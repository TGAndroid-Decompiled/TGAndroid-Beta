package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.telegram.messenger.FileLog;

public class YuvConverter {
    private static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private final GlGenericDrawer drawer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer;
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;
    private final VideoFrameDrawer videoFrameDrawer;

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        private ShaderCallbacks() {
        }

        @Override
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }
    }

    public YuvConverter() {
        this(new VideoFrameDrawer());
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        int i;
        int i2;
        ByteBuffer byteBuffer;
        int i3;
        this.threadChecker.checkIsOnValidThread();
        VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) this.videoFrameDrawer.prepareBufferForViewportSize(textureBuffer, textureBuffer.getWidth(), textureBuffer.getHeight());
        int width = textureBuffer2.getWidth();
        int height = textureBuffer2.getHeight();
        int i4 = ((width + 7) / 8) * 8;
        int i5 = (height + 1) / 2;
        int i6 = height + i5;
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i4 * i6);
        int i7 = i4 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        try {
            this.i420TextureFrameBuffer.setSize(i7, i6);
            GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
            GlUtil.checkNoGLES2Error("glBindFramebuffer");
            this.shaderCallbacks.setPlaneY();
            i = i4;
            i3 = 0;
            try {
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, 0, i7, height, false);
                this.shaderCallbacks.setPlaneU();
                try {
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, height, i7 / 2, i5, false);
                    this.shaderCallbacks.setPlaneV();
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, i7 / 2, height, i7 / 2, i5, false);
                    i2 = i5;
                    try {
                        byteBuffer = byteBufferNativeAllocateByteBuffer;
                        try {
                            GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBuffer);
                            GlUtil.checkNoGLES2Error("YuvConverter.convert");
                            GLES20.glBindFramebuffer(36160, 0);
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        byteBuffer = byteBufferNativeAllocateByteBuffer;
                        FileLog.e(e);
                        int i8 = i * height;
                        int i9 = i / 2;
                        int i10 = i8 + i9;
                        byteBuffer.position(i3);
                        byteBuffer.limit(i8);
                        ByteBuffer byteBufferSlice = byteBuffer.slice();
                        byteBuffer.position(i8);
                        int i11 = ((i2 - 1) * i) + i9;
                        byteBuffer.limit(i8 + i11);
                        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
                        byteBuffer.position(i10);
                        byteBuffer.limit(i10 + i11);
                        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
                        textureBuffer2.release();
                        return JavaI420Buffer.wrap(width, height, byteBufferSlice, i, byteBufferSlice2, i, byteBufferSlice3, i, new YuvConverter$$ExternalSyntheticLambda0(0, byteBuffer));
                    }
                } catch (Exception e3) {
                    e = e3;
                    i2 = i5;
                }
            } catch (Exception e4) {
                e = e4;
                i2 = i5;
            }
        } catch (Exception e5) {
            e = e5;
            i = i4;
            i2 = i5;
            byteBuffer = byteBufferNativeAllocateByteBuffer;
            i3 = 0;
        }
        int i12 = i * height;
        int i13 = i / 2;
        int i14 = i12 + i13;
        byteBuffer.position(i3);
        byteBuffer.limit(i12);
        ByteBuffer byteBufferSlice4 = byteBuffer.slice();
        byteBuffer.position(i12);
        int i15 = ((i2 - 1) * i) + i13;
        byteBuffer.limit(i12 + i15);
        ByteBuffer byteBufferSlice5 = byteBuffer.slice();
        byteBuffer.position(i14);
        byteBuffer.limit(i14 + i15);
        ByteBuffer byteBufferSlice6 = byteBuffer.slice();
        textureBuffer2.release();
        return JavaI420Buffer.wrap(width, height, byteBufferSlice4, i, byteBufferSlice5, i, byteBufferSlice6, i, new YuvConverter$$ExternalSyntheticLambda0(0, byteBuffer));
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.videoFrameDrawer.release();
        this.threadChecker.detachThread();
    }

    public YuvConverter(VideoFrameDrawer videoFrameDrawer) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", shaderCallbacks);
        this.videoFrameDrawer = videoFrameDrawer;
        threadChecker.detachThread();
    }
}
