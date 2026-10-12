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
import org.telegram.ui.web.f2;
import w7.j6;
public class d1 extends TextureView {
    public c1 f45520a;
    public u1 f45521b;
    public final r0 f45522c;
    public b1 d;
    public final d0 f45523e;
    public final q1 f45524f;
    public Bitmap h;
    public Bitmap f45525n;
    public boolean f45526r;
    public boolean f45527s;
    public float v;
    public int f45528w;
    public m f45529x;
    public boolean f45530y;

    public d1(Context context, r0 r0Var, Bitmap bitmap, Bitmap bitmap2, la laVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f45525n = bitmap2;
        this.f45522c = r0Var;
        r0Var.f45637f = this;
        setSurfaceTextureListener(new z0(this, laVar));
        this.f45523e = new d0(this);
        x0 x0Var = new x0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f45617c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f45618e = paint3;
        Paint paint4 = new Paint(1);
        obj.f45619f = paint4;
        Paint paint5 = new Paint(1);
        obj.f45620g = paint5;
        obj.f45625m = new ArrayList();
        obj.f45626n = new ArrayList();
        obj.f45628p = new float[2];
        obj.f45615a = this;
        obj.f45616b = x0Var;
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
        this.f45524f = obj;
        r0Var.f45633a = new k2.g0(this, 18);
    }

    public final void a() {
        x0 x0Var = new x0(this, 2);
        d0 d0Var = this.f45523e;
        d0Var.f45502g = new v0(d0Var.f45497a.getPainting().f45638g.f30699a, 0.0d, 1.0d);
        d0Var.f45506l = true;
        d0Var.a(new Object(), false, x0Var);
    }

    public final void b() {
        d1 d1Var;
        q1 q1Var = this.f45524f;
        if (q1Var != null && (d1Var = q1Var.f45615a) != null && d1Var.getPainting() != null && q1Var.h != null) {
            r0 painting = d1Var.getPainting();
            painting.f45637f.f(new o0(painting, 0));
            q1Var.f45625m.clear();
            q1Var.f45626n.clear();
            q1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f45529x instanceof l) {
            this.f45524f.e();
        }
        b1 b1Var = this.d;
        if (b1Var != null && b1Var.f45485f) {
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
        if (this.f45529x instanceof l) {
            q1 q1Var = this.f45524f;
            Paint paint = q1Var.f45617c;
            ArrayList arrayList = q1Var.f45625m;
            d1 d1Var = q1Var.f45615a;
            if (d1Var != null && d1Var.getPainting() != null) {
                sw0 sw0Var = d1Var.getPainting().f45638g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    p1 p1Var = (p1) arrayList.get(i10);
                    if (p1Var.f45610c && !p1Var.f45609b) {
                        q1Var.b(canvas, sw0Var, p1Var);
                    }
                }
                g1 g1Var2 = q1Var.h;
                if (g1Var2 != null && g1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-g1Var.h) / 3.141592653589793d) * 180.0d), (q1Var.h.f45539b / sw0Var.f30699a) * canvas.getWidth(), (q1Var.h.f45540c / sw0Var.f30700b) * canvas.getHeight());
                }
                g1 g1Var3 = q1Var.h;
                if (g1Var3 != null && g1Var3.f45538a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (q1Var.h.f45539b / sw0Var.f30699a), canvas.getHeight() * (q1Var.h.f45540c / sw0Var.f30700b), canvas.getWidth() * (q1Var.h.f45544i / sw0Var.f30699a), canvas.getHeight() * (q1Var.h.f45545j / sw0Var.f30700b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (q1Var.h.d / sw0Var.f30699a), canvas2.getHeight() * (q1Var.h.f45541e / sw0Var.f30700b), canvas2.getWidth() * (q1Var.h.f45544i / sw0Var.f30699a), canvas2.getHeight() * (q1Var.h.f45545j / sw0Var.f30700b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    p1 p1Var2 = (p1) arrayList.get(i11);
                    if (p1Var2.f45610c && p1Var2.f45609b) {
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
        b1Var.postRunnable(new f2(3, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f45529x;
    }

    public int getCurrentColor() {
        return this.f45528w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public r0 getPainting() {
        return this.f45522c;
    }

    public u1 getUndoStore() {
        return this.f45521b;
    }

    public final void h() {
        this.f45530y = true;
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
        r0 r0Var = this.f45522c;
        if (r0Var != null) {
            f7 = getWidth() / r0Var.f45638g.f30699a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        sw0 sw0Var = getPainting().f45638g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-sw0Var.f30699a) / 2.0f, (-sw0Var.f30700b) / 2.0f);
        if (this.f45529x instanceof l) {
            q1 q1Var = this.f45524f;
            q1Var.getClass();
            Matrix matrix2 = new Matrix();
            q1Var.f45627o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.f45523e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f45514t = matrix3;
            matrix.invert(matrix3);
        }
        b1 b1Var = this.d;
        r0Var.f45654y = j6.c(j6.b(b1Var.f45486n, b1Var.f45487r), j6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f45529x instanceof l;
        q1 q1Var = this.f45524f;
        if (z10) {
            q1Var.e();
        }
        this.f45529x = mVar;
        i();
        this.f45522c.q(this.f45529x);
        m mVar2 = this.f45529x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = q1Var.f45626n;
            ArrayList arrayList2 = q1Var.f45625m;
            d1 d1Var = q1Var.f45615a;
            if (d1Var != null && d1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                q1Var.h = new g1(l.p(o9));
                sw0 sw0Var = d1Var.getPainting().f45638g;
                g1 g1Var = q1Var.h;
                float f7 = sw0Var.f30699a;
                g1Var.f45539b = f7 / 2.0f;
                float f10 = sw0Var.f30700b;
                g1Var.f45540c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                g1Var.f45541e = min;
                g1Var.d = min;
                q1Var.h.f45542f = d1Var.getCurrentWeight();
                q1Var.h.f45543g = AndroidUtilities.dp(32.0f);
                q1Var.h.f45547l = t0.e(UserConfig.selectedAccount).f45692k;
                if (q1Var.h.f45538a.o() == 4) {
                    g1 g1Var2 = q1Var.h;
                    float f11 = sw0Var.f30699a / 2.0f;
                    g1Var2.d = f11;
                    g1Var2.f45539b = f11;
                    g1Var2.f45544i = f11 + 1.0f;
                    float f12 = sw0Var.f30700b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    g1Var2.f45540c = f14;
                    float f15 = f12 / 2.0f;
                    g1Var2.f45545j = f15;
                    g1Var2.f45541e = f13 * 2.0f;
                    g1Var2.f45546k = Math.abs(f14 - f15);
                    m1 m1Var = new m1(q1Var, 0);
                    arrayList2.add(m1Var);
                    n1 n1Var = new n1(q1Var, m1Var, 0);
                    arrayList2.add(n1Var);
                    arrayList.add(n1Var);
                    n1 n1Var2 = new n1(q1Var, m1Var, 1);
                    arrayList2.add(n1Var2);
                    arrayList.add(n1Var2);
                }
                if (q1Var.h.f45538a.o() == 0) {
                    arrayList2.add(new m1(q1Var, 1));
                }
                if (q1Var.h.f45538a.o() == 2) {
                    arrayList2.add(new m1(q1Var, 2));
                }
                if (q1Var.h.f45538a.o() == 1 || q1Var.h.f45538a.o() == 3) {
                    arrayList2.add(new o1(q1Var, q1Var.h, false, false));
                    arrayList2.add(new o1(q1Var, q1Var.h, true, false));
                    arrayList2.add(new o1(q1Var, q1Var.h, false, true));
                    arrayList2.add(new o1(q1Var, q1Var.h, true, true));
                    arrayList2.add(new m1(q1Var, 3, false));
                }
                if (q1Var.h.f45538a.o() == 3) {
                    g1 g1Var3 = q1Var.h;
                    g1Var3.f45544i = (g1Var3.d * 0.8f) + g1Var3.f45539b;
                    g1Var3.f45545j = (g1Var3.f45541e * 1.2f) + g1Var3.f45540c + g1Var3.f45542f;
                    m1 m1Var2 = new m1(q1Var, 4);
                    arrayList2.add(m1Var2);
                    m1Var2.f45609b = false;
                    arrayList.add(m1Var2);
                }
                q1Var.f45624l = new m1(q1Var, 5, false);
                if (q1Var.h.f45538a.o() != 4) {
                    q1Var.f45624l.f45610c = false;
                }
                m1 m1Var3 = q1Var.f45624l;
                m1Var3.f45609b = false;
                arrayList.add(m1Var3);
                arrayList2.add(q1Var.f45624l);
                d1Var.getPainting().k(q1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f45522c.f45638g.f30699a;
        this.v = e2.w(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f45529x instanceof l) {
            q1 q1Var = this.f45524f;
            d1 d1Var = q1Var.f45615a;
            g1 g1Var = q1Var.h;
            if (g1Var != null && g1Var.f45542f != d1Var.getCurrentWeight()) {
                q1Var.h.f45542f = d1Var.getCurrentWeight();
                d1Var.getPainting().k(q1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f45528w = i10;
        if (this.f45529x instanceof l) {
            q1 q1Var = this.f45524f;
            if (q1Var.h != null) {
                q1Var.f45615a.getPainting().k(q1Var.h);
            }
        }
    }

    public void setDelegate(c1 c1Var) {
        this.f45520a = c1Var;
    }

    public void setUndoStore(u1 u1Var) {
        this.f45521b = u1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
