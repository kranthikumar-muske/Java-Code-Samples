package com.kranthi.riskIqInterview.Notification;

public abstract class NotificationService {
    int notificationId;
    String content;
    abstract boolean send();
}
