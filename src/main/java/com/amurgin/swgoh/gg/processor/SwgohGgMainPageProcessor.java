package com.amurgin.swgoh.gg.processor;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Collection;

public class SwgohGgMainPageProcessor implements PageProcessor {

    private static final String SWGOH_GG_INDEX = "https://swgoh.gg/";

    @Override
    public void process(Collection<String> parameters) {
        Document page = fetchPage();
        //TODO if parameters.contains('cavatars') find all character pictures
    }

    private Document fetchPage() {
        try {
            return Jsoup.connect(SWGOH_GG_INDEX).get();
        } catch (IOException e) {
            //TODO add logger
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean accepts(String url) {
        return SWGOH_GG_INDEX.equalsIgnoreCase(url);
    }
}
