package com.sankuai.inf.leaf.service.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SegmentBufferView {
    private String key;
    private long value0;
    private int step0;
    private long max0;
    private long value1;
    private int step1;
    private long max1;
    private int pos;
    private boolean nextReady;
    private boolean initOk;
}
