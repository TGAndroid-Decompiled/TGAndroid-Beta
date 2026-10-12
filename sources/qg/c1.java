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
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.la;
import org.telegram.ui.Wallet.t8;
import w7.r6;
public class c1 extends TextureView {
    public b1 f43397a;
    public t1 f43398b;
    public final q0 f43399c;
    public a1 d;
    public final d0 e;
    public final p1 f43400f;
    public Bitmap h;
    public Bitmap f43401n;
    public boolean f43402r;
    public boolean f43403s;
    public float v;
    public int f43404w;
    public m f43405x;
    public boolean f43406y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, la laVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f43401n = bitmap2;
        this.f43399c = q0Var;
        q0Var.f43524f = this;
        setSurfaceTextureListener(new y0(this, laVar));
        this.e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f43509c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f43510f = paint4;
        Paint paint5 = new Paint(1);
        obj.f43511g = paint5;
        obj.f43516m = new ArrayList();
        obj.f43517n = new ArrayList();
        obj.f43519p = new float[2];
        obj.f43507a = this;
        obj.f43508b = w0Var;
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
        this.f43400f = obj;
        q0Var.f43521a = new h5(this, 20);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.e;
        d0Var.f43411g = new u0(d0Var.f43407a.getPainting().f43525g.f26116a, 0.0d, 1.0d);
        d0Var.f43415l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f43400f;
        if (p1Var != null && (c1Var = p1Var.f43507a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f43524f.f(new n0(painting, 0));
            p1Var.f43516m.clear();
            p1Var.f43517n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f43405x instanceof l) {
            this.f43400f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f43383f) {
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
        if (this.f43405x instanceof l) {
            p1 p1Var = this.f43400f;
            Paint paint = p1Var.f43509c;
            ArrayList arrayList = p1Var.f43516m;
            c1 c1Var = p1Var.f43507a;
            if (c1Var != null && c1Var.getPainting() != null) {
                iw0 iw0Var = c1Var.getPainting().f43525g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f43504c && !o1Var.f43503b) {
                        p1Var.b(canvas, iw0Var, o1Var);
                    }
                }
                f1 f1Var2 = p1Var.h;
                if (f1Var2 != null && f1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-f1Var.h) / 3.141592653589793d) * 180.0d), (p1Var.h.f43436b / iw0Var.f26116a) * canvas.getWidth(), (p1Var.h.f43437c / iw0Var.f26117b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f43435a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (p1Var.h.f43436b / iw0Var.f26116a), canvas.getHeight() * (p1Var.h.f43437c / iw0Var.f26117b), canvas.getWidth() * (p1Var.h.f43440i / iw0Var.f26116a), canvas.getHeight() * (p1Var.h.f43441j / iw0Var.f26117b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / iw0Var.f26116a), canvas2.getHeight() * (p1Var.h.e / iw0Var.f26117b), canvas2.getWidth() * (p1Var.h.f43440i / iw0Var.f26116a), canvas2.getHeight() * (p1Var.h.f43441j / iw0Var.f26117b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f43504c && o1Var2.f43503b) {
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
        a1Var.postRunnable(new t8(16, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f43405x;
    }

    public int getCurrentColor() {
        return this.f43404w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f43399c;
    }

    public t1 getUndoStore() {
        return this.f43398b;
    }

    public final void h() {
        this.f43406y = true;
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
        q0 q0Var = this.f43399c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f43525g.f26116a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        iw0 iw0Var = getPainting().f43525g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-iw0Var.f26116a) / 2.0f, (-iw0Var.f26117b) / 2.0f);
        if (this.f43405x instanceof l) {
            p1 p1Var = this.f43400f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f43518o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f43423t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f43541y = r6.c(r6.b(a1Var.f43384n, a1Var.f43385r), r6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f43405x instanceof l;
        p1 p1Var = this.f43400f;
        if (z10) {
            p1Var.e();
        }
        this.f43405x = mVar;
        i();
        this.f43399c.q(this.f43405x);
        m mVar2 = this.f43405x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f43517n;
            ArrayList arrayList2 = p1Var.f43516m;
            c1 c1Var = p1Var.f43507a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o10));
                iw0 iw0Var = c1Var.getPainting().f43525g;
                f1 f1Var = p1Var.h;
                float f7 = iw0Var.f26116a;
                f1Var.f43436b = f7 / 2.0f;
                float f10 = iw0Var.f26117b;
                f1Var.f43437c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f43438f = c1Var.getCurrentWeight();
                p1Var.h.f43439g = AndroidUtilities.dp(32.0f);
                p1Var.h.f43443l = s0.e(UserConfig.selectedAccount).f43572k;
                if (p1Var.h.f43435a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = iw0Var.f26116a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f43436b = f11;
                    f1Var2.f43440i = f11 + 1.0f;
                    float f12 = iw0Var.f26117b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f43437c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f43441j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f43442k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f43435a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f43435a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f43435a.o() == 1 || p1Var.h.f43435a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f43435a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f43440i = (f1Var3.d * 0.8f) + f1Var3.f43436b;
                    f1Var3.f43441j = (f1Var3.e * 1.2f) + f1Var3.f43437c + f1Var3.f43438f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f43503b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f43515l = new l1(p1Var, 5, false);
                if (p1Var.h.f43435a.o() != 4) {
                    p1Var.f43515l.f43504c = false;
                }
                l1 l1Var3 = p1Var.f43515l;
                l1Var3.f43503b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f43515l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f43399c.f43525g.f26116a;
        this.v = k3.t(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f43405x instanceof l) {
            p1 p1Var = this.f43400f;
            c1 c1Var = p1Var.f43507a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f43438f != c1Var.getCurrentWeight()) {
                p1Var.h.f43438f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f43404w = i10;
        if (this.f43405x instanceof l) {
            p1 p1Var = this.f43400f;
            if (p1Var.h != null) {
                p1Var.f43507a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f43397a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f43398b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
