# PushNotification-Android-Android-
This is basic push notification project. In this, I send notification from one android device to another using Firebase cloud messaging. Used Volley library also.<br>
<b>Steps:</b><br>
I) Create two android projects and one firebase project:<br>
  a)PushNotificationClient:<br>
  b)PushNotificationServer:<br>
  c)PushNotification (firebase project):<br>
 
 II) Go to firebase Console using your gmail account and click on Add Project. Give name to your project.. and create your firebase project.<br>
 
 III) PushNotificationClient:<br>
 i) Create android project, give name to project (here PushNotificationClient) and connect that project to firebase.<br>
 ii) To connect firebase, Open android studio -> tools -> firebase -> search Cloud messaging -> click on connect to firebase and select your project in browser.<br>
 iii) next step is to add cloud messaging dependancy to your project.<br>
 
 IV) PushNotificationServer:<br>
 i) Create Android Project, give name to project (here PushNotificationServer) and add Volley library in build.gradle and click on sync.<br>
 ii) Open your firebase project and go to project settings -> cloud messaging tab and copy firebase server key and paste it into NotificationSender.java file.<br>
 iii) run the both server and client application.<br>
 
 Screenshots:<br>
 i) PushNotificationServer:<br>
 <img src="images/ss1.jpeg" width=300 height=600><br>
 
 ii) PushNotificationClient:<br>
 <img src="images/ss2.jpeg" width=300 height=600>
 <img src="images/ss3.jpeg" width=300 height=600>
 <img src="images/ss4.jpeg" width=300 height=600>
 

