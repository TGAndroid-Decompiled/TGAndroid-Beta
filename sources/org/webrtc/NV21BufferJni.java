package org.webrtc;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.NV21Buffer;
class NV21BufferJni implements NV21Buffer.Natives {
    private static JniTestInstanceHolder sOverride;

    public static NV21Buffer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && (obj = jniTestInstanceHolder.value) != null) {
            return (NV21Buffer.Natives) obj;
        }
        return new NV21BufferJni();
    }

    public static void setInstanceForTesting(NV21Buffer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override
    public void cropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11) {
        GEN_JNI.org_webrtc_NV21Buffer_cropAndScale(i, i2, i3, i4, i5, i6, bArr, i7, i8, byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11);
    }
}
