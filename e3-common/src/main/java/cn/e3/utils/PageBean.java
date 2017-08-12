package cn.e3.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import cn.e3mall.pojo.TbItem;

public class PageBean implements Serializable{
	private List<TbItem> rows = new ArrayList<>();
	private Long total;
	public List<TbItem> getRows() {
		return rows;
	}
	public void setRows(List<TbItem> rows) {
		this.rows = rows;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}