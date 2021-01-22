package com.lhn.formssi.controller;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhn.formssi.service.QuestionnaireService;

@RestController
@RequestMapping(value = "/questionnaire")
@CrossOrigin
public class QuestionnaireController {
	@Autowired
	QuestionnaireService questionnaireService;
	
	@PostMapping(value = "/amenu")
	public Map<String, Object> getQuestionnaire(){
		Map<String, Object> mapModel = new HashMap<String, Object>();
		try {
			mapModel.put("success", questionnaireService.getQuestionnaire());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapModel;
	}
}
