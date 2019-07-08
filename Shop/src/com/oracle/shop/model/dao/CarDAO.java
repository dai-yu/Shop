package com.oracle.shop.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.oracle.shop.model.javabean.Goods;
import com.oracle.shop.model.javabean.Shopcart;

/**
 * 购物车的dao类
 * @author Administrator
 *
 */
@Mapper
public interface CarDAO {

	@Insert("insert into shopcart(carnumber,userid,goodsid) values(1,#{userid},#{productid})")
	public int addProduct(@Param("userid")int userid,@Param("productid")int productid);
	
	@Select("select *  from shopcart where userid=#{0}")
	public List<Shopcart> listCartsByUserId(int userid);
	
	
	@Select("select * from goods where goodsid=#{0}")
	public  Goods  getGoodsByGoodsId(int goodsid);
	
	@Update("update shopcart set carnumber=carnumber+1 where goodsid=#{pid} and userid=#{userid}")
	public int addProductNumber(@Param("pid")int pid ,@Param("userid")int userid);
}
