package org.webrtc;

import java.nio.ByteBuffer;
import k2.p1;
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

    private JavaI420Buffer(int i3, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, Runnable runnable) {
        this.width = i3;
        this.height = i10;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i11;
        this.strideU = i12;
        this.strideV = i13;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i3, int i10) {
        int i11 = (i10 + 1) / 2;
        int i12 = (i3 + 1) / 2;
        int i13 = i3 * i10;
        int i14 = i12 * i11;
        int i15 = i13 + i14;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i12 * 2 * i11) + i13);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i13);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i13);
        nativeAllocateByteBuffer.limit(i15);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i15);
        nativeAllocateByteBuffer.limit(i15 + i14);
        return new JavaI420Buffer(i3, i10, slice, i3, slice2, i12, nativeAllocateByteBuffer.slice(), i12, new j(0, nativeAllocateByteBuffer));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i3, int i10, int i11) {
        int e10 = com.google.android.recaptcha.internal.a.e(i10, 1, i11, i3);
        if (byteBuffer.capacity() >= e10) {
            return;
        }
        StringBuilder m10 = p1.m(e10, "Buffer must be at least ", " bytes, but was ");
        m10.append(byteBuffer.capacity());
        throw new IllegalArgumentException(m10.toString());
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i3, int i10, int i11, int i12, int i13, int i14) {
        if (i11 == i13 && i12 == i14) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i10) + i3);
            int i15 = i3 / 2;
            int i16 = i10 / 2;
            dataU.position((i420Buffer.getStrideU() * i16) + i15);
            dataV.position((i420Buffer.getStrideV() * i16) + i15);
            i420Buffer.retain();
            return wrap(i13, i14, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new h(i420Buffer, 1));
        }
        JavaI420Buffer allocate = allocate(i13, i14);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i3, i10, i11, i12, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i13, i14);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i20);

    public static JavaI420Buffer wrap(int i3, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, Runnable runnable) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer slice = byteBuffer.slice();
                ByteBuffer slice2 = byteBuffer2.slice();
                ByteBuffer slice3 = byteBuffer3.slice();
                int i14 = (i3 + 1) / 2;
                int i15 = (i10 + 1) / 2;
                checkCapacity(slice, i3, i10, i11);
                checkCapacity(slice2, i14, i15, i12);
                checkCapacity(slice3, i14, i15, i13);
                return new JavaI420Buffer(i3, i10, slice, i11, slice2, i12, slice3, i13, runnable);
            }
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        throw new IllegalArgumentException("Data buffers cannot be null.");
    }

    @Override
    public VideoFrame.Buffer cropAndScale(int i3, int i10, int i11, int i12, int i13, int i14) {
        return cropAndScaleI420(this, i3, i10, i11, i12, i13, i14);
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
