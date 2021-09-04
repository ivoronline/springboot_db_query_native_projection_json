package com.ivoronline.springboot_db_query_native_projection_json.controllers;

import com.ivoronline.springboot_db_query_native_projection_json.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN JSON RECORD
  //================================================================
  // {"name":"John","age":20}
  @RequestMapping("ReturnJSONRecord")
  String returnJSONRecord() {
    String json = personRepository.returnJSONRecord();
    return json;
  }

  //================================================================
  // RETURN JSON ARRAY
  //================================================================
  // [{"name":"John","age":20}, {"name":"John","age":21}]
  @RequestMapping("ReturnSONArray")
  String returnSONArray() {
    String json = personRepository.returnSONArray();
    return json;
  }

}


