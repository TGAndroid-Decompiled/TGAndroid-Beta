package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import ci.j6;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ja;
import w7.r6;
public class e1 extends TextureView {
    public d1 f44555a;
    public v1 f44556b;
    public final s0 f44557c;
    public c1 d;
    public final e0 e;
    public final r1 f44558f;
    public Bitmap h;
    public Bitmap f44559n;
    public boolean f44560r;
    public boolean f44561s;
    public float v;
    public int f44562w;
    public m f44563x;
    public boolean f44564y;

    public e1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44559n = bitmap2;
        this.f44557c = s0Var;
        s0Var.f44668f = this;
        setSurfaceTextureListener(new a1(this, jaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f44651c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f44652f = paint4;
        Paint paint5 = new Paint(1);
        obj.f44653g = paint5;
        obj.f44658m = new ArrayList();
        obj.f44659n = new ArrayList();
        obj.f44661p = new float[2];
        obj.f44649a = this;
        obj.f44650b = y0Var;
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
        this.f44558f = obj;
        s0Var.f44665a = new le.b(this, 16);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.e;
        e0Var.f44537g = new w0(e0Var.f44533a.getPainting().f44669g.f25727a, 0.0d, 1.0d);
        e0Var.f44541l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        e1 e1Var;
        r1 r1Var = this.f44558f;
        if (r1Var != null && (e1Var = r1Var.f44649a) != null && e1Var.getPainting() != null && r1Var.h != null) {
            s0 painting = e1Var.getPainting();
            painting.f44668f.f(new p0(painting, 0));
            r1Var.f44658m.clear();
            r1Var.f44659n.clear();
            r1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44563x instanceof l) {
            this.f44558f.e();
        }
        c1 c1Var = this.d;
        if (c1Var != null && c1Var.f44522f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                c1Var.postRunnable(new j6(c1Var, z10, z11, bitmapArr, countDownLatch));
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
        h1 h1Var;
        if (this.f44563x instanceof l) {
            r1 r1Var = this.f44558f;
            Paint paint = r1Var.f44651c;
            ArrayList arrayList = r1Var.f44658m;
            e1 e1Var = r1Var.f44649a;
            if (e1Var != null && e1Var.getPainting() != null) {
                dw0 dw0Var = e1Var.getPainting().f44669g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    q1 q1Var = (q1) arrayList.get(i10);
                    if (q1Var.f44645c && !q1Var.f44644b) {
                        r1Var.b(canvas, dw0Var, q1Var);
                    }
                }
                h1 h1Var2 = r1Var.h;
                if (h1Var2 != null && h1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-h1Var.h) / 3.141592653589793d) * 180.0d), (r1Var.h.f44574b / dw0Var.f25727a) * canvas.getWidth(), (r1Var.h.f44575c / dw0Var.f25728b) * canvas.getHeight());
                }
                h1 h1Var3 = r1Var.h;
                if (h1Var3 != null && h1Var3.f44573a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (r1Var.h.f44574b / dw0Var.f25727a), canvas.getHeight() * (r1Var.h.f44575c / dw0Var.f25728b), canvas.getWidth() * (r1Var.h.f44578i / dw0Var.f25727a), canvas.getHeight() * (r1Var.h.f44579j / dw0Var.f25728b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (r1Var.h.d / dw0Var.f25727a), canvas2.getHeight() * (r1Var.h.e / dw0Var.f25728b), canvas2.getWidth() * (r1Var.h.f44578i / dw0Var.f25727a), canvas2.getHeight() * (r1Var.h.f44579j / dw0Var.f25728b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q1 q1Var2 = (q1) arrayList.get(i11);
                    if (q1Var2.f44645c && q1Var2.f44644b) {
                        r1Var.b(canvas2, dw0Var, q1Var2);
                    }
                }
                h1 h1Var4 = r1Var.h;
                if (h1Var4 != null && h1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: qg.e1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        c1 c1Var = this.d;
        if (c1Var == null) {
            return;
        }
        c1Var.postRunnable(new p2.b(2, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f44563x;
    }

    public int getCurrentColor() {
        return this.f44562w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f44557c;
    }

    public v1 getUndoStore() {
        return this.f44556b;
    }

    public final void h() {
        this.f44564y = true;
        if (this.d != null) {
            f(new y0(this, 1));
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
        s0 s0Var = this.f44557c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f44669g.f25727a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        dw0 dw0Var = getPainting().f44669g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-dw0Var.f25727a) / 2.0f, (-dw0Var.f25728b) / 2.0f);
        if (this.f44563x instanceof l) {
            r1 r1Var = this.f44558f;
            r1Var.getClass();
            Matrix matrix2 = new Matrix();
            r1Var.f44660o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f44549t = matrix3;
            matrix.invert(matrix3);
        }
        c1 c1Var = this.d;
        s0Var.f44685y = r6.c(r6.b(c1Var.f44523n, c1Var.f44524r), r6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44563x instanceof l;
        r1 r1Var = this.f44558f;
        if (z10) {
            r1Var.e();
        }
        this.f44563x = mVar;
        i();
        this.f44557c.q(this.f44563x);
        m mVar2 = this.f44563x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = r1Var.f44659n;
            ArrayList arrayList2 = r1Var.f44658m;
            e1 e1Var = r1Var.f44649a;
            if (e1Var != null && e1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                r1Var.h = new h1(l.p(o10));
                dw0 dw0Var = e1Var.getPainting().f44669g;
                h1 h1Var = r1Var.h;
                float f7 = dw0Var.f25727a;
                h1Var.f44574b = f7 / 2.0f;
                float f10 = dw0Var.f25728b;
                h1Var.f44575c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                h1Var.e = min;
                h1Var.d = min;
                r1Var.h.f44576f = e1Var.getCurrentWeight();
                r1Var.h.f44577g = AndroidUtilities.dp(32.0f);
                r1Var.h.f44581l = u0.e(UserConfig.selectedAccount).f44719k;
                if (r1Var.h.f44573a.o() == 4) {
                    h1 h1Var2 = r1Var.h;
                    float f11 = dw0Var.f25727a / 2.0f;
                    h1Var2.d = f11;
                    h1Var2.f44574b = f11;
                    h1Var2.f44578i = f11 + 1.0f;
                    float f12 = dw0Var.f25728b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    h1Var2.f44575c = f14;
                    float f15 = f12 / 2.0f;
                    h1Var2.f44579j = f15;
                    h1Var2.e = f13 * 2.0f;
                    h1Var2.f44580k = Math.abs(f14 - f15);
                    n1 n1Var = new n1(r1Var, 0);
                    arrayList2.add(n1Var);
                    o1 o1Var = new o1(r1Var, n1Var, 0);
                    arrayList2.add(o1Var);
                    arrayList.add(o1Var);
                    o1 o1Var2 = new o1(r1Var, n1Var, 1);
                    arrayList2.add(o1Var2);
                    arrayList.add(o1Var2);
                }
                if (r1Var.h.f44573a.o() == 0) {
                    arrayList2.add(new n1(r1Var, 1));
                }
                if (r1Var.h.f44573a.o() == 2) {
                    arrayList2.add(new n1(r1Var, 2));
                }
                if (r1Var.h.f44573a.o() == 1 || r1Var.h.f44573a.o() == 3) {
                    arrayList2.add(new p1(r1Var, r1Var.h, false, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, false, true));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, true));
                    arrayList2.add(new n1(r1Var, 3, false));
                }
                if (r1Var.h.f44573a.o() == 3) {
                    h1 h1Var3 = r1Var.h;
                    h1Var3.f44578i = (h1Var3.d * 0.8f) + h1Var3.f44574b;
                    h1Var3.f44579j = (h1Var3.e * 1.2f) + h1Var3.f44575c + h1Var3.f44576f;
                    n1 n1Var2 = new n1(r1Var, 4);
                    arrayList2.add(n1Var2);
                    n1Var2.f44644b = false;
                    arrayList.add(n1Var2);
                }
                r1Var.f44657l = new n1(r1Var, 5, false);
                if (r1Var.h.f44573a.o() != 4) {
                    r1Var.f44657l.f44645c = false;
                }
                n1 n1Var3 = r1Var.f44657l;
                n1Var3.f44644b = false;
                arrayList.add(n1Var3);
                arrayList2.add(r1Var.f44657l);
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44557c.f44669g.f25727a;
        this.v = k3.t(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44563x instanceof l) {
            r1 r1Var = this.f44558f;
            e1 e1Var = r1Var.f44649a;
            h1 h1Var = r1Var.h;
            if (h1Var != null && h1Var.f44576f != e1Var.getCurrentWeight()) {
                r1Var.h.f44576f = e1Var.getCurrentWeight();
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44562w = i10;
        if (this.f44563x instanceof l) {
            r1 r1Var = this.f44558f;
            if (r1Var.h != null) {
                r1Var.f44649a.getPainting().k(r1Var.h);
            }
        }
    }

    public void setDelegate(d1 d1Var) {
        this.f44555a = d1Var;
    }

    public void setUndoStore(v1 v1Var) {
        this.f44556b = v1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
