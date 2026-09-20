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
import org.telegram.ui.Components.uv0;
import w7.m6;
import w7.o6;
public final class s0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public t1 D;
    public boolean E;
    public final ia F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public n2.e f41261a;
    public t0 f41262b;
    public h1 f41263c;
    public h1 d;
    public e1 f41264f;
    public final uv0 f41265g;
    public RectF h;
    public m f41266i;
    public t1 f41268k;
    public t1 f41269l;
    public final ByteBuffer f41270m;
    public final ByteBuffer f41271n;
    public int f41272o;
    public int f41273p;
    public int f41274q;
    public Map f41275r;
    public int f41276s;
    public final ByteBuffer f41278u;
    public boolean v;
    public a5.a f41279w;
    public final float[] f41280x;
    public float[] f41281y;
    public t1 f41282z;
    public final HashMap f41267j = new HashMap();
    public final int[] f41277t = new int[1];
    public boolean G = false;
    public final x0 e = new Object();

    public s0(uv0 uv0Var, Bitmap bitmap, int i10, ia iaVar) {
        this.F = iaVar;
        this.f41265g = uv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f41278u = ByteBuffer.allocateDirect(((int) uv0Var.f28868a) * ((int) uv0Var.f28869b) * 4);
        this.f41280x = m6.b(uv0Var.f28868a, uv0Var.f28869b);
        if (this.f41270m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f41270m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f41270m.putFloat(0.0f);
        this.f41270m.putFloat(0.0f);
        this.f41270m.putFloat(uv0Var.f28868a);
        this.f41270m.putFloat(0.0f);
        this.f41270m.putFloat(0.0f);
        this.f41270m.putFloat(uv0Var.f28869b);
        this.f41270m.putFloat(uv0Var.f28868a);
        this.f41270m.putFloat(uv0Var.f28869b);
        this.f41270m.rewind();
        if (this.f41271n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f41271n = allocateDirect2;
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
        int i10 = this.f41272o;
        int[] iArr = this.f41277t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f41272o = 0;
        }
        t1 t1Var = this.f41268k;
        if (t1Var != null) {
            t1Var.a(z10);
        }
        t1 t1Var2 = this.D;
        if (t1Var2 != null) {
            t1Var2.a(z10);
        }
        int i11 = this.f41273p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f41273p = 0;
        }
        HashMap hashMap = this.f41267j;
        for (t1 t1Var3 : hashMap.values()) {
            if (t1Var3 != null) {
                t1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f41274q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f41274q = 0;
        }
        t1 t1Var4 = this.f41282z;
        if (t1Var4 != null) {
            t1Var4.a(true);
        }
        t1 t1Var5 = this.f41269l;
        if (t1Var5 != null) {
            t1Var5.a(true);
        }
        Map map = this.f41275r;
        if (map != null) {
            for (f1 f1Var : map.values()) {
                if (f1Var.f41160a != 0) {
                    GLES20.glDeleteProgram(0);
                    f1Var.f41160a = 0;
                }
            }
            this.f41275r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        o6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            uv0 uv0Var = this.f41265g;
            GLES20.glViewport(0, 0, (int) uv0Var.f28868a, (int) uv0Var.f28869b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        n2.e eVar = this.f41261a;
        if (eVar != null) {
            eVar.p();
        }
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.f41341g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f41343j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f41262b = null;
        this.J = 0.0f;
    }

    public final void c(t0 t0Var, int i10, boolean z10, z zVar) {
        if (this.f41275r != null && this.f41266i != null) {
            this.f41264f.f(new m4.e0(this, t0Var, i10, z10, zVar));
        }
    }

    public final a5.a d(pg.t0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.d(pg.t0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(h1 h1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = h1Var.f41167a;
        if (mVar == null) {
            mVar = this.f41266i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f41276s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        uv0 uv0Var = this.f41265g;
        GLES20.glViewport(0, 0, (int) uv0Var.f28868a, (int) uv0Var.f28869b);
        f1 f1Var = (f1) this.f41275r.get(mVar.i(1));
        if (f1Var == null) {
            return null;
        }
        GLES20.glUseProgram(f1Var.f41160a);
        GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f41280x));
        GLES20.glUniform1i(f1Var.d("texture"), 0);
        GLES20.glUniform1i(f1Var.d("mask"), 1);
        f1.a(f1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f41282z != null) {
            GLES20.glUniform1i(f1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f41282z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(f1Var.d("type"), h1Var.f41167a.o());
            GLES20.glUniform2f(f1Var.d("resolution"), uv0Var.f28868a, uv0Var.f28869b);
            GLES20.glUniform2f(f1Var.d("center"), h1Var.f41168b, h1Var.f41169c);
            GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.e);
            GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f41170f);
            GLES20.glUniform1f(f1Var.d("rounding"), h1Var.f41171g);
            GLES20.glUniform2f(f1Var.d("middle"), h1Var.f41172i, h1Var.f41173j);
            GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
            GLES20.glUniform1i(f1Var.d("fill"), h1Var.f41175l ? 1 : 0);
            GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.f41174k);
            GLES20.glUniform1i(f1Var.d("composite"), 1);
            GLES20.glUniform1i(f1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41270m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41271n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        n2.e eVar = this.f41261a;
        if (eVar != null && this.f41276s <= 0) {
            eVar.p();
        }
        this.f41276s--;
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.f41341g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f41343j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f41262b = null;
        this.f41263c = null;
        return m10;
    }

    public final RectF f() {
        uv0 uv0Var = this.f41265g;
        return new RectF(0.0f, 0.0f, uv0Var.f28868a, uv0Var.f28869b);
    }

    public final int g() {
        if (this.f41273p == 0) {
            this.f41273p = t1.b(this.f41265g);
        }
        return this.f41273p;
    }

    public final f3 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        t1 t1Var;
        f3 f3Var;
        f1 f1Var;
        int i10;
        int j10;
        t1 t1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f41277t, 0);
        int i13 = this.f41277t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f41277t, 0);
        int i14 = this.f41277t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        uv0 uv0Var = this.f41265g;
        GLES20.glViewport(0, 0, (int) uv0Var.f28868a, (int) uv0Var.f28869b);
        Map map = this.f41275r;
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
                GLES20.glUseProgram(f1Var2.f41160a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = m6.c(this.f41280x, m6.a(matrix));
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
                    GLES20.glBindTexture(3553, this.f41269l.c());
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
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41270m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41271n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (f1Var = (f1) this.f41275r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(f1Var.f41160a);
                    GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(f1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(f1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    oa oaVar = this.F.f24979m;
                    if (oaVar != null) {
                        i10 = oaVar.f26882s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(f1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41270m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41271n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f41278u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f41278u);
                if (z10) {
                    f3Var = new f3(null, this.f41278u, false, 8);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f41278u);
                    f3Var = new f3(createBitmap, null, false, 8);
                }
                this.f41278u.rewind();
                int[] iArr = this.f41277t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f41277t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return f3Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f41272o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f41272o = iArr[0];
            o6.a();
        }
        return this.f41272o;
    }

    public final int j() {
        t1 t1Var = this.f41268k;
        if (t1Var != null) {
            return t1Var.c();
        }
        return 0;
    }

    public final void k(h1 h1Var) {
        if (h1Var == null) {
            return;
        }
        this.f41264f.f(new o0(this, h1Var, 0));
    }

    public final void l(pg.t0 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.l(pg.t0, boolean, boolean):void");
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f41261a.f15112b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f20270c, z10 ? 1 : 0, rectF);
        ((e1) this.f41261a.f15112b).f41149b.b(UUID.randomUUID(), new q0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, pg.t0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.n(int, pg.t0, float):void");
    }

    public final void o(int i10, int i11, h1 h1Var, float f7) {
        f1 f1Var;
        int i12;
        if (h1Var != null) {
            m mVar = this.f41266i;
            l lVar = h1Var.f41167a;
            if (lVar != null && i10 == this.f41274q) {
                mVar = lVar;
            }
            if (mVar != null && this.f41264f != null && (f1Var = (f1) this.f41275r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(f1Var.f41160a);
                GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f41281y));
                GLES20.glUniform1i(f1Var.d("texture"), 0);
                GLES20.glUniform1i(f1Var.d("mask"), 1);
                int currentColor = this.f41264f.getCurrentColor();
                f1.a(f1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(f1Var.d("type"), ((l) mVar).o());
                    int d = f1Var.d("resolution");
                    uv0 uv0Var = this.f41265g;
                    GLES20.glUniform2f(d, uv0Var.f28868a, uv0Var.f28869b);
                    GLES20.glUniform2f(f1Var.d("center"), h1Var.f41168b, h1Var.f41169c);
                    GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.e);
                    GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f41170f);
                    GLES20.glUniform1f(f1Var.d("rounding"), h1Var.f41171g);
                    GLES20.glUniform2f(f1Var.d("middle"), h1Var.f41172i, h1Var.f41173j);
                    GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
                    GLES20.glUniform1i(f1Var.d("fill"), h1Var.f41175l ? 1 : 0);
                    GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.f41174k);
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
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41270m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41271n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                o6.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        n2.e eVar;
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
            } catch (Exception e) {
                FileLog.e(e);
                byteBuffer = null;
            }
            int j3 = j();
            if (aVar.f277b == 1 && (t1Var = this.D) != null) {
                j3 = t1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) aVar.f278c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f278c).height(), 6408, 5121, byteBuffer);
            if (this.f41276s <= 0 && (eVar = this.f41261a) != null) {
                eVar.p();
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
        this.f41266i = mVar;
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
            e1 e1Var = this.f41264f;
            if (e1Var != null && (c10 = e1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            t1 t1Var = this.f41282z;
            if (t1Var != null) {
                t1Var.a(false);
            }
            this.f41282z = new t1(this.C);
        }
    }
}
