package com.lhn.formssi.dao;

import java.util.List;

import com.lhn.formssi.entity.Questionnaire;

public interface QuestionnaireDao {
	//获取启用版本的问卷
	public List<Questionnaire> getQuestionnaire() throws Exception;
}
