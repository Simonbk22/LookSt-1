package kr.co.lookst.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.lookst.post.dao.PostDao;
import kr.co.lookst.post.domain.Post_imgDto;


@Service
public class PostServiceImpl implements PostService{

	@Autowired
	PostDao postDao;
	
	@Override
	public List<Post_imgDto> getpostlistimg() throws Exception {
		return postDao.post_listimg();
	}

}
