package net.ssln.service;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import net.ssln.model.CollectUrl;

public interface CollectUrlService {
	public int add(CollectUrl param);
	public List<CollectUrl> findByParam(CollectUrl param); 
}
