package xf;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.opengl.GLES20;
import g7.h8;
import g7.j8;
import gh.m8;
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
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.qu0;
public final class q0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public r1 D;
    public boolean E;
    public final ba F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public m5.c0 f49310a;
    public r0 f49311b;
    public f1 f49312c;
    public f1 d;
    public c1 f49314f;
    public final qu0 f49315g;
    public RectF h;
    public m f49316i;
    public r1 f49318k;
    public r1 f49319l;
    public final ByteBuffer f49320m;
    public final ByteBuffer f49321n;
    public int f49322o;
    public int f49323p;
    public int f49324q;
    public Map f49325r;
    public int f49326s;
    public final ByteBuffer f49328u;
    public boolean v;
    public a6.a f49329w;
    public final float[] f49330x;
    public float[] f49331y;
    public r1 f49332z;
    public final HashMap f49317j = new HashMap();
    public final int[] f49327t = new int[1];
    public boolean G = false;
    public final v0 f49313e = new Object();

    public q0(qu0 qu0Var, Bitmap bitmap, int i9, ba baVar) {
        this.F = baVar;
        this.f49315g = qu0Var;
        this.A = bitmap;
        this.B = i9;
        this.f49328u = ByteBuffer.allocateDirect(((int) qu0Var.f32026a) * ((int) qu0Var.f32027b) * 4);
        this.f49330x = h8.b(qu0Var.f32026a, qu0Var.f32027b);
        if (this.f49320m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f49320m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f49320m.putFloat(0.0f);
        this.f49320m.putFloat(0.0f);
        this.f49320m.putFloat(qu0Var.f32026a);
        this.f49320m.putFloat(0.0f);
        this.f49320m.putFloat(0.0f);
        this.f49320m.putFloat(qu0Var.f32027b);
        this.f49320m.putFloat(qu0Var.f32026a);
        this.f49320m.putFloat(qu0Var.f32027b);
        this.f49320m.rewind();
        if (this.f49321n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f49321n = allocateDirect2;
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
        int i9 = this.f49322o;
        int[] iArr = this.f49327t;
        if (i9 != 0) {
            iArr[0] = i9;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f49322o = 0;
        }
        r1 r1Var = this.f49318k;
        if (r1Var != null) {
            r1Var.a(z10);
        }
        r1 r1Var2 = this.D;
        if (r1Var2 != null) {
            r1Var2.a(z10);
        }
        int i10 = this.f49323p;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f49323p = 0;
        }
        HashMap hashMap = this.f49317j;
        for (r1 r1Var3 : hashMap.values()) {
            if (r1Var3 != null) {
                r1Var3.a(true);
            }
        }
        hashMap.clear();
        int i11 = this.f49324q;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f49324q = 0;
        }
        r1 r1Var4 = this.f49332z;
        if (r1Var4 != null) {
            r1Var4.a(true);
        }
        r1 r1Var5 = this.f49319l;
        if (r1Var5 != null) {
            r1Var5.a(true);
        }
        Map map = this.f49325r;
        if (map != null) {
            for (d1 d1Var : map.values()) {
                if (d1Var.f49212a != 0) {
                    GLES20.glDeleteProgram(0);
                    d1Var.f49212a = 0;
                }
            }
            this.f49325r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        j8.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            qu0 qu0Var = this.f49315g;
            GLES20.glViewport(0, 0, (int) qu0Var.f32026a, (int) qu0Var.f32027b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        m5.c0 c0Var = this.f49310a;
        if (c0Var != null) {
            c0Var.i();
        }
        v0 v0Var = this.f49313e;
        v0Var.h = 0;
        v0Var.f49397g = 0.0d;
        ByteBuffer byteBuffer = v0Var.f49399j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f49311b = null;
        this.J = 0.0f;
    }

    public final void c(r0 r0Var, int i9, boolean z10, z zVar) {
        if (this.f49325r != null && this.f49316i != null) {
            this.f49314f.f(new m8(this, r0Var, i9, z10, zVar));
        }
    }

    public final a6.a d(xf.r0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: xf.q0.d(xf.r0, int, android.graphics.RectF):a6.a");
    }

    public final a6.a e(f1 f1Var, int i9, RectF rectF) {
        boolean z10;
        m mVar = f1Var.f49219a;
        if (mVar == null) {
            mVar = this.f49316i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a6.a m10 = m(rectF, z10);
        this.f49326s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        qu0 qu0Var = this.f49315g;
        GLES20.glViewport(0, 0, (int) qu0Var.f32026a, (int) qu0Var.f32027b);
        d1 d1Var = (d1) this.f49325r.get(mVar.i(1));
        if (d1Var == null) {
            return null;
        }
        GLES20.glUseProgram(d1Var.f49212a);
        GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f49330x));
        GLES20.glUniform1i(d1Var.d("texture"), 0);
        GLES20.glUniform1i(d1Var.d("mask"), 1);
        d1.a(d1Var.d("color"), i9);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f49332z != null) {
            GLES20.glUniform1i(d1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f49332z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(d1Var.d("type"), f1Var.f49219a.o());
            GLES20.glUniform2f(d1Var.d("resolution"), qu0Var.f32026a, qu0Var.f32027b);
            GLES20.glUniform2f(d1Var.d("center"), f1Var.f49220b, f1Var.f49221c);
            GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.f49222e);
            GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f49223f);
            GLES20.glUniform1f(d1Var.d("rounding"), f1Var.f49224g);
            GLES20.glUniform2f(d1Var.d("middle"), f1Var.f49225i, f1Var.f49226j);
            GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
            GLES20.glUniform1i(d1Var.d("fill"), f1Var.f49228l ? 1 : 0);
            GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.f49227k);
            GLES20.glUniform1i(d1Var.d("composite"), 1);
            GLES20.glUniform1i(d1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f49320m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f49321n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        m5.c0 c0Var = this.f49310a;
        if (c0Var != null && this.f49326s <= 0) {
            c0Var.i();
        }
        this.f49326s--;
        v0 v0Var = this.f49313e;
        v0Var.h = 0;
        v0Var.f49397g = 0.0d;
        ByteBuffer byteBuffer = v0Var.f49399j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f49311b = null;
        this.f49312c = null;
        return m10;
    }

    public final RectF f() {
        qu0 qu0Var = this.f49315g;
        return new RectF(0.0f, 0.0f, qu0Var.f32026a, qu0Var.f32027b);
    }

    public final int g() {
        if (this.f49323p == 0) {
            this.f49323p = r1.b(this.f49315g);
        }
        return this.f49323p;
    }

    public final w4.e h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j10;
        r1 r1Var;
        w4.e eVar;
        d1 d1Var;
        int i9;
        int j11;
        r1 r1Var2;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f49327t, 0);
        int i12 = this.f49327t[0];
        GLES20.glBindFramebuffer(36160, i12);
        GLES20.glGenTextures(1, this.f49327t, 0);
        int i13 = this.f49327t[0];
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i13, 0);
        qu0 qu0Var = this.f49315g;
        GLES20.glViewport(0, 0, (int) qu0Var.f32026a, (int) qu0Var.f32027b);
        Map map = this.f49325r;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else if (this.G) {
                str = "maskingBlit";
            } else {
                str = "blit";
            }
            d1 d1Var2 = (d1) map.get(str);
            if (d1Var2 != null) {
                GLES20.glUseProgram(d1Var2.f49212a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] c10 = h8.c(this.f49330x, h8.a(matrix));
                GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(d1Var2.d("texture"), 1);
                    GLES20.glUniform1i(d1Var2.d("mask"), 0);
                    GLES20.glUniform1f(d1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (r1Var2 = this.D) != null) {
                        j11 = r1Var2.c();
                    } else {
                        j11 = j();
                    }
                    GLES20.glBindTexture(3553, j11);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f49319l.c());
                } else {
                    GLES20.glUniform1i(d1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (r1Var = this.D) != null) {
                        j10 = r1Var.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f49320m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f49321n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (d1Var = (d1) this.f49325r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(d1Var.f49212a);
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(d1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    ha haVar = this.F.f27130m;
                    if (haVar != null) {
                        i9 = haVar.f29020s[2];
                    } else {
                        i9 = -1;
                    }
                    GLES20.glBindTexture(3553, i9);
                    GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f49320m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f49321n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f49328u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f49328u);
                if (z10) {
                    eVar = new w4.e(9, null, this.f49328u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f49328u);
                    eVar = new w4.e(9, createBitmap, null);
                }
                this.f49328u.rewind();
                int[] iArr = this.f49327t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f49327t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return eVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f49322o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f49322o = iArr[0];
            j8.a();
        }
        return this.f49322o;
    }

    public final int j() {
        r1 r1Var = this.f49318k;
        if (r1Var != null) {
            return r1Var.c();
        }
        return 0;
    }

    public final void k(f1 f1Var) {
        if (f1Var == null) {
            return;
        }
        this.f49314f.f(new l0(this, f1Var, 0));
    }

    public final void l(xf.r0 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: xf.q0.l(xf.r0, boolean, boolean):void");
    }

    public final a6.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f49310a.f17378b;
        a6.a aVar = new a6.a((ByteBuffer) h(rectF, true, z10, false).f48762c, z10 ? 1 : 0, rectF);
        ((c1) this.f49310a.f17378b).f49179b.b(UUID.randomUUID(), new n0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, xf.r0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: xf.q0.n(int, xf.r0, float):void");
    }

    public final void o(int i9, int i10, f1 f1Var, float f10) {
        d1 d1Var;
        int i11;
        if (f1Var != null) {
            m mVar = this.f49316i;
            l lVar = f1Var.f49219a;
            if (lVar != null && i9 == this.f49324q) {
                mVar = lVar;
            }
            if (mVar != null && this.f49314f != null && (d1Var = (d1) this.f49325r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(d1Var.f49212a);
                GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f49331y));
                GLES20.glUniform1i(d1Var.d("texture"), 0);
                GLES20.glUniform1i(d1Var.d("mask"), 1);
                int currentColor = this.f49314f.getCurrentColor();
                d1.a(d1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f10)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i9);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i10);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(d1Var.d("type"), ((l) mVar).o());
                    int d = d1Var.d("resolution");
                    qu0 qu0Var = this.f49315g;
                    GLES20.glUniform2f(d, qu0Var.f32026a, qu0Var.f32027b);
                    GLES20.glUniform2f(d1Var.d("center"), f1Var.f49220b, f1Var.f49221c);
                    GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.f49222e);
                    GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f49223f);
                    GLES20.glUniform1f(d1Var.d("rounding"), f1Var.f49224g);
                    GLES20.glUniform2f(d1Var.d("middle"), f1Var.f49225i, f1Var.f49226j);
                    GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
                    GLES20.glUniform1i(d1Var.d("fill"), f1Var.f49228l ? 1 : 0);
                    GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.f49227k);
                    GLES20.glUniform1i(d1Var.d("composite"), 0);
                    int d9 = d1Var.d("clear");
                    if (f1Var == this.d) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    GLES20.glUniform1i(d9, i11);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f49320m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f49321n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                j8.a();
            }
        }
    }

    public final void p(a6.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        m5.c0 c0Var;
        r1 r1Var;
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
            } catch (Exception e10) {
                FileLog.e(e10);
                byteBuffer = null;
            }
            int j10 = j();
            if (aVar.f102c == 1 && (r1Var = this.D) != null) {
                j10 = r1Var.c();
            }
            GLES20.glBindTexture(3553, j10);
            RectF rectF = (RectF) aVar.f101b;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f101b).height(), 6408, 5121, byteBuffer);
            if (this.f49326s <= 0 && (c0Var = this.f49310a) != null) {
                c0Var.i();
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
        this.f49316i = mVar;
        if ((mVar instanceof b) && (bitmap = this.A) != null && this.F == null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i9 = this.B;
            if (i9 == 90 || i9 == 270 || i9 == -90) {
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
            canvas.rotate(i9);
            if (i9 == 90) {
                canvas.translate(0.0f, -width);
            } else if (i9 == 180) {
                canvas.translate(-width, -height);
            } else if (i9 == 270) {
                canvas.translate(-height, 0.0f);
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.M);
            canvas.restore();
            c1 c1Var = this.f49314f;
            if (c1Var != null && (c10 = c1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            r1 r1Var = this.f49332z;
            if (r1Var != null) {
                r1Var.a(false);
            }
            this.f49332z = new r1(this.C);
        }
    }
}
