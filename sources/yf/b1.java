package yf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import h7.l8;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import jh.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.z9;
import rh.o2;

public class b1 extends TextureView {

    public a1 f49878a;

    public s1 f49879b;

    public final p0 f49880c;
    public z0 d;

    public final d0 f49881e;

    public final o1 f49882f;
    public Bitmap h;

    public Bitmap f49883n;

    public boolean f49884r;

    public boolean f49885s;
    public float v;

    public int f49886w;

    public m f49887x;

    public boolean f49888y;

    public b1(Context context, p0 p0Var, Bitmap bitmap, Bitmap bitmap2, z9 z9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f49883n = bitmap2;
        this.f49880c = p0Var;
        p0Var.f50015f = this;
        setSurfaceTextureListener(new x0(this, z9Var));
        this.f49881e = new d0(this);
        v0 v0Var = new v0(this, 0);
        o1 o1Var = new o1();
        Paint paint = new Paint(1);
        o1Var.f49999c = paint;
        Paint paint2 = new Paint(1);
        o1Var.d = paint2;
        Paint paint3 = new Paint(1);
        o1Var.f50000e = paint3;
        Paint paint4 = new Paint(1);
        o1Var.f50001f = paint4;
        Paint paint5 = new Paint(1);
        o1Var.f50002g = paint5;
        o1Var.f50007m = new ArrayList();
        o1Var.f50008n = new ArrayList();
        o1Var.f50010p = new float[2];
        o1Var.f49997a = this;
        o1Var.f49998b = v0Var;
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
        this.f49882f = o1Var;
        p0Var.f50011a = new n1.d(this, 25);
    }

    public final void a() {
        v0 v0Var = new v0(this, 2);
        d0 d0Var = this.f49881e;
        d0Var.f49901g = new t0(d0Var.f49896a.getPainting().f50016g.f32893a, 0.0d, 1.0d);
        d0Var.f49905l = true;
        d0Var.a(new d(), false, v0Var);
    }

    public final void b() {
        b1 b1Var;
        o1 o1Var = this.f49882f;
        if (o1Var == null || (b1Var = o1Var.f49997a) == null || b1Var.getPainting() == null || o1Var.h == null) {
            return;
        }
        p0 painting = b1Var.getPainting();
        painting.f50015f.f(new m0(painting, 0));
        o1Var.f50007m.clear();
        o1Var.f50008n.clear();
        o1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f49887x instanceof l) {
            this.f49882f.e();
        }
        z0 z0Var = this.d;
        if (z0Var == null || !z0Var.f50134f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            z0Var.postRunnable(new q5(z0Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.f49887x instanceof l) {
            o1 o1Var = this.f49882f;
            Paint paint = o1Var.f49999c;
            ArrayList arrayList = o1Var.f50007m;
            b1 b1Var = o1Var.f49997a;
            if (b1Var == null || b1Var.getPainting() == null) {
                return;
            }
            tu0 tu0Var = b1Var.getPainting().f50016g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n1 n1Var = (n1) arrayList.get(i10);
                if (n1Var.f49991c && !n1Var.f49990b) {
                    o1Var.b(canvas, tu0Var, n1Var);
                }
            }
            e1 e1Var = o1Var.h;
            if (e1Var != null && e1Var.h != 0.0f) {
                canvas.save();
                e1 e1Var2 = o1Var.h;
                canvas.rotate((float) ((((double) (-e1Var2.h)) / 3.141592653589793d) * 180.0d), (e1Var2.f49922b / tu0Var.f32893a) * canvas.getWidth(), (o1Var.h.f49923c / tu0Var.f32894b) * canvas.getHeight());
            }
            e1 e1Var3 = o1Var.h;
            if (e1Var3 == null || e1Var3.f49921a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (o1Var.h.f49922b / tu0Var.f32893a), canvas.getHeight() * (o1Var.h.f49923c / tu0Var.f32894b), canvas.getWidth() * (o1Var.h.f49927i / tu0Var.f32893a), canvas.getHeight() * (o1Var.h.f49928j / tu0Var.f32894b), paint);
                canvas2.drawLine(canvas2.getWidth() * (o1Var.h.d / tu0Var.f32893a), canvas2.getHeight() * (o1Var.h.f49924e / tu0Var.f32894b), canvas2.getWidth() * (o1Var.h.f49927i / tu0Var.f32893a), canvas2.getHeight() * (o1Var.h.f49928j / tu0Var.f32894b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                n1 n1Var2 = (n1) arrayList.get(i11);
                if (n1Var2.f49991c && n1Var2.f49990b) {
                    o1Var.b(canvas2, tu0Var, n1Var2);
                }
            }
            e1 e1Var4 = o1Var.h;
            if (e1Var4 == null || e1Var4.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: yf.b1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        z0 z0Var = this.d;
        if (z0Var == null) {
            return;
        }
        z0Var.postRunnable(new o2(7, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f49887x;
    }

    public int getCurrentColor() {
        return this.f49886w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public p0 getPainting() {
        return this.f49880c;
    }

    public s1 getUndoStore() {
        return this.f49879b;
    }

    public final void h() {
        this.f49888y = true;
        if (this.d != null) {
            f(new v0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        p0 p0Var = this.f49880c;
        float width = p0Var != null ? getWidth() / p0Var.f50016g.f32893a : 1.0f;
        float f10 = width > 0.0f ? width : 1.0f;
        tu0 tu0Var = getPainting().f50016g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-tu0Var.f32893a) / 2.0f, (-tu0Var.f32894b) / 2.0f);
        if (this.f49887x instanceof l) {
            o1 o1Var = this.f49882f;
            o1Var.getClass();
            Matrix matrix2 = new Matrix();
            o1Var.f50009o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.f49881e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f49913t = matrix3;
            matrix.invert(matrix3);
        }
        z0 z0Var = this.d;
        p0Var.f50032y = l8.c(l8.b(z0Var.f50135n, z0Var.f50136r), l8.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f49887x instanceof l;
        o1 o1Var = this.f49882f;
        if (z10) {
            o1Var.e();
        }
        this.f49887x = mVar;
        i();
        this.f49880c.q(this.f49887x);
        m mVar2 = this.f49887x;
        if (mVar2 instanceof l) {
            int iO = ((l) mVar2).o();
            ArrayList arrayList = o1Var.f50008n;
            ArrayList arrayList2 = o1Var.f50007m;
            b1 b1Var = o1Var.f49997a;
            if (b1Var == null || b1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            o1Var.h = new e1(l.p(iO));
            tu0 tu0Var = b1Var.getPainting().f50016g;
            e1 e1Var = o1Var.h;
            float f10 = tu0Var.f32893a;
            e1Var.f49922b = f10 / 2.0f;
            float f11 = tu0Var.f32894b;
            e1Var.f49923c = f11 / 2.0f;
            float fMin = Math.min(f10, f11) / 5.0f;
            e1Var.f49924e = fMin;
            e1Var.d = fMin;
            o1Var.h.f49925f = b1Var.getCurrentWeight();
            o1Var.h.f49926g = AndroidUtilities.dp(32.0f);
            o1Var.h.f49930l = r0.e(UserConfig.selectedAccount).f50062k;
            if (o1Var.h.f49921a.o() == 4) {
                e1 e1Var2 = o1Var.h;
                float f12 = tu0Var.f32893a / 2.0f;
                e1Var2.d = f12;
                e1Var2.f49922b = f12;
                e1Var2.f49927i = f12 + 1.0f;
                float f13 = tu0Var.f32894b;
                float f14 = f13 / 3.0f;
                float f15 = 1.0f * f14;
                e1Var2.f49923c = f15;
                float f16 = f13 / 2.0f;
                e1Var2.f49928j = f16;
                e1Var2.f49924e = f14 * 2.0f;
                e1Var2.f49929k = Math.abs(f15 - f16);
                k1 k1Var = new k1(o1Var, 0);
                arrayList2.add(k1Var);
                l1 l1Var = new l1(o1Var, k1Var, 0);
                arrayList2.add(l1Var);
                arrayList.add(l1Var);
                l1 l1Var2 = new l1(o1Var, k1Var, 1);
                arrayList2.add(l1Var2);
                arrayList.add(l1Var2);
            }
            if (o1Var.h.f49921a.o() == 0) {
                arrayList2.add(new k1(o1Var, 1));
            }
            if (o1Var.h.f49921a.o() == 2) {
                arrayList2.add(new k1(o1Var, 2));
            }
            if (o1Var.h.f49921a.o() == 1 || o1Var.h.f49921a.o() == 3) {
                arrayList2.add(new m1(o1Var, o1Var.h, false, false));
                arrayList2.add(new m1(o1Var, o1Var.h, true, false));
                arrayList2.add(new m1(o1Var, o1Var.h, false, true));
                arrayList2.add(new m1(o1Var, o1Var.h, true, true));
                arrayList2.add(new k1(o1Var, 3, false));
            }
            if (o1Var.h.f49921a.o() == 3) {
                e1 e1Var3 = o1Var.h;
                e1Var3.f49927i = (e1Var3.d * 0.8f) + e1Var3.f49922b;
                e1Var3.f49928j = (e1Var3.f49924e * 1.2f) + e1Var3.f49923c + e1Var3.f49925f;
                k1 k1Var2 = new k1(o1Var, 4);
                arrayList2.add(k1Var2);
                k1Var2.f49990b = false;
                arrayList.add(k1Var2);
            }
            o1Var.f50006l = new k1(o1Var, 5, false);
            if (o1Var.h.f49921a.o() != 4) {
                o1Var.f50006l.f49991c = false;
            }
            k1 k1Var3 = o1Var.f50006l;
            k1Var3.f49990b = false;
            arrayList.add(k1Var3);
            arrayList2.add(o1Var.f50006l);
            b1Var.getPainting().k(o1Var.h);
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f49880c.f50016g.f32893a;
        this.v = com.google.android.recaptcha.internal.a.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f49887x instanceof l) {
            o1 o1Var = this.f49882f;
            b1 b1Var = o1Var.f49997a;
            e1 e1Var = o1Var.h;
            if (e1Var == null || e1Var.f49925f == b1Var.getCurrentWeight()) {
                return;
            }
            o1Var.h.f49925f = b1Var.getCurrentWeight();
            b1Var.getPainting().k(o1Var.h);
        }
    }

    public void setColor(int i10) {
        this.f49886w = i10;
        if (this.f49887x instanceof l) {
            o1 o1Var = this.f49882f;
            if (o1Var.h != null) {
                o1Var.f49997a.getPainting().k(o1Var.h);
            }
        }
    }

    public void setDelegate(a1 a1Var) {
        this.f49878a = a1Var;
    }

    public void setUndoStore(s1 s1Var) {
        this.f49879b = s1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
