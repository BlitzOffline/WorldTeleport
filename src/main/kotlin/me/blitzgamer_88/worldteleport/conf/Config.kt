package me.blitzgamer_88.worldteleport.conf

import ch.jalu.configme.Comment
import ch.jalu.configme.SettingsHolder
import ch.jalu.configme.properties.Property
import ch.jalu.configme.properties.PropertyInitializer

internal object Config : SettingsHolder {

    @JvmField
    @Comment("If this is enabled the plugin will check if the player has his spawnpoint", "set in that world and teleport him there instead of the world spawnpoint or the saved location.")
    val checkForBed: Property<Boolean> = PropertyInitializer.newProperty("checkForBed", false)

    @JvmField
    @Comment("Specify every how many seconds the placeholders are updated")
    val placeholdersUpdateCooldown: Property<Int> = PropertyInitializer.newProperty("placeholdersUpdateCooldown", 60)

    @JvmField
    @Comment("Permission that is needed to use the world teleport command.")
    val worldTeleportPermission: Property<String> = PropertyInitializer.newProperty("worldTeleportPermission", "worldteleport.teleport")
    @JvmField
    @Comment("Permission that is needed to set a world's teleport location.")
    val worldSetTeleportPermission: Property<String> = PropertyInitializer.newProperty("worldSetTeleportPermission", "worldteleport.setlocation")
    @JvmField
    @Comment("When a player has this permission he will be able to remove saved locations")
    val worldRemoveTeleportPermission: Property<String> = PropertyInitializer.newProperty("worldRemoveTeleportPermission", "worldteleport.removelocation")
    @JvmField
    @Comment("When a player has this permission he will not be able to get teleported when someone uses \"/worldtp teleport <target>\" on him.")
    val bypassTeleportPermission: Property<String> = PropertyInitializer.newProperty("bypassTeleportPermission", "worldteleport.bypass")
    @JvmField
    @Comment("When a player has this permission he will be able to reload the locations file.")
    val reloadPermission: Property<String> = PropertyInitializer.newProperty("reloadPermission", "worldteleport.reload")

    @JvmField
    val locationRemovedSuccessfully: Property<String> = PropertyInitializer.newProperty("locationRemovedSuccessfully", "&aThe teleport location has been removed successfully.")
    @JvmField
    val couldNotTeleportTarget: Property<String> = PropertyInitializer.newProperty("couldNotTeleportTarget", "&cCould not teleport %player_name%.")
    @JvmField
    val locationSavedSuccessfully: Property<String> = PropertyInitializer.newProperty("locationSavedSuccessfully", "&aThe new teleport location has been set successfully.")
    @JvmField
    val teleportedSuccessfully: Property<String> = PropertyInitializer.newProperty("teleportedSuccessfully", "&aYou have been teleported successfully.")
    @JvmField
    val teleportedSuccessfullyWorldSpawn: Property<String> = PropertyInitializer.newProperty("teleportedSuccessfullyWorldSpawn", "&aNo teleport location has been found for this world so you have been teleported at that world's spawnpoint.")
    @JvmField
    val teleportedSuccessfullyBedLocation: Property<String> = PropertyInitializer.newProperty("teleportedSuccessfullyBedLocation", "&aNo teleport location has been found for this world so you have been teleported at your bed spawnpoint.")
    @JvmField
    val targetTeleportedSuccessfully: Property<String> = PropertyInitializer.newProperty("targetTeleportedSuccessfully", "&a%player_name% has been teleported successfully.")
    @JvmField
    val targetTeleportedSuccessfullyWorldSpawn: Property<String> = PropertyInitializer.newProperty("targetTeleportedSuccessfullyWorldSpawn", "&aNo teleport location has been found for this world so %player_name% has been teleported at that world's spawnpoint.")
    @JvmField
    val targetTeleportedSuccessfullyBedLocation: Property<String> = PropertyInitializer.newProperty("targetTeleportedSuccessfullyBedLocation", "&aNo teleport location has been found for this world so %player_name% has been teleported at this bed spawnpoint.")
    @JvmField
    val noWorldSpecified: Property<String> = PropertyInitializer.newProperty("noWorldSpecified", "&cYou need to specify a world name.")
    @JvmField
    val noLocationSavedInThatWorld: Property<String> = PropertyInitializer.newProperty("noLocationSavedInThatWorld", "&cThere is no location saved in this world.")
    @JvmField
    val wrongWorldName: Property<String> = PropertyInitializer.newProperty("wrongWorldName", "&cWrong world name!")
    @JvmField
    val noPermission: Property<String> = PropertyInitializer.newProperty("noPermission", "&cYou do not have permission to do that.")
    @JvmField
    val pluginReloaded: Property<String> = PropertyInitializer.newProperty("pluginReloaded", "&cPlugin reloaded successfully!")

}