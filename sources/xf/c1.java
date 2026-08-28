package xf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import g7.h8;
import ih.u5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.qu0;
public class c1 extends TextureView {
    public b1 f49178a;
    public t1 f49179b;
    public final q0 f49180c;
    public a1 d;
    public final d0 f49181e;
    public final p1 f49182f;
    public Bitmap h;
    public Bitmap f49183n;
    public boolean f49184r;
    public boolean f49185s;
    public float v;
    public int f49186w;
    public m f49187x;
    public boolean f49188y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, ba baVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f49183n = bitmap2;
        this.f49180c = q0Var;
        q0Var.f49314f = this;
        setSurfaceTextureListener(new y0(this, baVar));
        this.f49181e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f49297c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f49298e = paint3;
        Paint paint4 = new Paint(1);
        obj.f49299f = paint4;
        Paint paint5 = new Paint(1);
        obj.f49300g = paint5;
        obj.f49305m = new ArrayList();
        obj.f49306n = new ArrayList();
        obj.f49308p = new float[2];
        obj.f49295a = this;
        obj.f49296b = w0Var;
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
        this.f49182f = obj;
        q0Var.f49310a = new m5.c0(this, 28);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.f49181e;
        d0Var.f49194g = new u0(d0Var.f49189a.getPainting().f49315g.f32026a, 0.0d, 1.0d);
        d0Var.f49198l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f49182f;
        if (p1Var != null && (c1Var = p1Var.f49295a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f49314f.f(new m0(painting, 0));
            p1Var.f49305m.clear();
            p1Var.f49306n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f49187x instanceof l) {
            this.f49182f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f49163f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a1Var.postRunnable(new u5(a1Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.f49187x instanceof l) {
            p1 p1Var = this.f49182f;
            Paint paint = p1Var.f49297c;
            ArrayList arrayList = p1Var.f49305m;
            c1 c1Var = p1Var.f49295a;
            if (c1Var != null && c1Var.getPainting() != null) {
                qu0 qu0Var = c1Var.getPainting().f49315g;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    o1 o1Var = (o1) arrayList.get(i9);
                    if (o1Var.f49291c && !o1Var.f49290b) {
                        p1Var.b(canvas, qu0Var, o1Var);
                    }
                }
                f1 f1Var = p1Var.h;
                if (f1Var != null && f1Var.h != 0.0f) {
                    canvas.save();
                    f1 f1Var2 = p1Var.h;
                    canvas.rotate((float) (((-f1Var2.h) / 3.141592653589793d) * 180.0d), (f1Var2.f49220b / qu0Var.f32026a) * canvas.getWidth(), (p1Var.h.f49221c / qu0Var.f32027b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f49219a.o() == 4) {
                    float width = canvas.getWidth() * (p1Var.h.f49220b / qu0Var.f32026a);
                    float height = canvas.getHeight() * (p1Var.h.f49221c / qu0Var.f32027b);
                    float width2 = canvas.getWidth() * (p1Var.h.f49225i / qu0Var.f32026a);
                    float height2 = canvas.getHeight() * (p1Var.h.f49226j / qu0Var.f32027b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / qu0Var.f32026a), canvas2.getHeight() * (p1Var.h.f49222e / qu0Var.f32027b), canvas2.getWidth() * (p1Var.h.f49225i / qu0Var.f32026a), canvas2.getHeight() * (p1Var.h.f49226j / qu0Var.f32027b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var2 = (o1) arrayList.get(i10);
                    if (o1Var2.f49291c && o1Var2.f49290b) {
                        p1Var.b(canvas2, qu0Var, o1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: xf.c1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        a1 a1Var = this.d;
        if (a1Var == null) {
            return;
        }
        a1Var.postRunnable(new o0(1, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f49187x;
    }

    public int getCurrentColor() {
        return this.f49186w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f49180c;
    }

    public t1 getUndoStore() {
        return this.f49179b;
    }

    public final void h() {
        this.f49188y = true;
        if (this.d != null) {
            f(new w0(this, 1));
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
        q0 q0Var = this.f49180c;
        if (q0Var != null) {
            f10 = getWidth() / q0Var.f49315g.f32026a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        qu0 qu0Var = getPainting().f49315g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-qu0Var.f32026a) / 2.0f, (-qu0Var.f32027b) / 2.0f);
        if (this.f49187x instanceof l) {
            p1 p1Var = this.f49182f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f49307o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.f49181e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f49206t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f49331y = h8.c(h8.b(a1Var.f49164n, a1Var.f49165r), h8.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f49187x instanceof l;
        p1 p1Var = this.f49182f;
        if (z10) {
            p1Var.e();
        }
        this.f49187x = mVar;
        i();
        this.f49180c.q(this.f49187x);
        m mVar2 = this.f49187x;
        if (mVar2 instanceof l) {
            int o6 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f49306n;
            ArrayList arrayList2 = p1Var.f49305m;
            c1 c1Var = p1Var.f49295a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o6));
                qu0 qu0Var = c1Var.getPainting().f49315g;
                f1 f1Var = p1Var.h;
                float f10 = qu0Var.f32026a;
                f1Var.f49220b = f10 / 2.0f;
                float f11 = qu0Var.f32027b;
                f1Var.f49221c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                f1Var.f49222e = min;
                f1Var.d = min;
                p1Var.h.f49223f = c1Var.getCurrentWeight();
                p1Var.h.f49224g = AndroidUtilities.dp(32.0f);
                p1Var.h.f49228l = s0.e(UserConfig.selectedAccount).f49366k;
                if (p1Var.h.f49219a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f12 = qu0Var.f32026a / 2.0f;
                    f1Var2.d = f12;
                    f1Var2.f49220b = f12;
                    f1Var2.f49225i = f12 + 1.0f;
                    float f13 = qu0Var.f32027b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    f1Var2.f49221c = f15;
                    float f16 = f13 / 2.0f;
                    f1Var2.f49226j = f16;
                    f1Var2.f49222e = f14 * 2.0f;
                    f1Var2.f49227k = Math.abs(f15 - f16);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f49219a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f49219a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f49219a.o() == 1 || p1Var.h.f49219a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f49219a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f49225i = (f1Var3.d * 0.8f) + f1Var3.f49220b;
                    f1Var3.f49226j = (f1Var3.f49222e * 1.2f) + f1Var3.f49221c + f1Var3.f49223f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f49290b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f49304l = new l1(p1Var, 5, false);
                if (p1Var.h.f49219a.o() != 4) {
                    p1Var.f49304l.f49291c = false;
                }
                l1 l1Var3 = p1Var.f49304l;
                l1Var3.f49290b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f49304l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f49180c.f49315g.f32026a;
        this.v = e2.c.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f49187x instanceof l) {
            p1 p1Var = this.f49182f;
            c1 c1Var = p1Var.f49295a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f49223f != c1Var.getCurrentWeight()) {
                p1Var.h.f49223f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i9) {
        this.f49186w = i9;
        if (this.f49187x instanceof l) {
            p1 p1Var = this.f49182f;
            if (p1Var.h != null) {
                p1Var.f49295a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f49178a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f49179b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
