Read Me
This read me file has been created for user to understand how to setup his system before he is able to run the
test suite on their machine and actual android device connected to the machine. Test suite project is hybrid
Appium-Selenium Project  based on Maven Framework.
NOTE : This readme is primarily for windows based development/execution setup only.
The suite can be run on any host OS. For non windows OS users they will have to figure the stuff out on their own with help of google.
Following is a list of things that have to installed before you will be able to run this test suite

Step 1: Install the Java Development Kit (JDK)

Step 2: Set Up Java Environment Variable Path and JAVA_HOME variable path
https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html

Step 3: Download Unzip maven to a specific location and add that location to
	Environment variable Path and M2_HOME and MAVEN_HOME variables
https://www.mkyong.com/maven/how-to-install-maven-in-windows/

Step 3: Install Android SDK / ADB on Windows

Step 4: Install Android SDK Packages
https://www.360logica.com/blog/how-to-set-path-environmental-variable-for-sdk-in-windows/

Step 5: Set up Android Environment Variable and ANDROID_HOME variable

Step 6: Download and Install NodeJs
	https://blog.teamtreehouse.com/install-node-js-npm-windows

Step 8: Download And Install Appium Desktop Client

Step 9: Enabling Developer Mode Options on Android Phone or Tablet

Step 10: After all of the above Connect your device to computer with USB cable,
	Start Appium server from windows UI for the same with default options

Steps 11: Once server is started Open Appium Inspector from the server UI.
	 Add following desired capabilities to the same
	"platformName": "ANDROID",
  "platformVersion": "6",
  "automation": "Appium",
  "uuid": "05997829",
  "deviceName": "Nexus 7",
  "app": "D:\\ApKs\\Viu_com.vuclip.viu.apk"
NOTE : platformName, platformVersion, uuid, deviceName will all depend on which device you will use for the execution.
Attribute app is the absolute path of actual .apk on machine which is connected to the android device.
[You can extract any apk from android system with apps like apkextractor]
Setup is complete when Appium pushes the app to the device and you are able to see screen of device in Appium Inspector.

Steps 12: Stop Appium Inspector. Stop Appium server.
Steps 13: Clone the share repo from Git on your local. Makes changes to desired
	capabilities in BaseAndroidDriver.java based on device you are using.
Steps 14: Open command prompt in the cloned repo folder and give following
	Commands
	Start Appium Server from Appium UI or alternatively use’ testexecution.bat’
	From project root folder.
	mvn clean install

