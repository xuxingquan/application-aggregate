package com.sankuai.inf.leaf.service.segment.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LeafAlloc {
    private String key;
    private long maxId;
    private int step;
    private String updateTime;
}
