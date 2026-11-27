package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.Logging;
public class LoggingJni implements Logging.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Logging.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (Logging.Natives) obj;
        }
        return new LoggingJni();
    }

    public static void setInstanceForTesting(Logging.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void enableLogThreads() {
        GEN_JNI.org_webrtc_Logging_enableLogThreads();
    }

    @Override
    public void enableLogTimeStamps() {
        GEN_JNI.org_webrtc_Logging_enableLogTimeStamps();
    }

    @Override
    public void enableLogToDebugOutput(int i) {
        GEN_JNI.org_webrtc_Logging_enableLogToDebugOutput(i);
    }

    @Override
    public void log(int i, String str, String str2) {
        GEN_JNI.org_webrtc_Logging_log(i, str, str2);
    }
}
