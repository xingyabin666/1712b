package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.Brand;
import com.bw.bean.Goods;
import com.bw.bean.Goodskind;

public interface GoodsMapper {

	public List<Goods> findAll(Map<String, Object> map);
	
	public List<Brand> findBrand();
	
	public List<Goodskind> findKind();
	
	public void addGoods(Goods goods);
	
	public Goods findGoodsById(Integer gid);
	
	public void updatGoods(Goods goods);
	
	public void deleteGoods(String ids);
	
}
