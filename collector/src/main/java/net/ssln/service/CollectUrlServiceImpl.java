package net.ssln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ssln.dao.CollectUrlDao;
import net.ssln.model.CollectUrl;
@Service
public class CollectUrlServiceImpl implements CollectUrlService {
	@Autowired
 public CollectUrlDao collectUrlDao;
	public int add(CollectUrl param) {
		int result= collectUrlDao.add(param);
		return result;
	}

	public List<CollectUrl> findByParam(CollectUrl param) {
		// TODO Auto-generated method stub
		return collectUrlDao.findByParam(param);
	}
  
}
