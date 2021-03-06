package com.spring.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.BoardDAO;
import com.spring.board.dto.BoardDTO;

@Service // 서비스(비즈니스 로직)는 Service를 명시해야 한다.
		 // 현재 클래스를 Service bean으로 등록시킨다.
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardDTO bdto) throws Exception {
		boardDAO.insert(bdto);
	}

	@Override
	public List<BoardDTO> getBoardList() throws Exception {
		return boardDAO.selectAll();
	}

	@Override
	public BoardDTO getOneBoard(int num) throws Exception {
		return boardDAO.selectOne(num);
	}

}



