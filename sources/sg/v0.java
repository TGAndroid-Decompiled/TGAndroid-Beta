package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import c8.dc;
import di.a6;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.q5;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.y9;
public class v0 extends TextureView {
    public boolean D;
    public u0 f55234a;
    public l1 f55235b;
    public final j0 f55236c;
    public t0 d;
    public final w f55237e;
    public final h1 f55238f;
    public Bitmap h;
    public Bitmap f55239n;
    public boolean f55240r;
    public boolean f55241s;
    public float f55242w;
    public int f55243x;
    public h f55244y;

    public v0(Context context, j0 j0Var, Bitmap bitmap, Bitmap bitmap2, y9 y9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f55239n = bitmap2;
        this.f55236c = j0Var;
        j0Var.f55103f = this;
        setSurfaceTextureListener(new r0(this, y9Var));
        this.f55237e = new w(this);
        p0 p0Var = new p0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f55079c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f55080e = paint3;
        Paint paint4 = new Paint(1);
        obj.f55081f = paint4;
        Paint paint5 = new Paint(1);
        obj.f55082g = paint5;
        obj.f55087m = new ArrayList();
        obj.f55088n = new ArrayList();
        obj.f55090p = new float[2];
        obj.f55077a = this;
        obj.f55078b = p0Var;
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
        this.f55238f = obj;
        j0Var.f55099a = new vy(this, 17);
    }

    public final void a() {
        p0 p0Var = new p0(this, 2);
        w wVar = this.f55237e;
        wVar.f55250g = new n0(wVar.f55245a.getPainting().f55104g.f36801a, 0.0d, 1.0d);
        wVar.f55254l = true;
        wVar.a(new Object(), false, p0Var);
    }

    public final void b() {
        v0 v0Var;
        h1 h1Var = this.f55238f;
        if (h1Var != null && (v0Var = h1Var.f55077a) != null && v0Var.getPainting() != null && h1Var.h != null) {
            j0 painting = v0Var.getPainting();
            painting.f55103f.f(new f0(painting, 0));
            h1Var.f55087m.clear();
            h1Var.f55088n.clear();
            h1Var.h = null;
        }
    }

    public final Bitmap c(boolean z9, boolean z10) {
        if (this.f55244y instanceof g) {
            this.f55238f.e();
        }
        t0 t0Var = this.d;
        if (t0Var != null && t0Var.f55219f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                t0Var.postRunnable(new a6(t0Var, z9, z10, bitmapArr, countDownLatch));
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
        y0 y0Var;
        if (this.f55244y instanceof g) {
            h1 h1Var = this.f55238f;
            Paint paint = h1Var.f55079c;
            ArrayList arrayList = h1Var.f55087m;
            v0 v0Var = h1Var.f55077a;
            if (v0Var != null && v0Var.getPainting() != null) {
                ot0 ot0Var = v0Var.getPainting().f55104g;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    g1 g1Var = (g1) arrayList.get(i7);
                    if (g1Var.f55072c && !g1Var.f55071b) {
                        h1Var.b(canvas, ot0Var, g1Var);
                    }
                }
                y0 y0Var2 = h1Var.h;
                if (y0Var2 != null && y0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-y0Var.h) / 3.141592653589793d) * 180.0d), (h1Var.h.f55276b / ot0Var.f36801a) * canvas.getWidth(), (h1Var.h.f55277c / ot0Var.f36802b) * canvas.getHeight());
                }
                y0 y0Var3 = h1Var.h;
                if (y0Var3 != null && y0Var3.f55275a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (h1Var.h.f55276b / ot0Var.f36801a), canvas.getHeight() * (h1Var.h.f55277c / ot0Var.f36802b), canvas.getWidth() * (h1Var.h.f55281i / ot0Var.f36801a), canvas.getHeight() * (h1Var.h.f55282j / ot0Var.f36802b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (h1Var.h.d / ot0Var.f36801a), canvas2.getHeight() * (h1Var.h.f55278e / ot0Var.f36802b), canvas2.getWidth() * (h1Var.h.f55281i / ot0Var.f36801a), canvas2.getHeight() * (h1Var.h.f55282j / ot0Var.f36802b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    g1 g1Var2 = (g1) arrayList.get(i10);
                    if (g1Var2.f55072c && g1Var2.f55071b) {
                        h1Var.b(canvas2, ot0Var, g1Var2);
                    }
                }
                y0 y0Var4 = h1Var.h;
                if (y0Var4 != null && y0Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: sg.v0.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        t0 t0Var = this.d;
        if (t0Var == null) {
            return;
        }
        t0Var.postRunnable(new org.telegram.ui.web.s(20, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f55244y;
    }

    public int getCurrentColor() {
        return this.f55243x;
    }

    public float getCurrentWeight() {
        return this.f55242w;
    }

    public j0 getPainting() {
        return this.f55236c;
    }

    public l1 getUndoStore() {
        return this.f55235b;
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
        j0 j0Var = this.f55236c;
        if (j0Var != null) {
            f10 = getWidth() / j0Var.f55104g.f36801a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        ot0 ot0Var = getPainting().f55104g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-ot0Var.f36801a) / 2.0f, (-ot0Var.f36802b) / 2.0f);
        if (this.f55244y instanceof g) {
            h1 h1Var = this.f55238f;
            h1Var.getClass();
            Matrix matrix2 = new Matrix();
            h1Var.f55089o = matrix2;
            matrix.invert(matrix2);
        } else {
            w wVar = this.f55237e;
            wVar.getClass();
            Matrix matrix3 = new Matrix();
            wVar.f55262t = matrix3;
            matrix.invert(matrix3);
        }
        t0 t0Var = this.d;
        j0Var.f55120y = dc.c(dc.b(t0Var.f55220n, t0Var.f55221r), dc.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z9 = this.f55244y instanceof g;
        h1 h1Var = this.f55238f;
        if (z9) {
            h1Var.e();
        }
        this.f55244y = hVar;
        i();
        this.f55236c.q(this.f55244y);
        h hVar2 = this.f55244y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = h1Var.f55088n;
            ArrayList arrayList2 = h1Var.f55087m;
            v0 v0Var = h1Var.f55077a;
            if (v0Var != null && v0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                h1Var.h = new y0(g.p(o4));
                ot0 ot0Var = v0Var.getPainting().f55104g;
                y0 y0Var = h1Var.h;
                float f10 = ot0Var.f36801a;
                y0Var.f55276b = f10 / 2.0f;
                float f11 = ot0Var.f36802b;
                y0Var.f55277c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                y0Var.f55278e = min;
                y0Var.d = min;
                h1Var.h.f55279f = v0Var.getCurrentWeight();
                h1Var.h.f55280g = org.telegram.messenger.g0.L(32.0f);
                h1Var.h.f55284l = l0.e(p10.f24470s0).f55145k;
                if (h1Var.h.f55275a.o() == 4) {
                    y0 y0Var2 = h1Var.h;
                    float f12 = ot0Var.f36801a / 2.0f;
                    y0Var2.d = f12;
                    y0Var2.f55276b = f12;
                    y0Var2.f55281i = f12 + 1.0f;
                    float f13 = ot0Var.f36802b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    y0Var2.f55277c = f15;
                    float f16 = f13 / 2.0f;
                    y0Var2.f55282j = f16;
                    y0Var2.f55278e = f14 * 2.0f;
                    y0Var2.f55283k = Math.abs(f15 - f16);
                    d1 d1Var = new d1(h1Var, 0);
                    arrayList2.add(d1Var);
                    e1 e1Var = new e1(h1Var, d1Var, 0);
                    arrayList2.add(e1Var);
                    arrayList.add(e1Var);
                    e1 e1Var2 = new e1(h1Var, d1Var, 1);
                    arrayList2.add(e1Var2);
                    arrayList.add(e1Var2);
                }
                if (h1Var.h.f55275a.o() == 0) {
                    arrayList2.add(new d1(h1Var, 1));
                }
                if (h1Var.h.f55275a.o() == 2) {
                    arrayList2.add(new d1(h1Var, 2));
                }
                if (h1Var.h.f55275a.o() == 1 || h1Var.h.f55275a.o() == 3) {
                    arrayList2.add(new f1(h1Var, h1Var.h, false, false));
                    arrayList2.add(new f1(h1Var, h1Var.h, true, false));
                    arrayList2.add(new f1(h1Var, h1Var.h, false, true));
                    arrayList2.add(new f1(h1Var, h1Var.h, true, true));
                    arrayList2.add(new d1(h1Var, 3, false));
                }
                if (h1Var.h.f55275a.o() == 3) {
                    y0 y0Var3 = h1Var.h;
                    y0Var3.f55281i = (y0Var3.d * 0.8f) + y0Var3.f55276b;
                    y0Var3.f55282j = (y0Var3.f55278e * 1.2f) + y0Var3.f55277c + y0Var3.f55279f;
                    d1 d1Var2 = new d1(h1Var, 4);
                    arrayList2.add(d1Var2);
                    d1Var2.f55071b = false;
                    arrayList.add(d1Var2);
                }
                h1Var.f55086l = new d1(h1Var, 5, false);
                if (h1Var.h.f55275a.o() != 4) {
                    h1Var.f55086l.f55072c = false;
                }
                d1 d1Var3 = h1Var.f55086l;
                d1Var3.f55071b = false;
                arrayList.add(d1Var3);
                arrayList2.add(h1Var.f55086l);
                v0Var.getPainting().k(h1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f55236c.f55104g.f36801a;
        this.f55242w = com.google.android.recaptcha.internal.a.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f55244y instanceof g) {
            h1 h1Var = this.f55238f;
            v0 v0Var = h1Var.f55077a;
            y0 y0Var = h1Var.h;
            if (y0Var != null && y0Var.f55279f != v0Var.getCurrentWeight()) {
                h1Var.h.f55279f = v0Var.getCurrentWeight();
                v0Var.getPainting().k(h1Var.h);
            }
        }
    }

    public void setColor(int i7) {
        this.f55243x = i7;
        if (this.f55244y instanceof g) {
            h1 h1Var = this.f55238f;
            if (h1Var.h != null) {
                h1Var.f55077a.getPainting().k(h1Var.h);
            }
        }
    }

    public void setDelegate(u0 u0Var) {
        this.f55234a = u0Var;
    }

    public void setUndoStore(l1 l1Var) {
        this.f55235b = l1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(q5 q5Var) {
    }
}
