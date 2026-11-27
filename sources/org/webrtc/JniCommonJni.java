package org.webrtc;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.JniCommon;
public class JniCommonJni implements JniCommon.Natives {
    private static JniTestInstanceHolder sOverride;

    public static JniCommon.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (JniCommon.Natives) obj;
        }
        return new JniCommonJni();
    }

    public static void setInstanceForTesting(JniCommon.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void addRef(long j) {
        GEN_JNI.org_webrtc_JniCommon_addRef(j);
    }

    @Override
    public ByteBuffer allocateByteBuffer(int i) {
        return (ByteBuffer) GEN_JNI.org_webrtc_JniCommon_allocateByteBuffer(i);
    }

    @Override
    public void freeByteBuffer(ByteBuffer byteBuffer) {
        GEN_JNI.org_webrtc_JniCommon_freeByteBuffer(byteBuffer);
    }

    @Override
    public void releaseRef(long j) {
        GEN_JNI.org_webrtc_JniCommon_releaseRef(j);
    }
}
