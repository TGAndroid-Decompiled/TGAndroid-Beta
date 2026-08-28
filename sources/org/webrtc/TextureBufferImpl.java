package org.webrtc;

import android.graphics.Matrix;
import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.VideoFrame;
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private final int height;
    private final int f45283id;
    private final RefCountDelegate refCountDelegate;
    private final RefCountMonitor refCountMonitor;
    private final Handler toI420Handler;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int unscaledHeight;
    private final int unscaledWidth;
    private final int width;
    private final YuvConverter yuvConverter;

    public interface RefCountMonitor {
        void onDestroy(TextureBufferImpl textureBufferImpl);

        void onRelease(TextureBufferImpl textureBufferImpl);

        void onRetain(TextureBufferImpl textureBufferImpl);
    }

    public TextureBufferImpl(int i9, int i10, VideoFrame.TextureBuffer.Type type, int i11, Matrix matrix, Handler handler, YuvConverter yuvConverter, final Runnable runnable) {
        this(i9, i10, i9, i10, type, i11, matrix, handler, yuvConverter, new RefCountMonitor() {
            @Override
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override
            public void onRelease(TextureBufferImpl textureBufferImpl) {
            }

            @Override
            public void onRetain(TextureBufferImpl textureBufferImpl) {
            }
        });
    }

    public void lambda$new$0(RefCountMonitor refCountMonitor) {
        refCountMonitor.onDestroy(this);
    }

    public VideoFrame.I420Buffer lambda$toI420$1() {
        return this.yuvConverter.convert(this);
    }

    @Override
    public VideoFrame.Buffer cropAndScale(int i9, int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        int i15 = this.height;
        matrix.preTranslate(i9 / this.width, (i15 - (i10 + i12)) / i15);
        matrix.preScale(i11 / this.width, i12 / this.height);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i11) / this.width), Math.round((this.unscaledHeight * i12) / this.height), i13, i14);
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
    public int getTextureId() {
        return this.f45283id;
    }

    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    @Override
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    @Override
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    public YuvConverter getYuvConverter() {
        return this.yuvConverter;
    }

    @Override
    public void release() {
        this.refCountMonitor.onRelease(this);
        this.refCountDelegate.release();
    }

    @Override
    public void retain() {
        this.refCountMonitor.onRetain(this);
        this.refCountDelegate.retain();
    }

    @Override
    public VideoFrame.I420Buffer toI420() {
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() {
            @Override
            public final Object call() {
                VideoFrame.I420Buffer lambda$toI420$1;
                lambda$toI420$1 = TextureBufferImpl.this.lambda$toI420$1();
                return lambda$toI420$1;
            }
        });
    }

    public TextureBufferImpl(int i9, int i10, VideoFrame.TextureBuffer.Type type, int i11, Matrix matrix, Handler handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this(i9, i10, i9, i10, type, i11, matrix, handler, yuvConverter, refCountMonitor);
    }

    @Override
    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i9, int i10) {
        return applyTransformMatrix(matrix, i9, i10, i9, i10);
    }

    private TextureBufferImpl(int i9, int i10, int i11, int i12, VideoFrame.TextureBuffer.Type type, int i13, Matrix matrix, Handler handler, YuvConverter yuvConverter, RefCountMonitor refCountMonitor) {
        this.unscaledWidth = i9;
        this.unscaledHeight = i10;
        this.width = i11;
        this.height = i12;
        this.type = type;
        this.f45283id = i13;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(new s(0, this, refCountMonitor));
        this.refCountMonitor = refCountMonitor;
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i9, int i10, int i11, int i12) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i9, i10, i11, i12, this.type, this.f45283id, matrix2, this.toI420Handler, this.yuvConverter, new RefCountMonitor() {
            {
                TextureBufferImpl.this = this;
            }

            @Override
            public void onDestroy(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.release();
            }

            @Override
            public void onRelease(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRelease(TextureBufferImpl.this);
            }

            @Override
            public void onRetain(TextureBufferImpl textureBufferImpl) {
                TextureBufferImpl.this.refCountMonitor.onRetain(TextureBufferImpl.this);
            }
        });
    }
}
