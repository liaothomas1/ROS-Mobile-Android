package com.schneewittchen.rosandroid.model.repositories;

import androidx.lifecycle.LiveData;

public interface SshRepository {

    void startSession(String username, String password, String ip, int port);

    void stopSession();

    void sendMessage(String message);

    LiveData<String> getOutputData();
}
