package com.emi.common.service.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import com.emi.common.bean.core.TreeNode;
import com.emi.common.bean.core.ITreeQuery;
import com.emi.sys.core.bean.PageBean;

/**
 * @Title:工作中心
 * @Copyright: Copyright (c) v1.0
 * @Company: 江苏一米智能科技股份有限公司
 * @project name: LugErp
 * @author: zhuxiaochen
 * @version: V1.0
 * @time: 2016年4月22日 上午9:51:14
 */
public class WareHouseTreeQuery extends BaseTreeQuery implements ITreeQuery{

	public WareHouseTreeQuery(HttpServletRequest request) {
		super(request);
	}

	@Override
	public List<TreeNode> getQueryTree() {
		List<TreeNode> list = new ArrayList<TreeNode>();
		return list;
	}

	@Override
	public PageBean getQueryList() {
		String showTree = this.request.getParameter("showTree");
		String keyWord = this.request.getParameter("keyWord");
		PageBean pagebean = this.emiPluginDao.getWareHouseList( keyWord,sobId,orgId,this.pageIndex,this.pageSize,showTree);
		this.request.setAttribute("keyWord", keyWord);
		return pagebean;
	}

	@Override
	public List<JSONObject> getColumns() {
		List<JSONObject> list = new ArrayList<JSONObject>();
		//宽度百分比，注意已经有一列‘序号’，占了8%
		JSONObject c1 = JSONObject.fromObject("{'name':'gid','desc':'','width':'8%','check':'1'}"); //checkbox 
		list.add(c1);
		JSONObject c2 = JSONObject.fromObject("{'name':'whcode','desc':'仓库编码','width':'21%','check':'0'}");
		list.add(c2);
		JSONObject c3 = JSONObject.fromObject("{'name':'whname','desc':'仓库名称','width':'21%','check':'0'}");
		list.add(c3);
		JSONObject c4 = JSONObject.fromObject("{'name':'whaddr','desc':'仓库地址','width':'21%','check':'0'}");
		list.add(c4);
		JSONObject c5 = JSONObject.fromObject("{'name':'whtel','desc':'仓库电话','width':'21%','check':'0'}");
		list.add(c5);
		
		return list;
	}

}