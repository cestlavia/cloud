package com.lp.service.impl;

import com.lp.service.HelloService;

public class HelloServiceImpl implements HelloService {

  @Override
  public String hello(String content) {
    return content;
  }
}
