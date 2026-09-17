package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import bi.i7;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import ji.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ja;
import w7.s6;
public class c1 extends TextureView {
    public b1 f44388a;
    public t1 f44389b;
    public final q0 f44390c;
    public a1 d;
    public final d0 f44391e;
    public final p1 f44392f;
    public Bitmap h;
    public Bitmap f44393n;
    public boolean f44394r;
    public boolean f44395s;
    public float v;
    public int f44396w;
    public m f44397x;
    public boolean f44398y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44393n = bitmap2;
        this.f44390c = q0Var;
        q0Var.f44523f = this;
        setSurfaceTextureListener(new y0(this, jaVar));
        this.f44391e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f44506c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f44507e = paint3;
        Paint paint4 = new Paint(1);
        obj.f44508f = paint4;
        Paint paint5 = new Paint(1);
        obj.f44509g = paint5;
        obj.f44514m = new ArrayList();
        obj.f44515n = new ArrayList();
        obj.f44517p = new float[2];
        obj.f44504a = this;
        obj.f44505b = w0Var;
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
        this.f44392f = obj;
        q0Var.f44519a = new u4(this, 18);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.f44391e;
        d0Var.f44404g = new u0(d0Var.f44399a.getPainting().f44524g.f27272a, 0.0d, 1.0d);
        d0Var.f44408l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f44392f;
        if (p1Var != null && (c1Var = p1Var.f44504a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f44523f.f(new n0(painting, 0));
            p1Var.f44514m.clear();
            p1Var.f44515n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44397x instanceof l) {
            this.f44392f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f44373f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a1Var.postRunnable(new i7(a1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f44397x instanceof l) {
            p1 p1Var = this.f44392f;
            Paint paint = p1Var.f44506c;
            ArrayList arrayList = p1Var.f44514m;
            c1 c1Var = p1Var.f44504a;
            if (c1Var != null && c1Var.getPainting() != null) {
                iv0 iv0Var = c1Var.getPainting().f44524g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f44500c && !o1Var.f44499b) {
                        p1Var.b(canvas, iv0Var, o1Var);
                    }
                }
                f1 f1Var = p1Var.h;
                if (f1Var != null && f1Var.h != 0.0f) {
                    canvas.save();
                    f1 f1Var2 = p1Var.h;
                    canvas.rotate((float) (((-f1Var2.h) / 3.141592653589793d) * 180.0d), (f1Var2.f44429b / iv0Var.f27272a) * canvas.getWidth(), (p1Var.h.f44430c / iv0Var.f27273b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f44428a.o() == 4) {
                    float width = canvas.getWidth() * (p1Var.h.f44429b / iv0Var.f27272a);
                    float height = canvas.getHeight() * (p1Var.h.f44430c / iv0Var.f27273b);
                    float width2 = canvas.getWidth() * (p1Var.h.f44434i / iv0Var.f27272a);
                    float height2 = canvas.getHeight() * (p1Var.h.f44435j / iv0Var.f27273b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / iv0Var.f27272a), canvas2.getHeight() * (p1Var.h.f44431e / iv0Var.f27273b), canvas2.getWidth() * (p1Var.h.f44434i / iv0Var.f27272a), canvas2.getHeight() * (p1Var.h.f44435j / iv0Var.f27273b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f44500c && o1Var2.f44499b) {
                        p1Var.b(canvas2, iv0Var, o1Var2);
                    }
                }
                f1 f1Var4 = p1Var.h;
                if (f1Var4 != null && f1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: qg.c1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        a1 a1Var = this.d;
        if (a1Var == null) {
            return;
        }
        a1Var.postRunnable(new org.telegram.ui.web.g1(10, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f44397x;
    }

    public int getCurrentColor() {
        return this.f44396w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f44390c;
    }

    public t1 getUndoStore() {
        return this.f44389b;
    }

    public final void h() {
        this.f44398y = true;
        if (this.d != null) {
            f(new w0(this, 1));
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
        q0 q0Var = this.f44390c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f44524g.f27272a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        iv0 iv0Var = getPainting().f44524g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-iv0Var.f27272a) / 2.0f, (-iv0Var.f27273b) / 2.0f);
        if (this.f44397x instanceof l) {
            p1 p1Var = this.f44392f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f44516o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.f44391e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f44416t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f44540y = s6.c(s6.b(a1Var.f44374n, a1Var.f44375r), s6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44397x instanceof l;
        p1 p1Var = this.f44392f;
        if (z10) {
            p1Var.e();
        }
        this.f44397x = mVar;
        i();
        this.f44390c.q(this.f44397x);
        m mVar2 = this.f44397x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f44515n;
            ArrayList arrayList2 = p1Var.f44514m;
            c1 c1Var = p1Var.f44504a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o9));
                iv0 iv0Var = c1Var.getPainting().f44524g;
                f1 f1Var = p1Var.h;
                float f7 = iv0Var.f27272a;
                f1Var.f44429b = f7 / 2.0f;
                float f10 = iv0Var.f27273b;
                f1Var.f44430c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.f44431e = min;
                f1Var.d = min;
                p1Var.h.f44432f = c1Var.getCurrentWeight();
                p1Var.h.f44433g = AndroidUtilities.dp(32.0f);
                p1Var.h.f44437l = s0.e(UserConfig.selectedAccount).f44575k;
                if (p1Var.h.f44428a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = iv0Var.f27272a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f44429b = f11;
                    f1Var2.f44434i = f11 + 1.0f;
                    float f12 = iv0Var.f27273b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f44430c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f44435j = f15;
                    f1Var2.f44431e = f13 * 2.0f;
                    f1Var2.f44436k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f44428a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f44428a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f44428a.o() == 1 || p1Var.h.f44428a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f44428a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f44434i = (f1Var3.d * 0.8f) + f1Var3.f44429b;
                    f1Var3.f44435j = (f1Var3.f44431e * 1.2f) + f1Var3.f44430c + f1Var3.f44432f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f44499b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f44513l = new l1(p1Var, 5, false);
                if (p1Var.h.f44428a.o() != 4) {
                    p1Var.f44513l.f44500c = false;
                }
                l1 l1Var3 = p1Var.f44513l;
                l1Var3.f44499b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f44513l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44390c.f44524g.f27272a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44397x instanceof l) {
            p1 p1Var = this.f44392f;
            c1 c1Var = p1Var.f44504a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f44432f != c1Var.getCurrentWeight()) {
                p1Var.h.f44432f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44396w = i10;
        if (this.f44397x instanceof l) {
            p1 p1Var = this.f44392f;
            if (p1Var.h != null) {
                p1Var.f44504a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f44388a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f44389b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
