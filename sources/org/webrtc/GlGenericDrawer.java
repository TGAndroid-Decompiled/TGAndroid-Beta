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

        void onPrepareShader(GlShader glShader, float[] fArr, int i9, int i10, int i11, int i12);
    }

    public interface TextureCallback {
        void run(Bitmap bitmap, int i9);
    }

    public GlGenericDrawer(String str, ShaderCallbacks shaderCallbacks) {
        this("varying vec2 tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\nuniform mat4 tex_mat;\nvoid main() {\n  gl_Position = in_pos;\n  tc = (tex_mat * in_tc).xy;\n}\n", str, shaderCallbacks);
    }

    public static String createFragmentShaderString(String str, int i9, boolean z10) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i9 == 0) {
            sb2.append("#extension GL_OES_EGL_image_external : require\n");
        }
        sb2.append("precision highp float;\n");
        if (!z10) {
            sb2.append("varying vec2 tc;\n");
        }
        if (i9 == 2) {
            sb2.append("uniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nvec4 sample(vec2 p) {\n  float y = texture2D(y_tex, p).r * 1.16438;\n  float u = texture2D(u_tex, p).r;\n  float v = texture2D(v_tex, p).r;\n  return vec4(y + 1.59603 * v - 0.874202,\n    y - 0.391762 * u - 0.812968 * v + 0.531668,\n    y + 2.01723 * u - 1.08563, 1);\n}\n");
            sb2.append(str);
        } else {
            if (i9 == 0) {
                str2 = "samplerExternalOES";
            } else {
                str2 = "sampler2D";
            }
            sb2.append("uniform ");
            sb2.append(str2);
            sb2.append(" tex;\n");
            if (z10) {
                sb2.append("precision mediump float;\nvarying vec2 tc;\nconst mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);\nuniform float texelWidthOffset;\nuniform float texelHeightOffset;\nvoid main(){\nint rad = 3;\nint diameter = 2 * rad + 1;\nvec4 sampleTex = vec4(0, 0, 0, 0);\nvec3 col = vec3(0, 0, 0);\nfloat weightSum = 0.0;\nfor(int i = 0; i < diameter; i++) {\nvec2 offset = vec2(float(i - rad) * texelWidthOffset, float(i - rad) * texelHeightOffset);\nsampleTex = vec4(texture2D(tex, tc.st+offset));\nfloat index = float(i);\nfloat boxWeight = float(rad) + 1.0 - abs(index - float(rad));\ncol += sampleTex.rgb * boxWeight;\nweightSum += boxWeight;\n}\nvec3 result = col / weightSum;\nlowp float satLuminance = dot(result.rgb, satLuminanceWeighting);\nlowp vec3 greyScaleColor = vec3(satLuminance);\ngl_FragColor = vec4(clamp(mix(greyScaleColor, result.rgb, 1.1), 0.0, 1.0), 1.0);\n}\n");
            } else {
                sb2.append(str.replace("sample(", "texture2D(tex, "));
            }
        }
        return sb2.toString();
    }

    private void ensureRenderTargetCreated(int i9, int i10, int i11) {
        if (this.renderFrameBuffer == null) {
            int[] iArr = new int[2];
            this.renderFrameBuffer = iArr;
            GLES20.glGenFramebuffers(2, iArr, 0);
            GLES20.glGenTextures(2, this.renderTexture, 0);
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.renderTexture;
                if (i12 >= iArr2.length) {
                    break;
                }
                GLES20.glBindTexture(3553, iArr2[i12]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                i12++;
            }
            float[] fArr = new float[16];
            this.renderMatrix = fArr;
            Matrix.setIdentityM(fArr, 0);
        }
        if (this.renderTextureWidth[i11] != i9) {
            this.renderTextureDownscale = Math.max(1.0f, Math.max(i9, i10) / 50.0f);
            GLES20.glBindTexture(3553, this.renderTexture[i11]);
            float f10 = this.renderTextureDownscale;
            GLES20.glTexImage2D(3553, 0, 6408, (int) (i9 / f10), (int) (i10 / f10), 0, 6408, 5121, null);
            this.renderTextureWidth[i11] = i9;
            this.renderTextureHeight[i11] = i10;
        }
    }

    private void prepareShader(int i9, float[] fArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        float f10;
        if (i16 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        GlShader glShader = this.currentShader[i9][i16];
        if (glShader == null) {
            try {
                glShader = createShader(i9, z10);
                this.currentShader[i9][i16] = glShader;
                glShader.useProgram();
                if (i9 == 2) {
                    GLES20.glUniform1i(glShader.getUniformLocation("y_tex"), 0);
                    GLES20.glUniform1i(glShader.getUniformLocation("u_tex"), 1);
                    GLES20.glUniform1i(glShader.getUniformLocation("v_tex"), 2);
                } else {
                    GLES20.glUniform1i(glShader.getUniformLocation("tex"), 0);
                }
                GlUtil.checkNoGLES2Error("Create shader");
                this.shaderCallbacks.onNewShader(glShader);
                if (z10) {
                    this.texelLocation[i9][0] = glShader.getUniformLocation("texelWidthOffset");
                    this.texelLocation[i9][1] = glShader.getUniformLocation("texelHeightOffset");
                }
                this.texMatrixLocation[i9][i16] = glShader.getUniformLocation("tex_mat");
                this.inPosLocation[i9][i16] = glShader.getAttribLocation("in_pos");
                this.inTcLocation[i9][i16] = glShader.getAttribLocation("in_tc");
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        GlShader glShader2 = glShader;
        glShader2.useProgram();
        if (z10) {
            int i17 = this.texelLocation[i9][0];
            float f11 = 0.0f;
            if (i16 == 1) {
                f10 = 1.0f / i10;
            } else {
                f10 = 0.0f;
            }
            GLES20.glUniform1f(i17, f10);
            int i18 = this.texelLocation[i9][1];
            if (i16 == 2) {
                f11 = 1.0f / i11;
            }
            GLES20.glUniform1f(i18, f11);
        }
        GLES20.glEnableVertexAttribArray(this.inPosLocation[i9][i16]);
        GLES20.glVertexAttribPointer(this.inPosLocation[i9][i16], 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_BUFFER);
        GLES20.glEnableVertexAttribArray(this.inTcLocation[i9][i16]);
        GLES20.glVertexAttribPointer(this.inTcLocation[i9][i16], 2, 5126, false, 0, (Buffer) FULL_RECTANGLE_TEXTURE_BUFFER);
        GLES20.glUniformMatrix4fv(this.texMatrixLocation[i9][i16], 1, false, fArr, 0);
        this.shaderCallbacks.onPrepareShader(glShader2, fArr, i12, i13, i14, i15);
        GlUtil.checkNoGLES2Error("Prepare shader");
    }

    public GlShader createShader(int i9, boolean z10) {
        return new GlShader(this.vertexShader, createFragmentShaderString(this.genericFragmentSource, i9, z10));
    }

    @Override
    public void drawOes(int i9, int i10, int i11, int i12, int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10) {
        if (z10) {
            ensureRenderTargetCreated(i10, i11, 1);
            this.textureMatrix = fArr;
            float f10 = this.renderTextureDownscale;
            int i20 = (int) (i10 / f10);
            int i21 = (int) (i11 / f10);
            GLES20.glViewport(0, 0, i20, i21);
            int i22 = i20;
            int i23 = i21;
            prepareShader(0, this.renderMatrix, i12, i13, i14, i15, i18, i19, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i9);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            GLES20.glBindFramebuffer(36160, 0);
            if (i12 == i10) {
                i23 = i22;
                i22 = i23;
            }
            ensureRenderTargetCreated(i10, i11, 0);
            prepareShader(1, this.renderMatrix, i12 != i10 ? i22 : i23, i12 != i10 ? i23 : i22, i14, i15, i18, i19, 1);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[1]);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(i16, i17, i18, i19);
            prepareShader(1, fArr, i12 != i10 ? i22 : i23, i12 != i10 ? i23 : i22, i14, i15, i18, i19, 2);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[0]);
            GLES20.glDrawArrays(5, 0, 4);
            return;
        }
        prepareShader(0, fArr, i12, i13, i14, i15, i18, i19, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i9);
        GLES20.glViewport(i16, i17, i18, i19);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(36197, 0);
    }

    @Override
    public void drawRgb(int i9, int i10, int i11, int i12, int i13, float[] fArr, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10) {
        prepareShader(1, fArr, i12, i13, i14, i15, i18, i19, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i9);
        GLES20.glViewport(i16, i17, i18, i19);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, 0);
    }

    @Override
    public void drawYuv(int[] iArr, int i9, int i10, int i11, int i12, float[] fArr, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10) {
        if (z10 && i9 > 0 && i10 > 0) {
            this.textureMatrix = fArr;
            ensureRenderTargetCreated(i9, i10, 1);
            float f10 = this.renderTextureDownscale;
            int i19 = (int) (i9 / f10);
            int i20 = (int) (i10 / f10);
            GLES20.glViewport(0, 0, i19, i20);
            int i21 = i19;
            int i22 = i20;
            prepareShader(2, this.renderMatrix, i11, i12, i13, i14, i17, i18, 0);
            for (int i23 = 0; i23 < 3; i23++) {
                GLES20.glActiveTexture(i23 + 33984);
                GLES20.glBindTexture(3553, iArr[i23]);
            }
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[1]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[1], 0);
            GLES20.glDrawArrays(5, 0, 4);
            for (int i24 = 0; i24 < 3; i24++) {
                GLES20.glActiveTexture(i24 + 33984);
                GLES20.glBindTexture(3553, 0);
            }
            GLES20.glBindFramebuffer(36160, 0);
            if (i11 == i9) {
                i22 = i21;
                i21 = i22;
            }
            ensureRenderTargetCreated(i9, i10, 0);
            prepareShader(1, this.renderMatrix, i11 != i9 ? i21 : i22, i11 != i9 ? i22 : i21, i13, i14, i17, i18, 1);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[1]);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(i15, i16, i17, i18);
            prepareShader(1, fArr, i11 != i9 ? i21 : i22, i11 != i9 ? i22 : i21, i13, i14, i17, i18, 2);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.renderTexture[0]);
            GLES20.glDrawArrays(5, 0, 4);
            return;
        }
        prepareShader(2, fArr, i11, i12, i13, i14, i17, i18, 0);
        for (int i25 = 0; i25 < 3; i25++) {
            GLES20.glActiveTexture(i25 + 33984);
            GLES20.glBindTexture(3553, iArr[i25]);
        }
        GLES20.glViewport(i15, i16, i17, i18);
        GLES20.glDrawArrays(5, 0, 4);
        for (int i26 = 0; i26 < 3; i26++) {
            GLES20.glActiveTexture(i26 + 33984);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public void getRenderBufferBitmap(int i9, TextureCallback textureCallback) {
        float[] fArr;
        if (this.renderFrameBuffer != null && (fArr = this.textureMatrix) != null) {
            double asin = Math.asin(fArr[2]);
            if (asin < 1.5707963267948966d && asin > -1.5707963267948966d) {
                float[] fArr2 = this.textureMatrix;
                i9 = (int) ((-Math.atan((-fArr2[1]) / fArr2[0])) / 0.017453292519943295d);
            }
            float f10 = this.renderTextureDownscale;
            int i10 = (int) (this.renderTextureWidth[0] / f10);
            int i11 = (int) (this.renderTextureHeight[0] / f10);
            GLES20.glBindFramebuffer(36160, this.renderFrameBuffer[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.renderTexture[0], 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i11 * 4);
            GLES20.glReadPixels(0, 0, i10, i11, 6408, 5121, allocateDirect);
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            GLES20.glBindFramebuffer(36160, 0);
            textureCallback.run(createBitmap, i9);
            return;
        }
        textureCallback.run(null, 0);
    }

    @Override
    public void release() {
        for (int i9 = 0; i9 < this.currentShader.length; i9++) {
            int i10 = 0;
            while (true) {
                GlShader[] glShaderArr = this.currentShader[i9];
                if (i10 < glShaderArr.length) {
                    GlShader glShader = glShaderArr[i10];
                    if (glShader != null) {
                        glShader.release();
                        this.currentShader[i9][i10] = null;
                    }
                    i10++;
                }
            }
        }
        int[] iArr = this.renderFrameBuffer;
        if (iArr != null) {
            GLES20.glDeleteFramebuffers(2, iArr, 0);
            GLES20.glDeleteTextures(2, this.renderTexture, 0);
        }
    }

    public GlGenericDrawer(String str, String str2, ShaderCallbacks shaderCallbacks) {
        this.currentShader = (GlShader[][]) Array.newInstance(GlShader.class, 3, 3);
        Class cls = Integer.TYPE;
        this.inPosLocation = (int[][]) Array.newInstance(cls, 3, 3);
        this.inTcLocation = (int[][]) Array.newInstance(cls, 3, 3);
        this.texMatrixLocation = (int[][]) Array.newInstance(cls, 3, 3);
        this.texelLocation = (int[][]) Array.newInstance(cls, 3, 3);
        this.renderTexture = new int[2];
        this.renderTextureWidth = new int[2];
        this.renderTextureHeight = new int[2];
        this.vertexShader = str;
        this.genericFragmentSource = str2;
        this.shaderCallbacks = shaderCallbacks;
    }
}
