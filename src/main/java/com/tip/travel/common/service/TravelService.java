package com.tip.travel.common.service;

import com.tip.travel.common.domain.Travel;

public interface TravelService {

    Travel getTravelById(Long id);

    Integer saveTravel(Travel travel);

    Integer deleteTravel(Long id);
}
