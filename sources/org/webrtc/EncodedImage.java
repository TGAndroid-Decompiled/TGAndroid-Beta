package org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;
    public final Integer qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;
        private Integer qp;
        private Runnable releaseCallback;
        private int rotation;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.qp);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j3) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j3);
            return this;
        }

        public Builder setCaptureTimeNs(long j3) {
            this.captureTimeNs = j3;
            return this;
        }

        public Builder setEncodedHeight(int i7) {
            this.encodedHeight = i7;
            return this;
        }

        public Builder setEncodedWidth(int i7) {
            this.encodedWidth = i7;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.qp = num;
            return this;
        }

        public Builder setRotation(int i7) {
            this.rotation = i7;
            return this;
        }

        private Builder() {
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        private final int nativeIndex;

        FrameType(int i7) {
            this.nativeIndex = i7;
        }

        public static FrameType fromNativeIndex(int i7) {
            FrameType[] values;
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i7) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException(jg.g.j(i7, "Unknown native frame type: "));
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private Integer getQp() {
        return this.qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    @Override
    public void release() {
        this.refCountDelegate.release();
    }

    @Override
    public void retain() {
        this.refCountDelegate.retain();
    }

    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i7, int i10, long j3, FrameType frameType, int i11, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i7;
        this.encodedHeight = i10;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j3);
        this.captureTimeNs = j3;
        this.frameType = frameType;
        this.rotation = i11;
        this.qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
