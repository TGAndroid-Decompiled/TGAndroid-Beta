package org.webrtc;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.NV12Buffer;
class NV12BufferJni implements NV12Buffer.Natives {
    private static JniTestInstanceHolder sOverride;

    public static NV12Buffer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (NV12Buffer.Natives) obj;
        }
        return new NV12BufferJni();
    }

    public static void setInstanceForTesting(NV12Buffer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void cropAndScale(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13) {
        GEN_JNI.org_webrtc_NV12Buffer_cropAndScale(i, i2, i3, i4, i5, i6, byteBuffer, i7, i8, i9, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13);
    }
}
