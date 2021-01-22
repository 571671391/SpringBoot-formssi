package com.lhn.formssi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lhn.formssi.dao.QuestionnaireDao;
import com.lhn.formssi.entity.Questionnaire;
import com.lhn.formssi.service.QuestionnaireService;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

	@Autowired
	QuestionnaireDao questionnaireDao;

	@Override
	public List<Questionnaire> getQuestionnaire() throws Exception{
		// TODO Auto-generated method stub
		return questionnaireDao.getQuestionnaire();
	}

}
