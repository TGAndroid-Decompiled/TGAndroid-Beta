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
        public void onPrepareShader(GlShader glShader, float[] fArr, int i10, int i11, int i12, int i13) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i14 = this.xUnitLoc;
            float f10 = this.stepSize;
            float f11 = i10;
            GLES20.glUniform2f(i14, (fArr[0] * f10) / f11, (f10 * fArr[1]) / f11);
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
        int i10;
        int i11;
        ByteBuffer byteBuffer;
        int i12;
        this.threadChecker.checkIsOnValidThread();
        VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) this.videoFrameDrawer.prepareBufferForViewportSize(textureBuffer, textureBuffer.getWidth(), textureBuffer.getHeight());
        int width = textureBuffer2.getWidth();
        int height = textureBuffer2.getHeight();
        int i13 = ((width + 7) / 8) * 8;
        int i14 = (height + 1) / 2;
        int i15 = height + i14;
        ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i13 * i15);
        int i16 = i13 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        try {
            this.i420TextureFrameBuffer.setSize(i16, i15);
            GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
            GlUtil.checkNoGLES2Error("glBindFramebuffer");
            this.shaderCallbacks.setPlaneY();
            i10 = i13;
            i12 = 0;
            try {
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, 0, i16, height, false);
                this.shaderCallbacks.setPlaneU();
                try {
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, height, i16 / 2, i14, false);
                    this.shaderCallbacks.setPlaneV();
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, i16 / 2, height, i16 / 2, i14, false);
                    i11 = i14;
                    try {
                        byteBuffer = byteBufferNativeAllocateByteBuffer;
                        try {
                            GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBuffer);
                            GlUtil.checkNoGLES2Error("YuvConverter.convert");
                            GLES20.glBindFramebuffer(36160, 0);
                        } catch (Exception e9) {
                            e = e9;
                            FileLog.e(e);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        byteBuffer = byteBufferNativeAllocateByteBuffer;
                        FileLog.e(e);
                        int i17 = i10 * height;
                        int i18 = i10 / 2;
                        int i19 = i17 + i18;
                        byteBuffer.position(i12);
                        byteBuffer.limit(i17);
                        ByteBuffer byteBufferSlice = byteBuffer.slice();
                        byteBuffer.position(i17);
                        int i20 = ((i11 - 1) * i10) + i18;
                        byteBuffer.limit(i17 + i20);
                        ByteBuffer byteBufferSlice2 = byteBuffer.slice();
                        byteBuffer.position(i19);
                        byteBuffer.limit(i19 + i20);
                        ByteBuffer byteBufferSlice3 = byteBuffer.slice();
                        textureBuffer2.release();
                        return JavaI420Buffer.wrap(width, height, byteBufferSlice, i10, byteBufferSlice2, i10, byteBufferSlice3, i10, new j(1, byteBuffer));
                    }
                } catch (Exception e11) {
                    e = e11;
                    i11 = i14;
                }
            } catch (Exception e12) {
                e = e12;
                i11 = i14;
            }
        } catch (Exception e13) {
            e = e13;
            i10 = i13;
            i11 = i14;
            byteBuffer = byteBufferNativeAllocateByteBuffer;
            i12 = 0;
        }
        int i110 = i10 * height;
        int i111 = i10 / 2;
        int i112 = i110 + i111;
        byteBuffer.position(i12);
        byteBuffer.limit(i110);
        ByteBuffer byteBufferSlice4 = byteBuffer.slice();
        byteBuffer.position(i110);
        int i21 = ((i11 - 1) * i10) + i111;
        byteBuffer.limit(i110 + i21);
        ByteBuffer byteBufferSlice5 = byteBuffer.slice();
        byteBuffer.position(i112);
        byteBuffer.limit(i112 + i21);
        ByteBuffer byteBufferSlice6 = byteBuffer.slice();
        textureBuffer2.release();
        return JavaI420Buffer.wrap(width, height, byteBufferSlice4, i10, byteBufferSlice5, i10, byteBufferSlice6, i10, new j(1, byteBuffer));
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
