package org.webrtc;

import java.nio.ByteBuffer;
import kf.k0;
import vh.w2;
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15) {
        nativeABGRToI420((ByteBuffer) checkNotNull(byteBuffer, "src"), i10, (ByteBuffer) checkNotNull(byteBuffer2, "dstY"), i11, (ByteBuffer) checkNotNull(byteBuffer3, "dstU"), i12, (ByteBuffer) checkNotNull(byteBuffer4, "dstV"), i13, i14, i15);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = (i14 + 1) / 2;
        int i20 = i15 * i14;
        int i21 = i15 * i16;
        int i22 = (i17 * i19) + i21;
        int i23 = (i17 * i18) + i21;
        int i24 = ((i19 - 1) * i17) + i23 + ((i13 + 1) / 2);
        if (byteBuffer4.capacity() >= i24) {
            byteBuffer4.limit(i20);
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.limit(i22);
            byteBuffer4.position(i21);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.limit(i24);
            byteBuffer4.position(i23);
            I420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, slice, i15, slice2, i17, byteBuffer4.slice(), i17, i13, i14);
            return;
        }
        StringBuilder m9 = k0.m(i24, "Expected destination buffer capacity to be at least ", " was ");
        m9.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(m9.toString());
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dst");
        int i16 = i15 % 180;
        int i17 = i16 == 0 ? i13 : i14;
        int i18 = i16 == 0 ? i14 : i13;
        int i19 = (i17 + 1) / 2;
        int i20 = i18 * i17;
        int i21 = ((i18 + 1) / 2) * i19;
        int i22 = (i21 * 2) + i20;
        if (byteBuffer4.capacity() >= i22) {
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.position(i20);
            ByteBuffer slice2 = byteBuffer4.slice();
            byteBuffer4.position(i21 + i20);
            nativeI420Rotate(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, slice, i17, slice2, i19, byteBuffer4.slice(), i19, i13, i14, i15);
            return;
        }
        StringBuilder m9 = k0.m(i22, "Expected destination buffer capacity to be at least ", " was ");
        m9.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(m9.toString());
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15, int i16) {
        int i17 = (i13 + 1) / 2;
        int i18 = i15 * i14;
        int i19 = i15 * i16;
        int i20 = (((i14 + 1) / 2) * i17 * 2) + i19;
        if (byteBuffer4.capacity() >= i20) {
            byteBuffer4.limit(i18);
            byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            byteBuffer4.limit(i20);
            byteBuffer4.position(i19);
            I420ToNV12(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, slice, i15, byteBuffer4.slice(), i17 * 2, i13, i14);
            return;
        }
        StringBuilder m9 = k0.m(i20, "Expected destination buffer capacity to be at least ", " was ");
        m9.append(byteBuffer4.capacity());
        throw new IllegalArgumentException(m9.toString());
    }

    private static <T> T checkNotNull(T t6, String str) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(w2.k(str, " should not be null"));
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13) {
        nativeCopyPlane((ByteBuffer) checkNotNull(byteBuffer, "src"), i10, (ByteBuffer) checkNotNull(byteBuffer2, "dst"), i11, i12, i13);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17, int i18);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, int i15, int i16);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14) {
        I420ToNV12(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, i14, i13, i14);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, int i15, int i16) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstUV");
        if (i15 > 0 && i16 > 0) {
            nativeI420ToNV12(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, i15, i16);
            return;
        }
        throw new IllegalArgumentException("I420ToNV12: width and height should not be negative");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14) {
        I420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, i14, i13, i14, (i13 + 1) / 2, (i14 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, int i14, int i15, int i16) {
        I420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, i14, i15, i16, (i15 + 1) / 2, (i16 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        if (i16 > 0 && i17 > 0) {
            nativeI420Copy(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, byteBuffer6, i15, i16, i17);
            return;
        }
        throw new IllegalArgumentException("I420Copy: width and height should not be negative");
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13, ByteBuffer byteBuffer5, int i14, ByteBuffer byteBuffer6, int i15, int i16, int i17, int i18) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        nativeI420Rotate(byteBuffer, i10, byteBuffer2, i11, byteBuffer3, i12, byteBuffer4, i13, byteBuffer5, i14, byteBuffer6, i15, i16, i17, i18);
    }
}
