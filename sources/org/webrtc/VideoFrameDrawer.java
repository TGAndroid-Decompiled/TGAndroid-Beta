package org.webrtc;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final Point renderSize = new Point();
    private final YuvUploader yuvUploader = new YuvUploader(null);
    private final Matrix renderMatrix = new Matrix();
    private final Matrix renderRotateMatrix = new Matrix();

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        private YuvUploader() {
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i10, int i11, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i12 = i10 / 2;
            int[] iArr2 = {i10, i12, i12};
            int i13 = i11 / 2;
            int[] iArr3 = {i11, i13, i13};
            int i14 = 0;
            for (int i15 = 0; i15 < 3; i15++) {
                int i16 = iArr[i15];
                int i17 = iArr2[i15];
                if (i16 > i17) {
                    i14 = Math.max(i14, i17 * iArr3[i15]);
                }
            }
            if (i14 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i14)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i14);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i18 = 0; i18 < 3; i18++) {
                    this.yuvTextures[i18] = GlUtil.generateTexture(3553);
                }
            }
            for (int i19 = 0; i19 < 3; i19++) {
                GLES20.glActiveTexture(33984 + i19);
                GLES20.glBindTexture(3553, this.yuvTextures[i19]);
                int i20 = iArr[i19];
                int i21 = iArr2[i19];
                if (i20 == i21) {
                    byteBuffer = byteBufferArr[i19];
                } else {
                    YuvHelper.copyPlane(byteBufferArr[i19], i20, this.copyBuffer, i21, i21, iArr3[i19]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i19], iArr3[i19], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }

        public YuvUploader(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private void calculateTransformedRenderSize(int i10, int i11, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i10;
            this.renderHeight = i11;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i12 = 0; i12 < 3; i12++) {
            float[] fArr = this.dstPoints;
            int i13 = i12 * 2;
            fArr[i13] = fArr[i13] * i10;
            int i14 = i13 + 1;
            fArr[i14] = fArr[i14] * i11;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f9, float f10, float f11, float f12) {
        return (int) Math.round(Math.hypot(f11 - f9, f12 - f10));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i18 = AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i18 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), textureBuffer.getWidth(), textureBuffer.getHeight(), i10, i11, convertMatrixFromAndroidGraphicsMatrix, i12, i13, i14, i15, i16, i17, z10);
        } else if (i18 == 2) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), textureBuffer.getWidth(), textureBuffer.getHeight(), i10, i11, convertMatrixFromAndroidGraphicsMatrix, i12, i13, i14, i15, i16, i17, z10);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public void getRenderBufferBitmap(RendererCommon.GlDrawer glDrawer, int i10, GlGenericDrawer.TextureCallback textureCallback) {
        if (glDrawer instanceof GlGenericDrawer) {
            ((GlGenericDrawer) glDrawer).getRenderBufferBitmap(i10, textureCallback);
        }
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int i10, int i11) {
        buffer.retain();
        return buffer;
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), false, false);
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        calculateTransformedRenderSize(z10 ? videoFrame.getRotatedHeight() : videoFrame.getRotatedWidth(), z10 ? videoFrame.getRotatedWidth() : videoFrame.getRotatedHeight(), matrix);
        if (this.renderWidth > 0 && this.renderHeight > 0) {
            boolean z12 = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z12) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (z12) {
                this.lastI420Frame = null;
                drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), this.renderWidth, this.renderHeight, i10, i11, i12, i13, z11);
                return;
            }
            if (videoFrame != this.lastI420Frame) {
                this.lastI420Frame = videoFrame;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i10, i11, i12, i13, z11);
            return;
        }
        Logging.w("VideoFrameDrawer", "Illegal frame size: " + this.renderWidth + "x" + this.renderHeight);
    }
}
