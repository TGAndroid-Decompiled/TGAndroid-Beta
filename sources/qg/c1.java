package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import bi.n7;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import ji.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.la;
import w7.q6;
public class c1 extends TextureView {
    public b1 f43139a;
    public t1 f43140b;
    public final q0 f43141c;
    public a1 d;
    public final d0 e;
    public final p1 f43142f;
    public Bitmap h;
    public Bitmap f43143n;
    public boolean f43144r;
    public boolean f43145s;
    public float v;
    public int f43146w;
    public m f43147x;
    public boolean f43148y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, la laVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f43143n = bitmap2;
        this.f43141c = q0Var;
        q0Var.f43266f = this;
        setSurfaceTextureListener(new y0(this, laVar));
        this.e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f43251c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f43252f = paint4;
        Paint paint5 = new Paint(1);
        obj.f43253g = paint5;
        obj.f43258m = new ArrayList();
        obj.f43259n = new ArrayList();
        obj.f43261p = new float[2];
        obj.f43249a = this;
        obj.f43250b = w0Var;
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
        this.f43142f = obj;
        q0Var.f43263a = new w4(this, 20);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.e;
        d0Var.f43153g = new u0(d0Var.f43149a.getPainting().f43267g.f25809a, 0.0d, 1.0d);
        d0Var.f43157l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f43142f;
        if (p1Var != null && (c1Var = p1Var.f43249a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f43266f.f(new n0(painting, 0));
            p1Var.f43258m.clear();
            p1Var.f43259n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f43147x instanceof l) {
            this.f43142f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f43125f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a1Var.postRunnable(new n7(a1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f43147x instanceof l) {
            p1 p1Var = this.f43142f;
            Paint paint = p1Var.f43251c;
            ArrayList arrayList = p1Var.f43258m;
            c1 c1Var = p1Var.f43249a;
            if (c1Var != null && c1Var.getPainting() != null) {
                iw0 iw0Var = c1Var.getPainting().f43267g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f43246c && !o1Var.f43245b) {
                        p1Var.b(canvas, iw0Var, o1Var);
                    }
                }
                f1 f1Var2 = p1Var.h;
                if (f1Var2 != null && f1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-f1Var.h) / 3.141592653589793d) * 180.0d), (p1Var.h.f43178b / iw0Var.f25809a) * canvas.getWidth(), (p1Var.h.f43179c / iw0Var.f25810b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f43177a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (p1Var.h.f43178b / iw0Var.f25809a), canvas.getHeight() * (p1Var.h.f43179c / iw0Var.f25810b), canvas.getWidth() * (p1Var.h.f43182i / iw0Var.f25809a), canvas.getHeight() * (p1Var.h.f43183j / iw0Var.f25810b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / iw0Var.f25809a), canvas2.getHeight() * (p1Var.h.e / iw0Var.f25810b), canvas2.getWidth() * (p1Var.h.f43182i / iw0Var.f25809a), canvas2.getHeight() * (p1Var.h.f43183j / iw0Var.f25810b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f43246c && o1Var2.f43245b) {
                        p1Var.b(canvas2, iw0Var, o1Var2);
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
        a1Var.postRunnable(new org.telegram.ui.web.v(14, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f43147x;
    }

    public int getCurrentColor() {
        return this.f43146w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f43141c;
    }

    public t1 getUndoStore() {
        return this.f43140b;
    }

    public final void h() {
        this.f43148y = true;
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
        q0 q0Var = this.f43141c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f43267g.f25809a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        iw0 iw0Var = getPainting().f43267g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-iw0Var.f25809a) / 2.0f, (-iw0Var.f25810b) / 2.0f);
        if (this.f43147x instanceof l) {
            p1 p1Var = this.f43142f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f43260o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f43165t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f43283y = q6.c(q6.b(a1Var.f43126n, a1Var.f43127r), q6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f43147x instanceof l;
        p1 p1Var = this.f43142f;
        if (z10) {
            p1Var.e();
        }
        this.f43147x = mVar;
        i();
        this.f43141c.q(this.f43147x);
        m mVar2 = this.f43147x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f43259n;
            ArrayList arrayList2 = p1Var.f43258m;
            c1 c1Var = p1Var.f43249a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o10));
                iw0 iw0Var = c1Var.getPainting().f43267g;
                f1 f1Var = p1Var.h;
                float f7 = iw0Var.f25809a;
                f1Var.f43178b = f7 / 2.0f;
                float f10 = iw0Var.f25810b;
                f1Var.f43179c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f43180f = c1Var.getCurrentWeight();
                p1Var.h.f43181g = AndroidUtilities.dp(32.0f);
                p1Var.h.f43185l = s0.e(UserConfig.selectedAccount).f43314k;
                if (p1Var.h.f43177a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = iw0Var.f25809a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f43178b = f11;
                    f1Var2.f43182i = f11 + 1.0f;
                    float f12 = iw0Var.f25810b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f43179c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f43183j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f43184k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f43177a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f43177a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f43177a.o() == 1 || p1Var.h.f43177a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f43177a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f43182i = (f1Var3.d * 0.8f) + f1Var3.f43178b;
                    f1Var3.f43183j = (f1Var3.e * 1.2f) + f1Var3.f43179c + f1Var3.f43180f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f43245b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f43257l = new l1(p1Var, 5, false);
                if (p1Var.h.f43177a.o() != 4) {
                    p1Var.f43257l.f43246c = false;
                }
                l1 l1Var3 = p1Var.f43257l;
                l1Var3.f43245b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f43257l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f43141c.f43267g.f25809a;
        this.v = k3.t(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f43147x instanceof l) {
            p1 p1Var = this.f43142f;
            c1 c1Var = p1Var.f43249a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f43180f != c1Var.getCurrentWeight()) {
                p1Var.h.f43180f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f43146w = i10;
        if (this.f43147x instanceof l) {
            p1 p1Var = this.f43142f;
            if (p1Var.h != null) {
                p1Var.f43249a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f43139a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f43140b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
