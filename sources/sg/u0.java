package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import c8.ic;
import com.google.android.gms.internal.vision.e2;
import fi.p5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.k10;
import org.telegram.messenger.r5;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.yt0;
public class u0 extends TextureView {
    public boolean E;
    public t0 f57366a;
    public k1 f57367b;
    public final i0 f57368c;
    public s0 d;
    public final v f57369e;
    public final g1 f57370f;
    public Bitmap h;
    public Bitmap f57371n;
    public boolean f57372r;
    public boolean f57373s;
    public float f57374w;
    public int f57375x;
    public h f57376y;

    public u0(Context context, i0 i0Var, Bitmap bitmap, Bitmap bitmap2, ca caVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f57371n = bitmap2;
        this.f57368c = i0Var;
        i0Var.f57235f = this;
        setSurfaceTextureListener(new q0(this, caVar));
        this.f57369e = new v(this);
        o0 o0Var = new o0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f57212c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f57213e = paint3;
        Paint paint4 = new Paint(1);
        obj.f57214f = paint4;
        Paint paint5 = new Paint(1);
        obj.f57215g = paint5;
        obj.f57220m = new ArrayList();
        obj.f57221n = new ArrayList();
        obj.f57223p = new float[2];
        obj.f57210a = this;
        obj.f57211b = o0Var;
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
        this.f57370f = obj;
        i0Var.f57231a = new jn(this, 17);
    }

    public final void a() {
        o0 o0Var = new o0(this, 2);
        v vVar = this.f57369e;
        vVar.f57382g = new m0(vVar.f57377a.getPainting().f57236g.f42506a, 0.0d, 1.0d);
        vVar.f57386l = true;
        vVar.a(new Object(), false, o0Var);
    }

    public final void b() {
        u0 u0Var;
        g1 g1Var = this.f57370f;
        if (g1Var != null && (u0Var = g1Var.f57210a) != null && u0Var.getPainting() != null && g1Var.h != null) {
            i0 painting = u0Var.getPainting();
            painting.f57235f.f(new e0(painting, 0));
            g1Var.f57220m.clear();
            g1Var.f57221n.clear();
            g1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f57376y instanceof g) {
            this.f57370f.e();
        }
        s0 s0Var = this.d;
        if (s0Var != null && s0Var.f57351f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                s0Var.postRunnable(new p5(s0Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f57376y instanceof g) {
            g1 g1Var = this.f57370f;
            Paint paint = g1Var.f57212c;
            ArrayList arrayList = g1Var.f57220m;
            u0 u0Var = g1Var.f57210a;
            if (u0Var != null && u0Var.getPainting() != null) {
                yt0 yt0Var = u0Var.getPainting().f57236g;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    f1 f1Var = (f1) arrayList.get(i7);
                    if (f1Var.f57204c && !f1Var.f57203b) {
                        g1Var.b(canvas, yt0Var, f1Var);
                    }
                }
                x0 x0Var2 = g1Var.h;
                if (x0Var2 != null && x0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-x0Var.h) / 3.141592653589793d) * 180.0d), (g1Var.h.f57408b / yt0Var.f42506a) * canvas.getWidth(), (g1Var.h.f57409c / yt0Var.f42507b) * canvas.getHeight());
                }
                x0 x0Var3 = g1Var.h;
                if (x0Var3 != null && x0Var3.f57407a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (g1Var.h.f57408b / yt0Var.f42506a), canvas.getHeight() * (g1Var.h.f57409c / yt0Var.f42507b), canvas.getWidth() * (g1Var.h.f57413i / yt0Var.f42506a), canvas.getHeight() * (g1Var.h.f57414j / yt0Var.f42507b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (g1Var.h.d / yt0Var.f42506a), canvas2.getHeight() * (g1Var.h.f57410e / yt0Var.f42507b), canvas2.getWidth() * (g1Var.h.f57413i / yt0Var.f42506a), canvas2.getHeight() * (g1Var.h.f57414j / yt0Var.f42507b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    f1 f1Var2 = (f1) arrayList.get(i10);
                    if (f1Var2.f57204c && f1Var2.f57203b) {
                        g1Var.b(canvas2, yt0Var, f1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: sg.u0.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        s0 s0Var = this.d;
        if (s0Var == null) {
            return;
        }
        s0Var.postRunnable(new p4.o0(9, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f57376y;
    }

    public int getCurrentColor() {
        return this.f57375x;
    }

    public float getCurrentWeight() {
        return this.f57374w;
    }

    public i0 getPainting() {
        return this.f57368c;
    }

    public k1 getUndoStore() {
        return this.f57367b;
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
        i0 i0Var = this.f57368c;
        if (i0Var != null) {
            f10 = getWidth() / i0Var.f57236g.f42506a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        yt0 yt0Var = getPainting().f57236g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-yt0Var.f42506a) / 2.0f, (-yt0Var.f42507b) / 2.0f);
        if (this.f57376y instanceof g) {
            g1 g1Var = this.f57370f;
            g1Var.getClass();
            Matrix matrix2 = new Matrix();
            g1Var.f57222o = matrix2;
            matrix.invert(matrix2);
        } else {
            v vVar = this.f57369e;
            vVar.getClass();
            Matrix matrix3 = new Matrix();
            vVar.f57394t = matrix3;
            matrix.invert(matrix3);
        }
        s0 s0Var = this.d;
        i0Var.f57252y = ic.c(ic.b(s0Var.f57352n, s0Var.f57353r), ic.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.f57376y instanceof g;
        g1 g1Var = this.f57370f;
        if (z10) {
            g1Var.e();
        }
        this.f57376y = hVar;
        i();
        this.f57368c.q(this.f57376y);
        h hVar2 = this.f57376y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = g1Var.f57221n;
            ArrayList arrayList2 = g1Var.f57220m;
            u0 u0Var = g1Var.f57210a;
            if (u0Var != null && u0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                g1Var.h = new x0(g.p(o4));
                yt0 yt0Var = u0Var.getPainting().f57236g;
                x0 x0Var = g1Var.h;
                float f10 = yt0Var.f42506a;
                x0Var.f57408b = f10 / 2.0f;
                float f11 = yt0Var.f42507b;
                x0Var.f57409c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                x0Var.f57410e = min;
                x0Var.d = min;
                g1Var.h.f57411f = u0Var.getCurrentWeight();
                g1Var.h.f57412g = org.telegram.messenger.g0.L(32.0f);
                g1Var.h.f57416l = k0.e(k10.f24932t0).f57279k;
                if (g1Var.h.f57407a.o() == 4) {
                    x0 x0Var2 = g1Var.h;
                    float f12 = yt0Var.f42506a / 2.0f;
                    x0Var2.d = f12;
                    x0Var2.f57408b = f12;
                    x0Var2.f57413i = f12 + 1.0f;
                    float f13 = yt0Var.f42507b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    x0Var2.f57409c = f15;
                    float f16 = f13 / 2.0f;
                    x0Var2.f57414j = f16;
                    x0Var2.f57410e = f14 * 2.0f;
                    x0Var2.f57415k = Math.abs(f15 - f16);
                    c1 c1Var = new c1(g1Var, 0);
                    arrayList2.add(c1Var);
                    d1 d1Var = new d1(g1Var, c1Var, 0);
                    arrayList2.add(d1Var);
                    arrayList.add(d1Var);
                    d1 d1Var2 = new d1(g1Var, c1Var, 1);
                    arrayList2.add(d1Var2);
                    arrayList.add(d1Var2);
                }
                if (g1Var.h.f57407a.o() == 0) {
                    arrayList2.add(new c1(g1Var, 1));
                }
                if (g1Var.h.f57407a.o() == 2) {
                    arrayList2.add(new c1(g1Var, 2));
                }
                if (g1Var.h.f57407a.o() == 1 || g1Var.h.f57407a.o() == 3) {
                    arrayList2.add(new e1(g1Var, g1Var.h, false, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, false, true));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, true));
                    arrayList2.add(new c1(g1Var, 3, false));
                }
                if (g1Var.h.f57407a.o() == 3) {
                    x0 x0Var3 = g1Var.h;
                    x0Var3.f57413i = (x0Var3.d * 0.8f) + x0Var3.f57408b;
                    x0Var3.f57414j = (x0Var3.f57410e * 1.2f) + x0Var3.f57409c + x0Var3.f57411f;
                    c1 c1Var2 = new c1(g1Var, 4);
                    arrayList2.add(c1Var2);
                    c1Var2.f57203b = false;
                    arrayList.add(c1Var2);
                }
                g1Var.f57219l = new c1(g1Var, 5, false);
                if (g1Var.h.f57407a.o() != 4) {
                    g1Var.f57219l.f57204c = false;
                }
                c1 c1Var3 = g1Var.f57219l;
                c1Var3.f57203b = false;
                arrayList.add(c1Var3);
                arrayList2.add(g1Var.f57219l);
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f57368c.f57236g.f42506a;
        this.f57374w = e2.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f57376y instanceof g) {
            g1 g1Var = this.f57370f;
            u0 u0Var = g1Var.f57210a;
            x0 x0Var = g1Var.h;
            if (x0Var != null && x0Var.f57411f != u0Var.getCurrentWeight()) {
                g1Var.h.f57411f = u0Var.getCurrentWeight();
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setColor(int i7) {
        this.f57375x = i7;
        if (this.f57376y instanceof g) {
            g1 g1Var = this.f57370f;
            if (g1Var.h != null) {
                g1Var.f57210a.getPainting().k(g1Var.h);
            }
        }
    }

    public void setDelegate(t0 t0Var) {
        this.f57366a = t0Var;
    }

    public void setUndoStore(k1 k1Var) {
        this.f57367b = k1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(r5 r5Var) {
    }
}
