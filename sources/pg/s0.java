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
import m.f3;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.sa;
import w7.k6;
import w7.m6;
public final class s0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public t1 D;
    public boolean E;
    public final ma F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public f3 f45755a;
    public t0 f45756b;
    public h1 f45757c;
    public h1 d;
    public e1 f45759f;
    public final mw0 f45760g;
    public RectF h;
    public m f45761i;
    public t1 f45763k;
    public t1 f45764l;
    public final ByteBuffer f45765m;
    public final ByteBuffer f45766n;
    public int f45767o;
    public int f45768p;
    public int f45769q;
    public Map f45770r;
    public int f45771s;
    public final ByteBuffer f45773u;
    public boolean v;
    public a5.a f45774w;
    public final float[] f45775x;
    public float[] f45776y;
    public t1 f45777z;
    public final HashMap f45762j = new HashMap();
    public final int[] f45772t = new int[1];
    public boolean G = false;
    public final x0 f45758e = new Object();

    public s0(mw0 mw0Var, Bitmap bitmap, int i10, ma maVar) {
        this.F = maVar;
        this.f45760g = mw0Var;
        this.A = bitmap;
        this.B = i10;
        this.f45773u = ByteBuffer.allocateDirect(((int) mw0Var.f28963a) * ((int) mw0Var.f28964b) * 4);
        this.f45775x = k6.b(mw0Var.f28963a, mw0Var.f28964b);
        if (this.f45765m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f45765m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f45765m.putFloat(0.0f);
        this.f45765m.putFloat(0.0f);
        this.f45765m.putFloat(mw0Var.f28963a);
        this.f45765m.putFloat(0.0f);
        this.f45765m.putFloat(0.0f);
        this.f45765m.putFloat(mw0Var.f28964b);
        this.f45765m.putFloat(mw0Var.f28963a);
        this.f45765m.putFloat(mw0Var.f28964b);
        this.f45765m.rewind();
        if (this.f45766n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f45766n = allocateDirect2;
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
        int i10 = this.f45767o;
        int[] iArr = this.f45772t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f45767o = 0;
        }
        t1 t1Var = this.f45763k;
        if (t1Var != null) {
            t1Var.a(z10);
        }
        t1 t1Var2 = this.D;
        if (t1Var2 != null) {
            t1Var2.a(z10);
        }
        int i11 = this.f45768p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f45768p = 0;
        }
        HashMap hashMap = this.f45762j;
        for (t1 t1Var3 : hashMap.values()) {
            if (t1Var3 != null) {
                t1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f45769q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f45769q = 0;
        }
        t1 t1Var4 = this.f45777z;
        if (t1Var4 != null) {
            t1Var4.a(true);
        }
        t1 t1Var5 = this.f45764l;
        if (t1Var5 != null) {
            t1Var5.a(true);
        }
        Map map = this.f45770r;
        if (map != null) {
            for (f1 f1Var : map.values()) {
                if (f1Var.f45646a != 0) {
                    GLES20.glDeleteProgram(0);
                    f1Var.f45646a = 0;
                }
            }
            this.f45770r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        m6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            mw0 mw0Var = this.f45760g;
            GLES20.glViewport(0, 0, (int) mw0Var.f28963a, (int) mw0Var.f28964b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        f3 f3Var = this.f45755a;
        if (f3Var != null) {
            f3Var.g();
        }
        x0 x0Var = this.f45758e;
        x0Var.h = 0;
        x0Var.f45844g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f45846j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f45756b = null;
        this.J = 0.0f;
    }

    public final void c(t0 t0Var, int i10, boolean z10, z zVar) {
        if (this.f45770r != null && this.f45761i != null) {
            this.f45759f.f(new m4.f0(this, t0Var, i10, z10, zVar));
        }
    }

    public final a5.a d(pg.t0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.d(pg.t0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(h1 h1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = h1Var.f45653a;
        if (mVar == null) {
            mVar = this.f45761i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f45771s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        mw0 mw0Var = this.f45760g;
        GLES20.glViewport(0, 0, (int) mw0Var.f28963a, (int) mw0Var.f28964b);
        f1 f1Var = (f1) this.f45770r.get(mVar.i(1));
        if (f1Var == null) {
            return null;
        }
        GLES20.glUseProgram(f1Var.f45646a);
        GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f45775x));
        GLES20.glUniform1i(f1Var.d("texture"), 0);
        GLES20.glUniform1i(f1Var.d("mask"), 1);
        f1.a(f1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f45777z != null) {
            GLES20.glUniform1i(f1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f45777z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(f1Var.d("type"), h1Var.f45653a.o());
            GLES20.glUniform2f(f1Var.d("resolution"), mw0Var.f28963a, mw0Var.f28964b);
            GLES20.glUniform2f(f1Var.d("center"), h1Var.f45654b, h1Var.f45655c);
            GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.f45656e);
            GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f45657f);
            GLES20.glUniform1f(f1Var.d("rounding"), h1Var.f45658g);
            GLES20.glUniform2f(f1Var.d("middle"), h1Var.f45659i, h1Var.f45660j);
            GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
            GLES20.glUniform1i(f1Var.d("fill"), h1Var.f45662l ? 1 : 0);
            GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.f45661k);
            GLES20.glUniform1i(f1Var.d("composite"), 1);
            GLES20.glUniform1i(f1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45765m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45766n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        f3 f3Var = this.f45755a;
        if (f3Var != null && this.f45771s <= 0) {
            f3Var.g();
        }
        this.f45771s--;
        x0 x0Var = this.f45758e;
        x0Var.h = 0;
        x0Var.f45844g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f45846j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f45756b = null;
        this.f45757c = null;
        return m10;
    }

    public final RectF f() {
        mw0 mw0Var = this.f45760g;
        return new RectF(0.0f, 0.0f, mw0Var.f28963a, mw0Var.f28964b);
    }

    public final int g() {
        if (this.f45768p == 0) {
            this.f45768p = t1.b(this.f45760g);
        }
        return this.f45768p;
    }

    public final n6.t h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        t1 t1Var;
        n6.t tVar;
        f1 f1Var;
        int i10;
        int j10;
        t1 t1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f45772t, 0);
        int i13 = this.f45772t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f45772t, 0);
        int i14 = this.f45772t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        mw0 mw0Var = this.f45760g;
        GLES20.glViewport(0, 0, (int) mw0Var.f28963a, (int) mw0Var.f28964b);
        Map map = this.f45770r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            f1 f1Var2 = (f1) map.get(str);
            if (f1Var2 != null) {
                GLES20.glUseProgram(f1Var2.f45646a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = k6.c(this.f45775x, k6.a(matrix));
                GLES20.glUniformMatrix4fv(f1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(f1Var2.d("texture"), 1);
                    GLES20.glUniform1i(f1Var2.d("mask"), 0);
                    GLES20.glUniform1f(f1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (t1Var2 = this.D) != null) {
                        j10 = t1Var2.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f45764l.c());
                } else {
                    GLES20.glUniform1i(f1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (t1Var = this.D) != null) {
                        j3 = t1Var.c();
                    } else {
                        j3 = j();
                    }
                    GLES20.glBindTexture(3553, j3);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45765m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45766n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (f1Var = (f1) this.f45770r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(f1Var.f45646a);
                    GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(f1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(f1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    sa saVar = this.F.f28797m;
                    if (saVar != null) {
                        i10 = saVar.f30756s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(f1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45765m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45766n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f45773u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f45773u);
                if (z10) {
                    tVar = new n6.t(11, null, this.f45773u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f45773u);
                    tVar = new n6.t(11, createBitmap, null);
                }
                this.f45773u.rewind();
                int[] iArr = this.f45772t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f45772t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return tVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f45767o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f45767o = iArr[0];
            m6.a();
        }
        return this.f45767o;
    }

    public final int j() {
        t1 t1Var = this.f45763k;
        if (t1Var != null) {
            return t1Var.c();
        }
        return 0;
    }

    public final void k(h1 h1Var) {
        if (h1Var == null) {
            return;
        }
        this.f45759f.f(new o0(this, h1Var, 0));
    }

    public final void l(t0 t0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        float a2;
        int size;
        float atan2;
        w0 w0Var;
        float f7;
        double d;
        boolean z12;
        w0 w0Var2;
        float f10;
        w0[] w0VarArr;
        double d10;
        float f11;
        float f12;
        float f13;
        char c10;
        char c11;
        float f14;
        this.f45756b = t0Var;
        if (t0Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            m6.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                mw0 mw0Var = this.f45760g;
                GLES20.glViewport(0, 0, (int) mw0Var.f28963a, (int) mw0Var.f28964b);
                float f15 = 0.0f;
                if (z10) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                }
                Map map = this.f45770r;
                if (map != null) {
                    m mVar = t0Var.f45791e;
                    int i12 = 2;
                    f1 f1Var = (f1) map.get(mVar.i(2));
                    if (f1Var == null) {
                        return;
                    }
                    GLES20.glUseProgram(f1Var.f45646a);
                    t1 t1Var = (t1) this.f45762j.get(Integer.valueOf(mVar.l()));
                    if (t1Var == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        t1Var = new t1(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                        this.f45762j.put(Integer.valueOf(mVar.l()), t1Var);
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, t1Var.c());
                    GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f45775x));
                    GLES20.glUniform1i(f1Var.d("texture"), 0);
                    if (!z11) {
                        this.f45758e.f45843f = this.f45759f.getScaleX();
                    } else {
                        this.f45758e.f45843f = 1.0f;
                    }
                    x0 x0Var = this.f45758e;
                    x0Var.f45839a = t0Var.d;
                    x0Var.f45840b = t0Var.f45791e.k();
                    if (z11) {
                        a2 = 1.0f;
                    } else {
                        a2 = t0Var.f45791e.a();
                    }
                    x0Var.f45841c = a2;
                    x0Var.d = t0Var.f45791e.b();
                    x0Var.f45842e = t0Var.f45791e.h();
                    Vector vector = t0Var.f45789b;
                    if (vector == null) {
                        size = 0;
                    } else {
                        size = vector.size();
                    }
                    if (size == 0) {
                        i10 = 0;
                    } else {
                        if (size == 1) {
                            Vector vector2 = t0Var.f45789b;
                            w0[] w0VarArr2 = new w0[vector2.size()];
                            vector2.toArray(w0VarArr2);
                            w0 w0Var3 = w0VarArr2[0];
                            float f16 = ((x0Var.f45839a * x0Var.f45842e) * 1.0f) / x0Var.f45843f;
                            w0Var3.getClass();
                            PointF pointF = new PointF((float) w0Var3.f45829a, (float) w0Var3.f45830b);
                            if (Math.abs(x0Var.d) > 0.0f) {
                                f14 = x0Var.d;
                            } else {
                                f14 = 0.0f;
                            }
                            float f17 = x0Var.f45841c;
                            x0Var.c();
                            x0Var.b(1);
                            x0Var.a(pointF, f16, f14, f17, 0);
                        } else {
                            Vector vector3 = t0Var.f45789b;
                            int size2 = vector3.size();
                            w0[] w0VarArr3 = new w0[size2];
                            vector3.toArray(w0VarArr3);
                            x0Var.c();
                            int i13 = 0;
                            while (i13 < size2 - 1) {
                                w0 w0Var4 = w0VarArr3[i13];
                                int i14 = i13 + 1;
                                w0 w0Var5 = w0VarArr3[i14];
                                double a10 = w0Var4.a(w0Var5);
                                int i15 = size2;
                                float f18 = f15;
                                double d11 = w0Var5.f45829a - w0Var4.f45829a;
                                int i16 = i12;
                                double d12 = w0Var5.f45830b - w0Var4.f45830b;
                                double d13 = w0Var5.f45831c;
                                double d14 = d13 - w0Var4.f45831c;
                                w0 w0Var6 = new w0(1.0d, 1.0d, 0.0d);
                                if (Math.abs(x0Var.d) > f18) {
                                    atan2 = x0Var.d;
                                } else {
                                    atan2 = (float) Math.atan2(d12, d11);
                                }
                                float f19 = (float) ((((x0Var.f45839a * d13) * x0Var.f45842e) * 1.0d) / x0Var.f45843f);
                                double max = Math.max(1.0f, x0Var.f45840b * f19);
                                if (a10 > 0.0d) {
                                    double d15 = 1.0d / a10;
                                    w0Var = new w0(d11 * d15, d12 * d15, d14 * d15);
                                } else {
                                    w0Var = w0Var6;
                                }
                                float min = Math.min(1.0f, x0Var.f45841c * 1.15f);
                                boolean z13 = w0Var4.d;
                                boolean z14 = w0Var5.d;
                                float f20 = atan2;
                                int i17 = x0Var.h;
                                x0Var.b((int) Math.ceil((a10 - x0Var.f45844g) / max));
                                ByteBuffer byteBuffer = x0Var.f45846j;
                                if (byteBuffer != null && i17 >= 0) {
                                    f7 = f19;
                                    if (i17 < x0Var.f45845i) {
                                        byteBuffer.position(i17 * 20);
                                    }
                                } else {
                                    f7 = f19;
                                }
                                double d16 = x0Var.f45844g;
                                w0 w0Var7 = new w0(w0Var4.f45829a + (w0Var.f45829a * d16), w0Var4.f45830b + (w0Var.f45830b * d16), w0Var4.f45831c + (w0Var.f45831c * d16));
                                double d17 = d16;
                                w0 w0Var8 = w0Var7;
                                boolean z15 = true;
                                while (true) {
                                    if (d17 <= a10) {
                                        if (z13) {
                                            f12 = min;
                                        } else {
                                            f12 = x0Var.f45841c;
                                        }
                                        d = d17;
                                        z12 = z14;
                                        w0[] w0VarArr4 = w0VarArr3;
                                        d10 = a10;
                                        f11 = f20;
                                        float f21 = f12;
                                        w0 w0Var9 = w0Var8;
                                        w0Var2 = w0Var5;
                                        f10 = f7;
                                        boolean a11 = x0Var.a(new PointF((float) w0Var8.f45829a, (float) w0Var8.f45830b), f10, f11, f21, -1);
                                        if (!a11) {
                                            w0VarArr = w0VarArr4;
                                            z15 = a11;
                                            break;
                                        }
                                        w0 w0Var10 = new w0(w0Var9.f45829a + (w0Var.f45829a * max), w0Var9.f45830b + (w0Var.f45830b * max), w0Var9.f45831c + (w0Var.f45831c * max));
                                        z15 = a11;
                                        f20 = f11;
                                        w0Var8 = w0Var10;
                                        a10 = d10;
                                        w0VarArr3 = w0VarArr4;
                                        z14 = z12;
                                        f7 = f10;
                                        w0Var5 = w0Var2;
                                        d17 = d + max;
                                        z13 = false;
                                    } else {
                                        d = d17;
                                        z12 = z14;
                                        w0Var2 = w0Var5;
                                        f10 = f7;
                                        w0VarArr = w0VarArr3;
                                        d10 = a10;
                                        f11 = f20;
                                        break;
                                    }
                                }
                                if (z15 && z12) {
                                    x0Var.b(1);
                                    x0Var.a(new PointF((float) w0Var2.f45829a, (float) w0Var2.f45830b), f10, f11, min, -1);
                                }
                                x0Var.f45844g = d - d10;
                                size2 = i15;
                                i13 = i14;
                                f15 = f18;
                                i12 = i16;
                                w0VarArr3 = w0VarArr;
                            }
                        }
                        float f22 = f15;
                        int i18 = i12;
                        t0Var.f45788a = x0Var.f45844g;
                        rectF = new RectF(f22, f22, f22, f22);
                        int i19 = x0Var.h;
                        if (i19 <= 0) {
                            i10 = 0;
                        } else {
                            int i20 = i19 - 1;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i20 * 2) + (i19 * 4)) * 20);
                            allocateDirect.order(ByteOrder.nativeOrder());
                            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                            asFloatBuffer.position(0);
                            ByteBuffer byteBuffer2 = x0Var.f45846j;
                            if (byteBuffer2 != null && x0Var.f45845i > 0) {
                                byteBuffer2.position(0);
                            }
                            int i21 = 0;
                            for (int i22 = 0; i22 < i19; i22++) {
                                float f23 = x0Var.f45846j.getFloat();
                                float f24 = x0Var.f45846j.getFloat();
                                float f25 = x0Var.f45846j.getFloat();
                                float f26 = x0Var.f45846j.getFloat();
                                float f27 = x0Var.f45846j.getFloat();
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
            f3 f3Var = this.f45755a;
            if (f3Var != null) {
                f3Var.g();
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
        Object obj = this.f45755a.f15668b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f16718c, z10 ? 1 : 0, rectF);
        ((e1) this.f45755a.f15668b).f45634b.b(UUID.randomUUID(), new q0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, pg.t0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.n(int, pg.t0, float):void");
    }

    public final void o(int i10, int i11, h1 h1Var, float f7) {
        f1 f1Var;
        int currentColor;
        int i12;
        if (h1Var != null) {
            m mVar = this.f45761i;
            l lVar = h1Var.f45653a;
            if (lVar != null && i10 == this.f45769q) {
                mVar = lVar;
            }
            if (mVar != null && this.f45759f != null && (f1Var = (f1) this.f45770r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(f1Var.f45646a);
                GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f45776y));
                GLES20.glUniform1i(f1Var.d("texture"), 0);
                GLES20.glUniform1i(f1Var.d("mask"), 1);
                f1.a(f1Var.d("color"), i0.a.k(this.f45759f.getCurrentColor(), (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(f1Var.d("type"), ((l) mVar).o());
                    int d = f1Var.d("resolution");
                    mw0 mw0Var = this.f45760g;
                    GLES20.glUniform2f(d, mw0Var.f28963a, mw0Var.f28964b);
                    GLES20.glUniform2f(f1Var.d("center"), h1Var.f45654b, h1Var.f45655c);
                    GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.f45656e);
                    GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f45657f);
                    GLES20.glUniform1f(f1Var.d("rounding"), h1Var.f45658g);
                    GLES20.glUniform2f(f1Var.d("middle"), h1Var.f45659i, h1Var.f45660j);
                    GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
                    GLES20.glUniform1i(f1Var.d("fill"), h1Var.f45662l ? 1 : 0);
                    GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.f45661k);
                    GLES20.glUniform1i(f1Var.d("composite"), 0);
                    int d10 = f1Var.d("clear");
                    if (h1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f45765m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f45766n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                m6.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        f3 f3Var;
        t1 t1Var;
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
            if (aVar.f299b == 1 && (t1Var = this.D) != null) {
                j3 = t1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) aVar.f300c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f300c).height(), 6408, 5121, byteBuffer);
            if (this.f45771s <= 0 && (f3Var = this.f45755a) != null) {
                f3Var.g();
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
        this.f45761i = mVar;
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
            e1 e1Var = this.f45759f;
            if (e1Var != null && (c10 = e1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            t1 t1Var = this.f45777z;
            if (t1Var != null) {
                t1Var.a(false);
            }
            this.f45777z = new t1(this.C);
        }
    }
}
