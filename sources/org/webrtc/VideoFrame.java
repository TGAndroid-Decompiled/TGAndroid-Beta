package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {

        public abstract class CC {
            public static int $default$getBufferType(Buffer buffer) {
                return 0;
            }
        }

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getBufferType();

        int getHeight();

        int getWidth();

        @Override
        void release();

        @Override
        void retain();

        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {

        public abstract class CC {
            public static int $default$getBufferType(I420Buffer i420Buffer) {
                return 1;
            }
        }

        @Override
        int getBufferType();

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {

        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i % 90 != 0) {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override
    public void release() {
        this.buffer.release();
    }

    @Override
    public void retain() {
        this.buffer.retain();
    }
}
