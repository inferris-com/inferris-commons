# Inferris Commons
This library will be replaced with a more mainstream library that any Java-written software can use, and a Spigot-bound library will be made.

## Current features
Not all of our features are released in this build yet. It will require a migration of our in-house components from the proxy and spigot servers which will take some time.

**InventoryBuilder**
Easily design and create custom inventories for your plugins. InventoryBuilder simplifies the process of setting up inventory GUIs, making it a breeze to interact with players.

**ItemBuilder**
Crafting complex ItemStacks has never been easier. ItemBuilder enables you to build ItemStacks with custom lore, enchantments, and attributes, enhancing your plugin's item management capabilities.

**MobBuilder**
Spawn custom mobs with ease. MobBuilder lets you define the properties and behavior of mobs, making it simple to introduce unique creatures to the Minecraft world.

**PotionEffectBuilder**
Effortlessly apply potion effects to players and entities. PotionEffectBuilder simplifies the creation of custom potion effects, giving me fine control over gameplay mechanics.

**ItemStackProvider**
Obtain ItemStacks from dedicated sections within the GUI. ItemStackProvider offers a convenient way to access and distribute frequently used items in our plugins.

**AbstractGUI**
Build graphical user interfaces for the players. AbstractGUI provides a foundation for creating polished and user-friendly menus, making it easier to manage plugin inventory pages.

## Future plans
While our architecture already boasts a trove of in-house utilities and methods, I want to continue moving everything over for my SANITY. Here's a glimpse of what will be moved to this API:

**Database Management**
Easy-to-use multi-database support and utilities. Configuration-support. Most database operations happen on the REST API.

**Redis/Jedis Management**
This needs to be moved to this library to provide me a centralized Jedis management area for non-PD centric data.
