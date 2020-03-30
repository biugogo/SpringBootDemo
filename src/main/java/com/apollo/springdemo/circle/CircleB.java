package com.apollo.springdemo.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircleB {
    @Autowired
    private CircleC circleC;

}
