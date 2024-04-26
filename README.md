# SpongeKotlin Template

This project is a template for using Kotlin in Sponge plugins API8+

## Dependencies

[This project depends on MCKotlin](https://ore.spongepowered.org/4drian3d/MCKotlin)
to provide the kotlin runtime.

## How do I use this template?

Once you have your own copy of the template it will run as-is, but there are
some key things we're going to want to change!

### Root Project Name

Open `settings.gradle.kts` and change `rootProject.name`

This will represent the root project since this environment
supports multiple plugins at once

### Project Name

A projects name is derived from its directory name with this setup.
So in order to change your projects name, simply change the directory
`example` to something else and reload gradle!

#### Multiple Projects

The `projects` directory can contain multiple projects. If a directory
is there gradle will attempt to include it.

There are two provided currently `example` and `shade-example`

You can add more project as you see fit, you may also delete the
projects!

### Project Packages

By default, the template uses `com.github.replaceme` in file directories
as well as the `build.gradle.kts`

You should replace these values with your own unique namespace!

For example, I would do

`com.github.replaceme` -> `me.zodd`

#### Entry Point

`build.gradle.kts` has us define an entrypoint for our plugins.
We need to make sure that points to the correct location.

If you've renamed your directory from `com.github.replaceme`
like you should have, then you'll need to update the entrypoint
to reflect that!

For example, I would do

`com.github.replaceme.Main` -> `me.zodd.Main`

### Plugin ID & Name

While we're in `build.gradle.kts` We should change the plugin name
and displayName to reflect our unique plugin!

`replaceme` should be the ID of your plugin, all lowercase!

`plugin("replaceme")` -> `plugin("foobar")`

`Replaceme` should be the display name! Caps and spaces allowed

`displayName("Replace Me")` -> `displayName("Foo Bar")`

## Important, but less necessary changes!

### Plugin Licence

SpongeGradle lets you assign your plugins licence.

By default, in this template, plugins are `ALL RIGHTS RESERVED`
Default behavior configured in `/buildSrc/src/main/kotlin/spongeplugin.gradle.kts`
or can be overridden per-plugin

### Plugin Config

A default config is provided to work off of, if you do not intend on
using a config, you can delete it.
