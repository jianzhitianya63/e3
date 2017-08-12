package cn.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.service.ItemService;
import cn.e3.utils.PageBean;
import cn.e3mall.pojo.TbItem;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("findItemById/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		TbItem item = itemService.findItemById(itemId);
		return item;
	}
	@RequestMapping("item/list")
	@ResponseBody
	public PageBean list(@RequestParam(defaultValue="1") Integer page, Integer rows){
		System.out.println("aaa");
		return itemService.findAll(page, rows);
	}
}
