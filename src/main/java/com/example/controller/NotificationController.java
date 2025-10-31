package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final List<Map<String, Object>> notifications = new CopyOnWriteArrayList<>();

    @PostMapping
    public ResponseEntity<Map<String, Object>> createNotification(@RequestBody Map<String, Object> notificationRequest) {
        notifications.add(notificationRequest);
        // In real-life apps, send mail or push notification here
        return ResponseEntity.status(201).body(notificationRequest);
    }

    @GetMapping
    public List<Map<String, Object>> getAllNotifications() {
        return notifications;
    }
}
