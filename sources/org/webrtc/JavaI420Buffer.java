package org.webrtc;

import j7.l1;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, Runnable runnable) {
        this.width = i10;
        this.height = i11;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i12;
        this.strideU = i13;
        this.strideV = i14;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i10, int i11) {
        int i12 = (i11 + 1) / 2;
        int i13 = (i10 + 1) / 2;
        int i14 = i10 * i11;
        int i15 = i13 * i12;
        int i16 = i14 + i15;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i13 * 2 * i12) + i14);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i14);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i14);
        nativeAllocateByteBuffer.limit(i16);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i16);
        nativeAllocateByteBuffer.limit(i16 + i15);
        return new JavaI420Buffer(i10, i11, slice, i10, slice2, i13, nativeAllocateByteBuffer.slice(), i13, new j(0, nativeAllocateByteBuffer));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        int f9 = com.google.android.recaptcha.internal.a.f(i11, 1, i12, i10);
        if (byteBuffer.capacity() >= f9) {
            return;
        }
        StringBuilder o10 = l1.o(f9, "Buffer must be at least ", " bytes, but was ");
        o10.append(byteBuffer.capacity());
        throw new IllegalArgumentException(o10.toString());
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == i14 && i13 == i15) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i11) + i10);
            int i16 = i10 / 2;
            int i17 = i11 / 2;
            dataU.position((i420Buffer.getStrideU() * i17) + i16);
            dataV.position((i420Buffer.getStrideV() * i17) + i16);
            i420Buffer.retain();
            return wrap(i14, i15, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new h(i420Buffer, 1));
        }
        JavaI420Buffer allocate = allocate(i14, i15);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i10, i11, i12, i13, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i14, i15);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, ByteBuffer byteBuffer4, int i17, ByteBuffer byteBuffer5, int i18, ByteBuffer byteBuffer6, int i19, int i20, int i21);

    public static JavaI420Buffer wrap(int i10, int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, ByteBuffer byteBuffer3, int i14, Runnable runnable) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer slice = byteBuffer.slice();
                ByteBuffer slice2 = byteBuffer2.slice();
                ByteBuffer slice3 = byteBuffer3.slice();
                int i15 = (i10 + 1) / 2;
                int i16 = (i11 + 1) / 2;
                checkCapacity(slice, i10, i11, i12);
                checkCapacity(slice2, i15, i16, i13);
                checkCapacity(slice3, i15, i16, i14);
                return new JavaI420Buffer(i10, i11, slice, i12, slice2, i13, slice3, i14, runnable);
            }
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        throw new IllegalArgumentException("Data buffers cannot be null.");
    }

    @Override
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        return cropAndScaleI420(this, i10, i11, i12, i13, i14, i15);
    }

    @Override
    public final int getBufferType() {
        return b0.a(this);
    }

    @Override
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int getStrideU() {
        return this.strideU;
    }

    @Override
    public int getStrideV() {
        return this.strideV;
    }

    @Override
    public int getStrideY() {
        return this.strideY;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public void release() {
        this.refCountDelegate.release();
    }

    @Override
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
