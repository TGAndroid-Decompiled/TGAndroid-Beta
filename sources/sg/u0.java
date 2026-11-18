package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import c8.hc;
import com.google.android.gms.internal.vision.e2;
import fi.p5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.r5;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.vt0;
public class u0 extends TextureView {
    public boolean E;
    public t0 f57356a;
    public k1 f57357b;
    public final i0 f57358c;
    public s0 d;
    public final v f57359e;
    public final g1 f57360f;
    public Bitmap h;
    public Bitmap f57361n;
    public boolean f57362r;
    public boolean f57363s;
    public float f57364w;
    public int f57365x;
    public h f57366y;

    public u0(Context context, i0 i0Var, Bitmap bitmap, Bitmap bitmap2, ca caVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f57361n = bitmap2;
        this.f57358c = i0Var;
        i0Var.f57225f = this;
        setSurfaceTextureListener(new q0(this, caVar));
        this.f57359e = new v(this);
        o0 o0Var = new o0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f57202c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f57203e = paint3;
        Paint paint4 = new Paint(1);
        obj.f57204f = paint4;
        Paint paint5 = new Paint(1);
        obj.f57205g = paint5;
        obj.f57210m = new ArrayList();
        obj.f57211n = new ArrayList();
        obj.f57213p = new float[2];
        obj.f57200a = this;
        obj.f57201b = o0Var;
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
        this.f57360f = obj;
        i0Var.f57221a = new hn(this, 17);
    }

    public final void a() {
        o0 o0Var = new o0(this, 2);
        v vVar = this.f57359e;
        vVar.f57372g = new m0(vVar.f57367a.getPainting().f57226g.f41433a, 0.0d, 1.0d);
        vVar.f57376l = true;
        vVar.a(new Object(), false, o0Var);
    }

    public final void b() {
        u0 u0Var;
        g1 g1Var = this.f57360f;
        if (g1Var != null && (u0Var = g1Var.f57200a) != null && u0Var.getPainting() != null && g1Var.h != null) {
            i0 painting = u0Var.getPainting();
            painting.f57225f.f(new e0(painting, 0));
            g1Var.f57210m.clear();
            g1Var.f57211n.clear();
            g1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f57366y instanceof g) {
            this.f57360f.e();
        }
        s0 s0Var = this.d;
        if (s0Var != null && s0Var.f57341f) {
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
        if (this.f57366y instanceof g) {
            g1 g1Var = this.f57360f;
            Paint paint = g1Var.f57202c;
            ArrayList arrayList = g1Var.f57210m;
            u0 u0Var = g1Var.f57200a;
            if (u0Var != null && u0Var.getPainting() != null) {
                vt0 vt0Var = u0Var.getPainting().f57226g;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    f1 f1Var = (f1) arrayList.get(i7);
                    if (f1Var.f57194c && !f1Var.f57193b) {
                        g1Var.b(canvas, vt0Var, f1Var);
                    }
                }
                x0 x0Var2 = g1Var.h;
                if (x0Var2 != null && x0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-x0Var.h) / 3.141592653589793d) * 180.0d), (g1Var.h.f57398b / vt0Var.f41433a) * canvas.getWidth(), (g1Var.h.f57399c / vt0Var.f41434b) * canvas.getHeight());
                }
                x0 x0Var3 = g1Var.h;
                if (x0Var3 != null && x0Var3.f57397a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (g1Var.h.f57398b / vt0Var.f41433a), canvas.getHeight() * (g1Var.h.f57399c / vt0Var.f41434b), canvas.getWidth() * (g1Var.h.f57403i / vt0Var.f41433a), canvas.getHeight() * (g1Var.h.f57404j / vt0Var.f41434b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (g1Var.h.d / vt0Var.f41433a), canvas2.getHeight() * (g1Var.h.f57400e / vt0Var.f41434b), canvas2.getWidth() * (g1Var.h.f57403i / vt0Var.f41433a), canvas2.getHeight() * (g1Var.h.f57404j / vt0Var.f41434b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    f1 f1Var2 = (f1) arrayList.get(i10);
                    if (f1Var2.f57194c && f1Var2.f57193b) {
                        g1Var.b(canvas2, vt0Var, f1Var2);
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
        return this.f57366y;
    }

    public int getCurrentColor() {
        return this.f57365x;
    }

    public float getCurrentWeight() {
        return this.f57364w;
    }

    public i0 getPainting() {
        return this.f57358c;
    }

    public k1 getUndoStore() {
        return this.f57357b;
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
        i0 i0Var = this.f57358c;
        if (i0Var != null) {
            f10 = getWidth() / i0Var.f57226g.f41433a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        vt0 vt0Var = getPainting().f57226g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-vt0Var.f41433a) / 2.0f, (-vt0Var.f41434b) / 2.0f);
        if (this.f57366y instanceof g) {
            g1 g1Var = this.f57360f;
            g1Var.getClass();
            Matrix matrix2 = new Matrix();
            g1Var.f57212o = matrix2;
            matrix.invert(matrix2);
        } else {
            v vVar = this.f57359e;
            vVar.getClass();
            Matrix matrix3 = new Matrix();
            vVar.f57384t = matrix3;
            matrix.invert(matrix3);
        }
        s0 s0Var = this.d;
        i0Var.f57242y = hc.c(hc.b(s0Var.f57342n, s0Var.f57343r), hc.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.f57366y instanceof g;
        g1 g1Var = this.f57360f;
        if (z10) {
            g1Var.e();
        }
        this.f57366y = hVar;
        i();
        this.f57358c.q(this.f57366y);
        h hVar2 = this.f57366y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = g1Var.f57211n;
            ArrayList arrayList2 = g1Var.f57210m;
            u0 u0Var = g1Var.f57200a;
            if (u0Var != null && u0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                g1Var.h = new x0(g.p(o4));
                vt0 vt0Var = u0Var.getPainting().f57226g;
                x0 x0Var = g1Var.h;
                float f10 = vt0Var.f41433a;
                x0Var.f57398b = f10 / 2.0f;
                float f11 = vt0Var.f41434b;
                x0Var.f57399c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                x0Var.f57400e = min;
                x0Var.d = min;
                g1Var.h.f57401f = u0Var.getCurrentWeight();
                g1Var.h.f57402g = org.telegram.messenger.g0.L(32.0f);
                g1Var.h.f57406l = k0.e(j10.f24773t0).f57269k;
                if (g1Var.h.f57397a.o() == 4) {
                    x0 x0Var2 = g1Var.h;
                    float f12 = vt0Var.f41433a / 2.0f;
                    x0Var2.d = f12;
                    x0Var2.f57398b = f12;
                    x0Var2.f57403i = f12 + 1.0f;
                    float f13 = vt0Var.f41434b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    x0Var2.f57399c = f15;
                    float f16 = f13 / 2.0f;
                    x0Var2.f57404j = f16;
                    x0Var2.f57400e = f14 * 2.0f;
                    x0Var2.f57405k = Math.abs(f15 - f16);
                    c1 c1Var = new c1(g1Var, 0);
                    arrayList2.add(c1Var);
                    d1 d1Var = new d1(g1Var, c1Var, 0);
                    arrayList2.add(d1Var);
                    arrayList.add(d1Var);
                    d1 d1Var2 = new d1(g1Var, c1Var, 1);
                    arrayList2.add(d1Var2);
                    arrayList.add(d1Var2);
                }
                if (g1Var.h.f57397a.o() == 0) {
                    arrayList2.add(new c1(g1Var, 1));
                }
                if (g1Var.h.f57397a.o() == 2) {
                    arrayList2.add(new c1(g1Var, 2));
                }
                if (g1Var.h.f57397a.o() == 1 || g1Var.h.f57397a.o() == 3) {
                    arrayList2.add(new e1(g1Var, g1Var.h, false, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, false));
                    arrayList2.add(new e1(g1Var, g1Var.h, false, true));
                    arrayList2.add(new e1(g1Var, g1Var.h, true, true));
                    arrayList2.add(new c1(g1Var, 3, false));
                }
                if (g1Var.h.f57397a.o() == 3) {
                    x0 x0Var3 = g1Var.h;
                    x0Var3.f57403i = (x0Var3.d * 0.8f) + x0Var3.f57398b;
                    x0Var3.f57404j = (x0Var3.f57400e * 1.2f) + x0Var3.f57399c + x0Var3.f57401f;
                    c1 c1Var2 = new c1(g1Var, 4);
                    arrayList2.add(c1Var2);
                    c1Var2.f57193b = false;
                    arrayList.add(c1Var2);
                }
                g1Var.f57209l = new c1(g1Var, 5, false);
                if (g1Var.h.f57397a.o() != 4) {
                    g1Var.f57209l.f57194c = false;
                }
                c1 c1Var3 = g1Var.f57209l;
                c1Var3.f57193b = false;
                arrayList.add(c1Var3);
                arrayList2.add(g1Var.f57209l);
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f57358c.f57226g.f41433a;
        this.f57364w = e2.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f57366y instanceof g) {
            g1 g1Var = this.f57360f;
            u0 u0Var = g1Var.f57200a;
            x0 x0Var = g1Var.h;
            if (x0Var != null && x0Var.f57401f != u0Var.getCurrentWeight()) {
                g1Var.h.f57401f = u0Var.getCurrentWeight();
                u0Var.getPainting().k(g1Var.h);
            }
        }
    }

    public void setColor(int i7) {
        this.f57365x = i7;
        if (this.f57366y instanceof g) {
            g1 g1Var = this.f57360f;
            if (g1Var.h != null) {
                g1Var.f57200a.getPainting().k(g1Var.h);
            }
        }
    }

    public void setDelegate(t0 t0Var) {
        this.f57356a = t0Var;
    }

    public void setUndoStore(k1 k1Var) {
        this.f57357b = k1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(r5 r5Var) {
    }
}
