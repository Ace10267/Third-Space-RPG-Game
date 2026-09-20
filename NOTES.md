First Step --> Update all MacPort Extensions, download homebrew and update Mac and all extensions
Secodn Step --> Learn how to use Github and main commands like git pull, git commit, and git push
Also learned other git commands like git rebase, and git reflog that talk about how data can branch off of different paths and repositories.
Mainly also learned how to connect github repositiories to my hackatime which is synced with terminal, VS Code, and XCode commandline tools.
Troublsheeted zhsh tools for wakatime plugin.

Godot Steps:

Step 1: Create a separate folder for a new game and blank canvas
Step 2: This is an RPG game and Zenva is a good source of leanring materials
Step 3: Assests such as sprites, models, textures, and sounds are needed, and Godot isn't used to build these from scratch, but rather assemble them together
Step 4: CC0 means the assests are ready for free use
Step 5: To make anything in Godot, we have to use Nodes, which are the fundamental building blocks of a game
Step 6: Scenes help package multiple nodes, which can consist of things like the player, sword, and main menu.

Since each node can work simutaneiusly, it helps with efficient working.

To create the main characters, it takes a 2D Node on a 2D Scene
Save the scene to a specific file folder this way

We can add a new node, by selecting a 2D character body in the scene, and using the node selector, it is possible to edit the node and animate it

Assets --> sprites --> and upload via folder by selecting as many frames you need for creating the animations

Pixel art is what Godot uses and it may try to re-texture it via rendering

use Cmd or Ctrl A to add new nodes and then reset the camera scale to create a POV for the main chracter

Collision shapes are needed to make sure characters don't fall out of the world

World Building:

Add a tile map node, and the wordl is built by using different tile sets, which is a collection of tiles for the ground

Eraser can be used here to remove tiles and edit their POVs and depth

The tile map should use the paint tool, and you can paint different physics settings per tile, including colliders

By applying to different levels of Physic settings to each tile, it is possible to make realistic collisinos and interactions between the environment, and player

Position the camera to stay with the player, and use camera smoothing to keep the change in view smooth

Platforms, some that move, some that don't:

We can crop out and change elements that we want for the platform to view

These can be changed into one-way collision for the platform by layering it and changing the z-value

You can also animate the platform by keyframing it on a specific range of x or y values

Pickups such as coins:

Area2D nodes are necessary for this and select the png file for the sprite

Then, create a circular shape around that and give it a constant infinite spinning loop

Now, we need to make a GDScript and we can do this by for each sprite to make certain movements in velocity, jumping heights, and other cool stuff

A new function is sometimes needed in the script and a new message might be needed to check which body enters an area for each environmental interaction

The mask defines what layer the node collides with, and coin can be removed from a scene upon player interaction via scripting it

Dying and Resetarting:

Limiting the bottom part of the camera is necessary so that it doesn't follow thorugh all the way

A kill zone is necessary for a player to path back to the beginning

In the kill zone, you need a timer