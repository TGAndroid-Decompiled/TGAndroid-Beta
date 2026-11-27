package org.webrtc;

import java.util.Map;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.H264Utils;
public class H264UtilsJni implements H264Utils.Natives {
    private static JniTestInstanceHolder sOverride;

    public static H264Utils.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (H264Utils.Natives) obj;
        }
        return new H264UtilsJni();
    }

    public static void setInstanceForTesting(H264Utils.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public boolean isSameH264Profile(Map map, Map map2) {
        return GEN_JNI.org_webrtc_H264Utils_isSameH264Profile(map, map2);
    }
}
