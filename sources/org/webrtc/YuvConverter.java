package org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLException;
import java.nio.ByteBuffer;
import org.webrtc.GlGenericDrawer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
public final class YuvConverter {
    private static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String TAG = "YuvConverter";
    private final GlGenericDrawer drawer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer;
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;
    private final VideoFrameDrawer videoFrameDrawer;

    public YuvConverter(VideoFrameDrawer videoFrameDrawer) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks(0);
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer("uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n", shaderCallbacks);
        this.videoFrameDrawer = videoFrameDrawer;
        threadChecker.detachThread();
    }

    private VideoFrame.I420Buffer convertInternal(VideoFrame.TextureBuffer textureBuffer) {
        int i;
        int i2;
        ByteBuffer byteBuffer;
        VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) this.videoFrameDrawer.prepareBufferForViewportSize(textureBuffer, textureBuffer.getWidth(), textureBuffer.getHeight());
        int width = textureBuffer2.getWidth();
        int height = textureBuffer2.getHeight();
        int i3 = ((width + 7) / 8) << 3;
        int i4 = (height + 1) / 2;
        int i5 = height + i4;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i3 * i5);
        int i6 = i3 / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        try {
            this.i420TextureFrameBuffer.setSize(i6, i5);
            GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
            GlUtil.checkNoGLES2Error("glBindFramebuffer");
            this.shaderCallbacks.setPlaneY();
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, 0, 0, i6, height);
            this.shaderCallbacks.setPlaneU();
            i = i4;
        } catch (RuntimeException e) {
            e = e;
            i = i4;
        }
        try {
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, 0, height, i6 / 2, i);
            this.shaderCallbacks.setPlaneV();
            VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, i6 / 2, height, i6 / 2, i);
            i2 = 0;
        } catch (RuntimeException e2) {
            e = e2;
            i2 = 0;
            byteBuffer = nativeAllocateByteBuffer;
            Logging.e("YuvConverter", "convert failed", e);
            int i7 = i3 * height;
            int i8 = i3 / 2;
            int i9 = i7 + i8;
            byteBuffer.position(i2);
            byteBuffer.limit(i7);
            ByteBuffer slice = byteBuffer.slice();
            byteBuffer.position(i7);
            int i10 = ((i - 1) * i3) + i8;
            byteBuffer.limit(i7 + i10);
            ByteBuffer slice2 = byteBuffer.slice();
            byteBuffer.position(i9);
            byteBuffer.limit(i9 + i10);
            ByteBuffer slice3 = byteBuffer.slice();
            textureBuffer2.release();
            return JavaI420Buffer.wrap(width, height, slice, i3, slice2, i3, slice3, i3, new bv5(byteBuffer, (byte) 1));
        }
        try {
            GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), 6408, 5121, nativeAllocateByteBuffer);
            byteBuffer = nativeAllocateByteBuffer;
        } catch (RuntimeException e3) {
            e = e3;
            byteBuffer = nativeAllocateByteBuffer;
            Logging.e("YuvConverter", "convert failed", e);
            int i72 = i3 * height;
            int i82 = i3 / 2;
            int i92 = i72 + i82;
            byteBuffer.position(i2);
            byteBuffer.limit(i72);
            ByteBuffer slice4 = byteBuffer.slice();
            byteBuffer.position(i72);
            int i102 = ((i - 1) * i3) + i82;
            byteBuffer.limit(i72 + i102);
            ByteBuffer slice22 = byteBuffer.slice();
            byteBuffer.position(i92);
            byteBuffer.limit(i92 + i102);
            ByteBuffer slice32 = byteBuffer.slice();
            textureBuffer2.release();
            return JavaI420Buffer.wrap(width, height, slice4, i3, slice22, i3, slice32, i3, new bv5(byteBuffer, (byte) 1));
        }
        try {
            GlUtil.checkNoGLES2Error("YuvConverter.convert");
            GLES20.glBindFramebuffer(36160, 0);
        } catch (RuntimeException e4) {
            e = e4;
            Logging.e("YuvConverter", "convert failed", e);
            int i722 = i3 * height;
            int i822 = i3 / 2;
            int i922 = i722 + i822;
            byteBuffer.position(i2);
            byteBuffer.limit(i722);
            ByteBuffer slice42 = byteBuffer.slice();
            byteBuffer.position(i722);
            int i1022 = ((i - 1) * i3) + i822;
            byteBuffer.limit(i722 + i1022);
            ByteBuffer slice222 = byteBuffer.slice();
            byteBuffer.position(i922);
            byteBuffer.limit(i922 + i1022);
            ByteBuffer slice322 = byteBuffer.slice();
            textureBuffer2.release();
            return JavaI420Buffer.wrap(width, height, slice42, i3, slice222, i3, slice322, i3, new bv5(byteBuffer, (byte) 1));
        }
        int i7222 = i3 * height;
        int i8222 = i3 / 2;
        int i9222 = i7222 + i8222;
        byteBuffer.position(i2);
        byteBuffer.limit(i7222);
        ByteBuffer slice422 = byteBuffer.slice();
        byteBuffer.position(i7222);
        int i10222 = ((i - 1) * i3) + i8222;
        byteBuffer.limit(i7222 + i10222);
        ByteBuffer slice2222 = byteBuffer.slice();
        byteBuffer.position(i9222);
        byteBuffer.limit(i9222 + i10222);
        ByteBuffer slice3222 = byteBuffer.slice();
        textureBuffer2.release();
        return JavaI420Buffer.wrap(width, height, slice422, i3, slice2222, i3, slice3222, i3, new bv5(byteBuffer, (byte) 1));
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        try {
            return convertInternal(textureBuffer);
        } catch (GLException e) {
            Logging.w("YuvConverter", "Failed to convert TextureBuffer", e);
            return null;
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.videoFrameDrawer.release();
        this.threadChecker.detachThread();
    }

    public static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        public ShaderCallbacks(int i) {
            this();
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

        private ShaderCallbacks() {
        }
    }

    public YuvConverter() {
        this(new VideoFrameDrawer());
    }
}
