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

    public NV12Buffer(int i10, int i11, int i12, int i13, ByteBuffer byteBuffer, Runnable runnable) {
        this.width = i10;
        this.height = i11;
        this.stride = i12;
        this.sliceHeight = i13;
        this.buffer = byteBuffer;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i10, int i11, int i12, int i13, int i14, int i15, ByteBuffer byteBuffer, int i16, int i17, int i18, int i19, ByteBuffer byteBuffer2, int i20, ByteBuffer byteBuffer3, int i21, ByteBuffer byteBuffer4, int i22);

    @Override
    public VideoFrame.Buffer cropAndScale(int i10, int i11, int i12, int i13, int i14, int i15) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i14, i15);
        nativeCropAndScale(i10, i11, i12, i13, i14, i15, this.buffer, this.width, this.height, this.stride, this.sliceHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
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
        int i10 = this.width;
        int i11 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i10, i11, i10, i11);
    }
}
