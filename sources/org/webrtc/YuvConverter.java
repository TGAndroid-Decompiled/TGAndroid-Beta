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

    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        private ShaderCallbacks() {
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
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
    }

    public YuvConverter() {
        this(new VideoFrameDrawer());
    }

    public YuvConverter(VideoFrameDrawer videoFrameDrawer) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer(FRAGMENT_SHADER, shaderCallbacks);
        this.videoFrameDrawer = videoFrameDrawer;
        threadChecker.detachThread();
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        ByteBuffer byteBuffer;
        int i;
        this.threadChecker.checkIsOnValidThread();
        VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) this.videoFrameDrawer.prepareBufferForViewportSize(textureBuffer, textureBuffer.getWidth(), textureBuffer.getHeight());
        int width = textureBuffer2.getWidth();
        int height = textureBuffer2.getHeight();
        int i2 = ((width + 7) / 8) * 8;
        int i3 = (height + 1) / 2;
        int i4 = height + i3;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i2 * i4);
        int i5 = i2 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        try {
            this.i420TextureFrameBuffer.setSize(i5, i4);
            GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
            GlUtil.checkNoGLES2Error("glBindFramebuffer");
            this.shaderCallbacks.setPlaneY();
            byteBuffer = nativeAllocateByteBuffer;
            try {
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, 0, i5, height, false);
                this.shaderCallbacks.setPlaneU();
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, height, i5 / 2, i3, false);
                this.shaderCallbacks.setPlaneV();
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, i5 / 2, height, i5 / 2, i3, false);
                GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBuffer);
                GlUtil.checkNoGLES2Error("YuvConverter.convert");
                i = 0;
            } catch (Exception e) {
                e = e;
                i = 0;
                FileLog.m31e(e);
                int i6 = (i2 * height) + i;
                int i7 = i2 / 2;
                int i8 = i6 + i7;
                final ByteBuffer byteBuffer2 = byteBuffer;
                byteBuffer2.position(i);
                byteBuffer2.limit(i6);
                ByteBuffer slice = byteBuffer2.slice();
                byteBuffer2.position(i6);
                int i9 = ((i3 - 1) * i2) + i7;
                byteBuffer2.limit(i6 + i9);
                ByteBuffer slice2 = byteBuffer2.slice();
                byteBuffer2.position(i8);
                byteBuffer2.limit(i8 + i9);
                ByteBuffer slice3 = byteBuffer2.slice();
                textureBuffer2.release();
                return JavaI420Buffer.wrap(width, height, slice, i2, slice2, i2, slice3, i2, new Runnable() {
                    @Override
                    public final void run() {
                        JniCommon.nativeFreeByteBuffer(byteBuffer2);
                    }
                });
            }
        } catch (Exception e2) {
            e = e2;
            byteBuffer = nativeAllocateByteBuffer;
        }
        try {
            GLES20.glBindFramebuffer(36160, 0);
        } catch (Exception e3) {
            e = e3;
            FileLog.m31e(e);
            int i62 = (i2 * height) + i;
            int i72 = i2 / 2;
            int i82 = i62 + i72;
            final ByteBuffer byteBuffer22 = byteBuffer;
            byteBuffer22.position(i);
            byteBuffer22.limit(i62);
            ByteBuffer slice4 = byteBuffer22.slice();
            byteBuffer22.position(i62);
            int i92 = ((i3 - 1) * i2) + i72;
            byteBuffer22.limit(i62 + i92);
            ByteBuffer slice22 = byteBuffer22.slice();
            byteBuffer22.position(i82);
            byteBuffer22.limit(i82 + i92);
            ByteBuffer slice32 = byteBuffer22.slice();
            textureBuffer2.release();
            return JavaI420Buffer.wrap(width, height, slice4, i2, slice22, i2, slice32, i2, new Runnable() {
                @Override
                public final void run() {
                    JniCommon.nativeFreeByteBuffer(byteBuffer22);
                }
            });
        }
        int i622 = (i2 * height) + i;
        int i722 = i2 / 2;
        int i822 = i622 + i722;
        final ByteBuffer byteBuffer222 = byteBuffer;
        byteBuffer222.position(i);
        byteBuffer222.limit(i622);
        ByteBuffer slice42 = byteBuffer222.slice();
        byteBuffer222.position(i622);
        int i922 = ((i3 - 1) * i2) + i722;
        byteBuffer222.limit(i622 + i922);
        ByteBuffer slice222 = byteBuffer222.slice();
        byteBuffer222.position(i822);
        byteBuffer222.limit(i822 + i922);
        ByteBuffer slice322 = byteBuffer222.slice();
        textureBuffer2.release();
        return JavaI420Buffer.wrap(width, height, slice42, i2, slice222, i2, slice322, i2, new Runnable() {
            @Override
            public final void run() {
                JniCommon.nativeFreeByteBuffer(byteBuffer222);
            }
        });
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.videoFrameDrawer.release();
        this.threadChecker.detachThread();
    }
}
