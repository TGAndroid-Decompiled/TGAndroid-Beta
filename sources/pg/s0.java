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
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.wv0;
import w7.l6;
import w7.n6;
public final class s0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public u1 D;
    public boolean E;
    public final ia F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public l.d f41270a;
    public t0 f41271b;
    public i1 f41272c;
    public i1 d;
    public f1 f41273f;
    public final wv0 f41274g;
    public RectF h;
    public m f41275i;
    public u1 f41277k;
    public u1 f41278l;
    public final ByteBuffer f41279m;
    public final ByteBuffer f41280n;
    public int f41281o;
    public int f41282p;
    public int f41283q;
    public Map f41284r;
    public int f41285s;
    public final ByteBuffer f41287u;
    public boolean v;
    public a5.a f41288w;
    public final float[] f41289x;
    public float[] f41290y;
    public u1 f41291z;
    public final HashMap f41276j = new HashMap();
    public final int[] f41286t = new int[1];
    public boolean G = false;
    public final x0 e = new Object();

    public s0(wv0 wv0Var, Bitmap bitmap, int i10, ia iaVar) {
        this.F = iaVar;
        this.f41274g = wv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f41287u = ByteBuffer.allocateDirect(((int) wv0Var.f30161a) * ((int) wv0Var.f30162b) * 4);
        this.f41289x = l6.b(wv0Var.f30161a, wv0Var.f30162b);
        if (this.f41279m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f41279m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f41279m.putFloat(0.0f);
        this.f41279m.putFloat(0.0f);
        this.f41279m.putFloat(wv0Var.f30161a);
        this.f41279m.putFloat(0.0f);
        this.f41279m.putFloat(0.0f);
        this.f41279m.putFloat(wv0Var.f30162b);
        this.f41279m.putFloat(wv0Var.f30161a);
        this.f41279m.putFloat(wv0Var.f30162b);
        this.f41279m.rewind();
        if (this.f41280n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f41280n = allocateDirect2;
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
        int i10 = this.f41281o;
        int[] iArr = this.f41286t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f41281o = 0;
        }
        u1 u1Var = this.f41277k;
        if (u1Var != null) {
            u1Var.a(z10);
        }
        u1 u1Var2 = this.D;
        if (u1Var2 != null) {
            u1Var2.a(z10);
        }
        int i11 = this.f41282p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f41282p = 0;
        }
        HashMap hashMap = this.f41276j;
        for (u1 u1Var3 : hashMap.values()) {
            if (u1Var3 != null) {
                u1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f41283q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f41283q = 0;
        }
        u1 u1Var4 = this.f41291z;
        if (u1Var4 != null) {
            u1Var4.a(true);
        }
        u1 u1Var5 = this.f41278l;
        if (u1Var5 != null) {
            u1Var5.a(true);
        }
        Map map = this.f41284r;
        if (map != null) {
            for (g1 g1Var : map.values()) {
                if (g1Var.f41183a != 0) {
                    GLES20.glDeleteProgram(0);
                    g1Var.f41183a = 0;
                }
            }
            this.f41284r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        n6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            wv0 wv0Var = this.f41274g;
            GLES20.glViewport(0, 0, (int) wv0Var.f30161a, (int) wv0Var.f30162b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        l.d dVar = this.f41270a;
        if (dVar != null) {
            dVar.V();
        }
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.f41363g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f41365j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f41271b = null;
        this.J = 0.0f;
    }

    public final void c(t0 t0Var, int i10, boolean z10, z zVar) {
        if (this.f41284r != null && this.f41275i != null) {
            this.f41273f.f(new m4.e0(this, t0Var, i10, z10, zVar));
        }
    }

    public final a5.a d(pg.t0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.d(pg.t0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(i1 i1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = i1Var.f41189a;
        if (mVar == null) {
            mVar = this.f41275i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f41285s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        wv0 wv0Var = this.f41274g;
        GLES20.glViewport(0, 0, (int) wv0Var.f30161a, (int) wv0Var.f30162b);
        g1 g1Var = (g1) this.f41284r.get(mVar.i(1));
        if (g1Var == null) {
            return null;
        }
        GLES20.glUseProgram(g1Var.f41183a);
        GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f41289x));
        GLES20.glUniform1i(g1Var.d("texture"), 0);
        GLES20.glUniform1i(g1Var.d("mask"), 1);
        g1.a(g1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f41291z != null) {
            GLES20.glUniform1i(g1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f41291z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(g1Var.d("type"), i1Var.f41189a.o());
            GLES20.glUniform2f(g1Var.d("resolution"), wv0Var.f30161a, wv0Var.f30162b);
            GLES20.glUniform2f(g1Var.d("center"), i1Var.f41190b, i1Var.f41191c);
            GLES20.glUniform2f(g1Var.d("radius"), i1Var.d, i1Var.e);
            GLES20.glUniform1f(g1Var.d("thickness"), i1Var.f41192f);
            GLES20.glUniform1f(g1Var.d("rounding"), i1Var.f41193g);
            GLES20.glUniform2f(g1Var.d("middle"), i1Var.f41194i, i1Var.f41195j);
            GLES20.glUniform1f(g1Var.d("rotation"), i1Var.h);
            GLES20.glUniform1i(g1Var.d("fill"), i1Var.f41197l ? 1 : 0);
            GLES20.glUniform1f(g1Var.d("arrowTriangleLength"), i1Var.f41196k);
            GLES20.glUniform1i(g1Var.d("composite"), 1);
            GLES20.glUniform1i(g1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41279m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41280n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        l.d dVar = this.f41270a;
        if (dVar != null && this.f41285s <= 0) {
            dVar.V();
        }
        this.f41285s--;
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.f41363g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f41365j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f41271b = null;
        this.f41272c = null;
        return m10;
    }

    public final RectF f() {
        wv0 wv0Var = this.f41274g;
        return new RectF(0.0f, 0.0f, wv0Var.f30161a, wv0Var.f30162b);
    }

    public final int g() {
        if (this.f41282p == 0) {
            this.f41282p = u1.b(this.f41274g);
        }
        return this.f41282p;
    }

    public final f3 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        u1 u1Var;
        f3 f3Var;
        g1 g1Var;
        int i10;
        int j10;
        u1 u1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f41286t, 0);
        int i13 = this.f41286t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f41286t, 0);
        int i14 = this.f41286t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        wv0 wv0Var = this.f41274g;
        GLES20.glViewport(0, 0, (int) wv0Var.f30161a, (int) wv0Var.f30162b);
        Map map = this.f41284r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            g1 g1Var2 = (g1) map.get(str);
            if (g1Var2 != null) {
                GLES20.glUseProgram(g1Var2.f41183a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = l6.c(this.f41289x, l6.a(matrix));
                GLES20.glUniformMatrix4fv(g1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(g1Var2.d("texture"), 1);
                    GLES20.glUniform1i(g1Var2.d("mask"), 0);
                    GLES20.glUniform1f(g1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (u1Var2 = this.D) != null) {
                        j10 = u1Var2.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f41278l.c());
                } else {
                    GLES20.glUniform1i(g1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (u1Var = this.D) != null) {
                        j3 = u1Var.c();
                    } else {
                        j3 = j();
                    }
                    GLES20.glBindTexture(3553, j3);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41279m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41280n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (g1Var = (g1) this.f41284r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(g1Var.f41183a);
                    GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(g1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(g1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(g1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    oa oaVar = this.F.f25068m;
                    if (oaVar != null) {
                        i10 = oaVar.f27047s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(g1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(g1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41279m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41280n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f41287u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f41287u);
                if (z10) {
                    f3Var = new f3(null, this.f41287u, false, 8);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f41287u);
                    f3Var = new f3(createBitmap, null, false, 8);
                }
                this.f41287u.rewind();
                int[] iArr = this.f41286t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f41286t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return f3Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f41281o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f41281o = iArr[0];
            n6.a();
        }
        return this.f41281o;
    }

    public final int j() {
        u1 u1Var = this.f41277k;
        if (u1Var != null) {
            return u1Var.c();
        }
        return 0;
    }

    public final void k(i1 i1Var) {
        if (i1Var == null) {
            return;
        }
        this.f41273f.f(new o0(this, i1Var, 0));
    }

    public final void l(pg.t0 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.l(pg.t0, boolean, boolean):void");
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f41270a.f13912b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f20285c, z10 ? 1 : 0, rectF);
        ((f1) this.f41270a.f13912b).f41173b.b(UUID.randomUUID(), new q0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, pg.t0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.n(int, pg.t0, float):void");
    }

    public final void o(int i10, int i11, i1 i1Var, float f7) {
        g1 g1Var;
        int i12;
        if (i1Var != null) {
            m mVar = this.f41275i;
            l lVar = i1Var.f41189a;
            if (lVar != null && i10 == this.f41283q) {
                mVar = lVar;
            }
            if (mVar != null && this.f41273f != null && (g1Var = (g1) this.f41284r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(g1Var.f41183a);
                GLES20.glUniformMatrix4fv(g1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f41290y));
                GLES20.glUniform1i(g1Var.d("texture"), 0);
                GLES20.glUniform1i(g1Var.d("mask"), 1);
                int currentColor = this.f41273f.getCurrentColor();
                g1.a(g1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(g1Var.d("type"), ((l) mVar).o());
                    int d = g1Var.d("resolution");
                    wv0 wv0Var = this.f41274g;
                    GLES20.glUniform2f(d, wv0Var.f30161a, wv0Var.f30162b);
                    GLES20.glUniform2f(g1Var.d("center"), i1Var.f41190b, i1Var.f41191c);
                    GLES20.glUniform2f(g1Var.d("radius"), i1Var.d, i1Var.e);
                    GLES20.glUniform1f(g1Var.d("thickness"), i1Var.f41192f);
                    GLES20.glUniform1f(g1Var.d("rounding"), i1Var.f41193g);
                    GLES20.glUniform2f(g1Var.d("middle"), i1Var.f41194i, i1Var.f41195j);
                    GLES20.glUniform1f(g1Var.d("rotation"), i1Var.h);
                    GLES20.glUniform1i(g1Var.d("fill"), i1Var.f41197l ? 1 : 0);
                    GLES20.glUniform1f(g1Var.d("arrowTriangleLength"), i1Var.f41196k);
                    GLES20.glUniform1i(g1Var.d("composite"), 0);
                    int d10 = g1Var.d("clear");
                    if (i1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41279m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41280n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                n6.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        l.d dVar;
        u1 u1Var;
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
            if (aVar.f276b == 1 && (u1Var = this.D) != null) {
                j3 = u1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) aVar.f277c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f277c).height(), 6408, 5121, byteBuffer);
            if (this.f41285s <= 0 && (dVar = this.f41270a) != null) {
                dVar.V();
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
        this.f41275i = mVar;
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
            f1 f1Var = this.f41273f;
            if (f1Var != null && (c10 = f1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            u1 u1Var = this.f41291z;
            if (u1Var != null) {
                u1Var.a(false);
            }
            this.f41291z = new u1(this.C);
        }
    }
}
