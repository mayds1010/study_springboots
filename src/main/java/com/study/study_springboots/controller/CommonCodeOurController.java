package com.study.study_springboots.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.service.CommonCodeOurService;

@Controller
@RequestMapping(value = "/commonCodeOur")
public class CommonCodeOurController {

  @Autowired
  CommonCodeOurService commonCodecodeOurService;

  @RequestMapping(value = { "/delete/{uniqueId}" }, method = RequestMethod.POST)
  public ModelAndView delete(@RequestParam Map<String, Object> params, @PathVariable String uniqueId,
      ModelAndView modelAndView) {
    params.put("COMMON_CODE_ID", uniqueId);
    commonCodecodeOurService.delete(params);
    modelAndView.setViewName("commonCode_our/list");
    return modelAndView;
  }

  @RequestMapping(value = { "/update" }, method = RequestMethod.POST) // update는 post
  public ModelAndView update(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
    commonCodecodeOurService.updateOne(params);
    modelAndView.setViewName("commonCode_our/list");
    return modelAndView;
  }

  @RequestMapping(value = { "/list", "/", "" }, method = RequestMethod.GET)
  public ModelAndView list(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
    Object resultMap = commonCodecodeOurService.getList(params);
    modelAndView.addObject("resultMap", resultMap);
    modelAndView.setViewName("commonCode_our/list");
    return modelAndView;
  }

  @RequestMapping(value = { "/edit/{uniqueId}" }, method = RequestMethod.GET)
  public ModelAndView edit(@RequestParam Map<String, Object> params, @PathVariable String uniqueId,
      ModelAndView modelAndView) {
    params.put("COMMON_CODE_ID", uniqueId);
    Object resultMap = commonCodecodeOurService.getOne(params);
    modelAndView.addObject("resultMap", resultMap);
    modelAndView.setViewName("commonCode_our/edit");
    return modelAndView;
  }

}