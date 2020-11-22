package com.selldok.toy.event.model;

import com.selldok.toy.event.entity.Event;
import lombok.Getter;
import lombok.Setter;

/**
 * @author HJ Lee
 */
@Getter
@Setter
public class UpdateEventRequest {
    private String imageLink;
    private Event.EventType type;
    private String title;
    private String text;
    private String date;
    private String keywords;
    private String owner;
    private String location;
    private Boolean isFree;
    private Boolean isRecommend;
}
