/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

import java.util.Random;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        int[] randomDance = new int[30];
        Random randomly = new Random(8);
        for (int i = 0; i < randomDance.length; i++) {
            randomDance[i] = randomly.nextInt();
        }
        int[] dance = new int[5];
        dance[0] = 5;
        dance[1] = 4;
        dance[2] = 3;
        dance[3] = 7;
        dance[4] = 2;
        ActorWorld world = new ActorWorld();
        DancingBug bob = new DancingBug(dance);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}