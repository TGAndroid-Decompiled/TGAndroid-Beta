package qg;

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
import ji.u4;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.pa;
import w7.s6;
import w7.u6;
public final class q0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public r1 D;
    public boolean E;
    public final ja F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;
    public u4 f44547a;
    public r0 f44548b;
    public f1 f44549c;
    public f1 d;
    public c1 f44551f;
    public final iv0 f44552g;
    public RectF h;
    public m f44553i;
    public r1 f44555k;
    public r1 f44556l;
    public final ByteBuffer f44557m;
    public final ByteBuffer f44558n;
    public int f44559o;
    public int f44560p;
    public int f44561q;
    public Map f44562r;
    public int f44563s;
    public final ByteBuffer f44565u;
    public boolean v;
    public a5.a f44566w;
    public final float[] f44567x;
    public float[] f44568y;
    public r1 f44569z;
    public final HashMap f44554j = new HashMap();
    public final int[] f44564t = new int[1];
    public boolean G = false;
    public final v0 f44550e = new Object();

    public q0(iv0 iv0Var, Bitmap bitmap, int i10, ja jaVar) {
        this.F = jaVar;
        this.f44552g = iv0Var;
        this.A = bitmap;
        this.B = i10;
        this.f44565u = ByteBuffer.allocateDirect(((int) iv0Var.f27299a) * ((int) iv0Var.f27300b) * 4);
        this.f44567x = s6.b(iv0Var.f27299a, iv0Var.f27300b);
        if (this.f44557m == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
            this.f44557m = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f44557m.putFloat(0.0f);
        this.f44557m.putFloat(0.0f);
        this.f44557m.putFloat(iv0Var.f27299a);
        this.f44557m.putFloat(0.0f);
        this.f44557m.putFloat(0.0f);
        this.f44557m.putFloat(iv0Var.f27300b);
        this.f44557m.putFloat(iv0Var.f27299a);
        this.f44557m.putFloat(iv0Var.f27300b);
        this.f44557m.rewind();
        if (this.f44558n == null) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f44558n = allocateDirect2;
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
        int i10 = this.f44559o;
        int[] iArr = this.f44564t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f44559o = 0;
        }
        r1 r1Var = this.f44555k;
        if (r1Var != null) {
            r1Var.a(z10);
        }
        r1 r1Var2 = this.D;
        if (r1Var2 != null) {
            r1Var2.a(z10);
        }
        int i11 = this.f44560p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f44560p = 0;
        }
        HashMap hashMap = this.f44554j;
        for (r1 r1Var3 : hashMap.values()) {
            if (r1Var3 != null) {
                r1Var3.a(true);
            }
        }
        hashMap.clear();
        int i12 = this.f44561q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f44561q = 0;
        }
        r1 r1Var4 = this.f44569z;
        if (r1Var4 != null) {
            r1Var4.a(true);
        }
        r1 r1Var5 = this.f44556l;
        if (r1Var5 != null) {
            r1Var5.a(true);
        }
        Map map = this.f44562r;
        if (map != null) {
            for (d1 d1Var : map.values()) {
                if (d1Var.f44450a != 0) {
                    GLES20.glDeleteProgram(0);
                    d1Var.f44450a = 0;
                }
            }
            this.f44562r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        u6.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            iv0 iv0Var = this.f44552g;
            GLES20.glViewport(0, 0, (int) iv0Var.f27299a, (int) iv0Var.f27300b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        u4 u4Var = this.f44547a;
        if (u4Var != null) {
            u4Var.n();
        }
        v0 v0Var = this.f44550e;
        v0Var.h = 0;
        v0Var.f44634g = 0.0d;
        ByteBuffer byteBuffer = v0Var.f44636j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f44548b = null;
        this.J = 0.0f;
    }

    public final void c(r0 r0Var, int i10, boolean z10, z zVar) {
        if (this.f44562r != null && this.f44553i != null) {
            this.f44551f.f(new m4.e0(this, r0Var, i10, z10, zVar));
        }
    }

    public final a5.a d(qg.r0 r27, int r28, android.graphics.RectF r29) {
        throw new UnsupportedOperationException("Method not decompiled: qg.q0.d(qg.r0, int, android.graphics.RectF):a5.a");
    }

    public final a5.a e(f1 f1Var, int i10, RectF rectF) {
        boolean z10;
        m mVar = f1Var.f44456a;
        if (mVar == null) {
            mVar = this.f44553i;
        }
        if (this.F != null && (mVar instanceof b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a5.a m10 = m(rectF, z10);
        this.f44563s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        iv0 iv0Var = this.f44552g;
        GLES20.glViewport(0, 0, (int) iv0Var.f27299a, (int) iv0Var.f27300b);
        d1 d1Var = (d1) this.f44562r.get(mVar.i(1));
        if (d1Var == null) {
            return null;
        }
        GLES20.glUseProgram(d1Var.f44450a);
        GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f44567x));
        GLES20.glUniform1i(d1Var.d("texture"), 0);
        GLES20.glUniform1i(d1Var.d("mask"), 1);
        d1.a(d1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f44569z != null) {
            GLES20.glUniform1i(d1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f44569z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(d1Var.d("type"), f1Var.f44456a.o());
            GLES20.glUniform2f(d1Var.d("resolution"), iv0Var.f27299a, iv0Var.f27300b);
            GLES20.glUniform2f(d1Var.d("center"), f1Var.f44457b, f1Var.f44458c);
            GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.f44459e);
            GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f44460f);
            GLES20.glUniform1f(d1Var.d("rounding"), f1Var.f44461g);
            GLES20.glUniform2f(d1Var.d("middle"), f1Var.f44462i, f1Var.f44463j);
            GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
            GLES20.glUniform1i(d1Var.d("fill"), f1Var.f44465l ? 1 : 0);
            GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.f44464k);
            GLES20.glUniform1i(d1Var.d("composite"), 1);
            GLES20.glUniform1i(d1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f44557m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f44558n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        u4 u4Var = this.f44547a;
        if (u4Var != null && this.f44563s <= 0) {
            u4Var.n();
        }
        this.f44563s--;
        v0 v0Var = this.f44550e;
        v0Var.h = 0;
        v0Var.f44634g = 0.0d;
        ByteBuffer byteBuffer = v0Var.f44636j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f44548b = null;
        this.f44549c = null;
        return m10;
    }

    public final RectF f() {
        iv0 iv0Var = this.f44552g;
        return new RectF(0.0f, 0.0f, iv0Var.f27299a, iv0Var.f27300b);
    }

    public final int g() {
        if (this.f44560p == 0) {
            this.f44560p = r1.b(this.f44552g);
        }
        return this.f44560p;
    }

    public final o0.a h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        int j3;
        r1 r1Var;
        o0.a aVar;
        d1 d1Var;
        int i10;
        int j10;
        r1 r1Var2;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f44564t, 0);
        int i13 = this.f44564t[0];
        GLES20.glBindFramebuffer(36160, i13);
        GLES20.glGenTextures(1, this.f44564t, 0);
        int i14 = this.f44564t[0];
        GLES20.glBindTexture(3553, i14);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i14, 0);
        iv0 iv0Var = this.f44552g;
        GLES20.glViewport(0, 0, (int) iv0Var.f27299a, (int) iv0Var.f27300b);
        Map map = this.f44562r;
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
                GLES20.glUseProgram(d1Var2.f44450a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i11, -i12);
                float[] c10 = s6.c(this.f44567x, s6.a(matrix));
                GLES20.glUniformMatrix4fv(d1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                if (!z10 && this.G) {
                    GLES20.glUniform1i(d1Var2.d("texture"), 1);
                    GLES20.glUniform1i(d1Var2.d("mask"), 0);
                    GLES20.glUniform1f(d1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (r1Var2 = this.D) != null) {
                        j10 = r1Var2.c();
                    } else {
                        j10 = j();
                    }
                    GLES20.glBindTexture(3553, j10);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f44556l.c());
                } else {
                    GLES20.glUniform1i(d1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    if (z11 && (r1Var = this.D) != null) {
                        j3 = r1Var.c();
                    } else {
                        j3 = j();
                    }
                    GLES20.glBindTexture(3553, j3);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f44557m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f44558n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (d1Var = (d1) this.f44562r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(d1Var.f44450a);
                    GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(c10));
                    GLES20.glUniform1f(d1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(d1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    pa paVar = this.F.f27445m;
                    if (paVar != null) {
                        i10 = paVar.f29368s[2];
                    } else {
                        i10 = -1;
                    }
                    GLES20.glBindTexture(3553, i10);
                    GLES20.glUniform1f(d1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(d1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f44557m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f44558n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f44565u.limit(width * height * 4);
                GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.f44565u);
                if (z10) {
                    aVar = new o0.a(12, null, this.f44565u);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(this.f44565u);
                    aVar = new o0.a(12, createBitmap, null);
                }
                this.f44565u.rewind();
                int[] iArr = this.f44564t;
                iArr[0] = i13;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f44564t;
                iArr2[0] = i14;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return aVar;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f44559o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f44559o = iArr[0];
            u6.a();
        }
        return this.f44559o;
    }

    public final int j() {
        r1 r1Var = this.f44555k;
        if (r1Var != null) {
            return r1Var.c();
        }
        return 0;
    }

    public final void k(f1 f1Var) {
        if (f1Var == null) {
            return;
        }
        this.f44551f.f(new m0(this, f1Var, 0));
    }

    public final void l(qg.r0 r37, boolean r38, boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: qg.q0.l(qg.r0, boolean, boolean):void");
    }

    public final a5.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        Object obj = this.f44547a.f14247b;
        a5.a aVar = new a5.a((ByteBuffer) h(rectF, true, z10, false).f16797c, z10 ? 1 : 0, rectF);
        ((c1) this.f44547a.f14247b).f44417b.b(UUID.randomUUID(), new o0(this, aVar, 1));
        return aVar;
    }

    public final void n(int r19, qg.r0 r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: qg.q0.n(int, qg.r0, float):void");
    }

    public final void o(int i10, int i11, f1 f1Var, float f7) {
        d1 d1Var;
        int i12;
        if (f1Var != null) {
            m mVar = this.f44553i;
            l lVar = f1Var.f44456a;
            if (lVar != null && i10 == this.f44561q) {
                mVar = lVar;
            }
            if (mVar != null && this.f44551f != null && (d1Var = (d1) this.f44562r.get(mVar.i(0))) != null) {
                GLES20.glUseProgram(d1Var.f44450a);
                GLES20.glUniformMatrix4fv(d1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f44568y));
                GLES20.glUniform1i(d1Var.d("texture"), 0);
                GLES20.glUniform1i(d1Var.d("mask"), 1);
                int currentColor = this.f44551f.getCurrentColor();
                d1.a(d1Var.d("color"), i0.a.k(currentColor, (int) (Color.alpha(currentColor) * f7)));
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, i11);
                if (mVar instanceof l) {
                    GLES20.glUniform1i(d1Var.d("type"), ((l) mVar).o());
                    int d = d1Var.d("resolution");
                    iv0 iv0Var = this.f44552g;
                    GLES20.glUniform2f(d, iv0Var.f27299a, iv0Var.f27300b);
                    GLES20.glUniform2f(d1Var.d("center"), f1Var.f44457b, f1Var.f44458c);
                    GLES20.glUniform2f(d1Var.d("radius"), f1Var.d, f1Var.f44459e);
                    GLES20.glUniform1f(d1Var.d("thickness"), f1Var.f44460f);
                    GLES20.glUniform1f(d1Var.d("rounding"), f1Var.f44461g);
                    GLES20.glUniform2f(d1Var.d("middle"), f1Var.f44462i, f1Var.f44463j);
                    GLES20.glUniform1f(d1Var.d("rotation"), f1Var.h);
                    GLES20.glUniform1i(d1Var.d("fill"), f1Var.f44465l ? 1 : 0);
                    GLES20.glUniform1f(d1Var.d("arrowTriangleLength"), f1Var.f44464k);
                    GLES20.glUniform1i(d1Var.d("composite"), 0);
                    int d10 = d1Var.d("clear");
                    if (f1Var == this.d) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    GLES20.glUniform1i(d10, i12);
                }
                GLES20.glBlendFunc(1, 771);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f44557m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f44558n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                u6.a();
            }
        }
    }

    public final void p(a5.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        u4 u4Var;
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
            } catch (Exception e7) {
                FileLog.e(e7);
                byteBuffer = null;
            }
            int j3 = j();
            if (aVar.f297b == 1 && (r1Var = this.D) != null) {
                j3 = r1Var.c();
            }
            GLES20.glBindTexture(3553, j3);
            RectF rectF = (RectF) aVar.f298c;
            GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f298c).height(), 6408, 5121, byteBuffer);
            if (this.f44563s <= 0 && (u4Var = this.f44547a) != null) {
                u4Var.n();
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
        this.f44553i = mVar;
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
            c1 c1Var = this.f44551f;
            if (c1Var != null && (c10 = c1Var.c(false, false)) != null) {
                canvas.scale(width / c10.getWidth(), height / c10.getHeight());
                canvas.drawBitmap(c10, 0.0f, 0.0f, this.M);
                c10.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            r1 r1Var = this.f44569z;
            if (r1Var != null) {
                r1Var.a(false);
            }
            this.f44569z = new r1(this.C);
        }
    }
}
