package sg;

import a8.xa;
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
import c8.ec;
import c8.gc;
import di.z9;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.u9;
public final class i0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public i1 D;
    public boolean E;
    public final u9 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public ou f56647a;
    public j0 f56648b;
    public x0 f56649c;
    public x0 d;
    public u0 f56651f;
    public final nt0 f56652g;
    public RectF h;
    public h f56653i;
    public i1 f56655k;
    public i1 f56656l;
    public final ByteBuffer f56657m;
    public final ByteBuffer f56658n;
    public int f56659o;
    public int f56660p;
    public int f56661q;
    public Map f56662r;
    public int f56663s;
    public final ByteBuffer f56665u;
    public boolean v;
    public xa f56666w;
    public final float[] f56667x;
    public float[] f56668y;
    public i1 f56669z;
    public final HashMap f56654j = new HashMap();
    public final int[] f56664t = new int[1];
    public boolean G = false;
    public final n0 f56650e = new Object();

    public i0(nt0 nt0Var, Bitmap bitmap, int i7, u9 u9Var) {
        this.F = u9Var;
        this.f56652g = nt0Var;
        this.A = bitmap;
        this.B = i7;
        this.f56665u = ByteBuffer.allocateDirect(((int) nt0Var.f37702a) * ((int) nt0Var.f37703b) * 4);
        this.f56667x = ec.b(nt0Var.f37702a, nt0Var.f37703b);
        if (this.f56657m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f56657m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f56657m.putFloat(0.0f);
        this.f56657m.putFloat(0.0f);
        this.f56657m.putFloat(nt0Var.f37702a);
        this.f56657m.putFloat(0.0f);
        this.f56657m.putFloat(0.0f);
        this.f56657m.putFloat(nt0Var.f37703b);
        this.f56657m.putFloat(nt0Var.f37702a);
        this.f56657m.putFloat(nt0Var.f37703b);
        this.f56657m.rewind();
        if (this.f56658n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f56658n = allocateDirect2;
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
        int i7 = this.f56659o;
        int[] iArr = this.f56664t;
        if (i7 != 0) {
            iArr[0] = i7;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f56659o = 0;
        }
        i1 i1Var = this.f56655k;
        if (i1Var != null) {
            i1Var.a(z10);
        }
        i1 i1Var2 = this.D;
        if (i1Var2 != null) {
            i1Var2.a(z10);
        }
        int i10 = this.f56660p;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f56660p = 0;
        }
        HashMap hashMap = this.f56654j;
        for (i1 i1Var3 : hashMap.values()) {
            if (i1Var3 != null) {
                i1Var3.a(true);
            }
        }
        hashMap.clear();
        int i11 = this.f56661q;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f56661q = 0;
        }
        i1 i1Var4 = this.f56669z;
        if (i1Var4 != null) {
            i1Var4.a(true);
        }
        i1 i1Var5 = this.f56656l;
        if (i1Var5 != null) {
            i1Var5.a(true);
        }
        Map map = this.f56662r;
        if (map != null) {
            for (v0 v0Var : map.values()) {
                if (v0Var.f56816a != 0) {
                    GLES20.glDeleteProgram(0);
                    v0Var.f56816a = 0;
                }
            }
            this.f56662r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        gc.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            nt0 nt0Var = this.f56652g;
            GLES20.glViewport(0, 0, (int) nt0Var.f37702a, (int) nt0Var.f37703b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        ou ouVar = this.f56647a;
        if (ouVar != null) {
            ouVar.E0();
        }
        n0 n0Var = this.f56650e;
        n0Var.h = 0;
        n0Var.f56724g = 0.0d;
        ByteBuffer byteBuffer = n0Var.f56726j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f56648b = null;
        this.J = 0.0f;
    }

    public final void c(j0 j0Var, int i7, boolean z10, s sVar) {
        if (this.f56662r != null && this.f56653i != null) {
            this.f56651f.f(new z9(this, j0Var, i7, z10, sVar));
        }
    }

    public final a8.xa d(sg.j0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: sg.i0.d(sg.j0, int, android.graphics.RectF):a8.xa");
    }

    public final xa e(x0 x0Var, int i7, RectF rectF) {
        boolean z10;
        h hVar = x0Var.f56823a;
        if (hVar == null) {
            hVar = this.f56653i;
        }
        if (this.F != null && (hVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        xa m10 = m(rectF, z10);
        this.f56663s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        nt0 nt0Var = this.f56652g;
        GLES20.glViewport(0, 0, (int) nt0Var.f37702a, (int) nt0Var.f37703b);
        v0 v0Var = (v0) this.f56662r.get(hVar.i(1));
        if (v0Var == null) {
            return null;
        }
        GLES20.glUseProgram(v0Var.f56816a);
        GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f56667x));
        GLES20.glUniform1i(v0Var.d("texture"), 0);
        GLES20.glUniform1i(v0Var.d("mask"), 1);
        v0.a(v0Var.d("color"), i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((hVar instanceof b) && this.f56669z != null) {
            GLES20.glUniform1i(v0Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f56669z.c());
        }
        if (hVar instanceof g) {
            GLES20.glUniform1i(v0Var.d("type"), x0Var.f56823a.o());
            GLES20.glUniform2f(v0Var.d("resolution"), nt0Var.f37702a, nt0Var.f37703b);
            GLES20.glUniform2f(v0Var.d("center"), x0Var.f56824b, x0Var.f56825c);
            GLES20.glUniform2f(v0Var.d("radius"), x0Var.d, x0Var.f56826e);
            GLES20.glUniform1f(v0Var.d("thickness"), x0Var.f56827f);
            GLES20.glUniform1f(v0Var.d("rounding"), x0Var.f56828g);
            GLES20.glUniform2f(v0Var.d("middle"), x0Var.f56829i, x0Var.f56830j);
            GLES20.glUniform1f(v0Var.d("rotation"), x0Var.h);
            GLES20.glUniform1i(v0Var.d("fill"), x0Var.f56832l ? 1 : 0);
            GLES20.glUniform1f(v0Var.d("arrowTriangleLength"), x0Var.f56831k);
            GLES20.glUniform1i(v0Var.d("composite"), 1);
            GLES20.glUniform1i(v0Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f56657m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f56658n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        ou ouVar = this.f56647a;
        if (ouVar != null && this.f56663s <= 0) {
            ouVar.E0();
        }
        this.f56663s--;
        n0 n0Var = this.f56650e;
        n0Var.h = 0;
        n0Var.f56724g = 0.0d;
        ByteBuffer byteBuffer = n0Var.f56726j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f56648b = null;
        this.f56649c = null;
        return m10;
    }

    public final RectF f() {
        nt0 nt0Var = this.f56652g;
        return new RectF(0.0f, 0.0f, nt0Var.f37702a, nt0Var.f37703b);
    }

    public final int g() {
        if (this.f56660p == 0) {
            this.f56660p = i1.b(this.f56652g);
        }
        return this.f56660p;
    }

    public final h0 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        i1 i1Var;
        h0 h0Var;
        v0 v0Var;
        int i7;
        int j10;
        i1 i1Var2;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f56664t, 0);
        int i12 = this.f56664t[0];
        GLES20.glBindFramebuffer(36160, i12);
        GLES20.glGenTextures(1, this.f56664t, 0);
        int i13 = this.f56664t[0];
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i13, 0);
        nt0 nt0Var = this.f56652g;
        GLES20.glViewport(0, 0, (int) nt0Var.f37702a, (int) nt0Var.f37703b);
        Map map = this.f56662r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            v0 v0Var2 = (v0) map.get(str);
            if (v0Var2 != null) {
                GLES20.glUseProgram(v0Var2.f56816a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c10 = ec.c(this.f56667x, ec.a(matrix));
                GLES20.glUniformMatrix4fv(v0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(v0Var2.d("texture"), 1);
                    GLES20.glUniform1i(v0Var2.d("mask"), 0);
                    GLES20.glUniform1f(v0Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (i1Var2 = this.D) != null) {
                        j10 = i1Var2.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f56656l.c());
                } else {
                    GLES20.glUniform1i(v0Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (i1Var = this.D) != null) {
                        j3 = i1Var.c();
                    } else {
                        j3 = j();
                    }
                    GLES20.glBindTexture(3553, j3);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f56657m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f56658n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (v0Var = (v0) this.f56662r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(v0Var.f56816a);
                    GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(v0Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(v0Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(v0Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    org.telegram.ui.Components.z9 z9Var = this.F.f39976m;
                    if (z9Var != null) {
                        i7 = z9Var.f42322s[2];
                    } else {
                        i7 = -1;
                    }
                    GLES20.glBindTexture(3553, i7);
                    GLES20.glUniform1f(v0Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(v0Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f56657m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f56658n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f56665u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f56665u);
                if (z10) {
                    h0Var = new h0(0, null, this.f56665u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f56665u);
                    h0Var = new h0(0, createBitmap, null);
                }
                this.f56665u.rewind();
                int[] iArr = this.f56664t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f56664t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return h0Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f56659o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f56659o = iArr[0];
            gc.a();
        }
        return this.f56659o;
    }

    public final int j() {
        i1 i1Var = this.f56655k;
        if (i1Var != null) {
            return i1Var.c();
        }
        return 0;
    }

    public final void k(x0 x0Var) {
        if (x0Var == null) {
            return;
        }
        this.f56651f.f(new d0(this, x0Var, 0));
    }

    public final void l(j0 j0Var, boolean z10, boolean z11) {
        int i7;
        int i10;
        float a10;
        int size;
        float atan2;
        m0 m0Var;
        float f10;
        double d;
        boolean z12;
        m0 m0Var2;
        float f11;
        m0[] m0VarArr;
        double d2;
        float f12;
        float f13;
        float f14;
        char c10;
        char c11;
        float f15;
        this.f56648b = j0Var;
        if (j0Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            gc.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                nt0 nt0Var = this.f56652g;
                GLES20.glViewport(0, 0, (int) nt0Var.f37702a, (int) nt0Var.f37703b);
                float f16 = 0.0f;
                if (z10) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                }
                Map map = this.f56662r;
                if (map != null) {
                    h hVar = j0Var.f56677e;
                    int i11 = 2;
                    v0 v0Var = (v0) map.get(hVar.i(2));
                    if (v0Var == null) {
                        return;
                    }
                    GLES20.glUseProgram(v0Var.f56816a);
                    i1 i1Var = (i1) this.f56654j.get(Integer.valueOf(hVar.l()));
                    if (i1Var == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        i1Var = new i1(BitmapFactory.decodeResource(org.telegram.messenger.t0.f26609b.getResources(), hVar.l(), options));
                        this.f56654j.put(Integer.valueOf(hVar.l()), i1Var);
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, i1Var.c());
                    GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f56667x));
                    GLES20.glUniform1i(v0Var.d("texture"), 0);
                    if (!z11) {
                        this.f56650e.f56723f = this.f56651f.getScaleX();
                    } else {
                        this.f56650e.f56723f = 1.0f;
                    }
                    n0 n0Var = this.f56650e;
                    n0Var.f56719a = j0Var.d;
                    n0Var.f56720b = j0Var.f56677e.k();
                    if (z11) {
                        a10 = 1.0f;
                    } else {
                        a10 = j0Var.f56677e.a();
                    }
                    n0Var.f56721c = a10;
                    n0Var.d = j0Var.f56677e.b();
                    n0Var.f56722e = j0Var.f56677e.h();
                    Vector vector = j0Var.f56675b;
                    if (vector == null) {
                        size = 0;
                    } else {
                        size = vector.size();
                    }
                    if (size == 0) {
                        i7 = 0;
                    } else {
                        if (size == 1) {
                            Vector vector2 = j0Var.f56675b;
                            m0[] m0VarArr2 = new m0[vector2.size()];
                            vector2.toArray(m0VarArr2);
                            m0 m0Var3 = m0VarArr2[0];
                            float f17 = ((n0Var.f56719a * n0Var.f56722e) * 1.0f) / n0Var.f56723f;
                            m0Var3.getClass();
                            PointF pointF = new PointF((float) m0Var3.f56710a, (float) m0Var3.f56711b);
                            if (Math.abs(n0Var.d) > 0.0f) {
                                f15 = n0Var.d;
                            } else {
                                f15 = 0.0f;
                            }
                            float f18 = n0Var.f56721c;
                            n0Var.c();
                            n0Var.b(1);
                            n0Var.a(pointF, f17, f15, f18, 0);
                        } else {
                            Vector vector3 = j0Var.f56675b;
                            int size2 = vector3.size();
                            m0[] m0VarArr3 = new m0[size2];
                            vector3.toArray(m0VarArr3);
                            n0Var.c();
                            int i12 = 0;
                            while (i12 < size2 - 1) {
                                m0 m0Var4 = m0VarArr3[i12];
                                int i13 = i12 + 1;
                                m0 m0Var5 = m0VarArr3[i13];
                                double a11 = m0Var4.a(m0Var5);
                                int i14 = size2;
                                float f19 = f16;
                                double d10 = m0Var5.f56710a - m0Var4.f56710a;
                                int i15 = i11;
                                double d11 = m0Var5.f56711b - m0Var4.f56711b;
                                double d12 = m0Var5.f56712c;
                                double d13 = d12 - m0Var4.f56712c;
                                m0 m0Var6 = new m0(1.0d, 1.0d, 0.0d);
                                if (Math.abs(n0Var.d) > f19) {
                                    atan2 = n0Var.d;
                                } else {
                                    atan2 = (float) Math.atan2(d11, d10);
                                }
                                float f20 = (float) ((((n0Var.f56719a * d12) * n0Var.f56722e) * 1.0d) / n0Var.f56723f);
                                double max = Math.max(1.0f, n0Var.f56720b * f20);
                                if (a11 > 0.0d) {
                                    double d14 = 1.0d / a11;
                                    m0Var = new m0(d10 * d14, d11 * d14, d13 * d14);
                                } else {
                                    m0Var = m0Var6;
                                }
                                float min = Math.min(1.0f, n0Var.f56721c * 1.15f);
                                boolean z13 = m0Var4.d;
                                boolean z14 = m0Var5.d;
                                float f21 = atan2;
                                int i16 = n0Var.h;
                                n0Var.b((int) Math.ceil((a11 - n0Var.f56724g) / max));
                                ByteBuffer byteBuffer = n0Var.f56726j;
                                if (byteBuffer != null && i16 >= 0) {
                                    f10 = f20;
                                    if (i16 < n0Var.f56725i) {
                                        byteBuffer.position(i16 * 20);
                                    }
                                } else {
                                    f10 = f20;
                                }
                                double d15 = n0Var.f56724g;
                                m0 m0Var7 = new m0(m0Var4.f56710a + (m0Var.f56710a * d15), m0Var4.f56711b + (m0Var.f56711b * d15), m0Var4.f56712c + (m0Var.f56712c * d15));
                                double d16 = d15;
                                m0 m0Var8 = m0Var7;
                                boolean z15 = true;
                                while (true) {
                                    if (d16 <= a11) {
                                        if (z13) {
                                            f13 = min;
                                        } else {
                                            f13 = n0Var.f56721c;
                                        }
                                        d = d16;
                                        z12 = z14;
                                        m0[] m0VarArr4 = m0VarArr3;
                                        d2 = a11;
                                        f12 = f21;
                                        float f22 = f13;
                                        m0 m0Var9 = m0Var8;
                                        m0Var2 = m0Var5;
                                        f11 = f10;
                                        boolean a12 = n0Var.a(new PointF((float) m0Var8.f56710a, (float) m0Var8.f56711b), f11, f12, f22, -1);
                                        if (!a12) {
                                            m0VarArr = m0VarArr4;
                                            z15 = a12;
                                            break;
                                        }
                                        m0 m0Var10 = new m0(m0Var9.f56710a + (m0Var.f56710a * max), m0Var9.f56711b + (m0Var.f56711b * max), m0Var9.f56712c + (m0Var.f56712c * max));
                                        z15 = a12;
                                        f21 = f12;
                                        m0Var8 = m0Var10;
                                        a11 = d2;
                                        m0VarArr3 = m0VarArr4;
                                        z14 = z12;
                                        f10 = f11;
                                        m0Var5 = m0Var2;
                                        d16 = d + max;
                                        z13 = false;
                                    } else {
                                        d = d16;
                                        z12 = z14;
                                        m0Var2 = m0Var5;
                                        f11 = f10;
                                        m0VarArr = m0VarArr3;
                                        d2 = a11;
                                        f12 = f21;
                                        break;
                                    }
                                }
                                if (z15 && z12) {
                                    n0Var.b(1);
                                    n0Var.a(new PointF((float) m0Var2.f56710a, (float) m0Var2.f56711b), f11, f12, min, -1);
                                }
                                n0Var.f56724g = d - d2;
                                size2 = i14;
                                i12 = i13;
                                f16 = f19;
                                i11 = i15;
                                m0VarArr3 = m0VarArr;
                            }
                        }
                        float f23 = f16;
                        int i17 = i11;
                        j0Var.f56674a = n0Var.f56724g;
                        rectF = new RectF(f23, f23, f23, f23);
                        int i18 = n0Var.h;
                        if (i18 <= 0) {
                            i7 = 0;
                        } else {
                            int i19 = i18 - 1;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i19 * 2) + (i18 * 4)) * 20);
                            allocateDirect.order(ByteOrder.nativeOrder());
                            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                            asFloatBuffer.position(0);
                            ByteBuffer byteBuffer2 = n0Var.f56726j;
                            if (byteBuffer2 != null && n0Var.f56725i > 0) {
                                byteBuffer2.position(0);
                            }
                            int i20 = 0;
                            for (int i21 = 0; i21 < i18; i21++) {
                                float f24 = n0Var.f56726j.getFloat();
                                float f25 = n0Var.f56726j.getFloat();
                                float f26 = n0Var.f56726j.getFloat();
                                float f27 = n0Var.f56726j.getFloat();
                                float f28 = n0Var.f56726j.getFloat();
                                RectF rectF2 = new RectF(f24 - f26, f25 - f26, f24 + f26, f25 + f26);
                                float f29 = rectF2.left;
                                float f30 = rectF2.top;
                                float f31 = rectF2.right;
                                float f32 = rectF2.bottom;
                                float[] fArr = new float[8];
                                fArr[0] = f29;
                                fArr[1] = f30;
                                fArr[i17] = f31;
                                fArr[3] = f30;
                                fArr[4] = f29;
                                fArr[5] = f32;
                                fArr[6] = f31;
                                fArr[7] = f32;
                                float centerX = rectF2.centerX();
                                float centerY = rectF2.centerY();
                                Matrix matrix = new Matrix();
                                matrix.setRotate((float) Math.toDegrees(f27), centerX, centerY);
                                matrix.mapPoints(fArr);
                                matrix.mapRect(rectF2);
                                rectF2.left = (int) Math.floor(rectF2.left);
                                rectF2.top = (int) Math.floor(rectF2.top);
                                rectF2.right = (int) Math.ceil(rectF2.right);
                                rectF2.bottom = (int) Math.ceil(rectF2.bottom);
                                rectF.union(rectF2);
                                if (i20 != 0) {
                                    c10 = 0;
                                    asFloatBuffer.put(fArr[0]);
                                    c11 = 1;
                                    asFloatBuffer.put(fArr[1]);
                                    f14 = 0.0f;
                                    asFloatBuffer.put(0.0f);
                                    asFloatBuffer.put(0.0f);
                                    asFloatBuffer.put(f28);
                                    i20++;
                                } else {
                                    f14 = 0.0f;
                                    c10 = 0;
                                    c11 = 1;
                                }
                                asFloatBuffer.put(fArr[c10]);
                                asFloatBuffer.put(fArr[c11]);
                                asFloatBuffer.put(f14);
                                asFloatBuffer.put(f14);
                                asFloatBuffer.put(f28);
                                asFloatBuffer.put(fArr[i17]);
                                asFloatBuffer.put(fArr[3]);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f14);
                                asFloatBuffer.put(f28);
                                asFloatBuffer.put(fArr[4]);
                                asFloatBuffer.put(fArr[5]);
                                asFloatBuffer.put(f14);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f28);
                                asFloatBuffer.put(fArr[6]);
                                asFloatBuffer.put(fArr[7]);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(1.0f);
                                asFloatBuffer.put(f28);
                                int i22 = i20 + 4;
                                if (i21 != i19) {
                                    asFloatBuffer.put(fArr[6]);
                                    asFloatBuffer.put(fArr[7]);
                                    asFloatBuffer.put(1.0f);
                                    asFloatBuffer.put(1.0f);
                                    asFloatBuffer.put(f28);
                                    i20 += 5;
                                } else {
                                    i20 = i22;
                                }
                            }
                            asFloatBuffer.position(0);
                            GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(0);
                            asFloatBuffer.position(i17);
                            GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(1);
                            asFloatBuffer.position(4);
                            GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) asFloatBuffer.slice());
                            GLES20.glEnableVertexAttribArray(2);
                            i7 = 0;
                            GLES20.glDrawArrays(5, 0, i20);
                        }
                    }
                    i10 = 36160;
                } else {
                    return;
                }
            } else {
                i7 = 0;
                i10 = 36160;
            }
            GLES20.glBindFramebuffer(i10, i7);
            ou ouVar = this.f56647a;
            if (ouVar != null) {
                ouVar.E0();
            }
            RectF rectF3 = this.h;
            if (rectF3 != null) {
                rectF3.union(rectF);
            } else {
                this.h = rectF;
            }
        }
    }

    public final xa m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f56647a.f25806b;
        xa xaVar = new xa((ByteBuffer) h(rectF, true, z10, false).f56643c, z10 ? 1 : 0, rectF);
        ((u0) this.f56647a.f25806b).f56783b.b(UUID.randomUUID(), new f0(this, xaVar, 1));
        return xaVar;
    }

    public final void n(int r19, sg.j0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: sg.i0.n(int, sg.j0, float):void");
    }

    public final void o(int i7, int i10, x0 x0Var, float f10) {
        v0 v0Var;
        int currentColor;
        int i11;
        if (x0Var != null) {
            h hVar = this.f56653i;
            g gVar = x0Var.f56823a;
            if (gVar != null && i7 == this.f56661q) {
                hVar = gVar;
            }
            if (hVar != null && this.f56651f != null && (v0Var = (v0) this.f56662r.get(hVar.i(0))) != null) {
                GLES20.glUseProgram(v0Var.f56816a);
                GLES20.glUniformMatrix4fv(v0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f56668y));
                GLES20.glUniform1i(v0Var.d("texture"), 0);
                GLES20.glUniform1i(v0Var.d("mask"), 1);
                v0.a(v0Var.d("color"), i0.a.o(this.f56651f.getCurrentColor(), (int) (Color.alpha(currentColor) * f10)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i7);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i10);
                if (hVar instanceof g) {
                    GLES20.glUniform1i(v0Var.d("type"), ((g) hVar).o());
                    int d = v0Var.d("resolution");
                    nt0 nt0Var = this.f56652g;
                    GLES20.glUniform2f(d, nt0Var.f37702a, nt0Var.f37703b);
                    GLES20.glUniform2f(v0Var.d("center"), x0Var.f56824b, x0Var.f56825c);
                    GLES20.glUniform2f(v0Var.d("radius"), x0Var.d, x0Var.f56826e);
                    GLES20.glUniform1f(v0Var.d("thickness"), x0Var.f56827f);
                    GLES20.glUniform1f(v0Var.d("rounding"), x0Var.f56828g);
                    GLES20.glUniform2f(v0Var.d("middle"), x0Var.f56829i, x0Var.f56830j);
                    GLES20.glUniform1f(v0Var.d("rotation"), x0Var.h);
                    GLES20.glUniform1i(v0Var.d("fill"), x0Var.f56832l ? 1 : 0);
                    GLES20.glUniform1f(v0Var.d("arrowTriangleLength"), x0Var.f56831k);
                    GLES20.glUniform1i(v0Var.d("composite"), 0);
                    int d2 = v0Var.d("clear");
                    if (x0Var == this.d) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    GLES20.glUniform1i(d2, i11);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f56657m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f56658n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                gc.a();
            }
        }
    }

    public final void p(xa xaVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        ou ouVar;
        i1 i1Var;
        if (xaVar != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) xaVar.d);
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
            } catch (Exception e10) {
                a8.g(e10, true);
                byteBuffer = null;
            }
            int j3 = j();
            if (xaVar.f713b == 1 && (i1Var = this.D) != null) {
                j3 = i1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) xaVar.f714c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) xaVar.f714c).height(), 6408, 5121, byteBuffer);
            if (this.f56663s <= 0 && (ouVar = this.f56647a) != null) {
                ouVar.E0();
            }
            if (z10 && (file = (File) xaVar.d) != null) {
                file.delete();
                xaVar.d = null;
            }
        }
    }

    public final void q(h hVar) {
        Bitmap bitmap;
        Bitmap c10;
        this.f56653i = hVar;
        if ((hVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i7 = this.B;
            if (i7 == 90 || i7 == 270 || i7 == -90) {
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
            canvas.rotate(i7);
            if (i7 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i7 == 180) {
                canvas.translate(-width, -height);
            } else if (i7 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            u0 u0Var = this.f56651f;
            if (u0Var != null && (c10 = u0Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            i1 i1Var = this.f56669z;
            if (i1Var != null) {
                i1Var.a(false);
            }
            this.f56669z = new i1(this.C);
        }
    }
}
