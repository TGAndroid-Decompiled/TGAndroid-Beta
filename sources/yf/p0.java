package yf;

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
import h7.l8;
import h7.n8;
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
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.z9;

public final class p0 {
    public final Bitmap A;
    public final int B;
    public Bitmap C;
    public q1 D;
    public boolean E;
    public final z9 F;
    public boolean H;
    public float I;
    public float J;
    public ValueAnimator K;
    public ValueAnimator L;
    public Paint M;

    public n1.d f50011a;

    public q0 f50012b;

    public e1 f50013c;
    public e1 d;

    public b1 f50015f;

    public final tu0 f50016g;
    public RectF h;

    public m f50017i;

    public q1 f50019k;

    public q1 f50020l;

    public final ByteBuffer f50021m;

    public final ByteBuffer f50022n;

    public int f50023o;

    public int f50024p;

    public int f50025q;

    public Map f50026r;

    public int f50027s;

    public final ByteBuffer f50029u;
    public boolean v;

    public b6.a f50030w;

    public final float[] f50031x;

    public float[] f50032y;

    public q1 f50033z;

    public final HashMap f50018j = new HashMap();

    public final int[] f50028t = new int[1];
    public boolean G = false;

    public final u0 f50014e = new u0();

    public p0(tu0 tu0Var, Bitmap bitmap, int i10, z9 z9Var) {
        this.F = z9Var;
        this.f50016g = tu0Var;
        this.A = bitmap;
        this.B = i10;
        this.f50029u = ByteBuffer.allocateDirect(((int) tu0Var.f32893a) * ((int) tu0Var.f32894b) * 4);
        this.f50031x = l8.b(tu0Var.f32893a, tu0Var.f32894b);
        if (this.f50021m == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
            this.f50021m = byteBufferAllocateDirect;
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        }
        this.f50021m.putFloat(0.0f);
        this.f50021m.putFloat(0.0f);
        this.f50021m.putFloat(tu0Var.f32893a);
        this.f50021m.putFloat(0.0f);
        this.f50021m.putFloat(0.0f);
        this.f50021m.putFloat(tu0Var.f32894b);
        this.f50021m.putFloat(tu0Var.f32893a);
        this.f50021m.putFloat(tu0Var.f32894b);
        this.f50021m.rewind();
        if (this.f50022n == null) {
            ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
            this.f50022n = byteBufferAllocateDirect2;
            byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(0.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.putFloat(1.0f);
            byteBufferAllocateDirect2.rewind();
        }
    }

    public final void a(boolean z10) {
        int i10 = this.f50023o;
        int[] iArr = this.f50028t;
        if (i10 != 0) {
            iArr[0] = i10;
            GLES20.glDeleteFramebuffers(1, iArr, 0);
            this.f50023o = 0;
        }
        q1 q1Var = this.f50019k;
        if (q1Var != null) {
            q1Var.a(z10);
        }
        q1 q1Var2 = this.D;
        if (q1Var2 != null) {
            q1Var2.a(z10);
        }
        int i11 = this.f50024p;
        if (i11 != 0) {
            iArr[0] = i11;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f50024p = 0;
        }
        HashMap map = this.f50018j;
        for (q1 q1Var3 : map.values()) {
            if (q1Var3 != null) {
                q1Var3.a(true);
            }
        }
        map.clear();
        int i12 = this.f50025q;
        if (i12 != 0) {
            iArr[0] = i12;
            GLES20.glDeleteTextures(1, iArr, 0);
            this.f50025q = 0;
        }
        q1 q1Var4 = this.f50033z;
        if (q1Var4 != null) {
            q1Var4.a(true);
        }
        q1 q1Var5 = this.f50020l;
        if (q1Var5 != null) {
            q1Var5.a(true);
        }
        Map map2 = this.f50026r;
        if (map2 != null) {
            for (c1 c1Var : map2.values()) {
                if (c1Var.f49894a != 0) {
                    GLES20.glDeleteProgram(0);
                    c1Var.f49894a = 0;
                }
            }
            this.f50026r = null;
        }
    }

    public final void b() {
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        n8.a();
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            tu0 tu0Var = this.f50016g;
            GLES20.glViewport(0, 0, (int) tu0Var.f32893a, (int) tu0Var.f32894b);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        }
        GLES20.glBindFramebuffer(36160, 0);
        n1.d dVar = this.f50011a;
        if (dVar != null) {
            dVar.C();
        }
        u0 u0Var = this.f50014e;
        u0Var.h = 0;
        u0Var.f50094g = 0.0d;
        ByteBuffer byteBuffer = u0Var.f50096j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.h = null;
        this.f50012b = null;
        this.J = 0.0f;
    }

    public final void c(q0 q0Var, int i10, boolean z10, z zVar) {
        if (this.f50026r == null || this.f50017i == null) {
            return;
        }
        this.f50015f.f(new hh.l8(this, q0Var, i10, z10, zVar));
    }

    public final b6.a d(q0 q0Var, int i10, RectF rectF) {
        b6.a aVarM;
        n1.d dVar;
        Object obj;
        boolean z10;
        m mVar = this.f50017i;
        if (q0Var != null) {
            mVar = q0Var.f50041e;
        }
        m dVar2 = mVar;
        if (this.F == null || !(((z10 = dVar2 instanceof b)) || (dVar2 instanceof d))) {
            aVarM = m(rectF, false);
        } else {
            boolean z11 = this.E;
            if (rectF != null && rectF.setIntersect(rectF, f())) {
                ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, false, false).f48999c;
                Object obj2 = this.f50011a.f18088b;
                b6.a aVar = new b6.a(byteBuffer, 0, rectF);
                ByteBuffer byteBuffer2 = (ByteBuffer) h(rectF, true, true, false).f48999c;
                Object obj3 = this.f50011a.f18088b;
                ((b1) this.f50011a.f18088b).f49879b.b(UUID.randomUUID(), new cg.c(this, aVar, new b6.a(byteBuffer2, 1, rectF), z11, 28));
                aVarM = aVar;
            } else {
                aVarM = null;
            }
            this.E = z10;
        }
        this.f50027s++;
        int i11 = (this.F == null || !((dVar2 instanceof b) || (dVar2 instanceof d))) ? 1 : 2;
        for (int i12 = 0; i12 < i11; i12++) {
            GLES20.glBindFramebuffer(36160, i());
            int iJ = j();
            if (this.F != null && (((dVar2 instanceof b) && i12 == 0) || ((dVar2 instanceof d) && i12 == 1))) {
                q1 q1Var = this.D;
                iJ = q1Var != null ? q1Var.c() : 0;
            }
            if (i12 == 1 && (dVar2 instanceof b)) {
                dVar2 = new d();
            }
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iJ, 0);
            tu0 tu0Var = this.f50016g;
            GLES20.glViewport(0, 0, (int) tu0Var.f32893a, (int) tu0Var.f32894b);
            c1 c1Var = (c1) this.f50026r.get(dVar2.i(1));
            if (c1Var == null) {
                return null;
            }
            GLES20.glUseProgram(c1Var.f49894a);
            GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f50031x));
            GLES20.glUniform1i(c1Var.d("texture"), 0);
            GLES20.glUniform1i(c1Var.d("mask"), 1);
            c1.a(c1Var.d("color"), i0.b.k(i10, (int) (dVar2.f() * Color.alpha(i10))));
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iJ);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, g());
            if (dVar2 instanceof b) {
                GLES20.glUniform1i(c1Var.d("blured"), 2);
                GLES20.glActiveTexture(33986);
                z9 z9Var = this.F;
                if (z9Var != null) {
                    obj = z9Var.h;
                    fa faVar = z9Var.f35212m;
                    GLES20.glBindTexture(3553, faVar != null ? faVar.f28334s[2] : -1);
                } else {
                    GLES20.glBindTexture(3553, this.f50033z.c());
                    obj = null;
                }
            } else {
                obj = null;
            }
            GLES20.glBlendFunc(1, 0);
            GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f50021m);
            GLES20.glEnableVertexAttribArray(0);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f50022n);
            GLES20.glEnableVertexAttribArray(1);
            if (obj != null) {
                synchronized (obj) {
                    GLES20.glDrawArrays(5, 0, 4);
                }
            } else {
                GLES20.glDrawArrays(5, 0, 4);
            }
            GLES20.glBindTexture(3553, j());
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        GLES20.glBindFramebuffer(36160, 0);
        if (this.f50027s <= 0 && (dVar = this.f50011a) != null) {
            dVar.C();
        }
        this.f50027s--;
        u0 u0Var = this.f50014e;
        u0Var.h = 0;
        u0Var.f50094g = 0.0d;
        ByteBuffer byteBuffer3 = u0Var.f50096j;
        if (byteBuffer3 != null) {
            byteBuffer3.position(0);
        }
        this.f50012b = null;
        this.f50013c = null;
        return aVarM;
    }

    public final b6.a e(e1 e1Var, int i10, RectF rectF) {
        m mVar = e1Var.f49921a;
        if (mVar == null) {
            mVar = this.f50017i;
        }
        b6.a aVarM = m(rectF, this.F != null && (mVar instanceof b));
        this.f50027s++;
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, j(), 0);
        tu0 tu0Var = this.f50016g;
        GLES20.glViewport(0, 0, (int) tu0Var.f32893a, (int) tu0Var.f32894b);
        c1 c1Var = (c1) this.f50026r.get(mVar.i(1));
        if (c1Var == null) {
            return null;
        }
        GLES20.glUseProgram(c1Var.f49894a);
        GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f50031x));
        GLES20.glUniform1i(c1Var.d("texture"), 0);
        GLES20.glUniform1i(c1Var.d("mask"), 1);
        c1.a(c1Var.d("color"), i10);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, g());
        if ((mVar instanceof b) && this.f50033z != null) {
            GLES20.glUniform1i(c1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f50033z.c());
        }
        if (mVar instanceof l) {
            GLES20.glUniform1i(c1Var.d("type"), e1Var.f49921a.o());
            GLES20.glUniform2f(c1Var.d("resolution"), tu0Var.f32893a, tu0Var.f32894b);
            GLES20.glUniform2f(c1Var.d("center"), e1Var.f49922b, e1Var.f49923c);
            GLES20.glUniform2f(c1Var.d("radius"), e1Var.d, e1Var.f49924e);
            GLES20.glUniform1f(c1Var.d("thickness"), e1Var.f49925f);
            GLES20.glUniform1f(c1Var.d("rounding"), e1Var.f49926g);
            GLES20.glUniform2f(c1Var.d("middle"), e1Var.f49927i, e1Var.f49928j);
            GLES20.glUniform1f(c1Var.d("rotation"), e1Var.h);
            GLES20.glUniform1i(c1Var.d("fill"), e1Var.f49930l ? 1 : 0);
            GLES20.glUniform1f(c1Var.d("arrowTriangleLength"), e1Var.f49929k);
            GLES20.glUniform1i(c1Var.d("composite"), 1);
            GLES20.glUniform1i(c1Var.d("clear"), 0);
        }
        GLES20.glBlendFunc(1, 0);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f50021m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f50022n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindTexture(3553, j());
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glBindFramebuffer(36160, 0);
        n1.d dVar = this.f50011a;
        if (dVar != null && this.f50027s <= 0) {
            dVar.C();
        }
        this.f50027s--;
        u0 u0Var = this.f50014e;
        u0Var.h = 0;
        u0Var.f50094g = 0.0d;
        ByteBuffer byteBuffer = u0Var.f50096j;
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        this.J = 0.0f;
        this.H = false;
        this.I = 0.0f;
        this.d = null;
        this.f50012b = null;
        this.f50013c = null;
        return aVarM;
    }

    public final RectF f() {
        tu0 tu0Var = this.f50016g;
        return new RectF(0.0f, 0.0f, tu0Var.f32893a, tu0Var.f32894b);
    }

    public final int g() {
        if (this.f50024p == 0) {
            this.f50024p = q1.b(this.f50016g);
        }
        return this.f50024p;
    }

    public final w3.b0 h(RectF rectF, boolean z10, boolean z11, boolean z12) {
        String str;
        q1 q1Var;
        w3.b0 b0Var;
        c1 c1Var;
        q1 q1Var2;
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int iWidth = (int) rectF.width();
        int iHeight = (int) rectF.height();
        GLES20.glGenFramebuffers(1, this.f50028t, 0);
        int i12 = this.f50028t[0];
        GLES20.glBindFramebuffer(36160, i12);
        GLES20.glGenTextures(1, this.f50028t, 0);
        int i13 = this.f50028t[0];
        GLES20.glBindTexture(3553, i13);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, iWidth, iHeight, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i13, 0);
        tu0 tu0Var = this.f50016g;
        GLES20.glViewport(0, 0, (int) tu0Var.f32893a, (int) tu0Var.f32894b);
        Map map = this.f50026r;
        Object obj = null;
        if (map != null) {
            if (z10) {
                str = "nonPremultipliedBlit";
            } else {
                str = this.G ? "maskingBlit" : "blit";
            }
            c1 c1Var2 = (c1) map.get(str);
            if (c1Var2 != null) {
                GLES20.glUseProgram(c1Var2.f49894a);
                Matrix matrix = new Matrix();
                matrix.preTranslate(-i10, -i11);
                float[] fArrC = l8.c(this.f50031x, l8.a(matrix));
                GLES20.glUniformMatrix4fv(c1Var2.d("mvpMatrix"), 1, false, FloatBuffer.wrap(fArrC));
                if (z10 || !this.G) {
                    GLES20.glUniform1i(c1Var2.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (q1Var = this.D) == null) ? j() : q1Var.c());
                } else {
                    GLES20.glUniform1i(c1Var2.d("texture"), 1);
                    GLES20.glUniform1i(c1Var2.d("mask"), 0);
                    GLES20.glUniform1f(c1Var2.d("preview"), 0.0f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, (!z11 || (q1Var2 = this.D) == null) ? j() : q1Var2.c());
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f50020l.c());
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
                GLES20.glBlendFunc(1, 0);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f50021m);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f50022n);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glDrawArrays(5, 0, 4);
                if (z12 && !z11 && (c1Var = (c1) this.f50026r.get("videoBlur")) != null && this.F != null) {
                    GLES20.glUseProgram(c1Var.f49894a);
                    GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(fArrC));
                    GLES20.glUniform1f(c1Var.d("flipy"), 0.0f);
                    GLES20.glUniform1i(c1Var.d("texture"), 0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.D.c());
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glUniform1i(c1Var.d("blured"), 1);
                    GLES20.glActiveTexture(33985);
                    fa faVar = this.F.f35212m;
                    GLES20.glBindTexture(3553, faVar != null ? faVar.f28334s[2] : -1);
                    GLES20.glUniform1f(c1Var.d("eraser"), 0.0f);
                    GLES20.glUniform1i(c1Var.d("mask"), 2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, j());
                    GLES20.glBlendFunc(1, 771);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f50021m);
                    GLES20.glEnableVertexAttribArray(0);
                    GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f50022n);
                    GLES20.glEnableVertexAttribArray(1);
                    synchronized (this.F.h) {
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
                this.f50029u.limit(iWidth * iHeight * 4);
                GLES20.glReadPixels(0, 0, iWidth, iHeight, 6408, 5121, this.f50029u);
                if (z10) {
                    b0Var = new w3.b0(11, obj, this.f50029u);
                } else {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(this.f50029u);
                    b0Var = new w3.b0(11, bitmapCreateBitmap, obj);
                }
                this.f50029u.rewind();
                int[] iArr = this.f50028t;
                iArr[0] = i12;
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                int[] iArr2 = this.f50028t;
                iArr2[0] = i13;
                GLES20.glDeleteTextures(1, iArr2, 0);
                return b0Var;
            }
        }
        return null;
    }

    public final int i() {
        if (this.f50023o == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.f50023o = iArr[0];
            n8.a();
        }
        return this.f50023o;
    }

    public final int j() {
        q1 q1Var = this.f50019k;
        if (q1Var != null) {
            return q1Var.c();
        }
        return 0;
    }

    public final void k(e1 e1Var) {
        if (e1Var == null) {
            return;
        }
        this.f50015f.f(new l0(this, e1Var, 0));
    }

    public final void l(q0 q0Var, boolean z10, boolean z11) {
        int i10;
        t0 t0Var;
        float f10;
        double d;
        boolean z12;
        t0 t0Var2;
        float f11;
        t0[] t0VarArr;
        double d10;
        float f12;
        float f13;
        char c10;
        char c11;
        this.f50012b = q0Var;
        if (q0Var == null) {
            return;
        }
        GLES20.glBindFramebuffer(36160, i());
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, g(), 0);
        n8.a();
        RectF rectF = null;
        if (GLES20.glCheckFramebufferStatus(36160) == 36053) {
            tu0 tu0Var = this.f50016g;
            GLES20.glViewport(0, 0, (int) tu0Var.f32893a, (int) tu0Var.f32894b);
            if (z10) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16384);
            }
            Map map = this.f50026r;
            if (map == null) {
                return;
            }
            m mVar = q0Var.f50041e;
            c1 c1Var = (c1) map.get(mVar.i(2));
            if (c1Var == null) {
                return;
            }
            GLES20.glUseProgram(c1Var.f49894a);
            q1 q1Var = (q1) this.f50018j.get(Integer.valueOf(mVar.l()));
            if (q1Var == null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = false;
                q1Var = new q1(BitmapFactory.decodeResource(ApplicationLoader.applicationContext.getResources(), mVar.l(), options));
                this.f50018j.put(Integer.valueOf(mVar.l()), q1Var);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, q1Var.c());
            GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f50031x));
            GLES20.glUniform1i(c1Var.d("texture"), 0);
            if (z11) {
                this.f50014e.f50093f = 1.0f;
            } else {
                this.f50014e.f50093f = this.f50015f.getScaleX();
            }
            u0 u0Var = this.f50014e;
            u0Var.f50089a = q0Var.d;
            u0Var.f50090b = q0Var.f50041e.k();
            u0Var.f50091c = z11 ? 1.0f : q0Var.f50041e.a();
            u0Var.d = q0Var.f50041e.b();
            u0Var.f50092e = q0Var.f50041e.h();
            Vector vector = q0Var.f50039b;
            int size = vector == null ? 0 : vector.size();
            if (size != 0) {
                if (size == 1) {
                    Vector vector2 = q0Var.f50039b;
                    t0[] t0VarArr2 = new t0[vector2.size()];
                    vector2.toArray(t0VarArr2);
                    t0 t0Var3 = t0VarArr2[0];
                    float f14 = ((u0Var.f50089a * u0Var.f50092e) * 1.0f) / u0Var.f50093f;
                    t0Var3.getClass();
                    PointF pointF = new PointF((float) t0Var3.f50086a, (float) t0Var3.f50087b);
                    float f15 = Math.abs(u0Var.d) > 0.0f ? u0Var.d : 0.0f;
                    float f16 = u0Var.f50091c;
                    u0Var.c();
                    u0Var.b(1);
                    u0Var.a(pointF, f14, f15, f16, 0);
                } else {
                    Vector vector3 = q0Var.f50039b;
                    int size2 = vector3.size();
                    t0[] t0VarArr3 = new t0[size2];
                    vector3.toArray(t0VarArr3);
                    u0Var.c();
                    int i11 = 0;
                    while (i11 < size2 - 1) {
                        t0 t0Var4 = t0VarArr3[i11];
                        int i12 = i11 + 1;
                        t0 t0Var5 = t0VarArr3[i12];
                        double dA = t0Var4.a(t0Var5);
                        int i13 = size2;
                        double d11 = t0Var5.f50086a - t0Var4.f50086a;
                        double d12 = t0Var5.f50087b - t0Var4.f50087b;
                        double d13 = t0Var5.f50088c;
                        double d14 = d13 - t0Var4.f50088c;
                        t0 t0Var6 = new t0(1.0d, 1.0d, 0.0d);
                        float fAtan2 = Math.abs(u0Var.d) > 0.0f ? u0Var.d : (float) Math.atan2(d12, d11);
                        float f17 = (float) ((((((double) u0Var.f50089a) * d13) * ((double) u0Var.f50092e)) * 1.0d) / ((double) u0Var.f50093f));
                        double dMax = Math.max(1.0f, u0Var.f50090b * f17);
                        if (dA > 0.0d) {
                            double d15 = 1.0d / dA;
                            t0Var = new t0(d11 * d15, d12 * d15, d14 * d15);
                        } else {
                            t0Var = t0Var6;
                        }
                        float fMin = Math.min(1.0f, u0Var.f50091c * 1.15f);
                        boolean z13 = t0Var4.d;
                        boolean z14 = t0Var5.d;
                        float f18 = fAtan2;
                        int iCeil = (int) Math.ceil((dA - u0Var.f50094g) / dMax);
                        int i14 = u0Var.h;
                        u0Var.b(iCeil);
                        ByteBuffer byteBuffer = u0Var.f50096j;
                        if (byteBuffer == null || i14 < 0) {
                            f10 = f17;
                        } else {
                            f10 = f17;
                            if (i14 < u0Var.f50095i) {
                                byteBuffer.position(i14 * 20);
                            }
                        }
                        double d16 = u0Var.f50094g;
                        t0 t0Var7 = new t0(t0Var4.f50086a + (t0Var.f50086a * d16), t0Var4.f50087b + (t0Var.f50087b * d16), t0Var4.f50088c + (t0Var.f50088c * d16));
                        double d17 = d16;
                        t0 t0Var8 = t0Var7;
                        boolean z15 = true;
                        while (true) {
                            if (d17 > dA) {
                                d = d17;
                                z12 = z14;
                                t0Var2 = t0Var5;
                                f11 = f10;
                                t0VarArr = t0VarArr3;
                                d10 = dA;
                                f12 = f18;
                                break;
                            }
                            float f19 = z13 ? fMin : u0Var.f50091c;
                            d = d17;
                            z12 = z14;
                            t0[] t0VarArr4 = t0VarArr3;
                            d10 = dA;
                            f12 = f18;
                            float f20 = f19;
                            t0 t0Var9 = t0Var8;
                            t0Var2 = t0Var5;
                            f11 = f10;
                            boolean zA = u0Var.a(new PointF((float) t0Var8.f50086a, (float) t0Var8.f50087b), f11, f12, f20, -1);
                            if (!zA) {
                                t0VarArr = t0VarArr4;
                                z15 = zA;
                                break;
                            }
                            t0 t0Var10 = new t0(t0Var9.f50086a + (t0Var.f50086a * dMax), t0Var9.f50087b + (t0Var.f50087b * dMax), t0Var9.f50088c + (t0Var.f50088c * dMax));
                            z15 = zA;
                            f18 = f12;
                            t0Var8 = t0Var10;
                            dA = d10;
                            t0VarArr3 = t0VarArr4;
                            z14 = z12;
                            f10 = f11;
                            t0Var5 = t0Var2;
                            d17 = d + dMax;
                            z13 = false;
                        }
                        if (z15 && z12) {
                            u0Var.b(1);
                            u0Var.a(new PointF((float) t0Var2.f50086a, (float) t0Var2.f50087b), f11, f12, fMin, -1);
                        }
                        u0Var.f50094g = d - d10;
                        size2 = i13;
                        i11 = i12;
                        t0VarArr3 = t0VarArr;
                    }
                }
                q0Var.f50038a = u0Var.f50094g;
                rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                int i15 = u0Var.h;
                if (i15 <= 0) {
                    i10 = 0;
                } else {
                    int i16 = i15 - 1;
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((i16 * 2) + (i15 * 4)) * 20);
                    byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                    FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
                    floatBufferAsFloatBuffer.position(0);
                    ByteBuffer byteBuffer2 = u0Var.f50096j;
                    if (byteBuffer2 != null && u0Var.f50095i > 0) {
                        byteBuffer2.position(0);
                    }
                    int i17 = 0;
                    for (int i18 = 0; i18 < i15; i18++) {
                        float f21 = u0Var.f50096j.getFloat();
                        float f22 = u0Var.f50096j.getFloat();
                        float f23 = u0Var.f50096j.getFloat();
                        float f24 = u0Var.f50096j.getFloat();
                        float f25 = u0Var.f50096j.getFloat();
                        RectF rectF2 = new RectF(f21 - f23, f22 - f23, f21 + f23, f22 + f23);
                        float f26 = rectF2.left;
                        float f27 = rectF2.top;
                        float f28 = rectF2.right;
                        float f29 = rectF2.bottom;
                        float[] fArr = {f26, f27, f28, f27, f26, f29, f28, f29};
                        float fCenterX = rectF2.centerX();
                        float fCenterY = rectF2.centerY();
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) Math.toDegrees(f24), fCenterX, fCenterY);
                        matrix.mapPoints(fArr);
                        matrix.mapRect(rectF2);
                        rectF2.left = (int) Math.floor(rectF2.left);
                        rectF2.top = (int) Math.floor(rectF2.top);
                        rectF2.right = (int) Math.ceil(rectF2.right);
                        rectF2.bottom = (int) Math.ceil(rectF2.bottom);
                        rectF.union(rectF2);
                        if (i17 != 0) {
                            c10 = 0;
                            floatBufferAsFloatBuffer.put(fArr[0]);
                            c11 = 1;
                            floatBufferAsFloatBuffer.put(fArr[1]);
                            f13 = 0.0f;
                            floatBufferAsFloatBuffer.put(0.0f);
                            floatBufferAsFloatBuffer.put(0.0f);
                            floatBufferAsFloatBuffer.put(f25);
                            i17++;
                        } else {
                            f13 = 0.0f;
                            c10 = 0;
                            c11 = 1;
                        }
                        floatBufferAsFloatBuffer.put(fArr[c10]);
                        floatBufferAsFloatBuffer.put(fArr[c11]);
                        floatBufferAsFloatBuffer.put(f13);
                        floatBufferAsFloatBuffer.put(f13);
                        floatBufferAsFloatBuffer.put(f25);
                        floatBufferAsFloatBuffer.put(fArr[2]);
                        floatBufferAsFloatBuffer.put(fArr[3]);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(f13);
                        floatBufferAsFloatBuffer.put(f25);
                        floatBufferAsFloatBuffer.put(fArr[4]);
                        floatBufferAsFloatBuffer.put(fArr[5]);
                        floatBufferAsFloatBuffer.put(f13);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(f25);
                        floatBufferAsFloatBuffer.put(fArr[6]);
                        floatBufferAsFloatBuffer.put(fArr[7]);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(1.0f);
                        floatBufferAsFloatBuffer.put(f25);
                        int i19 = i17 + 4;
                        if (i18 != i16) {
                            floatBufferAsFloatBuffer.put(fArr[6]);
                            floatBufferAsFloatBuffer.put(fArr[7]);
                            floatBufferAsFloatBuffer.put(1.0f);
                            floatBufferAsFloatBuffer.put(1.0f);
                            floatBufferAsFloatBuffer.put(f25);
                            i17 += 5;
                        } else {
                            i17 = i19;
                        }
                    }
                    floatBufferAsFloatBuffer.position(0);
                    GLES20.glVertexAttribPointer(0, 2, 5126, false, 20, (Buffer) floatBufferAsFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(0);
                    floatBufferAsFloatBuffer.position(2);
                    GLES20.glVertexAttribPointer(1, 2, 5126, true, 20, (Buffer) floatBufferAsFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(1);
                    floatBufferAsFloatBuffer.position(4);
                    GLES20.glVertexAttribPointer(2, 1, 5126, true, 20, (Buffer) floatBufferAsFloatBuffer.slice());
                    GLES20.glEnableVertexAttribArray(2);
                    i10 = 0;
                    GLES20.glDrawArrays(5, 0, i17);
                }
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        GLES20.glBindFramebuffer(36160, i10);
        n1.d dVar = this.f50011a;
        if (dVar != null) {
            dVar.C();
        }
        RectF rectF3 = this.h;
        if (rectF3 != null) {
            rectF3.union(rectF);
        } else {
            this.h = rectF;
        }
    }

    public final b6.a m(RectF rectF, boolean z10) {
        if (rectF == null || !rectF.setIntersect(rectF, f())) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) h(rectF, true, z10, false).f48999c;
        Object obj = this.f50011a.f18088b;
        b6.a aVar = new b6.a(byteBuffer, z10 ? 1 : 0, rectF);
        ((b1) this.f50011a.f18088b).f49879b.b(UUID.randomUUID(), new n0(this, aVar, 1));
        return aVar;
    }

    public final void n(int i10, q0 q0Var, float f10) {
        Object obj;
        if (q0Var == null) {
            return;
        }
        m mVar = q0Var.f50041e;
        if (mVar == null) {
            mVar = this.f50017i;
        }
        boolean z10 = this.G && ((mVar instanceof f) || (mVar instanceof d));
        Map map = this.f50026r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mVar.i(0));
        sb2.append(z10 ? "_masking" : "");
        c1 c1Var = (c1) map.get(sb2.toString());
        if (c1Var == null) {
            return;
        }
        GLES20.glUseProgram(c1Var.f49894a);
        GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f50032y));
        GLES20.glUniform1i(c1Var.d("texture"), 0);
        GLES20.glUniform1i(c1Var.d("mask"), 1);
        int i11 = q0Var.f50040c;
        c1.a(c1Var.d("color"), i0.b.k(i11, (int) (mVar.f() * Color.alpha(i11) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, j());
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i10);
        if (z10) {
            GLES20.glUniform1i(c1Var.d("otexture"), 2);
            GLES20.glUniform1f(c1Var.d("preview"), 0.4f);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.f50020l.c());
        }
        if (mVar instanceof b) {
            GLES20.glUniform1i(c1Var.d("blured"), 2);
            GLES20.glActiveTexture(33986);
            z9 z9Var = this.F;
            if (z9Var != null) {
                obj = z9Var.h;
                fa faVar = z9Var.f35212m;
                GLES20.glBindTexture(3553, faVar != null ? faVar.f28334s[2] : -1);
            } else {
                q1 q1Var = this.f50033z;
                if (q1Var != null) {
                    GLES20.glBindTexture(3553, q1Var.c());
                }
                obj = null;
            }
        } else {
            obj = null;
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f50021m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f50022n);
        GLES20.glEnableVertexAttribArray(1);
        if (obj != null) {
            synchronized (obj) {
                GLES20.glDrawArrays(5, 0, 4);
            }
        } else {
            GLES20.glDrawArrays(5, 0, 4);
        }
        n8.a();
    }

    public final void o(int i10, int i11, e1 e1Var, float f10) {
        c1 c1Var;
        if (e1Var == null) {
            return;
        }
        m mVar = this.f50017i;
        l lVar = e1Var.f49921a;
        if (lVar != null && i10 == this.f50025q) {
            mVar = lVar;
        }
        if (mVar == null || this.f50015f == null || (c1Var = (c1) this.f50026r.get(mVar.i(0))) == null) {
            return;
        }
        GLES20.glUseProgram(c1Var.f49894a);
        GLES20.glUniformMatrix4fv(c1Var.d("mvpMatrix"), 1, false, FloatBuffer.wrap(this.f50032y));
        GLES20.glUniform1i(c1Var.d("texture"), 0);
        GLES20.glUniform1i(c1Var.d("mask"), 1);
        int currentColor = this.f50015f.getCurrentColor();
        c1.a(c1Var.d("color"), i0.b.k(currentColor, (int) (Color.alpha(currentColor) * f10)));
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i11);
        if (mVar instanceof l) {
            GLES20.glUniform1i(c1Var.d("type"), ((l) mVar).o());
            int iD = c1Var.d("resolution");
            tu0 tu0Var = this.f50016g;
            GLES20.glUniform2f(iD, tu0Var.f32893a, tu0Var.f32894b);
            GLES20.glUniform2f(c1Var.d("center"), e1Var.f49922b, e1Var.f49923c);
            GLES20.glUniform2f(c1Var.d("radius"), e1Var.d, e1Var.f49924e);
            GLES20.glUniform1f(c1Var.d("thickness"), e1Var.f49925f);
            GLES20.glUniform1f(c1Var.d("rounding"), e1Var.f49926g);
            GLES20.glUniform2f(c1Var.d("middle"), e1Var.f49927i, e1Var.f49928j);
            GLES20.glUniform1f(c1Var.d("rotation"), e1Var.h);
            GLES20.glUniform1i(c1Var.d("fill"), e1Var.f49930l ? 1 : 0);
            GLES20.glUniform1f(c1Var.d("arrowTriangleLength"), e1Var.f49929k);
            GLES20.glUniform1i(c1Var.d("composite"), 0);
            GLES20.glUniform1i(c1Var.d("clear"), e1Var == this.d ? 1 : 0);
        }
        GLES20.glBlendFunc(1, 771);
        GLES20.glVertexAttribPointer(0, 2, 5126, false, 8, (Buffer) this.f50021m);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.f50022n);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glDrawArrays(5, 0, 4);
        n8.a();
    }

    public final void p(b6.a aVar, boolean z10) {
        ByteBuffer byteBuffer;
        File file;
        n1.d dVar;
        q1 q1Var;
        if (aVar == null) {
            return;
        }
        try {
            byte[] bArr = new byte[1024];
            byte[] bArr2 = new byte[1024];
            FileInputStream fileInputStream = new FileInputStream((File) aVar.d);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Inflater inflater = new Inflater(true);
            while (true) {
                int i10 = fileInputStream.read(bArr);
                if (i10 != -1) {
                    inflater.setInput(bArr, 0, i10);
                }
                while (true) {
                    int iInflate = inflater.inflate(bArr2, 0, 1024);
                    if (iInflate == 0) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr2, 0, iInflate);
                    }
                }
                if (inflater.finished()) {
                    break;
                } else {
                    inflater.needsInput();
                }
            }
            inflater.end();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            fileInputStream.close();
            byteBuffer = byteBufferWrap;
        } catch (Exception e9) {
            FileLog.e(e9);
            byteBuffer = null;
        }
        int iJ = j();
        if (aVar.f2034c == 1 && (q1Var = this.D) != null) {
            iJ = q1Var.c();
        }
        GLES20.glBindTexture(3553, iJ);
        RectF rectF = (RectF) aVar.f2033b;
        GLES20.glTexSubImage2D(3553, 0, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) ((RectF) aVar.f2033b).height(), 6408, 5121, byteBuffer);
        if (this.f50027s <= 0 && (dVar = this.f50011a) != null) {
            dVar.C();
        }
        if (!z10 || (file = (File) aVar.d) == null) {
            return;
        }
        file.delete();
        aVar.d = null;
    }

    public final void q(m mVar) {
        Bitmap bitmap;
        Bitmap bitmapC;
        this.f50017i = mVar;
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
            b1 b1Var = this.f50015f;
            if (b1Var != null && (bitmapC = b1Var.c(false, false)) != null) {
                canvas.scale(width / bitmapC.getWidth(), height / bitmapC.getHeight());
                canvas.drawBitmap(bitmapC, 0.0f, 0.0f, this.M);
                bitmapC.recycle();
            }
            Utilities.stackBlurBitmap(this.C, (int) 8.0f);
            q1 q1Var = this.f50033z;
            if (q1Var != null) {
                q1Var.a(false);
            }
            this.f50033z = new q1(this.C);
        }
    }
}
