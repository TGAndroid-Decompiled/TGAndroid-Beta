package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.TurnCustomizer;
public class TurnCustomizerJni implements TurnCustomizer.Natives {
    private static JniTestInstanceHolder sOverride;

    public static TurnCustomizer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (TurnCustomizer.Natives) obj;
        }
        return new TurnCustomizerJni();
    }

    public static void setInstanceForTesting(TurnCustomizer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void freeTurnCustomizer(long j) {
        GEN_JNI.org_webrtc_TurnCustomizer_freeTurnCustomizer(j);
    }
}
