package com.lhn.formssi.service;


import java.util.List;

import com.lhn.formssi.entity.Questionnaire;

public interface QuestionnaireService {
	//获取启用版本的问卷
	public List<Questionnaire> getQuestionnaire() throws Exception;
}
