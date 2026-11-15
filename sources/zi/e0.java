package zi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import com.google.android.gms.internal.vision.e2;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.RLottieNative;
public final class e0 {
    public static d0 E;
    public static d0 F;
    public static final String G = l(1.75f, 4);
    public static final String H = l(4.0f, 9);
    public long A;
    public boolean B;
    public boolean C;
    public final int f61489a;
    public final int f61490b;
    public Size f61491c;
    public int d;
    public final boolean f61492e;
    public final boolean f61493f;
    public final z f61494g;
    public final b3.h h;
    public final b0 f61495i;
    public final a0 f61496j;
    public final c0 f61497k;
    public final z f61498l;
    public final z f61499m;
    public final b3.h f61500n;
    public final FloatBuffer f61501o;
    public final FloatBuffer f61502p;
    public FloatBuffer f61503q;
    public FloatBuffer f61504r;
    public int f61505s;
    public final int[] f61507u;
    public int v;
    public final int[] f61506t = new int[8];
    public int f61508w = 0;
    public int f61509x = 1;
    public int f61510y = 0;
    public int f61511z = 1;
    public float D = -1.0f;

    public e0(int i7, int i10, Size size, boolean z10) {
        a0 a0Var;
        float[] fArr;
        int i11;
        int i12;
        int i13;
        d0 d0Var;
        int round;
        int i14;
        int[] iArr = new int[10];
        this.f61507u = iArr;
        this.f61489a = i7;
        this.f61490b = Math.max(1, i7 / 2);
        this.f61491c = size;
        this.d = i10;
        this.f61492e = z10;
        String glGetString = GLES20.glGetString(7939);
        boolean z11 = glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod");
        this.f61493f = z11;
        this.f61494g = new z("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new b3.h("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.f61495i = z10 ? new b0() : null;
        if (z10) {
            ?? zVar = new z("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            int glGetUniformLocation = GLES20.glGetUniformLocation(zVar.f2901a, "bTexture");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(zVar.f2901a, "mTexture");
            GLES20.glUseProgram(zVar.f2901a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
            a0Var = zVar;
        } else {
            a0Var = null;
        }
        this.f61496j = a0Var;
        this.f61497k = new c0(z10, z11);
        this.f61498l = new z();
        this.f61499m = new z(H, 1);
        this.f61500n = z10 ? new b3.h("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n") : null;
        float[] fArr2 = new float[656];
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 1.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[5] = 1.0f;
        fArr2[6] = 1.0f;
        fArr2[7] = 1.0f;
        float[] fArr3 = new float[48];
        fArr3[0] = -1.0f;
        fArr3[1] = -1.0f;
        fArr3[2] = 0.0f;
        fArr3[3] = 1.0f;
        fArr3[4] = -1.0f;
        fArr3[5] = 0.0f;
        fArr3[6] = -1.0f;
        fArr3[7] = 1.0f;
        fArr3[8] = 0.0f;
        fArr3[9] = 1.0f;
        fArr3[10] = 1.0f;
        fArr3[11] = 0.0f;
        v();
        GLES20.glGenTextures(10, iArr, 0);
        if (z10) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i7 * i7);
            float f10 = i7 * 0.5f;
            float f11 = 2.0f;
            float f12 = f10 + 2.0f;
            int i15 = 0;
            while (i15 < i7) {
                float f13 = (i15 + 0.5f) - f10;
                float f14 = f11;
                int i16 = 0;
                while (i16 < i7) {
                    float f15 = (i16 + 0.5f) - f10;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f12 + 0.5f) - ((float) Math.sqrt((f13 * f13) + (f15 * f15))))) * 255.0f));
                    i16++;
                    fArr3 = fArr3;
                }
                i15++;
                f11 = f14;
            }
            float[] fArr4 = fArr3;
            float f16 = f11;
            allocateDirect.position(0);
            GLES20.glPixelStorei(3317, 1);
            int i17 = this.f61489a;
            GLES20.glTexImage2D(3553, 0, 6406, i17, i17, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            h(3);
            int i18 = this.f61489a;
            synchronized (e0.class) {
                try {
                    if (i18 == 360) {
                        d0Var = E;
                    } else {
                        d0Var = i18 == 480 ? F : null;
                    }
                    if (d0Var == null) {
                        float f17 = i18;
                        int round2 = Math.round((372.0f * f17) / 1536.0f);
                        int round3 = Math.round(0.2f * f17);
                        int round4 = round3 - (Math.round((f17 * 28.0f) / 1536.0f) * 2);
                        int i19 = round4 * 4;
                        int max = Math.max(round4 * 8, round2);
                        int i20 = i19 + round2;
                        RLottieNative b10 = RLottieNative.b(org.telegram.messenger.g0.y2(null, 2131624137), null, null, null);
                        if (b10 != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(round3, round3, Bitmap.Config.ARGB_8888);
                            Bitmap createBitmap2 = Bitmap.createBitmap(max, i20, Bitmap.Config.ALPHA_8);
                            Canvas canvas = new Canvas(createBitmap2);
                            int i21 = 0;
                            for (int i22 = 27; i21 < i22; i22 = 27) {
                                b10.c(i21 * 2, createBitmap, true);
                                canvas.drawBitmap(createBitmap, ((i21 % 8) * round4) - round, ((i21 / 8) * round4) - round, (Paint) null);
                                i21++;
                                i20 = i20;
                            }
                            int i23 = i20;
                            Bitmap x02 = org.telegram.messenger.g0.x0();
                            if (x02 != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(x02, round2, round2, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                i14 = i19;
                                canvas.drawBitmap(extractAlpha, 0.0f, i19, (Paint) null);
                                extractAlpha.recycle();
                                createScaledBitmap.recycle();
                                x02.recycle();
                            } else {
                                i14 = i19;
                            }
                            if (createBitmap2.getRowBytes() == max) {
                                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i23);
                                createBitmap2.copyPixelsToBuffer(allocateDirect2);
                                allocateDirect2.position(0);
                                d0 d0Var2 = new d0(max, i23, round2, round4, i14, allocateDirect2);
                                createBitmap2.recycle();
                                createBitmap.recycle();
                                b10.d();
                                if (i18 == 360) {
                                    E = d0Var2;
                                } else if (i18 == 480) {
                                    F = d0Var2;
                                }
                                d0Var = d0Var2;
                            } else {
                                createBitmap2.recycle();
                                createBitmap.recycle();
                                b10.d();
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
            int i24 = 0;
            for (int i25 = 27; i24 < i25; i25 = i25) {
                int i26 = i24 % 8;
                int i27 = i24 / 8;
                int i28 = i24 * 24;
                s(fArr2, i28 + 8, 0.0f, d0Var.f61484e / d0Var.f61482b, d0Var.f61483c / d0Var.f61481a, 1.0f);
                int i29 = i28 + 20;
                int i30 = d0Var.d;
                float f18 = d0Var.f61481a;
                float f19 = d0Var.f61482b;
                s(fArr2, i29, (i30 * i26) / f18, (i30 * i27) / f19, ((i26 + 1) * i30) / f18, ((i27 + 1) * i30) / f19);
                i24++;
            }
            i11 = 3;
            i12 = 4;
            float f20 = (d0Var.f61483c / this.f61489a) * f16;
            fArr = fArr4;
            t(fArr, 12, 1.0f - f20, 1.0f, f20 - 1.0f);
            float c10 = e2.c(d0Var.d, this.f61489a, f16, -1.0f);
            t(fArr, 30, -1.0f, c10, c10);
            ByteBuffer duplicate = d0Var.f61485f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, d0Var.f61481a, d0Var.f61482b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(8, 48, 48);
        } else {
            fArr = fArr3;
            i11 = 3;
            i12 = 4;
        }
        k(i12, i7, i7);
        k(5, 512, 512);
        k(6, i7, i7);
        int i31 = this.f61490b;
        k(7, i31, i31);
        int i32 = this.f61490b;
        k(9, i32, i32);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.f61506t;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z10) {
            b(0, 0);
            b(1, 1);
            i13 = 6;
            b(6, 8);
        } else {
            i13 = 6;
        }
        b(2, i12);
        b(i11, 5);
        b(i12, i13);
        b(5, 7);
        b(7, 9);
        GLES20.glBindFramebuffer(36160, 0);
        this.f61501o = i(fArr);
        this.f61502p = i(fArr2);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
    }

    public static int a(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(r.b.k("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i7) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i7);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer h = i20.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        return h;
    }

    public static FloatBuffer j(int i7, int i10, Size size, boolean z10) {
        int width;
        int height;
        int min = Math.min(i7, Math.min(size.getWidth(), size.getHeight()));
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
        float f10 = min;
        float f11 = f10 / (width * 2.0f);
        float f12 = f10 / (height * 2.0f);
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr2 = new float[8];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 * 2;
            float f13 = fArr[i12];
            int i13 = i12 + 1;
            float f14 = fArr[i13];
            if (i10 != 90) {
                if (i10 != 180) {
                    if (i10 == 270) {
                        f14 = -f14;
                    }
                } else {
                    f13 = -f13;
                    f14 = -f14;
                }
                fArr2[i12] = (f13 * f11) + 0.5f;
                fArr2[i13] = (f14 * f12) + 0.5f;
            } else {
                f13 = -f13;
            }
            float f15 = f14;
            f14 = f13;
            f13 = f15;
            fArr2[i12] = (f13 * f11) + 0.5f;
            fArr2[i13] = (f14 * f12) + 0.5f;
        }
        return i(fArr2);
    }

    public static String l(float f10, int i7) {
        double d;
        float f11;
        float y10;
        int i10 = -i7;
        double d2 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i10 > i7) {
                break;
            }
            double d10 = f10;
            d2 += Math.exp((-(i10 * i10)) / ((2.0d * d10) * d10));
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(4096);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb2.append(Float.toString((float) (1.0d / d2)));
        sb2.append(";\n");
        int i11 = 1;
        while (i11 <= i7) {
            double d11 = f10;
            double d12 = d11 * d * d11;
            float exp = (float) (Math.exp((-(i11 * i11)) / d12) / d2);
            int i12 = i11 + 1;
            if (i12 <= i7) {
                f11 = (float) (Math.exp((-(i12 * i12)) / d12) / d2);
            } else {
                f11 = 0.0f;
            }
            float f12 = exp + f11;
            if (f11 == 0.0f) {
                y10 = i11;
            } else {
                y10 = e2.y(i12, f11, i11 * exp, f12);
            }
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(y10));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(y10));
            sb2.append(").rgb) * ");
            sb2.append(Float.toString(f12));
            sb2.append(";\n");
            i11 += 2;
            d = 2.0d;
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void s(float[] fArr, int i7, float f10, float f11, float f12, float f13) {
        fArr[i7] = f10;
        fArr[i7 + 1] = f13;
        fArr[i7 + 2] = f12;
        fArr[i7 + 3] = f13;
        fArr[i7 + 4] = f10;
        fArr[i7 + 5] = f11;
        fArr[i7 + 6] = f10;
        fArr[i7 + 7] = f11;
        fArr[i7 + 8] = f12;
        fArr[i7 + 9] = f13;
        fArr[i7 + 10] = f12;
        fArr[i7 + 11] = f11;
    }

    public static void t(float[] fArr, int i7, float f10, float f11, float f12) {
        u(fArr, i7, f10, -1.0f);
        u(fArr, i7 + 3, f11, -1.0f);
        u(fArr, i7 + 6, f10, f12);
        u(fArr, i7 + 9, f10, f12);
        u(fArr, i7 + 12, f11, -1.0f);
        u(fArr, i7 + 15, f11, f12);
    }

    public static void u(float[] fArr, int i7, float f10, float f11) {
        fArr[i7] = f10;
        fArr[i7 + 1] = f11;
        fArr[i7 + 2] = 0.0f;
    }

    public final void b(int i7, int i10) {
        GLES20.glBindFramebuffer(36160, this.f61506t[i7]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f61507u[i10], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(z zVar, float[] fArr) {
        FloatBuffer floatBuffer;
        GLES20.glUseProgram(zVar.f2901a);
        this.f61501o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f61501o);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            floatBuffer = this.f61504r;
        } else {
            floatBuffer = this.f61503q;
        }
        FloatBuffer floatBuffer2 = floatBuffer;
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(zVar.d, 2, 5126, false, 8, (Buffer) floatBuffer2);
        GLES20.glUniformMatrix4fv(zVar.f61812e, 1, false, fArr, 0);
    }

    public final void e(b3.h hVar, int i7, int i10) {
        GLES20.glUseProgram(hVar.f2901a);
        this.f61501o.position(i10);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f61501o);
        this.f61502p.position(i7);
        GLES20.glVertexAttribPointer(hVar.d, 2, 5126, false, 8, (Buffer) this.f61502p);
    }

    public final void f(int i7, int i10) {
        GLES20.glActiveTexture(i7 + 33984);
        GLES20.glBindTexture(3553, this.f61507u[i10]);
    }

    public final void g(float[] fArr, int i7, boolean z10) {
        char c10;
        GLES20.glDisable(3042);
        int[] iArr = this.f61507u;
        if (!z10) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        if (z10) {
            c10 = 4;
        } else {
            c10 = 2;
        }
        int[] iArr2 = this.f61506t;
        GLES20.glBindFramebuffer(36160, iArr2[c10]);
        int i10 = this.f61489a;
        GLES20.glViewport(0, 0, i10, i10);
        c(this.f61494g, fArr);
        d(i7);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i11 = this.f61509x;
            this.f61511z = i11;
            if (this.f61492e) {
                q(i7, fArr, i11, 0.0f);
                int i12 = this.f61511z;
                n(0.020833334f, 0.0f, i12, 6);
                n(0.0f, 0.020833334f, 8, i12);
            }
            this.D = -1.0f;
            this.C = true;
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
        this.f61510y = this.f61508w;
        this.f61511z = this.f61509x;
        this.C = false;
        this.D = -1.0f;
    }

    public final void h(int i7) {
        GLES20.glBindTexture(3553, this.f61507u[i7]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i7, int i10, int i11) {
        h(i7);
        GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
    }

    public final void m(int i7, float[] fArr, long j3, int i10, int i11) {
        int i12;
        float f10;
        GLES20.glDisable(3042);
        if (this.f61492e) {
            int i13 = this.f61509x;
            if (this.B) {
                long j10 = this.A;
                if (j10 != 0) {
                    long j11 = j3 - j10;
                    if (j11 > 0 && j11 <= 100000000) {
                        f10 = (float) Math.exp((-j11) / 2.8E8d);
                        i12 = i7;
                        q(i12, fArr, i13, f10);
                        int i14 = this.f61509x;
                        n(0.020833334f, 0.0f, i14, 6);
                        n(0.0f, 0.020833334f, 8, i14);
                        int i15 = this.f61508w;
                        int i16 = this.f61509x;
                        this.f61508w = i16;
                        this.f61509x = i15;
                        this.B = true;
                        this.A = j3;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i10, i11);
                        c(this.f61496j, fArr);
                        d(i12);
                        f(1, i16);
                        f(2, 2);
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            i12 = i7;
            f10 = 0.0f;
            q(i12, fArr, i13, f10);
            int i142 = this.f61509x;
            n(0.020833334f, 0.0f, i142, 6);
            n(0.0f, 0.020833334f, 8, i142);
            int i152 = this.f61508w;
            int i162 = this.f61509x;
            this.f61508w = i162;
            this.f61509x = i152;
            this.B = true;
            this.A = j3;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i10, i11);
            c(this.f61496j, fArr);
            d(i12);
            f(1, i162);
            f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i10, i11);
            c(this.f61494g, fArr);
            d(i7);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f10, float f11, int i7, int i10) {
        GLES20.glBindFramebuffer(36160, this.f61506t[i10]);
        GLES20.glViewport(0, 0, 48, 48);
        z zVar = this.f61498l;
        e(zVar, 0, 0);
        f(0, i7);
        GLES20.glUniform2f(zVar.f61812e, f10, f11);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f10, float f11, float f12, int i7, int i10) {
        float f13;
        float max;
        boolean z10 = this.C;
        int i11 = this.f61489a;
        if (z10) {
            float min = Math.min(f10, 9.0f);
            if (Math.abs(this.D - min) >= 0.2f) {
                float f14 = min / (i11 * 9);
                int i12 = this.f61490b;
                p(6, f14, 7, i12, 0.0f, i12);
                int i13 = this.f61490b;
                p(9, 0.0f, 5, i13, f14, i13);
                this.D = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i7, i10);
        GLES20.glDisable(3042);
        c0 c0Var = this.f61497k;
        e(c0Var, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        if (this.f61492e) {
            f(4, this.f61510y);
            f(5, this.f61511z);
            f(6, 2);
        }
        float max2 = (Math.max(0.0f, f10) * 0.625f) / i11;
        GLES20.glUniform2f(c0Var.f61474e, max2, max2);
        int i14 = c0Var.f61475f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f10) * 0.625f) * 512.0f) / f13) / Math.log(2.0d))) + 1.25f;
        if (this.f61493f) {
            max = Math.max(0.0f, min2);
        } else {
            max = Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i11) / Math.log(2.0d))));
        }
        GLES20.glUniform1f(i14, max);
        GLES20.glUniform1f(c0Var.f61476g, Math.max(0.0f, Math.min(1.0f, f10 / 2.0f)));
        GLES20.glUniform1f(c0Var.h, f11);
        GLES20.glUniform1f(c0Var.f61477i, f12);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i7, float f10, int i10, int i11, float f11, int i12) {
        GLES20.glBindFramebuffer(36160, this.f61506t[i10]);
        GLES20.glViewport(0, 0, i11, i12);
        z zVar = this.f61499m;
        e(zVar, 0, 0);
        f(0, i7);
        GLES20.glUniform2f(zVar.f61812e, f10, f11);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i7, float[] fArr, int i10, float f10) {
        boolean z10;
        int width;
        int height;
        GLES20.glBindFramebuffer(36160, this.f61506t[i10]);
        GLES20.glViewport(0, 0, 48, 48);
        b0 b0Var = this.f61495i;
        c(b0Var, fArr);
        d(i7);
        f(1, this.f61508w);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(this.d, Math.min(this.f61491c.getWidth(), this.f61491c.getHeight()));
        Size size = this.f61491c;
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        float f11 = width;
        if (z10) {
            height = this.f61491c.getWidth();
        } else {
            height = this.f61491c.getHeight();
        }
        float f12 = min;
        float f13 = ((f12 / f11) / 48.0f) * 0.45f;
        float f14 = ((f12 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(b0Var.f61470f, fArr[0] * f13, fArr[1] * f13);
        GLES20.glUniform2f(b0Var.f61471g, fArr[4] * f14, fArr[5] * f14);
        GLES20.glUniform1f(b0Var.h, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        b3.h hVar;
        if (this.f61492e && (hVar = this.f61500n) != null) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i7 = this.v;
            this.v = i7 + 1;
            e(hVar, ((i7 % 27) * 24) + 8, 12);
            f(0, 3);
            GLES20.glDrawArrays(4, 0, 12);
            GLES20.glDisable(3042);
        }
    }

    public final void v() {
        this.f61503q = j(this.d, this.f61505s, this.f61491c, false);
        this.f61504r = j(this.d, this.f61505s, this.f61491c, true);
    }
}
