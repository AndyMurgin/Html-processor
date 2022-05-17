package com.amurgin.swgoh.gg.processor;

import java.util.Collection;

public interface PageProcessor {

    void process(Collection<String> parameters);

    boolean accepts(String url);
}
