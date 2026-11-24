package org.webrtc;

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

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i4 * i3;
        int i7 = i5 + i6;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(((i4 << 1) * i3) + i5);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i5);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i5);
        nativeAllocateByteBuffer.limit(i7);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i7);
        nativeAllocateByteBuffer.limit(i7 + i6);
        return new JavaI420Buffer(i, i2, slice, i, slice2, i4, nativeAllocateByteBuffer.slice(), i4, new ys5(nativeAllocateByteBuffer, (byte) 0));
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int h = oo1.h(i2, 1, i3, i);
        if (byteBuffer.capacity() >= h) {
            return;
        }
        fvc.e(byteBuffer.capacity(), de9.m(h, "Buffer must be at least ", " bytes, but was "));
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == i5 && i4 == i6) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i2) + i);
            int i7 = i / 2;
            int i8 = i2 / 2;
            dataU.position((i420Buffer.getStrideU() * i8) + i7);
            dataV.position((i420Buffer.getStrideV() * i8) + i7);
            i420Buffer.retain();
            return wrap(i5, i6, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new tp5(i420Buffer, (byte) 4));
        }
        JavaI420Buffer allocate = allocate(i5, i6);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer slice = byteBuffer.slice();
                ByteBuffer slice2 = byteBuffer2.slice();
                ByteBuffer slice3 = byteBuffer3.slice();
                int i6 = (i + 1) / 2;
                int i7 = (i2 + 1) / 2;
                checkCapacity(slice, i, i2, i3);
                checkCapacity(slice2, i6, i7, i4);
                checkCapacity(slice3, i6, i7, i5);
                return new JavaI420Buffer(i, i2, slice, i3, slice2, i4, slice3, i5, runnable);
            }
            w26.j("Data buffers must be direct byte buffers.");
            return null;
        }
        w26.j("Data buffers cannot be null.");
        return null;
    }

    @Override
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    @Override
    public final int getBufferType() {
        return 1;
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
