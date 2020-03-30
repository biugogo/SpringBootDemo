package com.apollo.springdemo.circle;

import org.springframework.stereotype.Service;

@Service
public class CircleA {
    private CircleB circleB;

    public CircleA(CircleB circleB) {this.circleB = circleB;}
}
