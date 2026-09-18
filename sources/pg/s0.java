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
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.vv0;
import w7.l6;
import w7.n6;
public final class s0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public t1 D;
    public boolean E;
    public final ja F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public n2.e f41220a;
    public t0 f41221b;
    public h1 f41222c;
    public h1 d;
    public e1 f41223f;
    public final vv0 f41224g;
    public RectF h;
    public m f41225i;
    public t1 f41227k;
    public t1 f41228l;
    public final ByteBuffer f41229m;
    public final ByteBuffer f41230n;
    public int f41231o;
    public int f41232p;
    public int f41233q;
    public Map f41234r;
    public int f41235s;
    public final ByteBuffer f41237u;
    public boolean v;
    public a5.a f41238w;
    public final float[] f41239x;
    public float[] f41240y;
    public t1 f41241z;
    public final HashMap f41226j = new HashMap();
    public final int[] f41236t = new int[1];
    public boolean G = false;
    public final x0 e = new Object();

    public s0(vv0 vv0Var, Bitmap bitmap, int i10, ja jaVar) {
        this.F = jaVar;
        this.f41224g = vv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f41237u = ByteBuffer.allocateDirect(((int) vv0Var.f29776a) * ((int) vv0Var.f29777b) * 4);
        this.f41239x = l6.b(vv0Var.f29776a, vv0Var.f29777b);
        if (this.f41229m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f41229m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f41229m.putFloat(0.0f);
        this.f41229m.putFloat(0.0f);
        this.f41229m.putFloat(vv0Var.f29776a);
        this.f41229m.putFloat(0.0f);
        this.f41229m.putFloat(0.0f);
        this.f41229m.putFloat(vv0Var.f29777b);
        this.f41229m.putFloat(vv0Var.f29776a);
        this.f41229m.putFloat(vv0Var.f29777b);
        this.f41229m.rewind();
        if (this.f41230n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f41230n = allocateDirect2;
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
        int i10 = this.f41231o;
        int[] iArr = this.f41236t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f41231o = 0;
        }
        t1 t1Var = this.f41227k;
        if (t1Var != null) {
            t1Var.a(z10);
        }
        t1 t1Var2 = this.D;
        if (t1Var2 != null) {
            t1Var2.a(z10);
        }
        int i11 = this.f41232p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f41232p = 0;
        }
        HashMap hashMap = this.f41226j;
        for (t1 t1Var3 : hashMap.values()) {
            if (t1Var3 != null) {
                t1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f41233q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f41233q = 0;
        }
        t1 t1Var4 = this.f41241z;
        if (t1Var4 != null) {
            t1Var4.a(true);
        }
        t1 t1Var5 = this.f41228l;
        if (t1Var5 != null) {
            t1Var5.a(true);
        }
        Map map = this.f41234r;
        if (map != null) {
            for (f1 f1Var : map.values()) {
                if (f1Var.f41119a != 0) {
                    GLES20.glDeleteProgram(0);
                    f1Var.f41119a = 0;
                }
            }
            this.f41234r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        n6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            vv0 vv0Var = this.f41224g;
            GLES20.glViewport(0, 0, (int) vv0Var.f29776a, (int) vv0Var.f29777b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        n2.e eVar = this.f41220a;
        if (eVar != null) {
            eVar.t();
        }
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.f41300g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f41302j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f41221b = null;
        this.J = 0.0f;
    }

    public final void c(t0 t0Var, int i10, boolean z10, z zVar) {
        if (this.f41234r != null && this.f41225i != null) {
            this.f41223f.f(new m4.e0(this, t0Var, i10, z10, zVar));
        }
    }

    public final a5.a d(pg.t0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.d(pg.t0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(h1 h1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = h1Var.f41126a;
        if (mVar == null) {
            mVar = this.f41225i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f41235s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        vv0 vv0Var = this.f41224g;
        GLES20.glViewport(0, 0, (int) vv0Var.f29776a, (int) vv0Var.f29777b);
        f1 f1Var = (f1) this.f41234r.get(mVar.i(1));
        if (f1Var == null) {
            return null;
        }
        GLES20.glUseProgram(f1Var.f41119a);
        GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f41239x));
        GLES20.glUniform1i(f1Var.d("texture"), 0);
        GLES20.glUniform1i(f1Var.d("mask"), 1);
        f1.a(f1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f41241z != null) {
            GLES20.glUniform1i(f1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f41241z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(f1Var.d("type"), h1Var.f41126a.o());
            GLES20.glUniform2f(f1Var.d("resolution"), vv0Var.f29776a, vv0Var.f29777b);
            GLES20.glUniform2f(f1Var.d("center"), h1Var.f41127b, h1Var.f41128c);
            GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.e);
            GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f41129f);
            GLES20.glUniform1f(f1Var.d("rounding"), h1Var.f41130g);
            GLES20.glUniform2f(f1Var.d("middle"), h1Var.f41131i, h1Var.f41132j);
            GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
            GLES20.glUniform1i(f1Var.d("fill"), h1Var.f41134l ? 1 : 0);
            GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.f41133k);
            GLES20.glUniform1i(f1Var.d("composite"), 1);
            GLES20.glUniform1i(f1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41229m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41230n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        n2.e eVar = this.f41220a;
        if (eVar != null && this.f41235s <= 0) {
            eVar.t();
        }
        this.f41235s--;
        x0 x0Var = this.e;
        x0Var.h = 0;
        x0Var.f41300g = 0.0d;
        ByteBuffer byteBuffer = x0Var.f41302j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f41221b = null;
        this.f41222c = null;
        return m10;
    }

    public final RectF f() {
        vv0 vv0Var = this.f41224g;
        return new RectF(0.0f, 0.0f, vv0Var.f29776a, vv0Var.f29777b);
    }

    public final int g() {
        if (this.f41232p == 0) {
            this.f41232p = t1.b(this.f41224g);
        }
        return this.f41232p;
    }

    public final n7.z0 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        t1 t1Var;
        n7.z0 z0Var;
        f1 f1Var;
        int i10;
        int j10;
        t1 t1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f41236t, 0);
        int i13 = this.f41236t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f41236t, 0);
        int i14 = this.f41236t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        vv0 vv0Var = this.f41224g;
        GLES20.glViewport(0, 0, (int) vv0Var.f29776a, (int) vv0Var.f29777b);
        Map map = this.f41234r;
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
                GLES20.glUseProgram(f1Var2.f41119a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = l6.c(this.f41239x, l6.a(matrix));
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
                    GLES20.glBindTexture(3553, this.f41228l.c());
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
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41229m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41230n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (f1Var = (f1) this.f41234r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(f1Var.f41119a);
                    GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(f1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(f1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    pa paVar = this.F.f25280m;
                    if (paVar != null) {
                        i10 = paVar.f27179s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(f1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(f1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41229m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41230n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f41237u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f41237u);
                if (z10) {
                    z0Var = new n7.z0(11, null, this.f41237u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f41237u);
                    z0Var = new n7.z0(11, createBitmap, null);
                }
                this.f41237u.rewind();
                int[] iArr = this.f41236t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f41236t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return z0Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f41231o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f41231o = iArr[0];
            n6.a();
        }
        return this.f41231o;
    }

    public final int j() {
        t1 t1Var = this.f41227k;
        if (t1Var != null) {
            return t1Var.c();
        }
        return 0;
    }

    public final void k(h1 h1Var) {
        if (h1Var == null) {
            return;
        }
        this.f41223f.f(new o0(this, h1Var, 0));
    }

    public final void l(pg.t0 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.l(pg.t0, boolean, boolean):void");
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f41220a.f15073b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f15368c, z10 ? 1 : 0, rectF);
        ((e1) this.f41220a.f15073b).f41108b.b(UUID.randomUUID(), new q0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, pg.t0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: pg.s0.n(int, pg.t0, float):void");
    }

    public final void o(int i10, int i11, h1 h1Var, float f7) {
        f1 f1Var;
        int i12;
        if (h1Var != null) {
            m mVar = this.f41225i;
            l lVar = h1Var.f41126a;
            if (lVar != null && i10 == this.f41233q) {
                mVar = lVar;
            }
            if (mVar != null && this.f41223f != null && (f1Var = (f1) this.f41234r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(f1Var.f41119a);
                GLES20.glUniformMatrix4fv(f1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f41240y));
                GLES20.glUniform1i(f1Var.d("texture"), 0);
                GLES20.glUniform1i(f1Var.d("mask"), 1);
                int currentColor = this.f41223f.getCurrentColor();
                f1.a(f1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(f1Var.d("type"), ((l) mVar).o());
                    int d = f1Var.d("resolution");
                    vv0 vv0Var = this.f41224g;
                    GLES20.glUniform2f(d, vv0Var.f29776a, vv0Var.f29777b);
                    GLES20.glUniform2f(f1Var.d("center"), h1Var.f41127b, h1Var.f41128c);
                    GLES20.glUniform2f(f1Var.d("radius"), h1Var.d, h1Var.e);
                    GLES20.glUniform1f(f1Var.d("thickness"), h1Var.f41129f);
                    GLES20.glUniform1f(f1Var.d("rounding"), h1Var.f41130g);
                    GLES20.glUniform2f(f1Var.d("middle"), h1Var.f41131i, h1Var.f41132j);
                    GLES20.glUniform1f(f1Var.d("rotation"), h1Var.h);
                    GLES20.glUniform1i(f1Var.d("fill"), h1Var.f41134l ? 1 : 0);
                    GLES20.glUniform1f(f1Var.d("arrowTriangleLength"), h1Var.f41133k);
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
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f41229m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f41230n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                n6.a();
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
            if (this.f41235s <= 0 && (eVar = this.f41220a) != null) {
                eVar.t();
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
        this.f41225i = mVar;
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
            e1 e1Var = this.f41223f;
            if (e1Var != null && (c10 = e1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            t1 t1Var = this.f41241z;
            if (t1Var != null) {
                t1Var.a(false);
            }
            this.f41241z = new t1(this.C);
        }
    }
}
