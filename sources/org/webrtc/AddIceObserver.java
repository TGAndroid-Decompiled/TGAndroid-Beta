package org.webrtc;

public interface AddIceObserver {
    void onAddFailure(String str);

    void onAddSuccess();
}
