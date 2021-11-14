package com.sampleCompany.game.sampleGame.scenes;

import com.sampleCompany.arki.gameEngine.Engine;
import com.sampleCompany.arki.gameEngine.entities.EntityManager;
import com.sampleCompany.arki.gameEngine.entities.EntityMap;
import com.sampleCompany.arki.gameEngine.scenes.DefaultScene;
import com.sampleCompany.arki.gameEngine.scenes.Scene;
import com.sampleCompany.arki.gameEngine.scenes.SceneInfo;

import java.awt.*;

@DefaultScene
@SceneInfo(name = "Sample Scene", sceneID = "sampleScene")
public class SampleScene extends Scene
{

    public EntityMap sampleEntityMap = new SampleEntityMap(this);

    @Override
    public void awake()
    {

    }

    @Override
    public void start()
    {
        EntityManager.mapEntities(sampleEntityMap);
    }

    @Override
    public void tick()
    {
        Engine.entityManager.tick();
    }

    @Override
    public void render(Graphics g)
    {
        Engine.entityManager.render(g);
    }

}