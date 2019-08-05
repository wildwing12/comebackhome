package com.example.combackhome.model.qna.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.combackhome.model.qna.dto.QnaDTO;

@Repository 
public class QnaDAOImpl implements QnaDAO {
	
	@Inject 
	SqlSession sqlSession;

	@Override
	public void deleteFile(String fullName) {
		sqlSession.delete("qna.deleteFile", fullName);
	}




	@Override
	public void create(QnaDTO dto) throws Exception {
		sqlSession.insert("qna.insert", dto);
	}

	@Override
	public void update(QnaDTO dto) throws Exception {
		sqlSession.update("qna.update", dto);
	}

	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete("qna.delete", bno);
	}


	@Override
	public List<QnaDTO> listAll(String search_option, 
			String keyword, int start, int end) 
			throws Exception {
		Map<String,Object> map=new HashMap<>();
		map.put("search_option", search_option);
		map.put("keyword","%"+keyword+"%");
		map.put("start", start);
		map.put("end", end);
		return sqlSession.selectList("qna.listAll",map);
	}

	@Override
	public void increaseViewcnt(int bno) throws Exception {
		sqlSession.update("qna.increaseViewcnt", bno);
	}

	@Override
	public int countArticle(String search_option, String keyword) 
			throws Exception {
		Map<String,String> map=new HashMap<>();
		map.put("search_option", search_option);
		map.put("keyword", "%"+keyword+"%");
		return sqlSession.selectOne("qna.countArticle",map);
	}

	@Override
	public QnaDTO read(int bno) throws Exception {
		return sqlSession.selectOne("qna.read", bno);
	}

}
