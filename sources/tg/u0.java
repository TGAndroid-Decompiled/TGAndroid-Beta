package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import ei.a6;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.q5;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.x9;
import org.telegram.ui.hc1;
public class u0 extends TextureView {
    public boolean E;
    public t0 f55321a;
    public k1 f55322b;
    public final i0 f55323c;
    public s0 d;
    public final w f55324e;
    public final g1 f55325f;
    public Bitmap h;
    public Bitmap f55326n;
    public boolean f55327r;
    public boolean f55328s;
    public float f55329w;
    public int f55330x;
    public h f55331y;

    public u0(Context context, i0 i0Var, Bitmap bitmap, Bitmap bitmap2, x9 x9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f55326n = bitmap2;
        this.f55323c = i0Var;
        i0Var.f55193f = this;
        setSurfaceTextureListener(new q0(this, x9Var));
        this.f55324e = new w(this);
        o0 o0Var = new o0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f55171c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f55172e = paint3;
        Paint paint4 = new Paint(1);
        obj.f55173f = paint4;
        Paint paint5 = new Paint(1);
        obj.f55174g = paint5;
        obj.f55179m = new ArrayList();
        obj.f55180n = new ArrayList();
        obj.f55182p = new float[2];
        obj.f55169a = this;
        obj.f55170b = o0Var;
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
        this.f55325f = obj;
        i0Var.f55189a = new nh(this, 20);
    }

    public final void a() {
        o0 o0Var = new o0(this, 2);
        w wVar = this.f55324e;
        wVar.f55344g = new m0(wVar.f55339a.getPainting().f55194g.f35877a, 0.0d, 1.0d);
        wVar.f55348l = true;
        wVar.a(new Object(), false, o0Var);
    }

    public final void b() {
        u0 u0Var;
        g1 g1Var = this.f55325f;
        if (g1Var != null && (u0Var = g1Var.f55169a) != null && u0Var.getPainting() != null && g1Var.h != null) {
            i0 painting = u0Var.getPainting();
            painting.f55193f.f(new f0(painting, 0));
            g1Var.f55179m.clear();
            g1Var.f55180n.clear();
            g1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f55331y instanceof g) {
            this.f55325f.e();
        }
        s0 s0Var = this.d;
        if (s0Var != null && s0Var.f55308f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                s0Var.postRunnable(new a6(s0Var, z10, z11, bitmapArr, countDownLatch));
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
        x0 x0Var;
        if (this.f55331y instanceof g) {
            g1 g1Var = this.f55325f;
            Paint paint = g1Var.f55171c;
            ArrayList arrayList = g1Var.f55179m;
            u0 u0Var = g1Var.f55169a;
            if (u0Var != null && u0Var.getPainting() != null) {
                lt0 lt0Var = u0Var.getPainting().f55194g;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    f1 f1Var = (f1) arrayList.get(i3);
                    if (f1Var.f55162c && !f1Var.f55161b) {
                        g1Var.b(canvas, lt0Var, f1Var);
                    }
                }
                x0 x0Var2 = g1Var.h;
                if (x0Var2 != null && x0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-x0Var.h) / 3.141592653589793d) * 180.0d), (g1Var.h.f55365b / lt0Var.f35877a) * canvas.getWidth(), (g1Var.h.f55366c / lt0Var.f35878b) * canvas.getHeight());
                }
                x0 x0Var3 = g1Var.h;
                if (x0Var3 != null && x0Var3.f55364a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (g1Var.h.f55365b / lt0Var.f35877a), canvas.getHeight() * (g1Var.h.f55366c / lt0Var.f35878b), canvas.getWidth() * (g1Var.h.f55370i / lt0Var.f35877a), canvas.getHeight() * (g1Var.h.f55371j / lt0Var.f35878b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (g1Var.h.d / lt0Var.f35877a), canvas2.getHeight() * (g1Var.h.f55367e / lt0Var.f35878b), canvas2.getWidth() * (g1Var.h.f55370i / lt0Var.f35877a), canvas2.getHeight() * (g1Var.h.f55371j / lt0Var.f35878b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    f1 f1Var2 = (f1) arrayList.get(i10);
                    if (f1Var2.f55162c && f1Var2.f55161b) {
                        g1Var.b(canvas2, lt0Var, f1Var2);
                    }
                }
                x0 x0Var4 = g1Var.h;
                if (x0Var4 != null && x0Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: tg.u0.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        s0 s0Var = this.d;
        if (s0Var == null) {
            return;
        }
        s0Var.postRunnable(new hc1(29, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f55331y;
    }

    public int getCurrentColor() {
        return this.f55330x;
    }

    public float getCurrentWeight() {
        return this.f55329w;
    }

    public i0 getPainting() {
        return this.f55323c;
    }

    public k1 getUndoStore() {
        return this.f55322b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new o0(this, 1));
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
        i0 i0Var = this.f55323c;
        if (i0Var != null) {
            f10 = getWidth() / i0Var.f55194g.f35877a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        lt0 lt0Var = getPainting().f55194g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-lt0Var.f35877a) / 2.0f, (-lt0Var.f35878b) / 2.0f);
        if (this.f55331y instanceof g) {
            g1 g1Var = this.f55325f;
            g1Var.getClass();
            Matrix matrix2 = new Matrix();
            g1Var.f55181o = matrix2;
            matrix.invert(matrix2);
        } else {
            w wVar = this.f55324e;
            wVar.getClass();
            Matrix matrix3 = new Matrix();
            wVar.f55356t = matrix3;
            matrix.invert(matrix3);
        }
        s0 s0Var = this.d;
        i0Var.f55210y = x7.c0.c(x7.c0.b(s0Var.f55309n, s0Var.f55310r), x7.c0.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.f55331y instanceof g;
        g1 g1Var = this.f55325f;
        if (z10) {
            g1Var.e();
        }
        this.f55331y = hVar;
        i();
        this.f55323c.q(this.f55331y);
        h hVar2 = this.f55331y;
        if (hVar2 instanceof g) {
            int o10 = ((g) hVar2).o();
            ArrayList arrayList = g1Var.f55180n;
            ArrayList arrayList2 = g1Var.f55179m;
            u0 u0Var = g1Var.f55169a;
            if (u0Var != null && u0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                g1Var.h = new x0(g.p(o10));
                lt0 lt0Var = u0Var.getPainting().f55194g;
                x0 x0Var = g1Var.h;
                float f10 = lt0Var.f35877a;
                x0Var.f55365b = f10 / 2.0f;
                float f11 = lt0Var.f35878b;
                x0Var.f55366c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                x0Var.f55367e = min;
                x0Var.d = min;
                g1Var.h.f55368f = u0Var.getCurrentWeight();
                g1Var.h.f55369g = org.telegram.messenger.g0.L(32.0f);
                g1Var.h.f55373l = k0.e(h10.f22829t0).f55237k;
                if (g1Var.h.f55364a.o() == 4) {
                    x0 x0Var2 = g1Var.h;
                    float f12 = lt0Var.f35877a / 2.0f;
                    x0Var2.d = f12;
                    x0Var2.f55365b = f12;
                    x0Var2.f55370i = f12 + 1.0f;
                    float f13 = lt0Var.f35878b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    x0Var2.f55366c = f15;
                    float f16 = f13 / 2.0f;
                    x0Var2.f55371j = f16;
                    x0Var2.f55367e = f14 * 2.0f;
                    x0Var2.f55372k = Math.abs(f15 - f16);
                    c1 c1Var = new c1(g1Var, 0);
                    arrayList2.add(c1Var);
                    d1 d1Var = new d1(g1Var, c1Var, 0);
                    arrayList2.add(d1Var);
                    arrayList.add(d1Var);
                    d1 d1Var2 = new d1(g1Var, c1Var, 1);
                    arrayList2.add(d1Var2);
                    arrayList.add(d1Var2);
                }
                if (g1Var.h.f55364a.o() == 0) {
                    arrayList2.add(new c1(g1Var, 1));
                }
                if (g1Var.h.f55364a.o() == 2) {
                    arrayList2.add(new c1(g1Var, 2));
                }
                if (g1Var.h.f55364a.o() == 1 || g1Var.h.f55364a.o() == 3) {
                    arrayList2.add(new e1(g1Var, g1Var.h, false, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, false, true));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, true));
                    arrayList2.add(new c1(g1Var, 3, false));
                }
                if (g1Var.h.f55364a.o() == 3) {
                    x0 x0Var3 = g1Var.h;
                    x0Var3.f55370i = (x0Var3.d * 0.8f) + x0Var3.f55365b;
                    x0Var3.f55371j = (x0Var3.f55367e * 1.2f) + x0Var3.f55366c + x0Var3.f55368f;
                    c1 c1Var2 = new c1(g1Var, 4);
                    arrayList2.add(c1Var2);
                    c1Var2.f55161b = false;
                    arrayList.add(c1Var2);
                }
                g1Var.f55178l = new c1(g1Var, 5, false);
                if (g1Var.h.f55364a.o() != 4) {
                    g1Var.f55178l.f55162c = false;
                }
                c1 c1Var3 = g1Var.f55178l;
                c1Var3.f55161b = false;
                arrayList.add(c1Var3);
                arrayList2.add(g1Var.f55178l);
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f55323c.f55194g.f35877a;
        this.f55329w = com.google.android.recaptcha.internal.a.v(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f55331y instanceof g) {
            g1 g1Var = this.f55325f;
            u0 u0Var = g1Var.f55169a;
            x0 x0Var = g1Var.h;
            if (x0Var != null && x0Var.f55368f != u0Var.getCurrentWeight()) {
                g1Var.h.f55368f = u0Var.getCurrentWeight();
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setColor(int i3) {
        this.f55330x = i3;
        if (this.f55331y instanceof g) {
            g1 g1Var = this.f55325f;
            if (g1Var.h != null) {
                g1Var.f55169a.getPainting().k(g1Var.h);
            }
        }
    }

    public void setDelegate(t0 t0Var) {
        this.f55321a = t0Var;
    }

    public void setUndoStore(k1 k1Var) {
        this.f55322b = k1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(q5 q5Var) {
    }
}
