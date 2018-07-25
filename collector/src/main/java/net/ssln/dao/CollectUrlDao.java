package net.ssln.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.ssln.model.CollectUrl;

@Mapper 
public interface CollectUrlDao {
 
	@Insert("insert into collect_url values(#{id},#{detailUrl},#{netPicUrl},#{name},#{state},#{type},#{updateTime},#{collectDomain})")  
	public int add(CollectUrl param);
	
	@Select("select * from  collect_url where collect_domain = #{collectDomain}")  
	public List<CollectUrl> findByParam(CollectUrl param);  
}
