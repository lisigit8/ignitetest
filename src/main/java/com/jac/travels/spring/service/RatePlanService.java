package com.jac.travels.spring.service;

import com.jac.travels.model.RatePlan;

import java.util.List;

public interface RatePlanService {
    List<RatePlan> getAll();
    RatePlan getRatePlaneByRoomId(int roomId);
}
