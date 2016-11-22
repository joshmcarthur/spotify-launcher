# spotify-launcher

An Android launcher application. It launches Spotify, that's it. I created this application to use on an older phone that I use for running. I'm really only interested in having Spotify on this phone, with my headphones connected to it. This application turns my old phone into a good old fashioned mp3 player.

It's not worth putting on the Play Store, as it does very little. While I researched whether there was a way of accomplishing what I wanted with Tasker or similar, I didn't manage to find anything that exactly fulfilled my need - I wanted Spotify to be open all the time, after a reboot, and without having to think about where I was going. If I jump into the settings to do something, I want to hit one button and be back on Spotify.

Once this app is set as your launcher, it will automatically start Spotify when the device is powered on, replacing something I was previously using Tasker for.

## Installation

A compiled APK of this application is available on the [releases page](https://github.com/joshmcarthur/spotify-launcher/releases). If you would like to compile a version yourself, that is also fine. You'll need to have an Android Development environment set up, then simply run `./gradlew build`. The APK will be in `app/build/outputs/apk`.

Once you have an APK, you can install it by running `adb install app-release-unsigned.apk`. You will need to have allowed installation from unsigned sources in order to install this. Once it's installed, the next time you hit the home key you can select "Spotify Launcher" to set the launcher. Once that's done, Spotify will be launched every time the launcher is triggered (back key, home key).

## Uninstallation

Easiest is via the applications menu in the settings, since this app won't show in the app drawer. Settings -> Applications -> Spotify Launcher -> Uninstall
