package vg;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import c8.ad;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
public final class a {
    public static final String[] D = {"crownGradient", "pavilionGradient", "lightSweep", "crownSweep", "rightCrownSweep", "leftCrownSweep", "pavilionSweep", "rightPavilionSweep", "leftPavilionSweep"};
    public boolean A;
    public int C;
    public final float[] f57248m;
    public final float[] f57249n;
    public final float[] f57250o;
    public final float[] f57251p;
    public final float[] f57252q;
    public final float[] f57253r;
    public int f57255t;
    public int f57256u;
    public int v;
    public final int f57257w;
    public double f57258x;
    public float f57259y;
    public float f57260z;
    public final int[] f57238a = new int[3];
    public final int[] f57239b = new int[4];
    public final int[] f57240c = new int[3];
    public final int[] d = new int[3];
    public final int[] f57241e = new int[2];
    public final int[] f57242f = new int[2];
    public final int[] f57243g = new int[1];
    public final HashMap h = new HashMap();
    public final float[] f57244i = new float[16];
    public final float[] f57245j = new float[16];
    public final float[] f57246k = new float[16];
    public final float[] f57247l = new float[42];
    public float f57254s = 1.0f;
    public float B = 1.0f;

    public a(Context context, int i7) {
        int i10;
        String str;
        try {
            String[] strArr = {"diamond", "sparkle", "copy"};
            for (int i11 = 0; i11 < 3; i11++) {
                if (i11 == 2) {
                    str = "fullscreenVertex";
                } else {
                    str = strArr[i11] + "Vertex";
                }
                this.f57238a[i11] = ad.a(context, j(context, str), j(context, strArr[i11] + "Fragment"));
            }
            float[] a10 = a(context, "frames");
            this.f57248m = a10;
            float[] a11 = a(context, "planes");
            this.f57249n = a11;
            float[] a12 = a(context, "anchors");
            this.f57250o = a12;
            float[] a13 = a(context, "widths");
            this.f57251p = a13;
            float[] a14 = a(context, "facetProjection");
            this.f57252q = a14;
            float[] a15 = a(context, "camera");
            this.f57253r = a15;
            if (a12.length == 64 && a13.length == 91 && a14.length == 4 && a15.length == 3) {
                if (a10.length == 60522 && a11.length == 68) {
                    int[] iArr = this.f57239b;
                    GLES30.glGenVertexArrays(iArr.length, iArr, 0);
                    int[] iArr2 = this.f57240c;
                    GLES20.glGenBuffers(iArr2.length, iArr2, 0);
                    String[] strArr2 = {"vertices", "main", "small"};
                    for (int i12 = 0; i12 < 3; i12++) {
                        float[] a16 = a(context, strArr2[i12]);
                        if (i12 == 0) {
                            i10 = 3;
                        } else {
                            i10 = 2;
                        }
                        this.d[i12] = a16.length / (i10 * 4);
                        GLES30.glBindVertexArray(this.f57239b[i12]);
                        GLES20.glBindBuffer(34962, this.f57240c[i12]);
                        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(a16.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        asFloatBuffer.put(a16).position(0);
                        GLES20.glBufferData(34962, a16.length * 4, asFloatBuffer, 35044);
                        for (int i13 = 0; i13 < i10; i13++) {
                            GLES20.glEnableVertexAttribArray(i13);
                            GLES20.glVertexAttribPointer(i13, 4, 5126, false, i10 * 16, i13 * 16);
                        }
                    }
                    GLES20.glGenFramebuffers(2, this.f57241e, 0);
                    GLES20.glGenRenderbuffers(2, this.f57242f, 0);
                    GLES20.glGenTextures(1, this.f57243g, 0);
                    GLES20.glBindTexture(3553, this.f57243g[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    int[] iArr3 = new int[1];
                    GLES20.glGetIntegerv(36183, iArr3, 0);
                    this.f57257w = Math.min(i7, iArr3[0]);
                    return;
                }
                throw new IllegalStateException("Invalid Swift diamond animation data");
            }
            throw new IllegalStateException("Invalid Swift diamond camera data");
        } catch (Exception e10) {
            b();
            throw new IllegalStateException("Cannot load Swift diamond", e10);
        }
    }

    public static float[] a(Context context, String str) {
        byte[] g10 = g(context, "models/diamond_ios/" + str + ".bin");
        float[] fArr = new float[g10.length / 4];
        ByteBuffer.wrap(g10).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(fArr);
        return fArr;
    }

    public static byte[] g(Context context, String str) {
        InputStream open = context.getAssets().open(str);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    open.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static float i(float f10) {
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        return com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
    }

    public static String j(Context context, String str) {
        return new String(g(context, "shaders/diamond/" + str + ".glsl"), StandardCharsets.UTF_8);
    }

    public final void b() {
        int[] iArr;
        for (int i7 : this.f57238a) {
            if (i7 != 0) {
                GLES20.glDeleteProgram(i7);
            }
        }
        int[] iArr2 = this.f57240c;
        GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
        int[] iArr3 = this.f57239b;
        GLES30.glDeleteVertexArrays(iArr3.length, iArr3, 0);
        int[] iArr4 = this.f57243g;
        GLES20.glDeleteTextures(iArr4.length, iArr4, 0);
        int[] iArr5 = this.f57241e;
        GLES20.glDeleteFramebuffers(iArr5.length, iArr5, 0);
        int[] iArr6 = this.f57242f;
        GLES20.glDeleteRenderbuffers(iArr6.length, iArr6, 0);
    }

    public final void c(int i7, int i10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z9) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        float abs;
        float f16;
        float f17;
        float f18;
        int i15;
        if (i7 > 0 && i10 > 0) {
            float max = Math.max(0.0f, Math.min(f13, 0.1f));
            double d = this.f57258x + max;
            this.f57258x = d;
            float f19 = (float) d;
            double d2 = (d * 240.0d) % 1440.0d;
            int i16 = (int) d2;
            float f20 = (float) (d2 - i16);
            int i17 = 0;
            int i18 = 0;
            while (true) {
                float[] fArr = this.f57247l;
                if (i18 >= fArr.length) {
                    break;
                }
                float[] fArr2 = this.f57248m;
                float f21 = fArr2[(i16 * 42) + i18];
                fArr[i18] = com.google.android.recaptcha.internal.a.z(fArr2[((1 + i16) * 42) + i18], f21, f20, f21);
                i18++;
            }
            float f22 = i7;
            int max2 = Math.max(1, Math.round(this.B * f22));
            float f23 = i10;
            int max3 = Math.max(1, Math.round(this.B * f23));
            int i19 = this.f57256u;
            int i20 = 36160;
            int[] iArr = this.f57241e;
            if (max2 == i19 && max3 == this.v) {
                z10 = true;
                i11 = 2;
                i12 = 0;
            } else {
                this.f57256u = max2;
                this.v = max3;
                GLES20.glBindFramebuffer(36160, iArr[0]);
                int i21 = 0;
                z10 = true;
                for (int i22 = 2; i21 < i22; i22 = 2) {
                    int[] iArr2 = this.f57242f;
                    int i23 = i17;
                    GLES20.glBindRenderbuffer(36161, iArr2[i21]);
                    if (i21 == 0) {
                        i13 = 32856;
                    } else {
                        i13 = 33189;
                    }
                    GLES30.glRenderbufferStorageMultisample(36161, this.f57257w, i13, max2, max3);
                    if (i21 == 0) {
                        i14 = 36064;
                    } else {
                        i14 = 36096;
                    }
                    GLES20.glFramebufferRenderbuffer(36160, i14, 36161, iArr2[i21]);
                    i21++;
                    i20 = 36160;
                    i17 = i23;
                }
                int i24 = i17;
                int i25 = i20;
                if (GLES20.glCheckFramebufferStatus(i25) == 36053) {
                    GLES20.glBindFramebuffer(i25, iArr[1]);
                    int[] iArr3 = this.f57243g;
                    GLES20.glBindTexture(3553, iArr3[i24]);
                    i11 = 2;
                    GLES20.glTexImage2D(3553, 0, 32856, max2, max3, 0, 6408, 5121, null);
                    i12 = i24;
                    GLES20.glFramebufferTexture2D(i25, 36064, 3553, iArr3[i24], i12);
                    if (GLES20.glCheckFramebufferStatus(i25) != 36053) {
                        throw new IllegalStateException("Incomplete diamond framebuffer");
                    }
                } else {
                    throw new IllegalStateException("Incomplete diamond framebuffer");
                }
            }
            float[] fArr3 = this.f57253r;
            float f24 = f11 + fArr3[i12];
            double d10 = f10;
            int i26 = i11;
            float min = Math.min(90.0f, (360.0f * Math.abs((float) Math.IEEEremainder(d10, 1.5707963267948966d))) / 3.1415927f);
            int min2 = Math.min(89, (int) min);
            float f25 = min - min2;
            float[] fArr4 = this.f57251p;
            float f26 = fArr4[min2];
            float f27 = fArr4[min2 + 1];
            if (min2 == 0) {
                f16 = 0.0f;
            } else {
                f16 = (f27 - fArr4[min2 - 1]) / 2.0f;
            }
            if (min2 == 89) {
                f17 = 0.0f;
            } else {
                f17 = (fArr4[min2 + 2] - f26) / 2.0f;
            }
            float f28 = ((((((((f26 - f27) * 2.0f) + f16 + f17) * f25) + ((((f27 - f26) * 3.0f) - (f16 * 2.0f)) - f17)) * f25) + f16) * f25) + f26;
            float sin = (float) Math.sin(abs * 2.0f);
            float f29 = 1.0f - ((0.035f * sin) * sin);
            double d11 = f24;
            this.f57254s = ((1.0f - i((float) ((Math.abs(Math.sin(d11)) - Math.sin(0.25d)) / (Math.sin(0.96d) - Math.sin(0.25d))))) * (((f29 * fArr4[0]) / f28) - 1.0f)) + 1.0f;
            float[] fArr5 = this.f57244i;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.rotateM(this.f57244i, 0, -((float) Math.toDegrees(f12)), 0.0f, 0.0f, 1.0f);
            Matrix.rotateM(this.f57244i, 0, (float) Math.toDegrees(d11), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.f57244i, 0, (float) Math.toDegrees(d10), 0.0f, 1.0f, 0.0f);
            char c10 = 0;
            Matrix.transposeM(this.f57245j, 0, fArr5, 0);
            float f30 = 0.0f;
            int i27 = 0;
            float f31 = -1.0f;
            while (i27 < 4) {
                float f32 = (i27 * 3.1415927f) / 2.0f;
                int i28 = i27;
                float cos = (float) (Math.cos(f24 - fArr3[c10]) * Math.cos(f10 + f32));
                if (cos > f31) {
                    f31 = cos;
                    f30 = f32;
                }
                i27 = i28 + 1;
                c10 = 0;
            }
            float atan2 = (float) Math.atan2(Math.sin(f10 - this.f57259y), Math.cos(f10 - this.f57259y));
            if (this.A && max > 0.0f) {
                f18 = ((float) Math.hypot(atan2, f24 - this.f57260z)) / max;
            } else {
                f18 = 0.596f;
            }
            this.f57259y = f10;
            this.f57260z = f24;
            this.A = z10;
            float i29 = i(((0.41887903f / Math.max(f18, 0.001f)) - 0.06f) / 0.34f) * i(1.0f - (((float) Math.acos(Math.max(-1.0f, Math.min(1.0f, f31)))) / 0.20943952f));
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glViewport(0, 0, this.f57256u, this.v);
            GLES20.glDepthMask(true);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glDisable(2929);
            GLES20.glDisable(2884);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            float f33 = f22 / f23;
            float max4 = Math.max(1.0f, 1.0f / f33) * (1.52f / (0.9975f / fArr4[0]));
            float[] fArr6 = this.f57246k;
            Matrix.setIdentityM(fArr6, 0);
            float f34 = 1.0f / (f33 * max4);
            fArr6[0] = f34;
            fArr6[5] = 1.0f / max4;
            float f35 = 1.0f / fArr3[i26];
            float f36 = -f35;
            float f37 = f36 / fArr3[1];
            fArr6[0] = f34 * this.f57254s;
            float f38 = 0.12f / max4;
            fArr6[9] = f38 * f37;
            fArr6[10] = f36 / 6.0f;
            fArr6[11] = f37;
            fArr6[13] = f38 * f35;
            fArr6[14] = 0.5f * f35;
            fArr6[15] = f35;
            int[] iArr4 = this.f57238a;
            h(f19, f30, i29, iArr4[0]);
            GLES20.glDisable(3042);
            GLES20.glEnable(2929);
            GLES20.glEnable(2884);
            GLES20.glDepthFunc(515);
            int[] iArr5 = this.f57239b;
            GLES30.glBindVertexArray(iArr5[0]);
            int[] iArr6 = this.d;
            GLES20.glDrawArrays(4, 0, iArr6[0]);
            h(f19, f30, i29, iArr4[1]);
            GLES20.glEnable(3042);
            GLES20.glDisable(2884);
            GLES20.glDisable(2929);
            for (int i30 = 1; i30 <= i26; i30++) {
                GLES30.glBindVertexArray(iArr5[i30]);
                GLES30.glUniform1ui(e("baseInstance"), i30 - 1);
                int i31 = iArr6[i30];
                if (i30 == 1) {
                    i15 = 1;
                } else {
                    i15 = 7;
                }
                GLES30.glDrawArraysInstanced(4, 0, i31, i15);
            }
            GLES20.glBindFramebuffer(36008, iArr[0]);
            GLES20.glBindFramebuffer(36009, iArr[1]);
            int i32 = this.f57256u;
            int i33 = this.v;
            GLES30.glBlitFramebuffer(0, 0, i32, i33, 0, 0, i32, i33, 16384, 9728);
            if (z9) {
                GLES20.glBindFramebuffer(36160, iArr[1]);
                GLES30.glBindVertexArray(0);
                return;
            }
            d(f14, f15, i7, i10);
        }
    }

    public final void d(float f10, float f11, int i7, int i10) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i7, i10);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        int i11 = this.f57238a[2];
        this.f57255t = i11;
        GLES20.glUseProgram(i11);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f57243g[0]);
        GLES20.glUniform1i(e("image"), 0);
        GLES20.glUniform1f(e("opacity"), f10);
        GLES20.glUniform1f(e("white"), f11);
        GLES30.glBindVertexArray(this.f57239b[3]);
        GLES20.glDrawArrays(4, 0, 3);
        GLES30.glBindVertexArray(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glEnable(2929);
    }

    public final int e(String str) {
        String str2 = this.f57255t + ":" + str;
        HashMap hashMap = this.h;
        Integer num = (Integer) hashMap.get(str2);
        if (num == null) {
            num = Integer.valueOf(GLES20.glGetUniformLocation(this.f57255t, str));
            hashMap.put(str2, num);
        }
        return num.intValue();
    }

    public final void f(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(e("u.".concat(str)), 1, false, fArr, 0);
    }

    public final void h(float f10, float f11, float f12, int i7) {
        this.f57255t = i7;
        GLES20.glUseProgram(i7);
        f("model", this.f57244i);
        f("inverseModel", this.f57245j);
        f("projection", this.f57246k);
        k("parameters", f10, 0.72f, 1.0f, 1.0f);
        GLES20.glUniform4fv(e("u.facetProjection"), 1, this.f57252q, 0);
        k("appearance", this.C, 0.0f, 0.0f, 0.0f);
        k("referenceCrownFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        k("referencePavilionFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        for (int i10 = 0; i10 < 8; i10++) {
            int e10 = e("anchors[" + i10 + "].position");
            int i11 = i10 * 8;
            float[] fArr = this.f57250o;
            GLES20.glUniform4fv(e10, 1, fArr, i11);
            GLES20.glUniform4fv(e("anchors[" + i10 + "].normal"), 1, fArr, i11 + 4);
        }
        k("viewport", this.f57256u, this.v, 17.0f, 0.0f);
        int e11 = e("u.sparkleShape");
        float[] fArr2 = this.f57247l;
        GLES20.glUniform4fv(e11, 1, fArr2, 36);
        k("sparkleHalo", fArr2[40], f11, this.f57254s, f12);
        for (int i12 = 0; i12 < 9; i12++) {
            GLES20.glUniform4fv(e("u." + D[i12]), 1, fArr2, i12 * 4);
        }
        GLES20.glUniform4fv(e("planes[0]"), 17, this.f57249n, 0);
    }

    public final void k(String str, float f10, float f11, float f12, float f13) {
        GLES20.glUniform4f(e("u.".concat(str)), f10, f11, f12, f13);
    }
}
