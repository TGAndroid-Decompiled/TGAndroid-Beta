package pg;

import ai.c8;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.sw0;
import w7.j6;
public class d1 extends TextureView {
    public c1 f45515a;
    public u1 f45516b;
    public final r0 f45517c;
    public b1 d;
    public final d0 f45518e;
    public final q1 f45519f;
    public Bitmap h;
    public Bitmap f45520n;
    public boolean f45521r;
    public boolean f45522s;
    public float v;
    public int f45523w;
    public m f45524x;
    public boolean f45525y;

    public d1(Context context, r0 r0Var, Bitmap bitmap, Bitmap bitmap2, la laVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f45520n = bitmap2;
        this.f45517c = r0Var;
        r0Var.f45632f = this;
        setSurfaceTextureListener(new z0(this, laVar));
        this.f45518e = new d0(this);
        x0 x0Var = new x0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f45612c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f45613e = paint3;
        Paint paint4 = new Paint(1);
        obj.f45614f = paint4;
        Paint paint5 = new Paint(1);
        obj.f45615g = paint5;
        obj.f45620m = new ArrayList();
        obj.f45621n = new ArrayList();
        obj.f45623p = new float[2];
        obj.f45610a = this;
        obj.f45611b = x0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f45519f = obj;
        r0Var.f45628a = new k2.g0(this, 18);
    }

    public final void a() {
        x0 x0Var = new x0(this, 2);
        d0 d0Var = this.f45518e;
        d0Var.f45497g = new v0(d0Var.f45492a.getPainting().f45633g.f30696a, 0.0d, 1.0d);
        d0Var.f45501l = true;
        d0Var.a(new Object(), false, x0Var);
    }

    public final void b() {
        d1 d1Var;
        q1 q1Var = this.f45519f;
        if (q1Var != null && (d1Var = q1Var.f45610a) != null && d1Var.getPainting() != null && q1Var.h != null) {
            r0 painting = d1Var.getPainting();
            painting.f45632f.f(new o0(painting, 0));
            q1Var.f45620m.clear();
            q1Var.f45621n.clear();
            q1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f45524x instanceof l) {
            this.f45519f.e();
        }
        b1 b1Var = this.d;
        if (b1Var != null && b1Var.f45480f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                b1Var.postRunnable(new c8(b1Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        g1 g1Var;
        if (this.f45524x instanceof l) {
            q1 q1Var = this.f45519f;
            Paint paint = q1Var.f45612c;
            ArrayList arrayList = q1Var.f45620m;
            d1 d1Var = q1Var.f45610a;
            if (d1Var != null && d1Var.getPainting() != null) {
                sw0 sw0Var = d1Var.getPainting().f45633g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    p1 p1Var = (p1) arrayList.get(i10);
                    if (p1Var.f45605c && !p1Var.f45604b) {
                        q1Var.b(canvas, sw0Var, p1Var);
                    }
                }
                g1 g1Var2 = q1Var.h;
                if (g1Var2 != null && g1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-g1Var.h) / 3.141592653589793d) * 180.0d), (q1Var.h.f45534b / sw0Var.f30696a) * canvas.getWidth(), (q1Var.h.f45535c / sw0Var.f30697b) * canvas.getHeight());
                }
                g1 g1Var3 = q1Var.h;
                if (g1Var3 != null && g1Var3.f45533a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (q1Var.h.f45534b / sw0Var.f30696a), canvas.getHeight() * (q1Var.h.f45535c / sw0Var.f30697b), canvas.getWidth() * (q1Var.h.f45539i / sw0Var.f30696a), canvas.getHeight() * (q1Var.h.f45540j / sw0Var.f30697b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (q1Var.h.d / sw0Var.f30696a), canvas2.getHeight() * (q1Var.h.f45536e / sw0Var.f30697b), canvas2.getWidth() * (q1Var.h.f45539i / sw0Var.f30696a), canvas2.getHeight() * (q1Var.h.f45540j / sw0Var.f30697b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    p1 p1Var2 = (p1) arrayList.get(i11);
                    if (p1Var2.f45605c && p1Var2.f45604b) {
                        q1Var.b(canvas2, sw0Var, p1Var2);
                    }
                }
                g1 g1Var4 = q1Var.h;
                if (g1Var4 != null && g1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: pg.d1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        b1 b1Var = this.d;
        if (b1Var == null) {
            return;
        }
        b1Var.postRunnable(new p2.b(2, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f45524x;
    }

    public int getCurrentColor() {
        return this.f45523w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public r0 getPainting() {
        return this.f45517c;
    }

    public u1 getUndoStore() {
        return this.f45516b;
    }

    public final void h() {
        this.f45525y = true;
        if (this.d != null) {
            f(new x0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f7;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f10 = 1.0f;
        r0 r0Var = this.f45517c;
        if (r0Var != null) {
            f7 = getWidth() / r0Var.f45633g.f30696a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        sw0 sw0Var = getPainting().f45633g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-sw0Var.f30696a) / 2.0f, (-sw0Var.f30697b) / 2.0f);
        if (this.f45524x instanceof l) {
            q1 q1Var = this.f45519f;
            q1Var.getClass();
            Matrix matrix2 = new Matrix();
            q1Var.f45622o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.f45518e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f45509t = matrix3;
            matrix.invert(matrix3);
        }
        b1 b1Var = this.d;
        r0Var.f45649y = j6.c(j6.b(b1Var.f45481n, b1Var.f45482r), j6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f45524x instanceof l;
        q1 q1Var = this.f45519f;
        if (z10) {
            q1Var.e();
        }
        this.f45524x = mVar;
        i();
        this.f45517c.q(this.f45524x);
        m mVar2 = this.f45524x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = q1Var.f45621n;
            ArrayList arrayList2 = q1Var.f45620m;
            d1 d1Var = q1Var.f45610a;
            if (d1Var != null && d1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                q1Var.h = new g1(l.p(o9));
                sw0 sw0Var = d1Var.getPainting().f45633g;
                g1 g1Var = q1Var.h;
                float f7 = sw0Var.f30696a;
                g1Var.f45534b = f7 / 2.0f;
                float f10 = sw0Var.f30697b;
                g1Var.f45535c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                g1Var.f45536e = min;
                g1Var.d = min;
                q1Var.h.f45537f = d1Var.getCurrentWeight();
                q1Var.h.f45538g = AndroidUtilities.dp(32.0f);
                q1Var.h.f45542l = t0.e(UserConfig.selectedAccount).f45687k;
                if (q1Var.h.f45533a.o() == 4) {
                    g1 g1Var2 = q1Var.h;
                    float f11 = sw0Var.f30696a / 2.0f;
                    g1Var2.d = f11;
                    g1Var2.f45534b = f11;
                    g1Var2.f45539i = f11 + 1.0f;
                    float f12 = sw0Var.f30697b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    g1Var2.f45535c = f14;
                    float f15 = f12 / 2.0f;
                    g1Var2.f45540j = f15;
                    g1Var2.f45536e = f13 * 2.0f;
                    g1Var2.f45541k = Math.abs(f14 - f15);
                    m1 m1Var = new m1(q1Var, 0);
                    arrayList2.add(m1Var);
                    n1 n1Var = new n1(q1Var, m1Var, 0);
                    arrayList2.add(n1Var);
                    arrayList.add(n1Var);
                    n1 n1Var2 = new n1(q1Var, m1Var, 1);
                    arrayList2.add(n1Var2);
                    arrayList.add(n1Var2);
                }
                if (q1Var.h.f45533a.o() == 0) {
                    arrayList2.add(new m1(q1Var, 1));
                }
                if (q1Var.h.f45533a.o() == 2) {
                    arrayList2.add(new m1(q1Var, 2));
                }
                if (q1Var.h.f45533a.o() == 1 || q1Var.h.f45533a.o() == 3) {
                    arrayList2.add(new o1(q1Var, q1Var.h, false, false));
                    arrayList2.add(new o1(q1Var, q1Var.h, true, false));
                    arrayList2.add(new o1(q1Var, q1Var.h, false, true));
                    arrayList2.add(new o1(q1Var, q1Var.h, true, true));
                    arrayList2.add(new m1(q1Var, 3, false));
                }
                if (q1Var.h.f45533a.o() == 3) {
                    g1 g1Var3 = q1Var.h;
                    g1Var3.f45539i = (g1Var3.d * 0.8f) + g1Var3.f45534b;
                    g1Var3.f45540j = (g1Var3.f45536e * 1.2f) + g1Var3.f45535c + g1Var3.f45537f;
                    m1 m1Var2 = new m1(q1Var, 4);
                    arrayList2.add(m1Var2);
                    m1Var2.f45604b = false;
                    arrayList.add(m1Var2);
                }
                q1Var.f45619l = new m1(q1Var, 5, false);
                if (q1Var.h.f45533a.o() != 4) {
                    q1Var.f45619l.f45605c = false;
                }
                m1 m1Var3 = q1Var.f45619l;
                m1Var3.f45604b = false;
                arrayList.add(m1Var3);
                arrayList2.add(q1Var.f45619l);
                d1Var.getPainting().k(q1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f45517c.f45633g.f30696a;
        this.v = e2.w(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f45524x instanceof l) {
            q1 q1Var = this.f45519f;
            d1 d1Var = q1Var.f45610a;
            g1 g1Var = q1Var.h;
            if (g1Var != null && g1Var.f45537f != d1Var.getCurrentWeight()) {
                q1Var.h.f45537f = d1Var.getCurrentWeight();
                d1Var.getPainting().k(q1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f45523w = i10;
        if (this.f45524x instanceof l) {
            q1 q1Var = this.f45519f;
            if (q1Var.h != null) {
                q1Var.f45610a.getPainting().k(q1Var.h);
            }
        }
    }

    public void setDelegate(c1 c1Var) {
        this.f45515a = c1Var;
    }

    public void setUndoStore(u1 u1Var) {
        this.f45516b = u1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
