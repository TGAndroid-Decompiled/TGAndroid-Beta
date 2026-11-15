package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import c8.ec;
import com.google.android.gms.internal.vision.e2;
import fi.r5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.ou;
import org.telegram.messenger.q5;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.u9;
public class u0 extends TextureView {
    public boolean E;
    public t0 f56782a;
    public k1 f56783b;
    public final i0 f56784c;
    public s0 d;
    public final v f56785e;
    public final g1 f56786f;
    public Bitmap h;
    public Bitmap f56787n;
    public boolean f56788r;
    public boolean f56789s;
    public float f56790w;
    public int f56791x;
    public h f56792y;

    public u0(Context context, i0 i0Var, Bitmap bitmap, Bitmap bitmap2, u9 u9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f56787n = bitmap2;
        this.f56784c = i0Var;
        i0Var.f56651f = this;
        setSurfaceTextureListener(new q0(this, u9Var));
        this.f56785e = new v(this);
        o0 o0Var = new o0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f56628c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f56629e = paint3;
        Paint paint4 = new Paint(1);
        obj.f56630f = paint4;
        Paint paint5 = new Paint(1);
        obj.f56631g = paint5;
        obj.f56636m = new ArrayList();
        obj.f56637n = new ArrayList();
        obj.f56639p = new float[2];
        obj.f56626a = this;
        obj.f56627b = o0Var;
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
        this.f56786f = obj;
        i0Var.f56647a = new ou(this, 24);
    }

    public final void a() {
        o0 o0Var = new o0(this, 2);
        v vVar = this.f56785e;
        vVar.f56798g = new m0(vVar.f56793a.getPainting().f56652g.f37702a, 0.0d, 1.0d);
        vVar.f56802l = true;
        vVar.a(new Object(), false, o0Var);
    }

    public final void b() {
        u0 u0Var;
        g1 g1Var = this.f56786f;
        if (g1Var != null && (u0Var = g1Var.f56626a) != null && u0Var.getPainting() != null && g1Var.h != null) {
            i0 painting = u0Var.getPainting();
            painting.f56651f.f(new e0(painting, 0));
            g1Var.f56636m.clear();
            g1Var.f56637n.clear();
            g1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f56792y instanceof g) {
            this.f56786f.e();
        }
        s0 s0Var = this.d;
        if (s0Var != null && s0Var.f56767f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                s0Var.postRunnable(new r5(s0Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f56792y instanceof g) {
            g1 g1Var = this.f56786f;
            Paint paint = g1Var.f56628c;
            ArrayList arrayList = g1Var.f56636m;
            u0 u0Var = g1Var.f56626a;
            if (u0Var != null && u0Var.getPainting() != null) {
                nt0 nt0Var = u0Var.getPainting().f56652g;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    f1 f1Var = (f1) arrayList.get(i7);
                    if (f1Var.f56620c && !f1Var.f56619b) {
                        g1Var.b(canvas, nt0Var, f1Var);
                    }
                }
                x0 x0Var2 = g1Var.h;
                if (x0Var2 != null && x0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-x0Var.h) / 3.141592653589793d) * 180.0d), (g1Var.h.f56824b / nt0Var.f37702a) * canvas.getWidth(), (g1Var.h.f56825c / nt0Var.f37703b) * canvas.getHeight());
                }
                x0 x0Var3 = g1Var.h;
                if (x0Var3 != null && x0Var3.f56823a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (g1Var.h.f56824b / nt0Var.f37702a), canvas.getHeight() * (g1Var.h.f56825c / nt0Var.f37703b), canvas.getWidth() * (g1Var.h.f56829i / nt0Var.f37702a), canvas.getHeight() * (g1Var.h.f56830j / nt0Var.f37703b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (g1Var.h.d / nt0Var.f37702a), canvas2.getHeight() * (g1Var.h.f56826e / nt0Var.f37703b), canvas2.getWidth() * (g1Var.h.f56829i / nt0Var.f37702a), canvas2.getHeight() * (g1Var.h.f56830j / nt0Var.f37703b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    f1 f1Var2 = (f1) arrayList.get(i10);
                    if (f1Var2.f56620c && f1Var2.f56619b) {
                        g1Var.b(canvas2, nt0Var, f1Var2);
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
        s0Var.postRunnable(new org.telegram.ui.web.e1(17, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f56792y;
    }

    public int getCurrentColor() {
        return this.f56791x;
    }

    public float getCurrentWeight() {
        return this.f56790w;
    }

    public i0 getPainting() {
        return this.f56784c;
    }

    public k1 getUndoStore() {
        return this.f56783b;
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
        i0 i0Var = this.f56784c;
        if (i0Var != null) {
            f10 = getWidth() / i0Var.f56652g.f37702a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        nt0 nt0Var = getPainting().f56652g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-nt0Var.f37702a) / 2.0f, (-nt0Var.f37703b) / 2.0f);
        if (this.f56792y instanceof g) {
            g1 g1Var = this.f56786f;
            g1Var.getClass();
            Matrix matrix2 = new Matrix();
            g1Var.f56638o = matrix2;
            matrix.invert(matrix2);
        } else {
            v vVar = this.f56785e;
            vVar.getClass();
            Matrix matrix3 = new Matrix();
            vVar.f56810t = matrix3;
            matrix.invert(matrix3);
        }
        s0 s0Var = this.d;
        i0Var.f56668y = ec.c(ec.b(s0Var.f56768n, s0Var.f56769r), ec.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.f56792y instanceof g;
        g1 g1Var = this.f56786f;
        if (z10) {
            g1Var.e();
        }
        this.f56792y = hVar;
        i();
        this.f56784c.q(this.f56792y);
        h hVar2 = this.f56792y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = g1Var.f56637n;
            ArrayList arrayList2 = g1Var.f56636m;
            u0 u0Var = g1Var.f56626a;
            if (u0Var != null && u0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                g1Var.h = new x0(g.p(o4));
                nt0 nt0Var = u0Var.getPainting().f56652g;
                x0 x0Var = g1Var.h;
                float f10 = nt0Var.f37702a;
                x0Var.f56824b = f10 / 2.0f;
                float f11 = nt0Var.f37703b;
                x0Var.f56825c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                x0Var.f56826e = min;
                x0Var.d = min;
                g1Var.h.f56827f = u0Var.getCurrentWeight();
                g1Var.h.f56828g = org.telegram.messenger.g0.L(32.0f);
                g1Var.h.f56832l = k0.e(m10.f24940t0).f56695k;
                if (g1Var.h.f56823a.o() == 4) {
                    x0 x0Var2 = g1Var.h;
                    float f12 = nt0Var.f37702a / 2.0f;
                    x0Var2.d = f12;
                    x0Var2.f56824b = f12;
                    x0Var2.f56829i = f12 + 1.0f;
                    float f13 = nt0Var.f37703b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    x0Var2.f56825c = f15;
                    float f16 = f13 / 2.0f;
                    x0Var2.f56830j = f16;
                    x0Var2.f56826e = f14 * 2.0f;
                    x0Var2.f56831k = Math.abs(f15 - f16);
                    c1 c1Var = new c1(g1Var, 0);
                    arrayList2.add(c1Var);
                    d1 d1Var = new d1(g1Var, c1Var, 0);
                    arrayList2.add(d1Var);
                    arrayList.add(d1Var);
                    d1 d1Var2 = new d1(g1Var, c1Var, 1);
                    arrayList2.add(d1Var2);
                    arrayList.add(d1Var2);
                }
                if (g1Var.h.f56823a.o() == 0) {
                    arrayList2.add(new c1(g1Var, 1));
                }
                if (g1Var.h.f56823a.o() == 2) {
                    arrayList2.add(new c1(g1Var, 2));
                }
                if (g1Var.h.f56823a.o() == 1 || g1Var.h.f56823a.o() == 3) {
                    arrayList2.add(new e1(g1Var, g1Var.h, false, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, false, true));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, true));
                    arrayList2.add(new c1(g1Var, 3, false));
                }
                if (g1Var.h.f56823a.o() == 3) {
                    x0 x0Var3 = g1Var.h;
                    x0Var3.f56829i = (x0Var3.d * 0.8f) + x0Var3.f56824b;
                    x0Var3.f56830j = (x0Var3.f56826e * 1.2f) + x0Var3.f56825c + x0Var3.f56827f;
                    c1 c1Var2 = new c1(g1Var, 4);
                    arrayList2.add(c1Var2);
                    c1Var2.f56619b = false;
                    arrayList.add(c1Var2);
                }
                g1Var.f56635l = new c1(g1Var, 5, false);
                if (g1Var.h.f56823a.o() != 4) {
                    g1Var.f56635l.f56620c = false;
                }
                c1 c1Var3 = g1Var.f56635l;
                c1Var3.f56619b = false;
                arrayList.add(c1Var3);
                arrayList2.add(g1Var.f56635l);
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f56784c.f56652g.f37702a;
        this.f56790w = e2.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f56792y instanceof g) {
            g1 g1Var = this.f56786f;
            u0 u0Var = g1Var.f56626a;
            x0 x0Var = g1Var.h;
            if (x0Var != null && x0Var.f56827f != u0Var.getCurrentWeight()) {
                g1Var.h.f56827f = u0Var.getCurrentWeight();
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setColor(int i7) {
        this.f56791x = i7;
        if (this.f56792y instanceof g) {
            g1 g1Var = this.f56786f;
            if (g1Var.h != null) {
                g1Var.f56626a.getPainting().k(g1Var.h);
            }
        }
    }

    public void setDelegate(t0 t0Var) {
        this.f56782a = t0Var;
    }

    public void setUndoStore(k1 k1Var) {
        this.f56783b = k1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(q5 q5Var) {
    }
}
