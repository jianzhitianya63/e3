package cn.e3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3.service.ItemService;
import cn.e3.utils.PageBean;
import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private TbItemMapper itemMapepr;
	@Override
	public TbItem findItemById(Long itemId) {
		TbItemExample example = new TbItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(itemId);
		List<TbItem> list = itemMapepr.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	@Override
	public PageBean findAll(Integer page,Integer rows) {
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(page, rows);
		//查询所有 ,使用分页插件设置分页
		List<TbItem> list = itemMapepr.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<TbItem>(list);
		PageBean pageBean = new PageBean();
		pageBean.setTotal(pageInfo.getTotal());
		pageBean.setRows(pageInfo.getList());
		return pageBean;
	}

}
