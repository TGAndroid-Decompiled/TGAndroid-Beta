package org.webrtc;

import java.nio.ByteBuffer;
public class JniCommon {

    public interface Natives {
        void addRef(long j);

        ByteBuffer allocateByteBuffer(int i);

        void freeByteBuffer(ByteBuffer byteBuffer);

        void releaseRef(long j);
    }

    public static void nativeAddRef(long j) {
        JniCommonJni.get().addRef(j);
    }

    public static ByteBuffer nativeAllocateByteBuffer(int i) {
        return JniCommonJni.get().allocateByteBuffer(i);
    }

    public static void nativeFreeByteBuffer(ByteBuffer byteBuffer) {
        JniCommonJni.get().freeByteBuffer(byteBuffer);
    }

    public static void nativeReleaseRef(long j) {
        JniCommonJni.get().releaseRef(j);
    }
}
