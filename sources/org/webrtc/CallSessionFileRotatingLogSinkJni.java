package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.CallSessionFileRotatingLogSink;
public class CallSessionFileRotatingLogSinkJni implements CallSessionFileRotatingLogSink.Natives {
    private static JniTestInstanceHolder sOverride;

    public static CallSessionFileRotatingLogSink.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (CallSessionFileRotatingLogSink.Natives) obj;
        }
        return new CallSessionFileRotatingLogSinkJni();
    }

    public static void setInstanceForTesting(CallSessionFileRotatingLogSink.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public long addSink(String str, int i, int i2) {
        return GEN_JNI.org_webrtc_CallSessionFileRotatingLogSink_addSink(str, i, i2);
    }

    @Override
    public void deleteSink(long j) {
        GEN_JNI.org_webrtc_CallSessionFileRotatingLogSink_deleteSink(j);
    }

    @Override
    public byte[] getLogData(String str) {
        return (byte[]) GEN_JNI.org_webrtc_CallSessionFileRotatingLogSink_getLogData(str);
    }
}
