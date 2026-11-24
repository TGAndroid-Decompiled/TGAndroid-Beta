package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {
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

        TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2);

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        int getUnscaledHeight();

        int getUnscaledWidth();
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                return;
            }
            w26.j("rotation must be a multiple of 90");
            throw null;
        }
        w26.j("buffer not allowed to be null");
        throw null;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        if (i == 0) {
            return buffer.getHeight();
        }
        return buffer.getWidth();
    }

    public int getRotatedWidth() {
        int i = this.rotation % 180;
        Buffer buffer = this.buffer;
        if (i == 0) {
            return buffer.getWidth();
        }
        return buffer.getHeight();
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
