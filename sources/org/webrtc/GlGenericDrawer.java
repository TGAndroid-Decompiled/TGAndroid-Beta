package org.webrtc;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.FileLog;
import org.webrtc.RendererCommon;

public class GlGenericDrawer implements RendererCommon.GlDrawer {
    private static final String DEFAULT_VERTEX_SHADER_STRING = "varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n";
    private static final FloatBuffer FULL_RECTANGLE_BUFFER = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer FULL_RECTANGLE_TEXTURE_BUFFER = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    private static final String INPUT_TEXTURE_COORDINATE_NAME = "in_tc";
    private static final String INPUT_VERTEX_COORDINATE_NAME = "in_pos";
    private static final int OES = 0;
    private static final int RGB = 1;
    private static final String TEXTURE_MATRIX_NAME = "tex_mat";
    private static final int YUV = 2;
    private GlShader[][] currentShader;
    private final String genericFragmentSource;
    private int[][] inPosLocation;
    private int[][] inTcLocation;
    private int[] renderFrameBuffer;
    private float[] renderMatrix;
    private int[] renderTexture;
    private float renderTextureDownscale;
    private int[] renderTextureHeight;
    private int[] renderTextureWidth;
    private final ShaderCallbacks shaderCallbacks;
    private int[][] texMatrixLocation;
    private int[][] texelLocation;
    private float[] textureMatrix;
    private final String vertexShader;

    public interface ShaderCallbacks {
        void onNewShader(GlShader glShader);

        void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4);
    }

    public interface TextureCallback {
        void run(Bitmap bitmap, int i);
    }

    static String createFragmentShaderString(String str, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            sb.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb.append("precision highp float;\n");
        if (!z) {
            sb.append("varying vec2 tc;\n");
        }
        if (i == 2) {
            sb.append("uniform sampler2D y_tex;\n");
            sb.append("uniform sampler2D u_tex;\n");
            sb.append("uniform sampler2D v_tex;\n");
            sb.append("vec4 sample(vec2 p) {\n");
            sb.append("  float y = texture2D(y_tex, p).r * 1.16438;\n");
            sb.append("  float u = texture2D(u_tex, p).r;\n");
            sb.append("  float v = texture2D(v_tex, p).r;\n");
            sb.append("  return vec4(y + 1.59603 * v - 0.874202,\n");
            sb.append("    y - 0.391762 * u - 0.812968 * v + 0.531668,\n");
            sb.append("    y + 2.01723 * u - 1.08563, 1);\n");
            sb.append("}\n");
            sb.append(str);
        } else {
            String str2 = i == 0 ? "samplerExternalOES" : "sampler2D";
            sb.append("uniform ");
            sb.append(str2);
            sb.append(" tex;\n");
            if (z) {
                sb.append("precision mediump float;\n");
                sb.append("varying vec2 tc;\n");
                sb.append("const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);\n");
                sb.append("uniform float texelWidthOffset;\n");
                sb.append("uniform float texelHeightOffset;\n");
                sb.append("void main(){\n");
                sb.append("int rad = 3;\n");
                sb.append("int diameter = 2 * rad + 1;\n");
                sb.append("vec4 sampleTex = vec4(0, 0, 0, 0);\n");
                sb.append("vec3 col = vec3(0, 0, 0);\n");
                sb.append("float weightSum = 0.0;\n");
                sb.append("for(int i = 0; i < diameter; i++) {\n");
                sb.append("vec2 offset = vec2(float(i - rad) * texelWidthOffset, float(i - rad) * texelHeightOffset);\n");
                sb.append("sampleTex = vec4(texture2D(tex, tc.st+offset));\n");
                sb.append("float index = float(i);\n");
                sb.append("float boxWeight = float(rad) + 1.0 - abs(index - float(rad));\n");
                sb.append("col += sampleTex.rgb * boxWeight;\n");
                sb.append("weightSum += boxWeight;\n");
                sb.append("}\n");
                sb.append("vec3 result = col / weightSum;\n");
                sb.append("lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);\n");
                sb.append("lowp vec3 greyScaleColor = vec3(satLuminance);\n");
                sb.append("gl_FragColor = vec4(clamp(mix(greyScaleColor, result.rgb, 1.1), 0.0, 1.0), 1.0);\n");
                sb.append("}\n");
            } else {
                sb.append(str.replace("sample(", "texture2D(tex, "));
            }
        }
        return sb.toString();
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this(DEFAULT_VERTEX_SHADER_STRING, str, shaderCallbacks);
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.currentShader = (GlShader[][]) Array.newInstance(GlShader.class, 3, 3);
        this.inPosLocation = (int[][]) Array.newInstance(int.class, 3, 3);
        this.inTcLocation = (int[][]) Array.newInstance(int.class, 3, 3);
        this.texMatrixLocation = (int[][]) Array.newInstance(int.class, 3, 3);
        this.texelLocation = (int[][]) Array.newInstance(int.class, 3, 3);
        this.renderTexture = new int[2];
        this.renderTextureWidth = new int[2];
        this.renderTextureHeight = new int[2];
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }

    GlShader createShader(int i, boolean z) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, i, z));
    }

    private void ensureRenderTargetCreated(int i, int i2, int i3) {
        if (this.renderFrameBuffer == null) {
            int[] iArr = new int[2];
            this.renderFrameBuffer = iArr;
            GLES20.glGenFramebuffers(2, iArr, 0);
            GLES20.glGenTextures(2, this.renderTexture, 0);
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.renderTexture;
                if (i4 >= iArr2.length) {
                    break;
                }
                GLES20.glBindTexture(3553, iArr2[i4]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                i4++;
            }
            float[] fArr = new float[16];
            this.renderMatrix = fArr;
            Matrix.setIdentityM(fArr, 0);
        }
        if (this.renderTextureWidth[i3] != i) {
            this.renderTextureDownscale = Math.max(1.0f, Math.max(i, i2) / 50.0f);
            GLES20.glBindTexture(3553, this.renderTexture[i3]);
            float f = this.renderTextureDownscale;
            GLES20.glTexImage2D(3553, 0, 6408, (int) (i / f), (int) (i2 / f), 0, 6408, 5121, null);
            this.renderTextureWidth[i3] = i;
            this.renderTextureHeight[i3] = i2;
        }
    }

    public void getRenderBufferBitmap(int i, TextureCallback textureCallback) {
        float[] fArr;
        if (this.renderFrameBuffer == null || (fArr = this.textureMatrix) == null) {
            textureCallback.run(null, 0);
            return;
        }
        double asin = Math.asin(fArr[2]);
        if (asin < 1.5707963267948966d && asin > -1.5707963267948966d) {
            float[] fArr2 = this.textureMatrix;
            i = (int) ((-Math.atan((-fArr2[1]) / fArr2[0])) / 0.017453292519943295d);
        }
        float f = this.renderTextureDownscale;
        int i2 = (int) (this.renderTextureWidth[0] / f);
        int i3 = (int) (this.renderTextureHeight[0] / f);
        GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        textureCallback.run(createBitmap, i);
    }

    @Override
    public void drawOes(int i, int i2, int i3, int i4, int i5, float[] fArr, int i6, int i7, int i8, int i9, int i10, int i11, boolean z) {
        if (z) {
            ensureRenderTargetCreated(i2, i3, 1);
            this.textureMatrix = fArr;
            float f = this.renderTextureDownscale;
            int i12 = (int) (i2 / f);
            int i13 = (int) (i3 / f);
            GLES20.glViewport(0, 0, i12, i13);
            int i14 = i13;
            int i15 = i12;
            prepareShader(0, this.renderMatrix, i4, i5, i6, i7, i10, i11, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            GLES20.glBindFramebuffer(36160, 0);
            if (i4 == i2) {
                i15 = i14;
                i14 = i15;
            }
            ensureRenderTargetCreated(i2, i3, 0);
            prepareShader(1, this.renderMatrix, i4 != i2 ? i15 : i14, i4 != i2 ? i14 : i15, i6, i7, i10, i11, 1);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[1]);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(i8, i9, i10, i11);
            prepareShader(1, fArr, i4 != i2 ? i15 : i14, i4 != i2 ? i14 : i15, i6, i7, i10, i11, 2);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[0]);
            GLES20.glDrawArrays(5, 0, 4);
            return;
        }
        prepareShader(0, fArr, i4, i5, i6, i7, i10, i11, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glViewport(i8, i9, i10, i11);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override
    public void drawRgb(int i, int i2, int i3, int i4, int i5, float[] fArr, int i6, int i7, int i8, int i9, int i10, int i11, boolean z) {
        prepareShader(1, fArr, i4, i5, i6, i7, i10, i11, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glViewport(i8, i9, i10, i11);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override
    public void drawYuv(int[] iArr, int i, int i2, int i3, int i4, float[] fArr, int i5, int i6, int i7, int i8, int i9, int i10, boolean z) {
        if (z && i > 0 && i2 > 0) {
            this.textureMatrix = fArr;
            ensureRenderTargetCreated(i, i2, 1);
            float f = this.renderTextureDownscale;
            int i11 = (int) (i / f);
            int i12 = (int) (i2 / f);
            GLES20.glViewport(0, 0, i11, i12);
            int i13 = i12;
            int i14 = i11;
            prepareShader(2, this.renderMatrix, i3, i4, i5, i6, i9, i10, 0);
            for (int i15 = 0; i15 < 3; i15++) {
                GLES20.glActiveTexture(i15 + 33984);
                GLES20.glBindTexture(3553, iArr[i15]);
            }
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
            GLES20.glDrawArrays(5, 0, 4);
            for (int i16 = 0; i16 < 3; i16++) {
                GLES20.glActiveTexture(i16 + 33984);
                GLES20.glBindTexture(3553, 0);
            }
            GLES20.glBindFramebuffer(36160, 0);
            if (i3 == i) {
                i14 = i13;
                i13 = i14;
            }
            ensureRenderTargetCreated(i, i2, 0);
            prepareShader(1, this.renderMatrix, i3 != i ? i14 : i13, i3 != i ? i13 : i14, i5, i6, i9, i10, 1);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[1]);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(i7, i8, i9, i10);
            prepareShader(1, fArr, i3 != i ? i14 : i13, i3 != i ? i13 : i14, i5, i6, i9, i10, 2);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[0]);
            GLES20.glDrawArrays(5, 0, 4);
            return;
        }
        prepareShader(2, fArr, i3, i4, i5, i6, i9, i10, 0);
        for (int i17 = 0; i17 < 3; i17++) {
            GLES20.glActiveTexture(i17 + 33984);
            GLES20.glBindTexture(3553, iArr[i17]);
        }
        GLES20.glViewport(i7, i8, i9, i10);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i18 = 0; i18 < 3; i18++) {
            GLES20.glActiveTexture(i18 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    private void prepareShader(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        GlShader createShader;
        boolean z = i8 != 0;
        GlShader[][] glShaderArr = this.currentShader;
        if (glShaderArr[i][i8] != null) {
            createShader = glShaderArr[i][i8];
        } else {
            try {
                createShader = createShader(i, z);
                this.currentShader[i][i8] = createShader;
                createShader.useProgram();
                if (i == 2) {
                    GLES20.glUniform1i(createShader.getUniformLocation("y_tex"), 0);
                    GLES20.glUniform1i(createShader.getUniformLocation("u_tex"), 1);
                    GLES20.glUniform1i(createShader.getUniformLocation("v_tex"), 2);
                } else {
                    GLES20.glUniform1i(createShader.getUniformLocation("tex"), 0);
                }
                GlUtil.checkNoGLES2Error("Create shader");
                this.shaderCallbacks.onNewShader(createShader);
                if (z) {
                    this.texelLocation[i][0] = createShader.getUniformLocation("texelWidthOffset");
                    this.texelLocation[i][1] = createShader.getUniformLocation("texelHeightOffset");
                }
                this.texMatrixLocation[i][i8] = createShader.getUniformLocation(TEXTURE_MATRIX_NAME);
                this.inPosLocation[i][i8] = createShader.getAttribLocation(INPUT_VERTEX_COORDINATE_NAME);
                this.inTcLocation[i][i8] = createShader.getAttribLocation(INPUT_TEXTURE_COORDINATE_NAME);
            } catch (Exception e) {
                FileLog.m31e(e);
                return;
            }
        }
        GlShader glShader = createShader;
        glShader.useProgram();
        if (z) {
            GLES20.glUniform1f(this.texelLocation[i][0], i8 == 1 ? 1.0f / i2 : 0.0f);
            GLES20.glUniform1f(this.texelLocation[i][1], i8 == 2 ? 1.0f / i3 : 0.0f);
        }
        GLES20.glEnableVertexAttribArray(this.inPosLocation[i][i8]);
        GLES20.glVertexAttribPointer(this.inPosLocation[i][i8], 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation[i][i8]);
        GLES20.glVertexAttribPointer(this.inTcLocation[i][i8], 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation[i][i8], 1, false, fArr, 0);
        this.shaderCallbacks.onPrepareShader(glShader, fArr, i4, i5, i6, i7);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    @Override
    public void release() {
        for (int i = 0; i < this.currentShader.length; i++) {
            int i2 = 0;
            while (true) {
                GlShader[][] glShaderArr = this.currentShader;
                if (i2 < glShaderArr[i].length) {
                    if (glShaderArr[i][i2] != null) {
                        glShaderArr[i][i2].release();
                        this.currentShader[i][i2] = null;
                    }
                    i2++;
                }
            }
        }
        int[] iArr = this.renderFrameBuffer;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(2, iArr, 0);
            GLES20.glDeleteTextures(2, this.renderTexture, 0);
        }
    }
}
