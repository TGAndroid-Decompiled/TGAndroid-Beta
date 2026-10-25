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
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Wallet.q6;
public class c1 extends TextureView {
    public b1 f47372a;
    public t1 f47373b;
    public final q0 f47374c;
    public a1 d;
    public final e0 e;
    public final p1 f47375f;
    public Bitmap h;
    public Bitmap f47376n;
    public boolean f47377r;
    public boolean f47378s;
    public float v;
    public int f47379w;
    public m f47380x;
    public boolean f47381y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, la laVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f47376n = bitmap2;
        this.f47374c = q0Var;
        q0Var.f47503f = this;
        setSurfaceTextureListener(new y0(this, laVar));
        this.e = new e0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f47489c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f47490f = paint4;
        Paint paint5 = new Paint(1);
        obj.f47491g = paint5;
        obj.f47496m = new ArrayList();
        obj.f47497n = new ArrayList();
        obj.f47499p = new float[2];
        obj.f47487a = this;
        obj.f47488b = w0Var;
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
        this.f47375f = obj;
        q0Var.f47500a = new e3(this, 16);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        e0 e0Var = this.e;
        e0Var.f47392g = new u0(e0Var.f47388a.getPainting().f47504g.f32052a, 0.0d, 1.0d);
        e0Var.f47396l = true;
        e0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f47375f;
        if (p1Var != null && (c1Var = p1Var.f47487a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f47503f.f(new n0(painting, 0));
            p1Var.f47496m.clear();
            p1Var.f47497n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f47380x instanceof l) {
            this.f47375f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f47359f) {
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
        if (this.f47380x instanceof l) {
            p1 p1Var = this.f47375f;
            Paint paint = p1Var.f47489c;
            ArrayList arrayList = p1Var.f47496m;
            c1 c1Var = p1Var.f47487a;
            if (c1Var != null && c1Var.getPainting() != null) {
                qw0 qw0Var = c1Var.getPainting().f47504g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f47481c && !o1Var.f47480b) {
                        p1Var.b(canvas, qw0Var, o1Var);
                    }
                }
                f1 f1Var2 = p1Var.h;
                if (f1Var2 != null && f1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-f1Var.h) / 3.141592653589793d) * 180.0d), (p1Var.h.f47413b / qw0Var.f32052a) * canvas.getWidth(), (p1Var.h.f47414c / qw0Var.f32053b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f47412a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (p1Var.h.f47413b / qw0Var.f32052a), canvas.getHeight() * (p1Var.h.f47414c / qw0Var.f32053b), canvas.getWidth() * (p1Var.h.f47417i / qw0Var.f32052a), canvas.getHeight() * (p1Var.h.f47418j / qw0Var.f32053b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / qw0Var.f32052a), canvas2.getHeight() * (p1Var.h.e / qw0Var.f32053b), canvas2.getWidth() * (p1Var.h.f47417i / qw0Var.f32052a), canvas2.getHeight() * (p1Var.h.f47418j / qw0Var.f32053b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f47481c && o1Var2.f47480b) {
                        p1Var.b(canvas2, qw0Var, o1Var2);
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
        a1Var.postRunnable(new q6(26, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f47380x;
    }

    public int getCurrentColor() {
        return this.f47379w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f47374c;
    }

    public t1 getUndoStore() {
        return this.f47373b;
    }

    public final void h() {
        this.f47381y = true;
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
        q0 q0Var = this.f47374c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f47504g.f32052a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        qw0 qw0Var = getPainting().f47504g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-qw0Var.f32052a) / 2.0f, (-qw0Var.f32053b) / 2.0f);
        if (this.f47380x instanceof l) {
            p1 p1Var = this.f47375f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f47498o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f47404t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f47520y = wf.c(wf.b(a1Var.f47360n, a1Var.f47361r), wf.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f47380x instanceof l;
        p1 p1Var = this.f47375f;
        if (z10) {
            p1Var.e();
        }
        this.f47380x = mVar;
        i();
        this.f47374c.q(this.f47380x);
        m mVar2 = this.f47380x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f47497n;
            ArrayList arrayList2 = p1Var.f47496m;
            c1 c1Var = p1Var.f47487a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o10));
                qw0 qw0Var = c1Var.getPainting().f47504g;
                f1 f1Var = p1Var.h;
                float f7 = qw0Var.f32052a;
                f1Var.f47413b = f7 / 2.0f;
                float f10 = qw0Var.f32053b;
                f1Var.f47414c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f47415f = c1Var.getCurrentWeight();
                p1Var.h.f47416g = AndroidUtilities.dp(32.0f);
                p1Var.h.f47420l = s0.e(UserConfig.selectedAccount).f47547k;
                if (p1Var.h.f47412a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = qw0Var.f32052a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f47413b = f11;
                    f1Var2.f47417i = f11 + 1.0f;
                    float f12 = qw0Var.f32053b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f47414c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f47418j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f47419k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f47412a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f47412a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f47412a.o() == 1 || p1Var.h.f47412a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f47412a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f47417i = (f1Var3.d * 0.8f) + f1Var3.f47413b;
                    f1Var3.f47418j = (f1Var3.e * 1.2f) + f1Var3.f47414c + f1Var3.f47415f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f47480b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f47495l = new l1(p1Var, 5, false);
                if (p1Var.h.f47412a.o() != 4) {
                    p1Var.f47495l.f47481c = false;
                }
                l1 l1Var3 = p1Var.f47495l;
                l1Var3.f47480b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f47495l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f47374c.f47504g.f32052a;
        this.v = c3.h0.u(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f47380x instanceof l) {
            p1 p1Var = this.f47375f;
            c1 c1Var = p1Var.f47487a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f47415f != c1Var.getCurrentWeight()) {
                p1Var.h.f47415f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f47379w = i10;
        if (this.f47380x instanceof l) {
            p1 p1Var = this.f47375f;
            if (p1Var.h != null) {
                p1Var.f47487a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f47372a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f47373b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
