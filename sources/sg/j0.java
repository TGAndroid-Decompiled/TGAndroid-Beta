package sg;

import a8.wa;
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
import bi.nb;
import c8.dc;
import c8.fc;
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
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.y9;
public final class j0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public j1 D;
    public boolean E;
    public final y9 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public vy f55099a;
    public k0 f55100b;
    public y0 f55101c;
    public y0 d;
    public v0 f55103f;
    public final ot0 f55104g;
    public RectF h;
    public h f55105i;
    public j1 f55107k;
    public j1 f55108l;
    public final ByteBuffer f55109m;
    public final ByteBuffer f55110n;
    public int f55111o;
    public int f55112p;
    public int f55113q;
    public Map f55114r;
    public int f55115s;
    public final ByteBuffer f55117u;
    public boolean v;
    public wa f55118w;
    public final float[] f55119x;
    public float[] f55120y;
    public j1 f55121z;
    public final HashMap f55106j = new HashMap();
    public final int[] f55116t = new int[1];
    public boolean G = false;
    public final o0 f55102e = new Object();

    public j0(ot0 ot0Var, Bitmap bitmap, int i7, y9 y9Var) {
        this.F = y9Var;
        this.f55104g = ot0Var;
        this.A = bitmap;
        this.B = i7;
        this.f55117u = ByteBuffer.allocateDirect(((int) ot0Var.f36801a) * ((int) ot0Var.f36802b) * 4);
        this.f55119x = dc.b(ot0Var.f36801a, ot0Var.f36802b);
        if (this.f55109m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f55109m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f55109m.putFloat(0.0f);
        this.f55109m.putFloat(0.0f);
        this.f55109m.putFloat(ot0Var.f36801a);
        this.f55109m.putFloat(0.0f);
        this.f55109m.putFloat(0.0f);
        this.f55109m.putFloat(ot0Var.f36802b);
        this.f55109m.putFloat(ot0Var.f36801a);
        this.f55109m.putFloat(ot0Var.f36802b);
        this.f55109m.rewind();
        if (this.f55110n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f55110n = allocateDirect2;
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

    public final void a(boolean z9) {
        int i7 = this.f55111o;
        int[] iArr = this.f55116t;
        if (i7 != 0) {
            iArr[0] = i7;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f55111o = 0;
        }
        j1 j1Var = this.f55107k;
        if (j1Var != null) {
            j1Var.a(z9);
        }
        j1 j1Var2 = this.D;
        if (j1Var2 != null) {
            j1Var2.a(z9);
        }
        int i10 = this.f55112p;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f55112p = 0;
        }
        HashMap hashMap = this.f55106j;
        for (j1 j1Var3 : hashMap.values()) {
            if (j1Var3 != null) {
                j1Var3.a(true);
            }
        }
        hashMap.clear();
        int i11 = this.f55113q;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f55113q = 0;
        }
        j1 j1Var4 = this.f55121z;
        if (j1Var4 != null) {
            j1Var4.a(true);
        }
        j1 j1Var5 = this.f55108l;
        if (j1Var5 != null) {
            j1Var5.a(true);
        }
        Map map = this.f55114r;
        if (map != null) {
            for (w0 w0Var : map.values()) {
                if (w0Var.f55268a != 0) {
                    GLES20.glDeleteProgram(0);
                    w0Var.f55268a = 0;
                }
            }
            this.f55114r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        fc.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            ot0 ot0Var = this.f55104g;
            GLES20.glViewport(0, 0, (int) ot0Var.f36801a, (int) ot0Var.f36802b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        vy vyVar = this.f55099a;
        if (vyVar != null) {
            vyVar.b();
        }
        o0 o0Var = this.f55102e;
        o0Var.h = 0;
        o0Var.f55181g = 0.0d;
        ByteBuffer byteBuffer = o0Var.f55183j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f55100b = null;
        this.J = 0.0f;
    }

    public final void c(k0 k0Var, int i7, boolean z9, s sVar) {
        if (this.f55114r != null && this.f55105i != null) {
            this.f55103f.f(new nb(this, k0Var, i7, z9, sVar, 7));
        }
    }

    public final a8.wa d(sg.k0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: sg.j0.d(sg.k0, int, android.graphics.RectF):a8.wa");
    }

    public final wa e(y0 y0Var, int i7, RectF rectF) {
        boolean z9;
        h hVar = y0Var.f55275a;
        if (hVar == null) {
            hVar = this.f55105i;
        }
        if (this.F != null && (hVar instanceof b)) {
            z9 = true;
        } else {
            z9 = false;
        }
        wa m10 = m(rectF, z9);
        this.f55115s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        ot0 ot0Var = this.f55104g;
        GLES20.glViewport(0, 0, (int) ot0Var.f36801a, (int) ot0Var.f36802b);
        w0 w0Var = (w0) this.f55114r.get(hVar.i(1));
        if (w0Var == null) {
            return null;
        }
        GLES20.glUseProgram(w0Var.f55268a);
        GLES20.glUniformMatrix4fv(w0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f55119x));
        GLES20.glUniform1i(w0Var.d("texture"), 0);
        GLES20.glUniform1i(w0Var.d("mask"), 1);
        w0.a(w0Var.d("color"), i7);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((hVar instanceof b) && this.f55121z != null) {
            GLES20.glUniform1i(w0Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f55121z.c());
        }
        if (hVar instanceof g) {
            GLES20.glUniform1i(w0Var.d("type"), y0Var.f55275a.o());
            GLES20.glUniform2f(w0Var.d("resolution"), ot0Var.f36801a, ot0Var.f36802b);
            GLES20.glUniform2f(w0Var.d("center"), y0Var.f55276b, y0Var.f55277c);
            GLES20.glUniform2f(w0Var.d("radius"), y0Var.d, y0Var.f55278e);
            GLES20.glUniform1f(w0Var.d("thickness"), y0Var.f55279f);
            GLES20.glUniform1f(w0Var.d("rounding"), y0Var.f55280g);
            GLES20.glUniform2f(w0Var.d("middle"), y0Var.f55281i, y0Var.f55282j);
            GLES20.glUniform1f(w0Var.d("rotation"), y0Var.h);
            GLES20.glUniform1i(w0Var.d("fill"), y0Var.f55284l ? 1 : 0);
            GLES20.glUniform1f(w0Var.d("arrowTriangleLength"), y0Var.f55283k);
            GLES20.glUniform1i(w0Var.d("composite"), 1);
            GLES20.glUniform1i(w0Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f55109m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f55110n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        vy vyVar = this.f55099a;
        if (vyVar != null && this.f55115s <= 0) {
            vyVar.b();
        }
        this.f55115s--;
        o0 o0Var = this.f55102e;
        o0Var.h = 0;
        o0Var.f55181g = 0.0d;
        ByteBuffer byteBuffer = o0Var.f55183j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f55100b = null;
        this.f55101c = null;
        return m10;
    }

    public final RectF f() {
        ot0 ot0Var = this.f55104g;
        return new RectF(0.0f, 0.0f, ot0Var.f36801a, ot0Var.f36802b);
    }

    public final int g() {
        if (this.f55112p == 0) {
            this.f55112p = j1.b(this.f55104g);
        }
        return this.f55112p;
    }

    public final i0 h(RectF rectF, boolean z9, boolean z10, boolean z11) {
        String str;
        int j3;
        j1 j1Var;
        i0 i0Var;
        w0 w0Var;
        int i7;
        int j10;
        j1 j1Var2;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f55116t, 0);
        int i12 = this.f55116t[0];
        GLES20.glBindFramebuffer(36160, i12);
        GLES20.glGenTextures(1, this.f55116t, 0);
        int i13 = this.f55116t[0];
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i13, 0);
        ot0 ot0Var = this.f55104g;
        GLES20.glViewport(0, 0, (int) ot0Var.f36801a, (int) ot0Var.f36802b);
        Map map = this.f55114r;
        if (map != null) {
            if (z9) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            w0 w0Var2 = (w0) map.get(str);
            if (w0Var2 != null) {
                GLES20.glUseProgram(w0Var2.f55268a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c10 = dc.c(this.f55119x, dc.a(matrix));
                GLES20.glUniformMatrix4fv(w0Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z9 && this.G) {
                    GLES20.glUniform1i(w0Var2.d("texture"), 1);
                    GLES20.glUniform1i(w0Var2.d("mask"), 0);
                    GLES20.glUniform1f(w0Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z10 && (j1Var2 = this.D) != null) {
                        j10 = j1Var2.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f55108l.c());
                } else {
                    GLES20.glUniform1i(w0Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z10 && (j1Var = this.D) != null) {
                        j3 = j1Var.c();
                    } else {
                        j3 = j();
                    }
                    GLES20.glBindTexture(3553, j3);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f55109m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f55110n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z11 && !z10 && (w0Var = (w0) this.f55114r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(w0Var.f55268a);
                    GLES20.glUniformMatrix4fv(w0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(w0Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(w0Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(w0Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    da daVar = this.F.f40681m;
                    if (daVar != null) {
                        i7 = daVar.f32912s[2];
                    } else {
                        i7 = -1;
                    }
                    GLES20.glBindTexture(3553, i7);
                    GLES20.glUniform1f(w0Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(w0Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f55109m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f55110n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f55117u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f55117u);
                if (z9) {
                    i0Var = new i0(0, null, this.f55117u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f55117u);
                    i0Var = new i0(0, createBitmap, null);
                }
                this.f55117u.rewind();
                int[] iArr = this.f55116t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f55116t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return i0Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f55111o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f55111o = iArr[0];
            fc.a();
        }
        return this.f55111o;
    }

    public final int j() {
        j1 j1Var = this.f55107k;
        if (j1Var != null) {
            return j1Var.c();
        }
        return 0;
    }

    public final void k(y0 y0Var) {
        if (y0Var == null) {
            return;
        }
        this.f55103f.f(new e0(this, y0Var, 0));
    }

    public final void l(k0 k0Var, boolean z9, boolean z10) {
        int i7;
        int i10;
        float a10;
        int size;
        float atan2;
        n0 n0Var;
        float f10;
        double d;
        boolean z11;
        n0 n0Var2;
        float f11;
        n0[] n0VarArr;
        double d2;
        float f12;
        float f13;
        float f14;
        char c10;
        char c11;
        float f15;
        this.f55100b = k0Var;
        if (k0Var != null) {
            GLES20.glBindFramebuffer(36160, i());
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
            fc.a();
            RectF rectF = null;
            if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
                ot0 ot0Var = this.f55104g;
                GLES20.glViewport(0, 0, (int) ot0Var.f36801a, (int) ot0Var.f36802b);
                float f16 = 0.0f;
                if (z9) {
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                }
                Map map = this.f55114r;
                if (map != null) {
                    h hVar = k0Var.f55130e;
                    int i11 = 2;
                    w0 w0Var = (w0) map.get(hVar.i(2));
                    if (w0Var == null) {
                        return;
                    }
                    GLES20.glUseProgram(w0Var.f55268a);
                    j1 j1Var = (j1) this.f55106j.get(Integer.valueOf(hVar.l()));
                    if (j1Var == null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = false;
                        j1Var = new j1(BitmapFactory.decodeResource(org.telegram.messenger.t0.f25566b.getResources(), hVar.l(), options));
                        this.f55106j.put(Integer.valueOf(hVar.l()), j1Var);
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, j1Var.c());
                    GLES20.glUniformMatrix4fv(w0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f55119x));
                    GLES20.glUniform1i(w0Var.d("texture"), 0);
                    if (!z10) {
                        this.f55102e.f55180f = this.f55103f.getScaleX();
                    } else {
                        this.f55102e.f55180f = 1.0f;
                    }
                    o0 o0Var = this.f55102e;
                    o0Var.f55176a = k0Var.d;
                    o0Var.f55177b = k0Var.f55130e.k();
                    if (z10) {
                        a10 = 1.0f;
                    } else {
                        a10 = k0Var.f55130e.a();
                    }
                    o0Var.f55178c = a10;
                    o0Var.d = k0Var.f55130e.b();
                    o0Var.f55179e = k0Var.f55130e.h();
                    Vector vector = k0Var.f55128b;
                    if (vector == null) {
                        size = 0;
                    } else {
                        size = vector.size();
                    }
                    if (size == 0) {
                        i7 = 0;
                    } else {
                        if (size == 1) {
                            Vector vector2 = k0Var.f55128b;
                            n0[] n0VarArr2 = new n0[vector2.size()];
                            vector2.toArray(n0VarArr2);
                            n0 n0Var3 = n0VarArr2[0];
                            float f17 = ((o0Var.f55176a * o0Var.f55179e) * 1.0f) / o0Var.f55180f;
                            n0Var3.getClass();
                            PointF pointF = new PointF((float) n0Var3.f55166a, (float) n0Var3.f55167b);
                            if (Math.abs(o0Var.d) > 0.0f) {
                                f15 = o0Var.d;
                            } else {
                                f15 = 0.0f;
                            }
                            float f18 = o0Var.f55178c;
                            o0Var.c();
                            o0Var.b(1);
                            o0Var.a(pointF, f17, f15, f18, 0);
                        } else {
                            Vector vector3 = k0Var.f55128b;
                            int size2 = vector3.size();
                            n0[] n0VarArr3 = new n0[size2];
                            vector3.toArray(n0VarArr3);
                            o0Var.c();
                            int i12 = 0;
                            while (i12 < size2 - 1) {
                                n0 n0Var4 = n0VarArr3[i12];
                                int i13 = i12 + 1;
                                n0 n0Var5 = n0VarArr3[i13];
                                double a11 = n0Var4.a(n0Var5);
                                int i14 = size2;
                                float f19 = f16;
                                double d10 = n0Var5.f55166a - n0Var4.f55166a;
                                int i15 = i11;
                                double d11 = n0Var5.f55167b - n0Var4.f55167b;
                                double d12 = n0Var5.f55168c;
                                double d13 = d12 - n0Var4.f55168c;
                                n0 n0Var6 = new n0(1.0d, 1.0d, 0.0d);
                                if (Math.abs(o0Var.d) > f19) {
                                    atan2 = o0Var.d;
                                } else {
                                    atan2 = (float) Math.atan2(d11, d10);
                                }
                                float f20 = (float) ((((o0Var.f55176a * d12) * o0Var.f55179e) * 1.0d) / o0Var.f55180f);
                                double max = Math.max(1.0f, o0Var.f55177b * f20);
                                if (a11 > 0.0d) {
                                    double d14 = 1.0d / a11;
                                    n0Var = new n0(d10 * d14, d11 * d14, d13 * d14);
                                } else {
                                    n0Var = n0Var6;
                                }
                                float min = Math.min(1.0f, o0Var.f55178c * 1.15f);
                                boolean z12 = n0Var4.d;
                                boolean z13 = n0Var5.d;
                                float f21 = atan2;
                                int i16 = o0Var.h;
                                o0Var.b((int) Math.ceil((a11 - o0Var.f55181g) / max));
                                ByteBuffer byteBuffer = o0Var.f55183j;
                                if (byteBuffer != null && i16 >= 0) {
                                    f10 = f20;
                                    if (i16 < o0Var.f55182i) {
                                        byteBuffer.position(i16 * 20);
                                    }
                                } else {
                                    f10 = f20;
                                }
                                double d15 = o0Var.f55181g;
                                n0 n0Var7 = new n0(n0Var4.f55166a + (n0Var.f55166a * d15), n0Var4.f55167b + (n0Var.f55167b * d15), n0Var4.f55168c + (n0Var.f55168c * d15));
                                double d16 = d15;
                                n0 n0Var8 = n0Var7;
                                boolean z14 = true;
                                while (true) {
                                    if (d16 <= a11) {
                                        if (z12) {
                                            f13 = min;
                                        } else {
                                            f13 = o0Var.f55178c;
                                        }
                                        d = d16;
                                        z11 = z13;
                                        n0[] n0VarArr4 = n0VarArr3;
                                        d2 = a11;
                                        f12 = f21;
                                        float f22 = f13;
                                        n0 n0Var9 = n0Var8;
                                        n0Var2 = n0Var5;
                                        f11 = f10;
                                        boolean a12 = o0Var.a(new PointF((float) n0Var8.f55166a, (float) n0Var8.f55167b), f11, f12, f22, -1);
                                        if (!a12) {
                                            n0VarArr = n0VarArr4;
                                            z14 = a12;
                                            break;
                                        }
                                        n0 n0Var10 = new n0(n0Var9.f55166a + (n0Var.f55166a * max), n0Var9.f55167b + (n0Var.f55167b * max), n0Var9.f55168c + (n0Var.f55168c * max));
                                        z14 = a12;
                                        f21 = f12;
                                        n0Var8 = n0Var10;
                                        a11 = d2;
                                        n0VarArr3 = n0VarArr4;
                                        z13 = z11;
                                        f10 = f11;
                                        n0Var5 = n0Var2;
                                        d16 = d + max;
                                        z12 = false;
                                    } else {
                                        d = d16;
                                        z11 = z13;
                                        n0Var2 = n0Var5;
                                        f11 = f10;
                                        n0VarArr = n0VarArr3;
                                        d2 = a11;
                                        f12 = f21;
                                        break;
                                    }
                                }
                                if (z14 && z11) {
                                    o0Var.b(1);
                                    o0Var.a(new PointF((float) n0Var2.f55166a, (float) n0Var2.f55167b), f11, f12, min, -1);
                                }
                                o0Var.f55181g = d - d2;
                                size2 = i14;
                                i12 = i13;
                                f16 = f19;
                                i11 = i15;
                                n0VarArr3 = n0VarArr;
                            }
                        }
                        float f23 = f16;
                        int i17 = i11;
                        k0Var.f55127a = o0Var.f55181g;
                        rectF = new RectF(f23, f23, f23, f23);
                        int i18 = o0Var.h;
                        if (i18 <= 0) {
                            i7 = 0;
                        } else {
                            int i19 = i18 - 1;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i19 * 2) + (i18 * 4)) * 20);
                            allocateDirect.order(ByteOrder.nativeOrder());
                            FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                            asFloatBuffer.position(0);
                            ByteBuffer byteBuffer2 = o0Var.f55183j;
                            if (byteBuffer2 != null && o0Var.f55182i > 0) {
                                byteBuffer2.position(0);
                            }
                            int i20 = 0;
                            for (int i21 = 0; i21 < i18; i21++) {
                                float f24 = o0Var.f55183j.getFloat();
                                float f25 = o0Var.f55183j.getFloat();
                                float f26 = o0Var.f55183j.getFloat();
                                float f27 = o0Var.f55183j.getFloat();
                                float f28 = o0Var.f55183j.getFloat();
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
            vy vyVar = this.f55099a;
            if (vyVar != null) {
                vyVar.b();
            }
            RectF rectF3 = this.h;
            if (rectF3 != null) {
                rectF3.union(rectF);
            } else {
                this.h = rectF;
            }
        }
    }

    public final wa m(RectF rectF, boolean z9) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f55099a.f39835b;
        wa waVar = new wa((ByteBuffer) h(rectF, true, z9, false).f55093c, z9 ? 1 : 0, rectF);
        ((v0) this.f55099a.f39835b).f55235b.b(UUID.randomUUID(), new g0(this, waVar, 1));
        return waVar;
    }

    public final void n(int r19, sg.k0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: sg.j0.n(int, sg.k0, float):void");
    }

    public final void o(int i7, int i10, y0 y0Var, float f10) {
        w0 w0Var;
        int currentColor;
        int i11;
        if (y0Var != null) {
            h hVar = this.f55105i;
            g gVar = y0Var.f55275a;
            if (gVar != null && i7 == this.f55113q) {
                hVar = gVar;
            }
            if (hVar != null && this.f55103f != null && (w0Var = (w0) this.f55114r.get(hVar.i(0))) != null) {
                GLES20.glUseProgram(w0Var.f55268a);
                GLES20.glUniformMatrix4fv(w0Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f55120y));
                GLES20.glUniform1i(w0Var.d("texture"), 0);
                GLES20.glUniform1i(w0Var.d("mask"), 1);
                w0.a(w0Var.d("color"), i0.a.o(this.f55103f.getCurrentColor(), (int) (Color.alpha(currentColor) * f10)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i7);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i10);
                if (hVar instanceof g) {
                    GLES20.glUniform1i(w0Var.d("type"), ((g) hVar).o());
                    int d = w0Var.d("resolution");
                    ot0 ot0Var = this.f55104g;
                    GLES20.glUniform2f(d, ot0Var.f36801a, ot0Var.f36802b);
                    GLES20.glUniform2f(w0Var.d("center"), y0Var.f55276b, y0Var.f55277c);
                    GLES20.glUniform2f(w0Var.d("radius"), y0Var.d, y0Var.f55278e);
                    GLES20.glUniform1f(w0Var.d("thickness"), y0Var.f55279f);
                    GLES20.glUniform1f(w0Var.d("rounding"), y0Var.f55280g);
                    GLES20.glUniform2f(w0Var.d("middle"), y0Var.f55281i, y0Var.f55282j);
                    GLES20.glUniform1f(w0Var.d("rotation"), y0Var.h);
                    GLES20.glUniform1i(w0Var.d("fill"), y0Var.f55284l ? 1 : 0);
                    GLES20.glUniform1f(w0Var.d("arrowTriangleLength"), y0Var.f55283k);
                    GLES20.glUniform1i(w0Var.d("composite"), 0);
                    int d2 = w0Var.d("clear");
                    if (y0Var == this.d) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    GLES20.glUniform1i(d2, i11);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f55109m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f55110n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                fc.a();
            }
        }
    }

    public final void p(wa waVar, boolean z9) {
        ByteBuffer byteBuffer;
        File file;
        vy vyVar;
        j1 j1Var;
        if (waVar != null) {
            try {
                byte[] bArr = new byte[1024];
                byte[] bArr2 = new byte[1024];
                FileInputStream fileInputStream = new FileInputStream((File) waVar.d);
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
            if (waVar.f700b == 1 && (j1Var = this.D) != null) {
                j3 = j1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) waVar.f701c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) waVar.f701c).height(), 6408, 5121, byteBuffer);
            if (this.f55115s <= 0 && (vyVar = this.f55099a) != null) {
                vyVar.b();
            }
            if (z9 && (file = (File) waVar.d) != null) {
                file.delete();
                waVar.d = null;
            }
        }
    }

    public final void q(h hVar) {
        Bitmap bitmap;
        Bitmap c10;
        this.f55105i = hVar;
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
            v0 v0Var = this.f55103f;
            if (v0Var != null && (c10 = v0Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            j1 j1Var = this.f55121z;
            if (j1Var != null) {
                j1Var.a(false);
            }
            this.f55121z = new j1(this.C);
        }
    }
}
