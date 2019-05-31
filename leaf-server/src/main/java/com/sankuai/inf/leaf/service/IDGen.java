package com.sankuai.inf.leaf.service;

import com.sankuai.inf.leaf.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
