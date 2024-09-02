package org.webrtc;

import android.content.Context;
import org.webrtc.NetworkChangeDetector;

public interface NetworkChangeDetectorFactory {
    NetworkChangeDetector create(NetworkChangeDetector.Observer observer, Context context);
}
