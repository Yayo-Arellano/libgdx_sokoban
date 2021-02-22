package com.nopalsoft.sokoban.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.nopalsoft.sokoban.MainSokoban;

public class HtmlLauncher extends GwtApplication {

    @Override
    public GwtApplicationConfiguration getConfig() {
        return new GwtApplicationConfiguration(1080, 648);
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new MainSokoban();
    }
}