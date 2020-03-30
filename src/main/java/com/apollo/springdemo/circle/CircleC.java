package com.apollo.springdemo.circle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircleC {

    private CircleA circleA;

    @Autowired
    public CircleC(CircleA circleA) {this.circleA = circleA;}
}
