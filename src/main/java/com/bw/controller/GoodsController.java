package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bw.bean.Brand;
import com.bw.bean.Goods;
import com.bw.bean.Goodskind;
import com.bw.service.GoodsService;
import com.bw.utils.FileUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
@Resource
	private GoodsService goodsService;
@RequestMapping("show")
	public  String show(Model model , @RequestParam(defaultValue="1")Integer pageNum){
		
		Map<String, Object> map = new HashMap<String, Object>();
		PageHelper.startPage(pageNum, 3);
		List<Goods> glist = goodsService.findAll(map);
		PageInfo<Goods> plist = new PageInfo<Goods>(glist);
		model.addAttribute("plist",plist);
		return"show";
	}
	@RequestMapping("lookImg")
	public void lookImg(String path,HttpServletRequest request,HttpServletResponse response){
		FileUtils.lookImg(path, request, response);
	}
	@RequestMapping("toadd")
	public String toad(Model model){
		List<Brand> brandList = goodsService.findBrand();
		List<Goodskind> kindList = goodsService.findKind();
		model.addAttribute("brandList",brandList);
		model.addAttribute("kindList",kindList);
		
		return "add";
	}
	@RequestMapping("add")
	public String add(Goods goods , MultipartFile file){
		try {
			String upload = FileUtils.upload(file);
			goods.setPriurl(upload);
			goodsService.addGoods(goods);
			return"redirect:show";
		} catch (Exception e) {
			System.out.println("添加失败了");
			return "add";
		}
		
		
		
		
	}
	
	
}
