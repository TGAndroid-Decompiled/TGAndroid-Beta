package sg;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import com.google.android.gms.internal.vision.e2;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import w7.m7;
public final class a {
    public static final String[] D = {"crownGradient", "pavilionGradient", "lightSweep", "crownSweep", "rightCrownSweep", "leftCrownSweep", "pavilionSweep", "rightPavilionSweep", "leftPavilionSweep"};
    public boolean A;
    public int C;
    public final float[] f48003m;
    public final float[] f48004n;
    public final float[] f48005o;
    public final float[] f48006p;
    public final float[] f48007q;
    public final float[] f48008r;
    public int f48010t;
    public int f48011u;
    public int v;
    public final int f48012w;
    public double f48013x;
    public float f48014y;
    public float f48015z;
    public final int[] f47993a = new int[3];
    public final int[] f47994b = new int[4];
    public final int[] f47995c = new int[3];
    public final int[] d = new int[3];
    public final int[] f47996e = new int[2];
    public final int[] f47997f = new int[2];
    public final int[] f47998g = new int[1];
    public final HashMap h = new HashMap();
    public final float[] f47999i = new float[16];
    public final float[] f48000j = new float[16];
    public final float[] f48001k = new float[16];
    public final float[] f48002l = new float[42];
    public float f48009s = 1.0f;
    public float B = 1.0f;

    public a(Context context, int i10) {
        int i11;
        String str;
        try {
            String[] strArr = {"diamond", "sparkle", "copy"};
            for (int i12 = 0; i12 < 3; i12++) {
                if (i12 == 2) {
                    str = "fullscreenVertex";
                } else {
                    str = strArr[i12] + "Vertex";
                }
                this.f47993a[i12] = m7.b(context, "diamond", j(context, str), j(context, strArr[i12] + "Fragment"), "position", "normal");
            }
            float[] a2 = a(context, "frames");
            this.f48003m = a2;
            float[] a10 = a(context, "planes");
            this.f48004n = a10;
            float[] a11 = a(context, "anchors");
            this.f48005o = a11;
            float[] a12 = a(context, "widths");
            this.f48006p = a12;
            float[] a13 = a(context, "facetProjection");
            this.f48007q = a13;
            float[] a14 = a(context, "camera");
            this.f48008r = a14;
            if (a11.length == 64 && a12.length == 91 && a13.length == 4 && a14.length == 3) {
                if (a2.length == 60522 && a10.length == 68) {
                    int[] iArr = this.f47994b;
                    GLES30.glGenVertexArrays(iArr.length, iArr, 0);
                    int[] iArr2 = this.f47995c;
                    GLES20.glGenBuffers(iArr2.length, iArr2, 0);
                    String[] strArr2 = {"vertices", "main", "small"};
                    for (int i13 = 0; i13 < 3; i13++) {
                        float[] a15 = a(context, strArr2[i13]);
                        if (i13 == 0) {
                            i11 = 3;
                        } else {
                            i11 = 2;
                        }
                        this.d[i13] = a15.length / (i11 * 4);
                        GLES30.glBindVertexArray(this.f47994b[i13]);
                        GLES20.glBindBuffer(34962, this.f47995c[i13]);
                        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(a15.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        asFloatBuffer.put(a15).position(0);
                        GLES20.glBufferData(34962, a15.length * 4, asFloatBuffer, 35044);
                        for (int i14 = 0; i14 < i11; i14++) {
                            GLES20.glEnableVertexAttribArray(i14);
                            GLES20.glVertexAttribPointer(i14, 4, 5126, false, i11 * 16, i14 * 16);
                        }
                    }
                    GLES20.glGenFramebuffers(2, this.f47996e, 0);
                    GLES20.glGenRenderbuffers(2, this.f47997f, 0);
                    GLES20.glGenTextures(1, this.f47998g, 0);
                    GLES20.glBindTexture(3553, this.f47998g[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    int[] iArr3 = new int[1];
                    GLES20.glGetIntegerv(36183, iArr3, 0);
                    this.f48012w = Math.min(i10, iArr3[0]);
                    return;
                }
                throw new IllegalStateException("Invalid Swift diamond animation data");
            }
            throw new IllegalStateException("Invalid Swift diamond camera data");
        } catch (Exception e7) {
            b();
            throw new IllegalStateException("Cannot load Swift diamond", e7);
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

    public static float i(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return e2.B(max, 2.0f, 3.0f, max * max);
    }

    public static String j(Context context, String str) {
        return new String(g(context, "shaders/diamond/" + str + ".glsl"), StandardCharsets.UTF_8);
    }

    public final void b() {
        int[] iArr;
        for (int i10 : this.f47993a) {
            if (i10 != 0) {
                GLES20.glDeleteProgram(i10);
            }
        }
        int[] iArr2 = this.f47995c;
        GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
        int[] iArr3 = this.f47994b;
        GLES30.glDeleteVertexArrays(iArr3.length, iArr3, 0);
        int[] iArr4 = this.f47998g;
        GLES20.glDeleteTextures(iArr4.length, iArr4, 0);
        int[] iArr5 = this.f47996e;
        GLES20.glDeleteFramebuffers(iArr5.length, iArr5, 0);
        int[] iArr6 = this.f47997f;
        GLES20.glDeleteRenderbuffers(iArr6.length, iArr6, 0);
    }

    public final void c(int i10, int i11, float f7, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        float abs;
        float f15;
        float f16;
        float f17;
        int i16;
        if (i10 > 0 && i11 > 0) {
            float max = Math.max(0.0f, Math.min(f12, 0.1f));
            double d = this.f48013x + max;
            this.f48013x = d;
            float f18 = (float) d;
            double d10 = (d * 240.0d) % 1440.0d;
            int i17 = (int) d10;
            float f19 = (float) (d10 - i17);
            int i18 = 0;
            int i19 = 0;
            while (true) {
                float[] fArr = this.f48002l;
                if (i19 >= fArr.length) {
                    break;
                }
                float[] fArr2 = this.f48003m;
                float f20 = fArr2[(i17 * 42) + i19];
                fArr[i19] = e2.y(fArr2[((1 + i17) * 42) + i19], f20, f19, f20);
                i19++;
            }
            float f21 = i10;
            int max2 = Math.max(1, Math.round(this.B * f21));
            float f22 = i11;
            int max3 = Math.max(1, Math.round(this.B * f22));
            int i20 = this.f48011u;
            int i21 = 36160;
            int[] iArr = this.f47996e;
            if (max2 == i20 && max3 == this.v) {
                z11 = true;
                i12 = 2;
                i13 = 0;
            } else {
                this.f48011u = max2;
                this.v = max3;
                GLES20.glBindFramebuffer(36160, iArr[0]);
                int i22 = 0;
                z11 = true;
                for (int i23 = 2; i22 < i23; i23 = 2) {
                    int[] iArr2 = this.f47997f;
                    int i24 = i18;
                    GLES20.glBindRenderbuffer(36161, iArr2[i22]);
                    if (i22 == 0) {
                        i14 = 32856;
                    } else {
                        i14 = 33189;
                    }
                    GLES30.glRenderbufferStorageMultisample(36161, this.f48012w, i14, max2, max3);
                    if (i22 == 0) {
                        i15 = 36064;
                    } else {
                        i15 = 36096;
                    }
                    GLES20.glFramebufferRenderbuffer(36160, i15, 36161, iArr2[i22]);
                    i22++;
                    i21 = 36160;
                    i18 = i24;
                }
                int i25 = i18;
                int i26 = i21;
                if (GLES20.glCheckFramebufferStatus(i26) == 36053) {
                    GLES20.glBindFramebuffer(i26, iArr[1]);
                    int[] iArr3 = this.f47998g;
                    GLES20.glBindTexture(3553, iArr3[i25]);
                    i12 = 2;
                    GLES20.glTexImage2D(3553, 0, 32856, max2, max3, 0, 6408, 5121, null);
                    i13 = i25;
                    GLES20.glFramebufferTexture2D(i26, 36064, 3553, iArr3[i25], i13);
                    if (GLES20.glCheckFramebufferStatus(i26) != 36053) {
                        throw new IllegalStateException("Incomplete diamond framebuffer");
                    }
                } else {
                    throw new IllegalStateException("Incomplete diamond framebuffer");
                }
            }
            float[] fArr3 = this.f48008r;
            float f23 = f10 + fArr3[i13];
            double d11 = f7;
            int i27 = i12;
            float min = Math.min(90.0f, (360.0f * Math.abs((float) Math.IEEEremainder(d11, 1.5707963267948966d))) / 3.1415927f);
            int min2 = Math.min(89, (int) min);
            float f24 = min - min2;
            float[] fArr4 = this.f48006p;
            float f25 = fArr4[min2];
            float f26 = fArr4[min2 + 1];
            if (min2 == 0) {
                f15 = 0.0f;
            } else {
                f15 = (f26 - fArr4[min2 - 1]) / 2.0f;
            }
            if (min2 == 89) {
                f16 = 0.0f;
            } else {
                f16 = (fArr4[min2 + 2] - f25) / 2.0f;
            }
            float f27 = ((((((((f25 - f26) * 2.0f) + f15 + f16) * f24) + ((((f26 - f25) * 3.0f) - (f15 * 2.0f)) - f16)) * f24) + f15) * f24) + f25;
            float sin = (float) Math.sin(abs * 2.0f);
            float f28 = 1.0f - ((0.035f * sin) * sin);
            double d12 = f23;
            this.f48009s = ((1.0f - i((float) ((Math.abs(Math.sin(d12)) - Math.sin(0.25d)) / (Math.sin(0.96d) - Math.sin(0.25d))))) * (((f28 * fArr4[0]) / f27) - 1.0f)) + 1.0f;
            float[] fArr5 = this.f47999i;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.rotateM(this.f47999i, 0, -((float) Math.toDegrees(f11)), 0.0f, 0.0f, 1.0f);
            Matrix.rotateM(this.f47999i, 0, (float) Math.toDegrees(d12), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.f47999i, 0, (float) Math.toDegrees(d11), 0.0f, 1.0f, 0.0f);
            char c10 = 0;
            Matrix.transposeM(this.f48000j, 0, fArr5, 0);
            float f29 = 0.0f;
            int i28 = 0;
            float f30 = -1.0f;
            while (i28 < 4) {
                float f31 = (i28 * 3.1415927f) / 2.0f;
                int i29 = i28;
                float cos = (float) (Math.cos(f23 - fArr3[c10]) * Math.cos(f7 + f31));
                if (cos > f30) {
                    f30 = cos;
                    f29 = f31;
                }
                i28 = i29 + 1;
                c10 = 0;
            }
            float atan2 = (float) Math.atan2(Math.sin(f7 - this.f48014y), Math.cos(f7 - this.f48014y));
            if (this.A && max > 0.0f) {
                f17 = ((float) Math.hypot(atan2, f23 - this.f48015z)) / max;
            } else {
                f17 = 0.596f;
            }
            this.f48014y = f7;
            this.f48015z = f23;
            this.A = z11;
            float i30 = i(((0.41887903f / Math.max(f17, 0.001f)) - 0.06f) / 0.34f) * i(1.0f - (((float) Math.acos(Math.max(-1.0f, Math.min(1.0f, f30)))) / 0.20943952f));
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glViewport(0, 0, this.f48011u, this.v);
            GLES20.glDepthMask(true);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glDisable(2929);
            GLES20.glDisable(2884);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            float f32 = f21 / f22;
            float max4 = Math.max(1.0f, 1.0f / f32) * (1.52f / (0.9975f / fArr4[0]));
            float[] fArr6 = this.f48001k;
            Matrix.setIdentityM(fArr6, 0);
            float f33 = 1.0f / (f32 * max4);
            fArr6[0] = f33;
            fArr6[5] = 1.0f / max4;
            float f34 = 1.0f / fArr3[i27];
            float f35 = -f34;
            float f36 = f35 / fArr3[1];
            fArr6[0] = f33 * this.f48009s;
            float f37 = 0.12f / max4;
            fArr6[9] = f37 * f36;
            fArr6[10] = f35 / 6.0f;
            fArr6[11] = f36;
            fArr6[13] = f37 * f34;
            fArr6[14] = 0.5f * f34;
            fArr6[15] = f34;
            int[] iArr4 = this.f47993a;
            h(f18, f29, i30, iArr4[0]);
            GLES20.glDisable(3042);
            GLES20.glEnable(2929);
            GLES20.glEnable(2884);
            GLES20.glDepthFunc(515);
            int[] iArr5 = this.f47994b;
            GLES30.glBindVertexArray(iArr5[0]);
            int[] iArr6 = this.d;
            GLES20.glDrawArrays(4, 0, iArr6[0]);
            h(f18, f29, i30, iArr4[1]);
            GLES20.glEnable(3042);
            GLES20.glDisable(2884);
            GLES20.glDisable(2929);
            for (int i31 = 1; i31 <= i27; i31++) {
                GLES30.glBindVertexArray(iArr5[i31]);
                GLES30.glUniform1ui(e("baseInstance"), i31 - 1);
                int i32 = iArr6[i31];
                if (i31 == 1) {
                    i16 = 1;
                } else {
                    i16 = 7;
                }
                GLES30.glDrawArraysInstanced(4, 0, i32, i16);
            }
            GLES20.glBindFramebuffer(36008, iArr[0]);
            GLES20.glBindFramebuffer(36009, iArr[1]);
            int i33 = this.f48011u;
            int i34 = this.v;
            GLES30.glBlitFramebuffer(0, 0, i33, i34, 0, 0, i33, i34, 16384, 9728);
            if (z10) {
                GLES20.glBindFramebuffer(36160, iArr[1]);
                GLES30.glBindVertexArray(0);
                return;
            }
            d(f13, f14, i10, i11);
        }
    }

    public final void d(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        int i12 = this.f47993a[2];
        this.f48010t = i12;
        GLES20.glUseProgram(i12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f47998g[0]);
        GLES20.glUniform1i(e("image"), 0);
        GLES20.glUniform1f(e("opacity"), f7);
        GLES20.glUniform1f(e("white"), f10);
        GLES30.glBindVertexArray(this.f47994b[3]);
        GLES20.glDrawArrays(4, 0, 3);
        GLES30.glBindVertexArray(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glEnable(2929);
    }

    public final int e(String str) {
        String str2 = this.f48010t + ":" + str;
        HashMap hashMap = this.h;
        Integer num = (Integer) hashMap.get(str2);
        if (num == null) {
            num = Integer.valueOf(GLES20.glGetUniformLocation(this.f48010t, str));
            hashMap.put(str2, num);
        }
        return num.intValue();
    }

    public final void f(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(e("u.".concat(str)), 1, false, fArr, 0);
    }

    public final void h(float f7, float f10, float f11, int i10) {
        this.f48010t = i10;
        GLES20.glUseProgram(i10);
        f("model", this.f47999i);
        f("inverseModel", this.f48000j);
        f("projection", this.f48001k);
        k("parameters", f7, 0.72f, 1.0f, 1.0f);
        GLES20.glUniform4fv(e("u.facetProjection"), 1, this.f48007q, 0);
        k("appearance", this.C, 0.0f, 0.0f, 0.0f);
        k("referenceCrownFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        k("referencePavilionFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        for (int i11 = 0; i11 < 8; i11++) {
            int e7 = e("anchors[" + i11 + "].position");
            int i12 = i11 * 8;
            float[] fArr = this.f48005o;
            GLES20.glUniform4fv(e7, 1, fArr, i12);
            GLES20.glUniform4fv(e("anchors[" + i11 + "].normal"), 1, fArr, i12 + 4);
        }
        k("viewport", this.f48011u, this.v, 17.0f, 0.0f);
        int e10 = e("u.sparkleShape");
        float[] fArr2 = this.f48002l;
        GLES20.glUniform4fv(e10, 1, fArr2, 36);
        k("sparkleHalo", fArr2[40], f10, this.f48009s, f11);
        for (int i13 = 0; i13 < 9; i13++) {
            GLES20.glUniform4fv(e("u." + D[i13]), 1, fArr2, i13 * 4);
        }
        GLES20.glUniform4fv(e("planes[0]"), 17, this.f48004n, 0);
    }

    public final void k(String str, float f7, float f10, float f11, float f12) {
        GLES20.glUniform4f(e("u.".concat(str)), f7, f10, f11, f12);
    }
}
