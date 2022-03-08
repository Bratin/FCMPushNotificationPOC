package com.bratin.fcmpushnotificationpoc

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        println(remoteMessage.notification?.title + " " + remoteMessage.notification?.body)
    }

    override fun onNewToken(token: String) {
        println(token)
        //send token to server
    }
}