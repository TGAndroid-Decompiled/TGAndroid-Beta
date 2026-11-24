package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
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

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        int i;
        int i2;
        int i3;
        ByteBuffer byteBuffer;
        byte b;
        this.threadChecker.checkIsOnValidThread();
        VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) this.videoFrameDrawer.prepareBufferForViewportSize(textureBuffer, textureBuffer.getWidth(), textureBuffer.getHeight());
        int width = textureBuffer2.getWidth();
        int height = textureBuffer2.getHeight();
        int i4 = ((width + 7) / 8) << 3;
        int i5 = (height + 1) / 2;
        int i6 = height + i5;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i4 * i6);
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
            i2 = 0;
            i3 = i5;
            try {
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, 0, i7, height, false);
                this.shaderCallbacks.setPlaneU();
                try {
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, 0, height, i7 / 2, i3, false);
                    this.shaderCallbacks.setPlaneV();
                    VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, width, height, i7 / 2, height, i7 / 2, i3, false);
                    i3 = i3;
                    byteBuffer = nativeAllocateByteBuffer;
                } catch (Exception e) {
                    e = e;
                    i3 = i3;
                    byteBuffer = nativeAllocateByteBuffer;
                    b = 1;
                    fc4.g(e, true);
                    int i8 = i * height;
                    int i9 = i / 2;
                    int i10 = i8 + i9;
                    byteBuffer.position(i2);
                    byteBuffer.limit(i8);
                    ByteBuffer slice = byteBuffer.slice();
                    byteBuffer.position(i8);
                    int i11 = ((i3 - 1) * i) + i9;
                    byteBuffer.limit(i8 + i11);
                    ByteBuffer slice2 = byteBuffer.slice();
                    byteBuffer.position(i10);
                    byteBuffer.limit(i10 + i11);
                    ByteBuffer slice3 = byteBuffer.slice();
                    textureBuffer2.release();
                    return JavaI420Buffer.wrap(width, height, slice, i, slice2, i, slice3, i, new xu5(byteBuffer, b));
                }
                try {
                    GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, byteBuffer);
                    GlUtil.checkNoGLES2Error("YuvConverter.convert");
                    GLES20.glBindFramebuffer(36160, 0);
                    b = 1;
                } catch (Exception e2) {
                    e = e2;
                    b = 1;
                    fc4.g(e, true);
                    int i82 = i * height;
                    int i92 = i / 2;
                    int i102 = i82 + i92;
                    byteBuffer.position(i2);
                    byteBuffer.limit(i82);
                    ByteBuffer slice4 = byteBuffer.slice();
                    byteBuffer.position(i82);
                    int i112 = ((i3 - 1) * i) + i92;
                    byteBuffer.limit(i82 + i112);
                    ByteBuffer slice22 = byteBuffer.slice();
                    byteBuffer.position(i102);
                    byteBuffer.limit(i102 + i112);
                    ByteBuffer slice32 = byteBuffer.slice();
                    textureBuffer2.release();
                    return JavaI420Buffer.wrap(width, height, slice4, i, slice22, i, slice32, i, new xu5(byteBuffer, b));
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            i = i4;
            i2 = 0;
            i3 = i5;
        }
        int i822 = i * height;
        int i922 = i / 2;
        int i1022 = i822 + i922;
        byteBuffer.position(i2);
        byteBuffer.limit(i822);
        ByteBuffer slice42 = byteBuffer.slice();
        byteBuffer.position(i822);
        int i1122 = ((i3 - 1) * i) + i922;
        byteBuffer.limit(i822 + i1122);
        ByteBuffer slice222 = byteBuffer.slice();
        byteBuffer.position(i1022);
        byteBuffer.limit(i1022 + i1122);
        ByteBuffer slice322 = byteBuffer.slice();
        textureBuffer2.release();
        return JavaI420Buffer.wrap(width, height, slice42, i, slice222, i, slice322, i, new xu5(byteBuffer, b));
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.videoFrameDrawer.release();
        this.threadChecker.detachThread();
    }

    public YuvConverter() {
        this(new VideoFrameDrawer());
    }
}
