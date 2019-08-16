# Travelmantics_ALC4_Challenge_2

=================================================================
                          Travelmantics
               Swahili Greetings Android project
          created and tested from Android Studio 3.4.2
=================================================================

This directory contains the full implementation of the Travelmantics application for the Android platform, demonstrating the basic facilities that applications will use.  You can run the application either directly from the Run'app' list in the app launcher (it is named Skeleton App) or by selecting it from the top list in the Sample Code app.

Travelmantics Android project has been run successfully on the virtual Android device "API_16" configured as follows: Android 4.1 target, 1GB SD card and HVGA skin

Travelmantics is an Android App given as a Challenge 2.0 in the Andela Learning Community 4.0.

It is a Travel Deals App with Regular users and Admins who have rights to write to the App Database unlike the Regular users who only read the Deals provided by the Admins.

Both types of users have to be authenticated to use the App by either Emain SignIn or using a Google Account.

Finally the Logins are up and running. Now working on the Picasso issues. Pics aren't showing.


Software Requirements
---------------------

In order to build/run this Android App, you need to install the following free software distributions:

1) Java JDK 1.6 +  (1.7.0_03, www.oracle.com/technetwork/java/javase/downloads/)
2) Android Studio and SDK    (developer.android.com)
3) Physical Android Device on version 4.1 and later 
4) At least 50MB of free space on your Android device

NB. In this document we relied mostly on the Android Emulater NOX (we will say more about NOX in future).


Project Structure
-----------------

The project structure of an Android application follows the directory layout prescribed by the Android system (for more details see the documentation page
$ANDROID_SDK_ROOT/docs/guide/developing/other-ide.html#CreatingAProject).

In particular:

* The "AndroidManifest.xml" file contains essential information the Android system needs to run the application's code (for more details see the documentation page $ANDROID_SDK_ROOT/docs/guide/topics/manifest/manifest-intro.html)



Project Build
-------------

We assume here the Android emulator is up and running; if not we start it using the shell command (let us assume the existence of the "API_16" virtual device) :

=================================================================


Signing your Applications
-------------------------
All Android applications must be signed. The system will not install an application that is not signed. You can use self-signed certificates to sign your applications. No certificate authority is needed. For example:

$ keytool -genkey -v -keystore ~/.android/release.keystore
          -alias android-app-dev -keyalg RSA -validity 10000

See also http://developer.android.com/guide/publishing/app-signing.html


Have fun!
Boub
