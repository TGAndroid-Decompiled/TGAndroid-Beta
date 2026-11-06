package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import c8.cc;
import di.z5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.q5;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.y9;
public class w0 extends TextureView {
    public boolean D;
    public v0 f55132a;
    public m1 f55133b;
    public final j0 f55134c;
    public u0 d;
    public final w f55135e;
    public final i1 f55136f;
    public Bitmap h;
    public Bitmap f55137n;
    public boolean f55138r;
    public boolean f55139s;
    public float f55140w;
    public int f55141x;
    public h f55142y;

    public w0(Context context, j0 j0Var, Bitmap bitmap, Bitmap bitmap2, y9 y9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f55137n = bitmap2;
        this.f55134c = j0Var;
        j0Var.f54973f = this;
        setSurfaceTextureListener(new r0(this, y9Var));
        this.f55135e = new w(this);
        p0 p0Var = new p0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f54955c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f54956e = paint3;
        Paint paint4 = new Paint(1);
        obj.f54957f = paint4;
        Paint paint5 = new Paint(1);
        obj.f54958g = paint5;
        obj.f54963m = new ArrayList();
        obj.f54964n = new ArrayList();
        obj.f54966p = new float[2];
        obj.f54953a = this;
        obj.f54954b = p0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f55136f = obj;
        j0Var.f54969a = new uy(this, 17);
    }

    public final void a() {
        p0 p0Var = new p0(this, 2);
        w wVar = this.f55135e;
        wVar.f55114g = new n0(wVar.f55109a.getPainting().f54974g.f36132a, 0.0d, 1.0d);
        wVar.f55118l = true;
        wVar.a(new Object(), false, p0Var);
    }

    public final void b() {
        w0 w0Var;
        i1 i1Var = this.f55136f;
        if (i1Var != null && (w0Var = i1Var.f54953a) != null && w0Var.getPainting() != null && i1Var.h != null) {
            j0 painting = w0Var.getPainting();
            painting.f54973f.f(new f0(painting, 0));
            i1Var.f54963m.clear();
            i1Var.f54964n.clear();
            i1Var.h = null;
        }
    }

    public final Bitmap c(boolean z9, boolean z10) {
        if (this.f55142y instanceof g) {
            this.f55136f.e();
        }
        u0 u0Var = this.d;
        if (u0Var != null && u0Var.f55097f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                u0Var.postRunnable(new z5(u0Var, z9, z10, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        z0 z0Var;
        if (this.f55142y instanceof g) {
            i1 i1Var = this.f55136f;
            Paint paint = i1Var.f54955c;
            ArrayList arrayList = i1Var.f54963m;
            w0 w0Var = i1Var.f54953a;
            if (w0Var != null && w0Var.getPainting() != null) {
                mt0 mt0Var = w0Var.getPainting().f54974g;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    h1 h1Var = (h1) arrayList.get(i7);
                    if (h1Var.f54948c && !h1Var.f54947b) {
                        i1Var.b(canvas, mt0Var, h1Var);
                    }
                }
                z0 z0Var2 = i1Var.h;
                if (z0Var2 != null && z0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-z0Var.h) / 3.141592653589793d) * 180.0d), (i1Var.h.f55151b / mt0Var.f36132a) * canvas.getWidth(), (i1Var.h.f55152c / mt0Var.f36133b) * canvas.getHeight());
                }
                z0 z0Var3 = i1Var.h;
                if (z0Var3 != null && z0Var3.f55150a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (i1Var.h.f55151b / mt0Var.f36132a), canvas.getHeight() * (i1Var.h.f55152c / mt0Var.f36133b), canvas.getWidth() * (i1Var.h.f55156i / mt0Var.f36132a), canvas.getHeight() * (i1Var.h.f55157j / mt0Var.f36133b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (i1Var.h.d / mt0Var.f36132a), canvas2.getHeight() * (i1Var.h.f55153e / mt0Var.f36133b), canvas2.getWidth() * (i1Var.h.f55156i / mt0Var.f36132a), canvas2.getHeight() * (i1Var.h.f55157j / mt0Var.f36133b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    h1 h1Var2 = (h1) arrayList.get(i10);
                    if (h1Var2.f54948c && h1Var2.f54947b) {
                        i1Var.b(canvas2, mt0Var, h1Var2);
                    }
                }
                z0 z0Var4 = i1Var.h;
                if (z0Var4 != null && z0Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: sg.w0.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        u0 u0Var = this.d;
        if (u0Var == null) {
            return;
        }
        u0Var.postRunnable(new org.telegram.ui.web.w(24, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f55142y;
    }

    public int getCurrentColor() {
        return this.f55141x;
    }

    public float getCurrentWeight() {
        return this.f55140w;
    }

    public j0 getPainting() {
        return this.f55134c;
    }

    public m1 getUndoStore() {
        return this.f55133b;
    }

    public final void h() {
        this.D = true;
        if (this.d != null) {
            f(new p0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f10;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f11 = 1.0f;
        j0 j0Var = this.f55134c;
        if (j0Var != null) {
            f10 = getWidth() / j0Var.f54974g.f36132a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        mt0 mt0Var = getPainting().f54974g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-mt0Var.f36132a) / 2.0f, (-mt0Var.f36133b) / 2.0f);
        if (this.f55142y instanceof g) {
            i1 i1Var = this.f55136f;
            i1Var.getClass();
            Matrix matrix2 = new Matrix();
            i1Var.f54965o = matrix2;
            matrix.invert(matrix2);
        } else {
            w wVar = this.f55135e;
            wVar.getClass();
            Matrix matrix3 = new Matrix();
            wVar.f55126t = matrix3;
            matrix.invert(matrix3);
        }
        u0 u0Var = this.d;
        j0Var.f54990y = cc.c(cc.b(u0Var.f55098n, u0Var.f55099r), cc.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z9 = this.f55142y instanceof g;
        i1 i1Var = this.f55136f;
        if (z9) {
            i1Var.e();
        }
        this.f55142y = hVar;
        i();
        this.f55134c.q(this.f55142y);
        h hVar2 = this.f55142y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = i1Var.f54964n;
            ArrayList arrayList2 = i1Var.f54963m;
            w0 w0Var = i1Var.f54953a;
            if (w0Var != null && w0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                i1Var.h = new z0(g.p(o4));
                mt0 mt0Var = w0Var.getPainting().f54974g;
                z0 z0Var = i1Var.h;
                float f10 = mt0Var.f36132a;
                z0Var.f55151b = f10 / 2.0f;
                float f11 = mt0Var.f36133b;
                z0Var.f55152c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                z0Var.f55153e = min;
                z0Var.d = min;
                i1Var.h.f55154f = w0Var.getCurrentWeight();
                i1Var.h.f55155g = org.telegram.messenger.g0.L(32.0f);
                i1Var.h.f55159l = l0.e(p10.f24459s0).f55018k;
                if (i1Var.h.f55150a.o() == 4) {
                    z0 z0Var2 = i1Var.h;
                    float f12 = mt0Var.f36132a / 2.0f;
                    z0Var2.d = f12;
                    z0Var2.f55151b = f12;
                    z0Var2.f55156i = f12 + 1.0f;
                    float f13 = mt0Var.f36133b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    z0Var2.f55152c = f15;
                    float f16 = f13 / 2.0f;
                    z0Var2.f55157j = f16;
                    z0Var2.f55153e = f14 * 2.0f;
                    z0Var2.f55158k = Math.abs(f15 - f16);
                    e1 e1Var = new e1(i1Var, 0);
                    arrayList2.add(e1Var);
                    f1 f1Var = new f1(i1Var, e1Var, 0);
                    arrayList2.add(f1Var);
                    arrayList.add(f1Var);
                    f1 f1Var2 = new f1(i1Var, e1Var, 1);
                    arrayList2.add(f1Var2);
                    arrayList.add(f1Var2);
                }
                if (i1Var.h.f55150a.o() == 0) {
                    arrayList2.add(new e1(i1Var, 1));
                }
                if (i1Var.h.f55150a.o() == 2) {
                    arrayList2.add(new e1(i1Var, 2));
                }
                if (i1Var.h.f55150a.o() == 1 || i1Var.h.f55150a.o() == 3) {
                    arrayList2.add(new g1(i1Var, i1Var.h, false, false));
                    arrayList2.add(new g1(i1Var, i1Var.h, true, false));
                    arrayList2.add(new g1(i1Var, i1Var.h, false, true));
                    arrayList2.add(new g1(i1Var, i1Var.h, true, true));
                    arrayList2.add(new e1(i1Var, 3, false));
                }
                if (i1Var.h.f55150a.o() == 3) {
                    z0 z0Var3 = i1Var.h;
                    z0Var3.f55156i = (z0Var3.d * 0.8f) + z0Var3.f55151b;
                    z0Var3.f55157j = (z0Var3.f55153e * 1.2f) + z0Var3.f55152c + z0Var3.f55154f;
                    e1 e1Var2 = new e1(i1Var, 4);
                    arrayList2.add(e1Var2);
                    e1Var2.f54947b = false;
                    arrayList.add(e1Var2);
                }
                i1Var.f54962l = new e1(i1Var, 5, false);
                if (i1Var.h.f55150a.o() != 4) {
                    i1Var.f54962l.f54948c = false;
                }
                e1 e1Var3 = i1Var.f54962l;
                e1Var3.f54947b = false;
                arrayList.add(e1Var3);
                arrayList2.add(i1Var.f54962l);
                w0Var.getPainting().k(i1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f55134c.f54974g.f36132a;
        this.f55140w = com.google.android.recaptcha.internal.a.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f55142y instanceof g) {
            i1 i1Var = this.f55136f;
            w0 w0Var = i1Var.f54953a;
            z0 z0Var = i1Var.h;
            if (z0Var != null && z0Var.f55154f != w0Var.getCurrentWeight()) {
                i1Var.h.f55154f = w0Var.getCurrentWeight();
                w0Var.getPainting().k(i1Var.h);
            }
        }
    }

    public void setColor(int i7) {
        this.f55141x = i7;
        if (this.f55142y instanceof g) {
            i1 i1Var = this.f55136f;
            if (i1Var.h != null) {
                i1Var.f54953a.getPainting().k(i1Var.h);
            }
        }
    }

    public void setDelegate(v0 v0Var) {
        this.f55132a = v0Var;
    }

    public void setUndoStore(m1 m1Var) {
        this.f55133b = m1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(q5 q5Var) {
    }
}
