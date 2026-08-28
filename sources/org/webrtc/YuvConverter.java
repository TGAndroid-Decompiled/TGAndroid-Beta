package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import org.telegram.messenger.FileLog;
import org.webrtc.GlGenericDrawer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
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
        public void onPrepareShader(GlShader glShader, float[] fArr, int i9, int i10, int i11, int i12) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i13 = this.xUnitLoc;
            float f10 = this.stepSize;
            float f11 = i9;
            GLES20.glUniform2f(i13, (fArr[0] * f10) / f11, (f10 * fArr[1]) / f11);
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
        int i9;
        int i10;
        ByteBuffer byteBuffer;
        int i11;
        this.threadChecker.checkIsOnValidThread();
        VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) this.videoFrameDrawer.prepareBufferForViewportSize(textureBuffer, textureBuffer.getWidth(), textureBuffer.getHeight());
        int width = textureBuffer2.getWidth();
        int height = textureBuffer2.getHeight();
        int i12 = ((width + 7) / 8) * 8;
        int i13 = (height + 1) / 2;
        int i14 = height + i13;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i12 * i14);
        int i15 = i12 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        try {
            this.i420TextureFrameBuffer.setSize(i15, i14);
            GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
            GlUtil.checkNoGLES2Error("glBindFramebuffer");
            this.shaderCallbacks.setPlaneY();
            i9 = i12;
            i11 = 0;
            try {
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, 0, i15, height, false);
                this.shaderCallbacks.setPlaneU();
                try {
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, height, i15 / 2, i13, false);
                    this.shaderCallbacks.setPlaneV();
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, i15 / 2, height, i15 / 2, i13, false);
                    i10 = i13;
                } catch (Exception e10) {
                    e = e10;
                    i10 = i13;
                }
            } catch (Exception e11) {
                e = e11;
                i10 = i13;
            }
        } catch (Exception e12) {
            e = e12;
            i9 = i12;
            i10 = i13;
            byteBuffer = nativeAllocateByteBuffer;
            i11 = 0;
        }
        try {
            byteBuffer = nativeAllocateByteBuffer;
        } catch (Exception e13) {
            e = e13;
            byteBuffer = nativeAllocateByteBuffer;
            FileLog.e(e);
            int i16 = i9 * height;
            int i17 = i9 / 2;
            int i18 = i16 + i17;
            byteBuffer.position(i11);
            byteBuffer.limit(i16);
            ByteBuffer slice = byteBuffer.slice();
            byteBuffer.position(i16);
            int i19 = ((i10 - 1) * i9) + i17;
            byteBuffer.limit(i16 + i19);
            ByteBuffer slice2 = byteBuffer.slice();
            byteBuffer.position(i18);
            byteBuffer.limit(i18 + i19);
            ByteBuffer slice3 = byteBuffer.slice();
            textureBuffer2.release();
            return JavaI420Buffer.wrap(width, height, slice, i9, slice2, i9, slice3, i9, new j(1, byteBuffer));
        }
        try {
            GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBuffer);
            GlUtil.checkNoGLES2Error("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
        } catch (Exception e14) {
            e = e14;
            FileLog.e(e);
            int i162 = i9 * height;
            int i172 = i9 / 2;
            int i182 = i162 + i172;
            byteBuffer.position(i11);
            byteBuffer.limit(i162);
            ByteBuffer slice4 = byteBuffer.slice();
            byteBuffer.position(i162);
            int i192 = ((i10 - 1) * i9) + i172;
            byteBuffer.limit(i162 + i192);
            ByteBuffer slice22 = byteBuffer.slice();
            byteBuffer.position(i182);
            byteBuffer.limit(i182 + i192);
            ByteBuffer slice32 = byteBuffer.slice();
            textureBuffer2.release();
            return JavaI420Buffer.wrap(width, height, slice4, i9, slice22, i9, slice32, i9, new j(1, byteBuffer));
        }
        int i1622 = i9 * height;
        int i1722 = i9 / 2;
        int i1822 = i1622 + i1722;
        byteBuffer.position(i11);
        byteBuffer.limit(i1622);
        ByteBuffer slice42 = byteBuffer.slice();
        byteBuffer.position(i1622);
        int i1922 = ((i10 - 1) * i9) + i1722;
        byteBuffer.limit(i1622 + i1922);
        ByteBuffer slice222 = byteBuffer.slice();
        byteBuffer.position(i1822);
        byteBuffer.limit(i1822 + i1922);
        ByteBuffer slice322 = byteBuffer.slice();
        textureBuffer2.release();
        return JavaI420Buffer.wrap(width, height, slice42, i9, slice222, i9, slice322, i9, new j(1, byteBuffer));
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
