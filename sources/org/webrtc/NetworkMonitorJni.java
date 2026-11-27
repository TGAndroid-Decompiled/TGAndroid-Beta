package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;
class NetworkMonitorJni implements NetworkMonitor.Natives {
    static final boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static NetworkMonitor.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (NetworkMonitor.Natives) obj;
        }
        return new NetworkMonitorJni();
    }

    public static void setInstanceForTesting(NetworkMonitor.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void notifyConnectionTypeChanged(long j) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyConnectionTypeChanged(j);
    }

    @Override
    public void notifyOfActiveNetworkList(long j, NetworkChangeDetector.NetworkInformation[] networkInformationArr) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfActiveNetworkList(j, networkInformationArr);
    }

    @Override
    public void notifyOfNetworkConnect(long j, NetworkChangeDetector.NetworkInformation networkInformation) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfNetworkConnect(j, networkInformation);
    }

    @Override
    public void notifyOfNetworkDisconnect(long j, long j2) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfNetworkDisconnect(j, j2);
    }

    @Override
    public void notifyOfNetworkPreference(long j, NetworkChangeDetector.ConnectionType connectionType, int i) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfNetworkPreference(j, connectionType, i);
    }
}
