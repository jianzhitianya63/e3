package cn.e3.service;

import com.github.pagehelper.PageHelper;

import cn.e3.utils.PageBean;
import cn.e3mall.pojo.TbItem;

public interface ItemService {
	public TbItem findItemById(Long itemId);
	public PageBean findAll(Integer page,Integer rows);
}
