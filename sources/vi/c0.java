package vi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b10;
public final class c0 {
    public static b0 D;
    public static b0 E;
    public static final String F = l(1.75f, 4);
    public static final String G = l(4.0f, 9);
    public boolean A;
    public boolean B;
    public final int f50340a;
    public final int f50341b;
    public Size f50342c;
    public int d;
    public final boolean e;
    public final boolean f50343f;
    public final w f50344g;
    public final y h;
    public final z f50345i;
    public final x f50346j;
    public final a0 f50347k;
    public final w f50348l;
    public final w f50349m;
    public final y f50350n;
    public final FloatBuffer f50351o;
    public final FloatBuffer f50352p;
    public FloatBuffer f50353q;
    public FloatBuffer f50354r;
    public final int[] f50356t;
    public int f50357u;
    public long f50361z;
    public final int[] f50355s = new int[8];
    public int v = 0;
    public int f50358w = 1;
    public int f50359x = 0;
    public int f50360y = 1;
    public float C = -1.0f;

    public c0(int i10, Size size, int i11, boolean z10) {
        boolean z11;
        z zVar;
        int i12;
        x xVar;
        y yVar;
        float[] fArr;
        int i13;
        b0 b0Var;
        int round;
        float f7;
        float[] fArr2;
        Bitmap bitmap;
        int[] iArr = new int[10];
        this.f50356t = iArr;
        this.f50340a = i10;
        this.f50341b = Math.max(1, i10 / 2);
        this.f50342c = size;
        this.d = i11;
        this.e = z10;
        String glGetString = GLES20.glGetString(7939);
        if (glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f50343f = z11;
        this.f50344g = new w("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new y("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        if (z10) {
            zVar = new z();
        } else {
            zVar = null;
        }
        this.f50345i = zVar;
        if (z10) {
            ?? wVar = new w("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            int glGetUniformLocation = GLES20.glGetUniformLocation(wVar.f50630a, "bTexture");
            i12 = 8;
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(wVar.f50630a, "mTexture");
            GLES20.glUseProgram(wVar.f50630a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
            xVar = wVar;
        } else {
            i12 = 8;
            xVar = null;
        }
        this.f50346j = xVar;
        this.f50347k = new a0(z10, z11);
        this.f50348l = new w();
        this.f50349m = new w(G, 1);
        if (z10) {
            yVar = new y("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n");
        } else {
            yVar = null;
        }
        this.f50350n = yVar;
        float[] fArr3 = new float[656];
        fArr3[0] = 0.0f;
        fArr3[1] = 0.0f;
        fArr3[2] = 1.0f;
        fArr3[3] = 0.0f;
        fArr3[4] = 0.0f;
        fArr3[5] = 1.0f;
        fArr3[6] = 1.0f;
        fArr3[7] = 1.0f;
        float[] fArr4 = new float[48];
        fArr4[0] = -1.0f;
        fArr4[1] = -1.0f;
        fArr4[2] = 0.0f;
        fArr4[3] = 1.0f;
        fArr4[4] = -1.0f;
        fArr4[5] = 0.0f;
        fArr4[6] = -1.0f;
        fArr4[7] = 1.0f;
        fArr4[i12] = 0.0f;
        fArr4[9] = 1.0f;
        fArr4[10] = 1.0f;
        fArr4[11] = 0.0f;
        this.f50353q = j(size, i11, false);
        this.f50354r = j(size, i11, true);
        GLES20.glGenTextures(10, iArr, 0);
        if (z10) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i10);
            float f10 = i10 * 0.5f;
            float f11 = 2.0f;
            float f12 = f10 + 2.0f;
            for (int i14 = 0; i14 < i10; i14++) {
                float f13 = (i14 + 0.5f) - f10;
                int i15 = 0;
                while (i15 < i10) {
                    float f14 = f11;
                    float f15 = (i15 + 0.5f) - f10;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f12 + 0.5f) - ((float) Math.sqrt((f13 * f13) + (f15 * f15))))) * 255.0f));
                    i15++;
                    f11 = f14;
                    f12 = f12;
                }
            }
            float f16 = f11;
            allocateDirect.position(0);
            GLES20.glPixelStorei(3317, 1);
            int i16 = this.f50340a;
            GLES20.glTexImage2D(3553, 0, 6406, i16, i16, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            h(3);
            int i17 = this.f50340a;
            synchronized (c0.class) {
                try {
                    if (i17 == 360) {
                        b0Var = D;
                    } else if (i17 == 480) {
                        b0Var = E;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var != null) {
                        fArr2 = fArr3;
                        f7 = 1.0f;
                    } else {
                        float f17 = i17;
                        int round2 = Math.round((372.0f * f17) / 1536.0f);
                        int round3 = Math.round(0.2f * f17);
                        int round4 = round3 - (Math.round((f17 * 28.0f) / 1536.0f) * 2);
                        f7 = 1.0f;
                        int i18 = round4 * 4;
                        int max = Math.max(round4 * 8, round2);
                        int i19 = i18 + round2;
                        RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                        if (b10 != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(round3, round3, Bitmap.Config.ARGB_8888);
                            Bitmap createBitmap2 = Bitmap.createBitmap(max, i19, Bitmap.Config.ALPHA_8);
                            Canvas canvas = new Canvas(createBitmap2);
                            fArr2 = fArr3;
                            int i20 = 0;
                            while (i20 < 27) {
                                int i21 = i20;
                                b10.c(i21 * 2, createBitmap, true);
                                canvas.drawBitmap(createBitmap, (round4 * (i20 % 8)) - round, ((i20 / 8) * round4) - round, (Paint) null);
                                i20 = i21 + 1;
                                b10 = b10;
                            }
                            RLottieNative rLottieNative = b10;
                            Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                            if (bitmapFromRaw != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round2, round2, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = createBitmap;
                                canvas.drawBitmap(extractAlpha, 0.0f, i18, (Paint) null);
                                extractAlpha.recycle();
                                createScaledBitmap.recycle();
                                bitmapFromRaw.recycle();
                            } else {
                                bitmap = createBitmap;
                            }
                            if (createBitmap2.getRowBytes() == max) {
                                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i19);
                                createBitmap2.copyPixelsToBuffer(allocateDirect2);
                                allocateDirect2.position(0);
                                b0 b0Var2 = new b0(max, i19, round2, round4, i18, allocateDirect2);
                                createBitmap2.recycle();
                                bitmap.recycle();
                                rLottieNative.d();
                                if (i17 == 360) {
                                    D = b0Var2;
                                } else if (i17 == 480) {
                                    E = b0Var2;
                                }
                                b0Var = b0Var2;
                            } else {
                                createBitmap2.recycle();
                                bitmap.recycle();
                                rLottieNative.d();
                                throw new IllegalStateException("Unexpected watermark atlas stride");
                            }
                        } else {
                            throw new IllegalStateException("Unable to load watermark animation");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i22 = 0;
            while (i22 < 27) {
                int i23 = i22 % 8;
                int i24 = i22 / 8;
                int i25 = i22 * 24;
                float[] fArr5 = fArr2;
                s(fArr5, i25 + 8, 0.0f, b0Var.e / b0Var.f50336b, b0Var.f50337c / b0Var.f50335a, 1.0f);
                int i26 = i25 + 20;
                int i27 = b0Var.d;
                float f18 = b0Var.f50335a;
                float f19 = b0Var.f50336b;
                s(fArr5, i26, (i27 * i23) / f18, (i27 * i24) / f19, ((i23 + 1) * i27) / f18, ((i24 + 1) * i27) / f19);
                i22++;
                fArr2 = fArr5;
            }
            fArr = fArr2;
            float f20 = (b0Var.f50337c / this.f50340a) * f16;
            t(fArr4, 12, f7 - f20, f7, f20 - 1.0f);
            float c10 = a1.g.c(b0Var.d, this.f50340a, f16, -1.0f);
            t(fArr4, 30, -1.0f, c10, c10);
            ByteBuffer duplicate = b0Var.f50338f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, b0Var.f50335a, b0Var.f50336b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(i12, 48, 48);
        } else {
            fArr = fArr3;
        }
        k(4, i10, i10);
        k(5, 512, 512);
        k(6, i10, i10);
        int i28 = this.f50341b;
        k(7, i28, i28);
        int i29 = this.f50341b;
        k(9, i29, i29);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.f50355s;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z10) {
            b(0, 0);
            b(1, 1);
            i13 = 6;
            b(6, 8);
        } else {
            i13 = 6;
        }
        b(2, 4);
        b(3, 5);
        b(4, i13);
        b(5, 7);
        b(7, 9);
        GLES20.glBindFramebuffer(36160, 0);
        this.f50351o = i(fArr4);
        this.f50352p = i(fArr);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
    }

    public static int a(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(b10.j("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i10) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer h = vh.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        return h;
    }

    public static FloatBuffer j(Size size, int i10, boolean z10) {
        int width;
        int height;
        int min = Math.min(i10, Math.min(size.getWidth(), size.getHeight()));
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        if (z10) {
            height = size.getWidth();
        } else {
            height = size.getHeight();
        }
        float f7 = min;
        float f10 = f7 / (width * 2.0f);
        float f11 = f7 / (height * 2.0f);
        float f12 = 0.5f - f10;
        float f13 = 0.5f - f11;
        float f14 = f10 + 0.5f;
        float f15 = f11 + 0.5f;
        return i(new float[]{f12, f13, f14, f13, f12, f15, f14, f15});
    }

    public static String l(float f7, int i10) {
        double d;
        float f10;
        float x9;
        int i11 = -i10;
        double d10 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i11 > i10) {
                break;
            }
            double d11 = f7;
            d10 += Math.exp((-(i11 * i11)) / ((2.0d * d11) * d11));
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(4096);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb2.append(Float.toString((float) (1.0d / d10)));
        sb2.append(";\n");
        int i12 = 1;
        while (i12 <= i10) {
            double d12 = f7;
            double d13 = d12 * d * d12;
            float exp = (float) (Math.exp((-(i12 * i12)) / d13) / d10);
            int i13 = i12 + 1;
            if (i13 <= i10) {
                f10 = (float) (Math.exp((-(i13 * i13)) / d13) / d10);
            } else {
                f10 = 0.0f;
            }
            float f11 = exp + f10;
            if (f10 == 0.0f) {
                x9 = i12;
            } else {
                x9 = c3.h0.x(i13, f10, i12 * exp, f11);
            }
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(x9));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(x9));
            sb2.append(").rgb) * ");
            sb2.append(Float.toString(f11));
            sb2.append(";\n");
            i12 += 2;
            d = 2.0d;
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void s(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f12;
        fArr[i10 + 2] = f11;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = f7;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f7;
        fArr[i10 + 7] = f10;
        fArr[i10 + 8] = f11;
        fArr[i10 + 9] = f12;
        fArr[i10 + 10] = f11;
        fArr[i10 + 11] = f10;
    }

    public static void t(float[] fArr, int i10, float f7, float f10, float f11) {
        u(fArr, i10, f7, -1.0f);
        u(fArr, i10 + 3, f10, -1.0f);
        u(fArr, i10 + 6, f7, f11);
        u(fArr, i10 + 9, f7, f11);
        u(fArr, i10 + 12, f10, -1.0f);
        u(fArr, i10 + 15, f10, f11);
    }

    public static void u(float[] fArr, int i10, float f7, float f10) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f10;
        fArr[i10 + 2] = 0.0f;
    }

    public final void b(int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.f50355s[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f50356t[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(w wVar, float[] fArr) {
        FloatBuffer floatBuffer;
        GLES20.glUseProgram(wVar.f50630a);
        this.f50351o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f50351o);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            floatBuffer = this.f50354r;
        } else {
            floatBuffer = this.f50353q;
        }
        FloatBuffer floatBuffer2 = floatBuffer;
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(wVar.d, 2, 5126, false, 8, (Buffer) floatBuffer2);
        GLES20.glUniformMatrix4fv(wVar.e, 1, false, fArr, 0);
    }

    public final void e(y yVar, int i10, int i11) {
        GLES20.glUseProgram(yVar.f50630a);
        this.f50351o.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f50351o);
        this.f50352p.position(i10);
        GLES20.glVertexAttribPointer(yVar.d, 2, 5126, false, 8, (Buffer) this.f50352p);
    }

    public final void f(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.f50356t[i11]);
    }

    public final void g(float[] fArr, int i10, boolean z10) {
        char c10;
        GLES20.glDisable(3042);
        int[] iArr = this.f50356t;
        if (!z10) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        if (z10) {
            c10 = 4;
        } else {
            c10 = 2;
        }
        int[] iArr2 = this.f50355s;
        GLES20.glBindFramebuffer(36160, iArr2[c10]);
        int i11 = this.f50340a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.f50344g, fArr);
        d(i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i12 = this.f50358w;
            this.f50360y = i12;
            if (this.e) {
                q(i10, fArr, i12, 0.0f);
                int i13 = this.f50360y;
                n(0.020833334f, 0.0f, i13, 6);
                n(0.0f, 0.020833334f, 8, i13);
            }
            this.C = -1.0f;
            this.B = true;
            return;
        }
        GLES20.glBindFramebuffer(36160, iArr2[3]);
        GLES20.glViewport(0, 0, 512, 512);
        e(this.h, 0, 0);
        f(0, 4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, iArr[5]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glTexParameteri(3553, 10241, 9987);
        this.f50359x = this.v;
        this.f50360y = this.f50358w;
        this.B = false;
        this.C = -1.0f;
    }

    public final void h(int i10) {
        GLES20.glBindTexture(3553, this.f50356t[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i10, int i11, int i12) {
        h(i10);
        GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
    }

    public final void m(int i10, float[] fArr, long j10, int i11, int i12) {
        int i13;
        float f7;
        GLES20.glDisable(3042);
        if (this.e) {
            int i14 = this.f50358w;
            if (this.A) {
                long j11 = this.f50361z;
                if (j11 != 0) {
                    long j12 = j10 - j11;
                    if (j12 > 0 && j12 <= 100000000) {
                        f7 = (float) Math.exp((-j12) / 2.8E8d);
                        i13 = i10;
                        q(i13, fArr, i14, f7);
                        int i15 = this.f50358w;
                        n(0.020833334f, 0.0f, i15, 6);
                        n(0.0f, 0.020833334f, 8, i15);
                        int i16 = this.v;
                        int i17 = this.f50358w;
                        this.v = i17;
                        this.f50358w = i16;
                        this.A = true;
                        this.f50361z = j10;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i11, i12);
                        c(this.f50346j, fArr);
                        d(i13);
                        f(1, i17);
                        f(2, 2);
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            i13 = i10;
            f7 = 0.0f;
            q(i13, fArr, i14, f7);
            int i152 = this.f50358w;
            n(0.020833334f, 0.0f, i152, 6);
            n(0.0f, 0.020833334f, 8, i152);
            int i162 = this.v;
            int i172 = this.f50358w;
            this.v = i172;
            this.f50358w = i162;
            this.A = true;
            this.f50361z = j10;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f50346j, fArr);
            d(i13);
            f(1, i172);
            f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f50344g, fArr);
            d(i10);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.f50355s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        w wVar = this.f50348l;
        e(wVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(wVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f7, float f10, float f11, int i10, int i11) {
        float f12;
        float max;
        boolean z10 = this.B;
        int i12 = this.f50340a;
        if (z10) {
            float min = Math.min(f7, 9.0f);
            if (Math.abs(this.C - min) >= 0.2f) {
                float f13 = min / (i12 * 9);
                int i13 = this.f50341b;
                p(6, f13, 7, i13, 0.0f, i13);
                int i14 = this.f50341b;
                p(9, 0.0f, 5, i14, f13, i14);
                this.C = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        a0 a0Var = this.f50347k;
        e(a0Var, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        if (this.e) {
            f(4, this.f50359x);
            f(5, this.f50360y);
            f(6, 2);
        }
        float max2 = (Math.max(0.0f, f7) * 0.625f) / i12;
        GLES20.glUniform2f(a0Var.e, max2, max2);
        int i15 = a0Var.f50329f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f7) * 0.625f) * 512.0f) / f12) / Math.log(2.0d))) + 1.25f;
        if (this.f50343f) {
            max = Math.max(0.0f, min2);
        } else {
            max = Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i12) / Math.log(2.0d))));
        }
        GLES20.glUniform1f(i15, max);
        GLES20.glUniform1f(a0Var.f50330g, Math.max(0.0f, Math.min(1.0f, f7 / 2.0f)));
        GLES20.glUniform1f(a0Var.h, f10);
        GLES20.glUniform1f(a0Var.f50331i, f11);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i10, float f7, int i11, int i12, float f10, int i13) {
        GLES20.glBindFramebuffer(36160, this.f50355s[i11]);
        GLES20.glViewport(0, 0, i12, i13);
        w wVar = this.f50349m;
        e(wVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(wVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i10, float[] fArr, int i11, float f7) {
        boolean z10;
        int width;
        int height;
        GLES20.glBindFramebuffer(36160, this.f50355s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        z zVar = this.f50345i;
        c(zVar, fArr);
        d(i10);
        f(1, this.v);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(this.d, Math.min(this.f50342c.getWidth(), this.f50342c.getHeight()));
        Size size = this.f50342c;
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        float f10 = width;
        if (z10) {
            height = this.f50342c.getWidth();
        } else {
            height = this.f50342c.getHeight();
        }
        float f11 = min;
        float f12 = ((f11 / f10) / 48.0f) * 0.45f;
        float f13 = ((f11 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(zVar.f50633f, fArr[0] * f12, fArr[1] * f12);
        GLES20.glUniform2f(zVar.f50634g, fArr[4] * f13, fArr[5] * f13);
        GLES20.glUniform1f(zVar.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        y yVar;
        if (this.e && (yVar = this.f50350n) != null) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i10 = this.f50357u;
            this.f50357u = i10 + 1;
            e(yVar, ((i10 % 27) * 24) + 8, 12);
            f(0, 3);
            GLES20.glDrawArrays(4, 0, 12);
            GLES20.glDisable(3042);
        }
    }
}
