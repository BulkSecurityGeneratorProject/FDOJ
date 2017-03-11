package com.doj.gateway.cucumber.stepdefs;

import com.doj.gateway.DojGatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DojGatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
