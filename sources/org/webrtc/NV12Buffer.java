package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;
public class NV12Buffer implements VideoFrame.Buffer {
    private final ByteBuffer buffer;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    public NV12Buffer(int i9, int i10, int i11, int i12, ByteBuffer byteBuffer, Runnable runnable) {
        this.width = i9;
        this.height = i10;
        this.stride = i11;
        this.sliceHeight = i12;
        this.buffer = byteBuffer;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i9, int i10, int i11, int i12, int i13, int i14, ByteBuffer byteBuffer, int i15, int i16, int i17, int i18, ByteBuffer byteBuffer2, int i19, ByteBuffer byteBuffer3, int i20, ByteBuffer byteBuffer4, int i21);

    @Override
    public VideoFrame.Buffer cropAndScale(int i9, int i10, int i11, int i12, int i13, int i14) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i13, i14);
        nativeCropAndScale(i9, i10, i11, i12, i13, i14, this.buffer, this.width, this.height, this.stride, this.sliceHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }

    @Override
    public final int getBufferType() {
        return a0.a(this);
    }

    @Override
    public int getHeight() {
        return this.height;
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
        int i9 = this.width;
        int i10 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i9, i10, i9, i10);
    }
}
