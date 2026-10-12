package pg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.zip.Inflater;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.sw0;
import w7.j6;
import w7.l6;
public final class r0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public s1 D;
    public boolean E;
    public final la F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public k2.g0 f45628a;
    public s0 f45629b;
    public g1 f45630c;
    public g1 d;
    public d1 f45632f;
    public final sw0 f45633g;
    public RectF h;
    public m f45634i;
    public s1 f45636k;
    public s1 f45637l;
    public final ByteBuffer f45638m;
    public final ByteBuffer f45639n;
    public int f45640o;
    public int f45641p;
    public int f45642q;
    public Map f45643r;
    public int f45644s;
    public final ByteBuffer f45646u;
    public boolean v;
    public a5.a f45647w;
    public final float[] f45648x;
    public float[] f45649y;
    public s1 f45650z;
    public final HashMap f45635j = new HashMap();
    public final int[] f45645t = new int[1];
    public boolean G = false;
    public final w0 f45631e = new Object();

    public r0(sw0 sw0Var, Bitmap bitmap, int i10, la laVar) {
        this.F = laVar;
        this.f45633g = sw0Var;
        this.A = bitmap;
        this.B = i10;
        this.f45646u = ByteBuffer.allocateDirect(((int) sw0Var.f30696a) * ((int) sw0Var.f30697b) * 4);
        this.f45648x = j6.b(sw0Var.f30696a, sw0Var.f30697b);
        if (this.f45638m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f45638m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f45638m.putFloat(0.0f);
        this.f45638m.putFloat(0.0f);
        this.f45638m.putFloat(sw0Var.f30696a);
        this.f45638m.putFloat(0.0f);
        this.f45638m.putFloat(0.0f);
        this.f45638m.putFloat(sw0Var.f30697b);
        this.f45638m.putFloat(sw0Var.f30696a);
        this.f45638m.putFloat(sw0Var.f30697b);
        this.f45638m.rewind();
        if (this.f45639n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f45639n = allocateDirect2;
            allocateDirect2.order(ByteOrder.nativeOrder());
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(0.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.putFloat(1.0f);
            allocateDirect2.rewind();
        }
    }

    public final void a(boolean z10) {
        int i10 = this.f45640o;
        int[] iArr = this.f45645t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f45640o = 0;
        }
        s1 s1Var = this.f45636k;
        if (s1Var != null) {
            s1Var.a(z10);
        }
        s1 s1Var2 = this.D;
        if (s1Var2 != null) {
            s1Var2.a(z10);
        }
        int i11 = this.f45641p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f45641p = 0;
        }
        HashMap hashMap = this.f45635j;
        for (s1 s1Var3 : hashMap.values()) {
            if (s1Var3 != null) {
                s1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f45642q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f45642q = 0;
        }
        s1 s1Var4 = this.f45650z;
        if (s1Var4 != null) {
            s1Var4.a(true);
        }
        s1 s1Var5 = this.f45637l;
        if (s1Var5 != null) {
            s1Var5.a(true);
        }
        Map map = this.f45643r;
        if (map != null) {
            for (e1 e1Var : map.values()) {
                if (e1Var.f45527a != 0) {
                    GLES20.glDeleteProgram(0);
                    e1Var.f45527a = 0;
                }
            }
            this.f45643r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        l6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            sw0 sw0Var = this.f45633g;
            GLES20.glViewport(0, 0, (int) sw0Var.f30696a, (int) sw0Var.f30697b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        k2.g0 g0Var = this.f45628a;
        if (g0Var != null) {
            g0Var.e();
        }
        w0 w0Var = this.f45631e;
        w0Var.h = 0;
        w0Var.f45716g = 0.0d;
        ByteBuffer byteBuffer = w0Var.f45718j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f45629b = null;
        this.J = 0.0f;
    }

    public final void c(s0 s0Var, int i10, boolean z10, z zVar) {
        if (this.f45643r != null && this.f45634i != null) {
            this.f45632f.f(new m4.g0(this, s0Var, i10, z10, zVar));
        }
    }

    public final a5.a d(pg.s0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: pg.r0.d(pg.s0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(g1 g1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = g1Var.f45533a;
        if (mVar == null) {
            mVar = this.f45634i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f45644s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        sw0 sw0Var = this.f45633g;
        GLES20.glViewport(0, 0, (int) sw0Var.f30696a, (int) sw0Var.f30697b);
        e1 e1Var = (e1) this.f45643r.get(mVar.i(1));
        if (e1Var == null) {
            return null;
        }
        GLES20.glUseProgram(e1Var.f45527a);
        GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f45648x));
        GLES20.glUniform1i(e1Var.d("texture"), 0);
        GLES20.glUniform1i(e1Var.d("mask"), 1);
        e1.a(e1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f45650z != null) {
            GLES20.glUniform1i(e1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f45650z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(e1Var.d("type"), g1Var.f45533a.o());
            GLES20.glUniform2f(e1Var.d("resolution"), sw0Var.f30696a, sw0Var.f30697b);
            GLES20.glUniform2f(e1Var.d("center"), g1Var.f45534b, g1Var.f45535c);
            GLES20.glUniform2f(e1Var.d("radius"), g1Var.d, g1Var.f45536e);
            GLES20.glUniform1f(e1Var.d("thickness"), g1Var.f45537f);
            GLES20.glUniform1f(e1Var.d("rounding"), g1Var.f45538g);
            GLES20.glUniform2f(e1Var.d("middle"), g1Var.f45539i, g1Var.f45540j);
            GLES20.glUniform1f(e1Var.d("rotation"), g1Var.h);
            GLES20.glUniform1i(e1Var.d("fill"), g1Var.f45542l ? 1 : 0);
            GLES20.glUniform1f(e1Var.d("arrowTriangleLength"), g1Var.f45541k);
            GLES20.glUniform1i(e1Var.d("composite"), 1);
            GLES20.glUniform1i(e1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45638m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45639n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        k2.g0 g0Var = this.f45628a;
        if (g0Var != null && this.f45644s <= 0) {
            g0Var.e();
        }
        this.f45644s--;
        w0 w0Var = this.f45631e;
        w0Var.h = 0;
        w0Var.f45716g = 0.0d;
        ByteBuffer byteBuffer = w0Var.f45718j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f45629b = null;
        this.f45630c = null;
        return m10;
    }

    public final RectF f() {
        sw0 sw0Var = this.f45633g;
        return new RectF(0.0f, 0.0f, sw0Var.f30696a, sw0Var.f30697b);
    }

    public final int g() {
        if (this.f45641p == 0) {
            this.f45641p = s1.b(this.f45633g);
        }
        return this.f45641p;
    }

    public final n6.k h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        s1 s1Var;
        n6.k kVar;
        e1 e1Var;
        int i10;
        int j10;
        s1 s1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f45645t, 0);
        int i13 = this.f45645t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f45645t, 0);
        int i14 = this.f45645t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        sw0 sw0Var = this.f45633g;
        GLES20.glViewport(0, 0, (int) sw0Var.f30696a, (int) sw0Var.f30697b);
        Map map = this.f45643r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            e1 e1Var2 = (e1) map.get(str);
            if (e1Var2 != null) {
                GLES20.glUseProgram(e1Var2.f45527a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = j6.c(this.f45648x, j6.a(matrix));
                GLES20.glUniformMatrix4fv(e1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(e1Var2.d("texture"), 1);
                    GLES20.glUniform1i(e1Var2.d("mask"), 0);
                    GLES20.glUniform1f(e1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (s1Var2 = this.D) != null) {
                        j10 = s1Var2.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f45637l.c());
                } else {
                    GLES20.glUniform1i(e1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (s1Var = this.D) != null) {
                        j3 = s1Var.c();
                    } else {
                        j3 = j();
                    }
                    GLES20.glBindTexture(3553, j3);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45638m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45639n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (e1Var = (e1) this.f45643r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(e1Var.f45527a);
                    GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(e1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(e1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(e1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ra raVar = this.F.f28142m;
                    if (raVar != null) {
                        i10 = raVar.f30131s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(e1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(e1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45638m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45639n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f45646u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f45646u);
                if (z10) {
                    kVar = new n6.k(12, null, this.f45646u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f45646u);
                    kVar = new n6.k(12, createBitmap, null);
                }
                this.f45646u.rewind();
                int[] iArr = this.f45645t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f45645t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return kVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f45640o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f45640o = iArr[0];
            l6.a();
        }
        return this.f45640o;
    }

    public final int j() {
        s1 s1Var = this.f45636k;
        if (s1Var != null) {
            return s1Var.c();
        }
        return 0;
    }

    public final void k(g1 g1Var) {
        if (g1Var == null) {
            return;
        }
        this.f45632f.f(new n0(this, g1Var, 0));
    }

    public final void l(s0 s0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        float a2;
        int size;
        float atan2;
        v0 v0Var;
        float f7;
        double d;
        boolean z12;
        v0 v0Var2;
        float f10;
        v0[] v0VarArr;
        double d10;
        float f11;
        float f12;
        float f13;
        char c10;
        char c11;
        float f14;
        this.f45629b = s0Var;
        if (s0Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            l6.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                sw0 sw0Var = this.f45633g;
                GLES20.glViewport(0, 0, (int) sw0Var.f30696a, (int) sw0Var.f30697b);
                float f15 = 0.0f;
                if (z10) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                }
                Map map = this.f45643r;
                if (map != null) {
                    m mVar = s0Var.f45663e;
                    int i12 = 2;
                    e1 e1Var = (e1) map.get(mVar.i(2));
                    if (e1Var == null) {
                        return;
                    }
                    GLES20.glUseProgram(e1Var.f45527a);
                    s1 s1Var = (s1) this.f45635j.get(Integer.valueOf(mVar.l()));
                    if (s1Var == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        s1Var = new s1(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                        this.f45635j.put(Integer.valueOf(mVar.l()), s1Var);
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, s1Var.c());
                    GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f45648x));
                    GLES20.glUniform1i(e1Var.d("texture"), 0);
                    if (!z11) {
                        this.f45631e.f45715f = this.f45632f.getScaleX();
                    } else {
                        this.f45631e.f45715f = 1.0f;
                    }
                    w0 w0Var = this.f45631e;
                    w0Var.f45711a = s0Var.d;
                    w0Var.f45712b = s0Var.f45663e.k();
                    if (z11) {
                        a2 = 1.0f;
                    } else {
                        a2 = s0Var.f45663e.a();
                    }
                    w0Var.f45713c = a2;
                    w0Var.d = s0Var.f45663e.b();
                    w0Var.f45714e = s0Var.f45663e.h();
                    Vector vector = s0Var.f45661b;
                    if (vector == null) {
                        size = 0;
                    } else {
                        size = vector.size();
                    }
                    if (size == 0) {
                        i10 = 0;
                    } else {
                        if (size == 1) {
                            Vector vector2 = s0Var.f45661b;
                            v0[] v0VarArr2 = new v0[vector2.size()];
                            vector2.toArray(v0VarArr2);
                            v0 v0Var3 = v0VarArr2[0];
                            float f16 = ((w0Var.f45711a * w0Var.f45714e) * 1.0f) / w0Var.f45715f;
                            v0Var3.getClass();
                            PointF pointF = new PointF((float) v0Var3.f45703a, (float) v0Var3.f45704b);
                            if (Math.abs(w0Var.d) > 0.0f) {
                                f14 = w0Var.d;
                            } else {
                                f14 = 0.0f;
                            }
                            float f17 = w0Var.f45713c;
                            w0Var.c();
                            w0Var.b(1);
                            w0Var.a(pointF, f16, f14, f17, 0);
                        } else {
                            Vector vector3 = s0Var.f45661b;
                            int size2 = vector3.size();
                            v0[] v0VarArr3 = new v0[size2];
                            vector3.toArray(v0VarArr3);
                            w0Var.c();
                            int i13 = 0;
                            while (i13 < size2 - 1) {
                                v0 v0Var4 = v0VarArr3[i13];
                                int i14 = i13 + 1;
                                v0 v0Var5 = v0VarArr3[i14];
                                double a10 = v0Var4.a(v0Var5);
                                int i15 = size2;
                                float f18 = f15;
                                double d11 = v0Var5.f45703a - v0Var4.f45703a;
                                int i16 = i12;
                                double d12 = v0Var5.f45704b - v0Var4.f45704b;
                                double d13 = v0Var5.f45705c;
                                double d14 = d13 - v0Var4.f45705c;
                                v0 v0Var6 = new v0(1.0d, 1.0d, 0.0d);
                                if (Math.abs(w0Var.d) > f18) {
                                    atan2 = w0Var.d;
                                } else {
                                    atan2 = (float) Math.atan2(d12, d11);
                                }
                                float f19 = (float) ((((w0Var.f45711a * d13) * w0Var.f45714e) * 1.0d) / w0Var.f45715f);
                                double max = Math.max(1.0f, w0Var.f45712b * f19);
                                if (a10 > 0.0d) {
                                    double d15 = 1.0d / a10;
                                    v0Var = new v0(d11 * d15, d12 * d15, d14 * d15);
                                } else {
                                    v0Var = v0Var6;
                                }
                                float min = Math.min(1.0f, w0Var.f45713c * 1.15f);
                                boolean z13 = v0Var4.d;
                                boolean z14 = v0Var5.d;
                                float f20 = atan2;
                                int i17 = w0Var.h;
                                w0Var.b((int) Math.ceil((a10 - w0Var.f45716g) / max));
                                ByteBuffer byteBuffer = w0Var.f45718j;
                                if (byteBuffer != null && i17 >= 0) {
                                    f7 = f19;
                                    if (i17 < w0Var.f45717i) {
                                        byteBuffer.position(i17 * 20);
                                    }
                                } else {
                                    f7 = f19;
                                }
                                double d16 = w0Var.f45716g;
                                v0 v0Var7 = new v0(v0Var4.f45703a + (v0Var.f45703a * d16), v0Var4.f45704b + (v0Var.f45704b * d16), v0Var4.f45705c + (v0Var.f45705c * d16));
                                double d17 = d16;
                                v0 v0Var8 = v0Var7;
                                boolean z15 = true;
                                while (true) {
                                    if (d17 <= a10) {
                                        if (z13) {
                                            f12 = min;
                                        } else {
                                            f12 = w0Var.f45713c;
                                        }
                                        d = d17;
                                        z12 = z14;
                                        v0[] v0VarArr4 = v0VarArr3;
                                        d10 = a10;
                                        f11 = f20;
                                        float f21 = f12;
                                        v0 v0Var9 = v0Var8;
                                        v0Var2 = v0Var5;
                                        f10 = f7;
                                        boolean a11 = w0Var.a(new PointF((float) v0Var8.f45703a, (float) v0Var8.f45704b), f10, f11, f21, -1);
                                        if (!a11) {
                                            v0VarArr = v0VarArr4;
                                            z15 = a11;
                                            break;
                                        }
                                        v0 v0Var10 = new v0(v0Var9.f45703a + (v0Var.f45703a * max), v0Var9.f45704b + (v0Var.f45704b * max), v0Var9.f45705c + (v0Var.f45705c * max));
                                        z15 = a11;
                                        f20 = f11;
                                        v0Var8 = v0Var10;
                                        a10 = d10;
                                        v0VarArr3 = v0VarArr4;
                                        z14 = z12;
                                        f7 = f10;
                                        v0Var5 = v0Var2;
                                        d17 = d + max;
                                        z13 = false;
                                    } else {
                                        d = d17;
                                        z12 = z14;
                                        v0Var2 = v0Var5;
                                        f10 = f7;
                                        v0VarArr = v0VarArr3;
                                        d10 = a10;
                                        f11 = f20;
                                        break;
                                    }
                                }
                                if (z15 && z12) {
                                    w0Var.b(1);
                                    w0Var.a(new PointF((float) v0Var2.f45703a, (float) v0Var2.f45704b), f10, f11, min, -1);
                                }
                                w0Var.f45716g = d - d10;
                                size2 = i15;
                                i13 = i14;
                                f15 = f18;
                                i12 = i16;
                                v0VarArr3 = v0VarArr;
                            }
                        }
                        float f22 = f15;
                        int i18 = i12;
                        s0Var.f45660a = w0Var.f45716g;
                        rectF = new RectF(f22, f22, f22, f22);
                        int i19 = w0Var.h;
                        if (i19 <= 0) {
                            i10 = 0;
                        } else {
                            int i20 = i19 - 1;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i20 * 2) + (i19 * 4)) * 20);
                            allocateDirect.order(ByteOrder.nativeOrder());
                            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                            asFloatBuffer.position(0);
                            ByteBuffer byteBuffer2 = w0Var.f45718j;
                            if (byteBuffer2 != null && w0Var.f45717i > 0) {
                                byteBuffer2.position(0);
                            }
                            int i21 = 0;
                            for (int i22 = 0; i22 < i19; i22++) {
                                float f23 = w0Var.f45718j.getFloat();
                                float f24 = w0Var.f45718j.getFloat();
                                float f25 = w0Var.f45718j.getFloat();
                                float f26 = w0Var.f45718j.getFloat();
                                float f27 = w0Var.f45718j.getFloat();
                                RectF rectF2 = new RectF(f23 - f25, f24 - f25, f23 + f25, f24 + f25);
                                float f28 = rectF2.left;
                                float f29 = rectF2.top;
                                float f30 = rectF2.right;
                                float f31 = rectF2.bottom;
                                float[] fArr = new float[8];
                                fArr[0] = f28;
                                fArr[1] = f29;
                                fArr[i18] = f30;
                                fArr[3] = f29;
                                fArr[4] = f28;
                                fArr[5] = f31;
                                fArr[6] = f30;
                                fArr[7] = f31;
                                float centerX = rectF2.centerX();
                                float centerY = rectF2.centerY();
                                Matrix matrix = new Matrix();
                                matrix.setRotate((float) Math.toDegrees(f26), centerX, centerY);
                                matrix.mapPoints(fArr);
                                matrix.mapRect(rectF2);
                                rectF2.left = (int) Math.floor(rectF2.left);
                                rectF2.top = (int) Math.floor(rectF2.top);
                                rectF2.right = (int) Math.ceil(rectF2.right);
                                rectF2.bottom = (int) Math.ceil(rectF2.bottom);
                                rectF.union(rectF2);
                                if (i21 != 0) {
                                    c10 = 0;
                                    asFloatBuffer.put(fArr[0]);
                                    c11 = 1;
                                    asFloatBuffer.put(fArr[1]);
                                    f13 = 0.0f;
                                    asFloatBuffer.put(0.0f);
                                    asFloatBuffer.put(0.0f);
                                    asFloatBuffer.put(f27);
                                    i21++;
                                } else {
                                    f13 = 0.0f;
                                    c10 = 0;
                                    c11 = 1;
                                }
                                asFloatBuffer.put(fArr[c10]);
                                asFloatBuffer.put(fArr[c11]);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(f27);
                                asFloatBuffer.put(fArr[i18]);
                                asFloatBuffer.put(fArr[3]);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(f27);
                                asFloatBuffer.put(fArr[4]);
                                asFloatBuffer.put(fArr[5]);
                                asFloatBuffer.put(f13);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f27);
                                asFloatBuffer.put(fArr[6]);
                                asFloatBuffer.put(fArr[7]);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f27);
                                int i23 = i21 + 4;
                                if (i22 != i20) {
                                    asFloatBuffer.put(fArr[6]);
                                    asFloatBuffer.put(fArr[7]);
                                    asFloatBuffer.put(1.0f);
                                    asFloatBuffer.put(1.0f);
                                    asFloatBuffer.put(f27);
                                    i21 += 5;
                                } else {
                                    i21 = i23;
                                }
                            }
                            asFloatBuffer.position(0);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(0);
                            asFloatBuffer.position(i18);
                            GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(1);
                            asFloatBuffer.position(4);
                            GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(2);
                            i10 = 0;
                            GLES20.glDrawArrays(5, 0, i21);
                        }
                    }
                    i11 = 36160;
                } else {
                    return;
                }
            } else {
                i10 = 0;
                i11 = 36160;
            }
            GLES20.glBindFramebuffer(i11, i10);
            k2.g0 g0Var = this.f45628a;
            if (g0Var != null) {
                g0Var.e();
            }
            RectF rectF3 = this.h;
            if (rectF3 != null) {
                rectF3.union(rectF);
            } else {
                this.h = rectF;
            }
        }
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f45628a.f14466b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f16433c, z10 ? 1 : 0, rectF);
        ((d1) this.f45628a.f14466b).f45516b.b(UUID.randomUUID(), new p0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, pg.s0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: pg.r0.n(int, pg.s0, float):void");
    }

    public final void o(int i10, int i11, g1 g1Var, float f7) {
        e1 e1Var;
        int currentColor;
        int i12;
        if (g1Var != null) {
            m mVar = this.f45634i;
            l lVar = g1Var.f45533a;
            if (lVar != null && i10 == this.f45642q) {
                mVar = lVar;
            }
            if (mVar != null && this.f45632f != null && (e1Var = (e1) this.f45643r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(e1Var.f45527a);
                GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f45649y));
                GLES20.glUniform1i(e1Var.d("texture"), 0);
                GLES20.glUniform1i(e1Var.d("mask"), 1);
                e1.a(e1Var.d("color"), i0.a.k(this.f45632f.getCurrentColor(), (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(e1Var.d("type"), ((l) mVar).o());
                    int d = e1Var.d("resolution");
                    sw0 sw0Var = this.f45633g;
                    GLES20.glUniform2f(d, sw0Var.f30696a, sw0Var.f30697b);
                    GLES20.glUniform2f(e1Var.d("center"), g1Var.f45534b, g1Var.f45535c);
                    GLES20.glUniform2f(e1Var.d("radius"), g1Var.d, g1Var.f45536e);
                    GLES20.glUniform1f(e1Var.d("thickness"), g1Var.f45537f);
                    GLES20.glUniform1f(e1Var.d("rounding"), g1Var.f45538g);
                    GLES20.glUniform2f(e1Var.d("middle"), g1Var.f45539i, g1Var.f45540j);
                    GLES20.glUniform1f(e1Var.d("rotation"), g1Var.h);
                    GLES20.glUniform1i(e1Var.d("fill"), g1Var.f45542l ? 1 : 0);
                    GLES20.glUniform1f(e1Var.d("arrowTriangleLength"), g1Var.f45541k);
                    GLES20.glUniform1i(e1Var.d("composite"), 0);
                    int d10 = e1Var.d("clear");
                    if (g1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45638m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45639n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                l6.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        k2.g0 g0Var;
        s1 s1Var;
        if (aVar != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) aVar.d);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Inflater inflater = new Inflater(true);
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        inflater.setInput(bArr, 0, read);
                    }
                    while (true) {
                        int inflate = inflater.inflate(bArr2, 0, 1024);
                        if (inflate == 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, inflate);
                    }
                    if (inflater.finished()) {
                        break;
                    }
                    inflater.needsInput();
                }
                inflater.end();
                ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                byteArrayOutputStream.close();
                fileInputStream.close();
                byteBuffer = wrap;
            } catch (Exception e7) {
                FileLog.e(e7);
                byteBuffer = null;
            }
            int j3 = j();
            if (aVar.f299b == 1 && (s1Var = this.D) != null) {
                j3 = s1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) aVar.f300c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f300c).height(), 6408, 5121, byteBuffer);
            if (this.f45644s <= 0 && (g0Var = this.f45628a) != null) {
                g0Var.e();
            }
            if (z10 && (file = (File) aVar.d) != null) {
                file.delete();
                aVar.d = null;
            }
        }
    }

    public final void q(m mVar) {
        Bitmap bitmap;
        Bitmap c10;
        this.f45634i = mVar;
        if ((mVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = this.B;
            if (i10 == 90 || i10 == 270 || i10 == -90) {
                height = width;
                width = height;
            }
            if (this.C == null) {
                this.C = Bitmap.createBitmap((int) (width / 8.0f), (int) (height / 8.0f), Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(this.C);
            canvas.save();
            canvas.scale(0.125f, 0.125f);
            if (this.M != null) {
                this.M = new Paint(1);
            }
            canvas.save();
            canvas.rotate(i10);
            if (i10 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i10 == 180) {
                canvas.translate(-width, -height);
            } else if (i10 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            d1 d1Var = this.f45632f;
            if (d1Var != null && (c10 = d1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            s1 s1Var = this.f45650z;
            if (s1Var != null) {
                s1Var.a(false);
            }
            this.f45650z = new s1(this.C);
        }
    }
}
