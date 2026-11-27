package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.DataChannel;
public class DataChannelJni implements DataChannel.Natives {
    private static JniTestInstanceHolder sOverride;

    public static DataChannel.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (DataChannel.Natives) obj;
        }
        return new DataChannelJni();
    }

    public static void setInstanceForTesting(DataChannel.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long bufferedAmount(DataChannel dataChannel) {
        return GEN_JNI.org_webrtc_DataChannel_bufferedAmount(dataChannel);
    }

    @Override
    public void close(DataChannel dataChannel) {
        GEN_JNI.org_webrtc_DataChannel_close(dataChannel);
    }

    @Override
    public int id(DataChannel dataChannel) {
        return GEN_JNI.org_webrtc_DataChannel_id(dataChannel);
    }

    @Override
    public String label(DataChannel dataChannel) {
        return (String) GEN_JNI.org_webrtc_DataChannel_label(dataChannel);
    }

    @Override
    public long registerObserver(DataChannel dataChannel, DataChannel.Observer observer) {
        return GEN_JNI.org_webrtc_DataChannel_registerObserver(dataChannel, observer);
    }

    @Override
    public boolean send(DataChannel dataChannel, byte[] bArr, boolean z) {
        return GEN_JNI.org_webrtc_DataChannel_send(dataChannel, bArr, z);
    }

    @Override
    public DataChannel.State state(DataChannel dataChannel) {
        return (DataChannel.State) GEN_JNI.org_webrtc_DataChannel_state(dataChannel);
    }

    @Override
    public void unregisterObserver(DataChannel dataChannel, long j) {
        GEN_JNI.org_webrtc_DataChannel_unregisterObserver(dataChannel, j);
    }
}
