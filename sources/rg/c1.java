package rg;

import a8.wf;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import di.i6;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Wallet.a6;
public class c1 extends TextureView {
    public b1 f47410a;
    public t1 f47411b;
    public final q0 f47412c;
    public a1 d;
    public final e0 e;
    public final p1 f47413f;
    public Bitmap h;
    public Bitmap f47414n;
    public boolean f47415r;
    public boolean f47416s;
    public float v;
    public int f47417w;
    public m f47418x;
    public boolean f47419y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, la laVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f47414n = bitmap2;
        this.f47412c = q0Var;
        q0Var.f47541f = this;
        setSurfaceTextureListener(new y0(this, laVar));
        this.e = new e0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f47527c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f47528f = paint4;
        Paint paint5 = new Paint(1);
        obj.f47529g = paint5;
        obj.f47534m = new ArrayList();
        obj.f47535n = new ArrayList();
        obj.f47537p = new float[2];
        obj.f47525a = this;
        obj.f47526b = w0Var;
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
        this.f47413f = obj;
        q0Var.f47538a = new e3(this, 16);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        e0 e0Var = this.e;
        e0Var.f47430g = new u0(e0Var.f47426a.getPainting().f47542g.f32392a, 0.0d, 1.0d);
        e0Var.f47434l = true;
        e0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f47413f;
        if (p1Var != null && (c1Var = p1Var.f47525a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f47541f.f(new n0(painting, 0));
            p1Var.f47534m.clear();
            p1Var.f47535n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f47418x instanceof l) {
            this.f47413f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f47397f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a1Var.postRunnable(new i6(a1Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        f1 f1Var;
        if (this.f47418x instanceof l) {
            p1 p1Var = this.f47413f;
            Paint paint = p1Var.f47527c;
            ArrayList arrayList = p1Var.f47534m;
            c1 c1Var = p1Var.f47525a;
            if (c1Var != null && c1Var.getPainting() != null) {
                rw0 rw0Var = c1Var.getPainting().f47542g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f47519c && !o1Var.f47518b) {
                        p1Var.b(canvas, rw0Var, o1Var);
                    }
                }
                f1 f1Var2 = p1Var.h;
                if (f1Var2 != null && f1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-f1Var.h) / 3.141592653589793d) * 180.0d), (p1Var.h.f47451b / rw0Var.f32392a) * canvas.getWidth(), (p1Var.h.f47452c / rw0Var.f32393b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f47450a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (p1Var.h.f47451b / rw0Var.f32392a), canvas.getHeight() * (p1Var.h.f47452c / rw0Var.f32393b), canvas.getWidth() * (p1Var.h.f47455i / rw0Var.f32392a), canvas.getHeight() * (p1Var.h.f47456j / rw0Var.f32393b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / rw0Var.f32392a), canvas2.getHeight() * (p1Var.h.e / rw0Var.f32393b), canvas2.getWidth() * (p1Var.h.f47455i / rw0Var.f32392a), canvas2.getHeight() * (p1Var.h.f47456j / rw0Var.f32393b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f47519c && o1Var2.f47518b) {
                        p1Var.b(canvas2, rw0Var, o1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: rg.c1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        a1 a1Var = this.d;
        if (a1Var == null) {
            return;
        }
        a1Var.postRunnable(new a6(27, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f47418x;
    }

    public int getCurrentColor() {
        return this.f47417w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f47412c;
    }

    public t1 getUndoStore() {
        return this.f47411b;
    }

    public final void h() {
        this.f47419y = true;
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
        q0 q0Var = this.f47412c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f47542g.f32392a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        rw0 rw0Var = getPainting().f47542g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-rw0Var.f32392a) / 2.0f, (-rw0Var.f32393b) / 2.0f);
        if (this.f47418x instanceof l) {
            p1 p1Var = this.f47413f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f47536o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f47442t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f47558y = wf.c(wf.b(a1Var.f47398n, a1Var.f47399r), wf.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f47418x instanceof l;
        p1 p1Var = this.f47413f;
        if (z10) {
            p1Var.e();
        }
        this.f47418x = mVar;
        i();
        this.f47412c.q(this.f47418x);
        m mVar2 = this.f47418x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f47535n;
            ArrayList arrayList2 = p1Var.f47534m;
            c1 c1Var = p1Var.f47525a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o10));
                rw0 rw0Var = c1Var.getPainting().f47542g;
                f1 f1Var = p1Var.h;
                float f7 = rw0Var.f32392a;
                f1Var.f47451b = f7 / 2.0f;
                float f10 = rw0Var.f32393b;
                f1Var.f47452c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f47453f = c1Var.getCurrentWeight();
                p1Var.h.f47454g = AndroidUtilities.dp(32.0f);
                p1Var.h.f47458l = s0.e(UserConfig.selectedAccount).f47585k;
                if (p1Var.h.f47450a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = rw0Var.f32392a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f47451b = f11;
                    f1Var2.f47455i = f11 + 1.0f;
                    float f12 = rw0Var.f32393b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f47452c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f47456j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f47457k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f47450a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f47450a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f47450a.o() == 1 || p1Var.h.f47450a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f47450a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f47455i = (f1Var3.d * 0.8f) + f1Var3.f47451b;
                    f1Var3.f47456j = (f1Var3.e * 1.2f) + f1Var3.f47452c + f1Var3.f47453f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f47518b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f47533l = new l1(p1Var, 5, false);
                if (p1Var.h.f47450a.o() != 4) {
                    p1Var.f47533l.f47519c = false;
                }
                l1 l1Var3 = p1Var.f47533l;
                l1Var3.f47518b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f47533l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f47412c.f47542g.f32392a;
        this.v = c3.h0.u(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f47418x instanceof l) {
            p1 p1Var = this.f47413f;
            c1 c1Var = p1Var.f47525a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f47453f != c1Var.getCurrentWeight()) {
                p1Var.h.f47453f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f47417w = i10;
        if (this.f47418x instanceof l) {
            p1 p1Var = this.f47413f;
            if (p1Var.h != null) {
                p1Var.f47525a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f47410a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f47411b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
