package pg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
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
import java.util.zip.Inflater;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pa;
import w7.k6;
import w7.m6;
public final class r0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public s1 D;
    public boolean E;
    public final ja F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public k2.u f40905a;
    public s0 f40906b;
    public g1 f40907c;
    public g1 d;
    public d1 f40908f;
    public final jv0 f40909g;
    public RectF h;
    public m f40910i;
    public s1 f40912k;
    public s1 f40913l;
    public final ByteBuffer f40914m;
    public final ByteBuffer f40915n;
    public int f40916o;
    public int f40917p;
    public int f40918q;
    public Map f40919r;
    public int f40920s;
    public final ByteBuffer f40922u;
    public boolean v;
    public a5.a f40923w;
    public final float[] f40924x;
    public float[] f40925y;
    public s1 f40926z;
    public final HashMap f40911j = new HashMap();
    public final int[] f40921t = new int[1];
    public boolean G = false;
    public final w0 e = new Object();

    public r0(jv0 jv0Var, Bitmap bitmap, int i10, ja jaVar) {
        this.F = jaVar;
        this.f40909g = jv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f40922u = ByteBuffer.allocateDirect(((int) jv0Var.f25428a) * ((int) jv0Var.f25429b) * 4);
        this.f40924x = k6.b(jv0Var.f25428a, jv0Var.f25429b);
        if (this.f40914m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f40914m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f40914m.putFloat(0.0f);
        this.f40914m.putFloat(0.0f);
        this.f40914m.putFloat(jv0Var.f25428a);
        this.f40914m.putFloat(0.0f);
        this.f40914m.putFloat(0.0f);
        this.f40914m.putFloat(jv0Var.f25429b);
        this.f40914m.putFloat(jv0Var.f25428a);
        this.f40914m.putFloat(jv0Var.f25429b);
        this.f40914m.rewind();
        if (this.f40915n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f40915n = allocateDirect2;
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
        int i10 = this.f40916o;
        int[] iArr = this.f40921t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f40916o = 0;
        }
        s1 s1Var = this.f40912k;
        if (s1Var != null) {
            s1Var.a(z10);
        }
        s1 s1Var2 = this.D;
        if (s1Var2 != null) {
            s1Var2.a(z10);
        }
        int i11 = this.f40917p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f40917p = 0;
        }
        HashMap hashMap = this.f40911j;
        for (s1 s1Var3 : hashMap.values()) {
            if (s1Var3 != null) {
                s1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f40918q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f40918q = 0;
        }
        s1 s1Var4 = this.f40926z;
        if (s1Var4 != null) {
            s1Var4.a(true);
        }
        s1 s1Var5 = this.f40913l;
        if (s1Var5 != null) {
            s1Var5.a(true);
        }
        Map map = this.f40919r;
        if (map != null) {
            for (e1 e1Var : map.values()) {
                if (e1Var.f40810a != 0) {
                    GLES20.glDeleteProgram(0);
                    e1Var.f40810a = 0;
                }
            }
            this.f40919r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        m6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            jv0 jv0Var = this.f40909g;
            GLES20.glViewport(0, 0, (int) jv0Var.f25428a, (int) jv0Var.f25429b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        k2.u uVar = this.f40905a;
        if (uVar != null) {
            uVar.W();
        }
        w0 w0Var = this.e;
        w0Var.h = 0;
        w0Var.f40984g = 0.0d;
        ByteBuffer byteBuffer = w0Var.f40986j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f40906b = null;
        this.J = 0.0f;
    }

    public final void c(s0 s0Var, int i10, boolean z10, z zVar) {
        if (this.f40919r != null && this.f40910i != null) {
            this.f40908f.f(new m4.e0(this, s0Var, i10, z10, zVar));
        }
    }

    public final a5.a d(pg.s0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: pg.r0.d(pg.s0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(g1 g1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = g1Var.f40816a;
        if (mVar == null) {
            mVar = this.f40910i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f40920s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        jv0 jv0Var = this.f40909g;
        GLES20.glViewport(0, 0, (int) jv0Var.f25428a, (int) jv0Var.f25429b);
        e1 e1Var = (e1) this.f40919r.get(mVar.i(1));
        if (e1Var == null) {
            return null;
        }
        GLES20.glUseProgram(e1Var.f40810a);
        GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f40924x));
        GLES20.glUniform1i(e1Var.d("texture"), 0);
        GLES20.glUniform1i(e1Var.d("mask"), 1);
        e1.a(e1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f40926z != null) {
            GLES20.glUniform1i(e1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f40926z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(e1Var.d("type"), g1Var.f40816a.o());
            GLES20.glUniform2f(e1Var.d("resolution"), jv0Var.f25428a, jv0Var.f25429b);
            GLES20.glUniform2f(e1Var.d("center"), g1Var.f40817b, g1Var.f40818c);
            GLES20.glUniform2f(e1Var.d("radius"), g1Var.d, g1Var.e);
            GLES20.glUniform1f(e1Var.d("thickness"), g1Var.f40819f);
            GLES20.glUniform1f(e1Var.d("rounding"), g1Var.f40820g);
            GLES20.glUniform2f(e1Var.d("middle"), g1Var.f40821i, g1Var.f40822j);
            GLES20.glUniform1f(e1Var.d("rotation"), g1Var.h);
            GLES20.glUniform1i(e1Var.d("fill"), g1Var.f40824l ? 1 : 0);
            GLES20.glUniform1f(e1Var.d("arrowTriangleLength"), g1Var.f40823k);
            GLES20.glUniform1i(e1Var.d("composite"), 1);
            GLES20.glUniform1i(e1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f40914m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f40915n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        k2.u uVar = this.f40905a;
        if (uVar != null && this.f40920s <= 0) {
            uVar.W();
        }
        this.f40920s--;
        w0 w0Var = this.e;
        w0Var.h = 0;
        w0Var.f40984g = 0.0d;
        ByteBuffer byteBuffer = w0Var.f40986j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f40906b = null;
        this.f40907c = null;
        return m10;
    }

    public final RectF f() {
        jv0 jv0Var = this.f40909g;
        return new RectF(0.0f, 0.0f, jv0Var.f25428a, jv0Var.f25429b);
    }

    public final int g() {
        if (this.f40917p == 0) {
            this.f40917p = s1.b(this.f40909g);
        }
        return this.f40917p;
    }

    public final n7.a1 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        s1 s1Var;
        n7.a1 a1Var;
        e1 e1Var;
        int i10;
        int j10;
        s1 s1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f40921t, 0);
        int i13 = this.f40921t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f40921t, 0);
        int i14 = this.f40921t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        jv0 jv0Var = this.f40909g;
        GLES20.glViewport(0, 0, (int) jv0Var.f25428a, (int) jv0Var.f25429b);
        Map map = this.f40919r;
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
                GLES20.glUseProgram(e1Var2.f40810a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = k6.c(this.f40924x, k6.a(matrix));
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
                    GLES20.glBindTexture(3553, this.f40913l.c());
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
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f40914m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f40915n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (e1Var = (e1) this.f40919r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(e1Var.f40810a);
                    GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(e1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(e1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(e1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    pa paVar = this.F.f25237m;
                    if (paVar != null) {
                        i10 = paVar.f26990s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(e1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(e1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f40914m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f40915n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f40922u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f40922u);
                if (z10) {
                    a1Var = new n7.a1(11, null, this.f40922u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f40922u);
                    a1Var = new n7.a1(11, createBitmap, null);
                }
                this.f40922u.rewind();
                int[] iArr = this.f40921t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f40921t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return a1Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f40916o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f40916o = iArr[0];
            m6.a();
        }
        return this.f40916o;
    }

    public final int j() {
        s1 s1Var = this.f40912k;
        if (s1Var != null) {
            return s1Var.c();
        }
        return 0;
    }

    public final void k(g1 g1Var) {
        if (g1Var == null) {
            return;
        }
        this.f40908f.f(new n0(this, g1Var, 0));
    }

    public final void l(pg.s0 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: pg.r0.l(pg.s0, boolean, boolean):void");
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f40905a.f13371b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f15084c, z10 ? 1 : 0, rectF);
        ((d1) this.f40905a.f13371b).f40800b.b(UUID.randomUUID(), new p0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, pg.s0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: pg.r0.n(int, pg.s0, float):void");
    }

    public final void o(int i10, int i11, g1 g1Var, float f7) {
        e1 e1Var;
        int i12;
        if (g1Var != null) {
            m mVar = this.f40910i;
            l lVar = g1Var.f40816a;
            if (lVar != null && i10 == this.f40918q) {
                mVar = lVar;
            }
            if (mVar != null && this.f40908f != null && (e1Var = (e1) this.f40919r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(e1Var.f40810a);
                GLES20.glUniformMatrix4fv(e1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f40925y));
                GLES20.glUniform1i(e1Var.d("texture"), 0);
                GLES20.glUniform1i(e1Var.d("mask"), 1);
                int currentColor = this.f40908f.getCurrentColor();
                e1.a(e1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(e1Var.d("type"), ((l) mVar).o());
                    int d = e1Var.d("resolution");
                    jv0 jv0Var = this.f40909g;
                    GLES20.glUniform2f(d, jv0Var.f25428a, jv0Var.f25429b);
                    GLES20.glUniform2f(e1Var.d("center"), g1Var.f40817b, g1Var.f40818c);
                    GLES20.glUniform2f(e1Var.d("radius"), g1Var.d, g1Var.e);
                    GLES20.glUniform1f(e1Var.d("thickness"), g1Var.f40819f);
                    GLES20.glUniform1f(e1Var.d("rounding"), g1Var.f40820g);
                    GLES20.glUniform2f(e1Var.d("middle"), g1Var.f40821i, g1Var.f40822j);
                    GLES20.glUniform1f(e1Var.d("rotation"), g1Var.h);
                    GLES20.glUniform1i(e1Var.d("fill"), g1Var.f40824l ? 1 : 0);
                    GLES20.glUniform1f(e1Var.d("arrowTriangleLength"), g1Var.f40823k);
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
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f40914m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f40915n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                m6.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        k2.u uVar;
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
            } catch (Exception e) {
                FileLog.e(e);
                byteBuffer = null;
            }
            int j3 = j();
            if (aVar.f277b == 1 && (s1Var = this.D) != null) {
                j3 = s1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) aVar.f278c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f278c).height(), 6408, 5121, byteBuffer);
            if (this.f40920s <= 0 && (uVar = this.f40905a) != null) {
                uVar.W();
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
        this.f40910i = mVar;
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
            d1 d1Var = this.f40908f;
            if (d1Var != null && (c10 = d1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            s1 s1Var = this.f40926z;
            if (s1Var != null) {
                s1Var.a(false);
            }
            this.f40926z = new s1(this.C);
        }
    }
}
