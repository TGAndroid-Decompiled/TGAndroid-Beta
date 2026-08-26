package org.webrtc;

import androidx.recyclerview.widget.DiffUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import java.nio.ByteBuffer;

public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        nativeABGRToI420((ByteBuffer) checkNotNull(byteBuffer, "src"), i, (ByteBuffer) checkNotNull(byteBuffer2, "dstY"), i2, (ByteBuffer) checkNotNull(byteBuffer3, "dstU"), i3, (ByteBuffer) checkNotNull(byteBuffer4, "dstV"), i4, i5, i6);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = (i5 + 1) / 2;
        int i11 = i6 * i5;
        int i12 = i6 * i7;
        int i13 = (i8 * i10) + i12;
        int i14 = (i8 * i9) + i12;
        int i15 = ((i10 - 1) * i8) + i14 + ((i4 + 1) / 2);
        if (byteBuffer4.capacity() < i15) {
            StringBuilder sbM = DiffUtil.m(i15, "Expected destination buffer capacity to be at least ", " was ");
            sbM.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(sbM.toString());
        }
        byteBuffer4.limit(i11);
        byteBuffer4.position(0);
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        byteBuffer4.limit(i13);
        byteBuffer4.position(i12);
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        byteBuffer4.limit(i15);
        byteBuffer4.position(i14);
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i6, byteBufferSlice2, i8, byteBuffer4.slice(), i8, i4, i5);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dst");
        int i7 = i6 % 180;
        int i8 = i7 == 0 ? i4 : i5;
        int i9 = i7 == 0 ? i5 : i4;
        int i10 = (i9 + 1) / 2;
        int i11 = (i8 + 1) / 2;
        int i12 = i9 * i8;
        int i13 = i10 * i11;
        int i14 = (i13 * 2) + i12;
        if (byteBuffer4.capacity() < i14) {
            StringBuilder sbM = DiffUtil.m(i14, "Expected destination buffer capacity to be at least ", " was ");
            sbM.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(sbM.toString());
        }
        byteBuffer4.position(0);
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        byteBuffer4.position(i12);
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        byteBuffer4.position(i13 + i12);
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i8, byteBufferSlice2, i11, byteBuffer4.slice(), i11, i4, i5, i6);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        int i8 = (i4 + 1) / 2;
        int i9 = i6 * i5;
        int i10 = i6 * i7;
        int i11 = (((i5 + 1) / 2) * i8 * 2) + i10;
        if (byteBuffer4.capacity() < i11) {
            StringBuilder sbM = DiffUtil.m(i11, "Expected destination buffer capacity to be at least ", " was ");
            sbM.append(byteBuffer4.capacity());
            throw new IllegalArgumentException(sbM.toString());
        }
        byteBuffer4.limit(i9);
        byteBuffer4.position(0);
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        byteBuffer4.limit(i11);
        byteBuffer4.position(i10);
        I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBufferSlice, i6, byteBuffer4.slice(), i8 * 2, i4, i5);
    }

    private static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(zzhp.m(str, " should not be null"));
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane((ByteBuffer) checkNotNull(byteBuffer, "src"), i, (ByteBuffer) checkNotNull(byteBuffer2, "dst"), i2, i3, i4);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstUV");
        if (i6 > 0 && i7 > 0) {
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
            return;
        }
        throw new IllegalArgumentException("I420ToNV12: width and height should not be negative");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5, (i4 + 1) / 2, (i5 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6, i7, (i6 + 1) / 2, (i7 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        if (i7 > 0 && i8 > 0) {
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
            return;
        }
        throw new IllegalArgumentException("I420Copy: width and height should not be negative");
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        checkNotNull(byteBuffer, "srcY");
        checkNotNull(byteBuffer2, "srcU");
        checkNotNull(byteBuffer3, "srcV");
        checkNotNull(byteBuffer4, "dstY");
        checkNotNull(byteBuffer5, "dstU");
        checkNotNull(byteBuffer6, "dstV");
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }
}
