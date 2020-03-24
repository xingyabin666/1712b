package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Brand;
import com.bw.bean.Goods;
import com.bw.bean.Goodskind;
import com.bw.mapper.GoodsMapper;
@Service
public class GoodsServiceImp implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	
	
	
	public GoodsServiceImp(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;
	}

	public List<Goods> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.findAll(map);
	}

	public List<Brand> findBrand() {
		// TODO Auto-generated method stub
		return goodsMapper.findBrand();
	}

	public List<Goodskind> findKind() {
		// TODO Auto-generated method stub
		return goodsMapper.findKind();
	}

	public void addGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.addGoods(goods);

	}

	public Goods findGoodsById(Integer gid) {
		// TODO Auto-generated method stub
		return goodsMapper.findGoodsById(gid);
	}

	public void updatGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.updatGoods(goods);
	}

	public void deleteGoods(String ids) {
		// TODO Auto-generated method stub
		goodsMapper.deleteGoods(ids);
	}

}
