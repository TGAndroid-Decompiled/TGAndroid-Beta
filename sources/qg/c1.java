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
    public b1 f44416a;
    public t1 f44417b;
    public final q0 f44418c;
    public a1 d;
    public final d0 f44419e;
    public final p1 f44420f;
    public Bitmap h;
    public Bitmap f44421n;
    public boolean f44422r;
    public boolean f44423s;
    public float v;
    public int f44424w;
    public m f44425x;
    public boolean f44426y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44421n = bitmap2;
        this.f44418c = q0Var;
        q0Var.f44551f = this;
        setSurfaceTextureListener(new y0(this, jaVar));
        this.f44419e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f44534c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f44535e = paint3;
        Paint paint4 = new Paint(1);
        obj.f44536f = paint4;
        Paint paint5 = new Paint(1);
        obj.f44537g = paint5;
        obj.f44542m = new ArrayList();
        obj.f44543n = new ArrayList();
        obj.f44545p = new float[2];
        obj.f44532a = this;
        obj.f44533b = w0Var;
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
        this.f44420f = obj;
        q0Var.f44547a = new u4(this, 18);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.f44419e;
        d0Var.f44432g = new u0(d0Var.f44427a.getPainting().f44552g.f27299a, 0.0d, 1.0d);
        d0Var.f44436l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f44420f;
        if (p1Var != null && (c1Var = p1Var.f44532a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f44551f.f(new n0(painting, 0));
            p1Var.f44542m.clear();
            p1Var.f44543n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44425x instanceof l) {
            this.f44420f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f44401f) {
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
        if (this.f44425x instanceof l) {
            p1 p1Var = this.f44420f;
            Paint paint = p1Var.f44534c;
            ArrayList arrayList = p1Var.f44542m;
            c1 c1Var = p1Var.f44532a;
            if (c1Var != null && c1Var.getPainting() != null) {
                iv0 iv0Var = c1Var.getPainting().f44552g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f44528c && !o1Var.f44527b) {
                        p1Var.b(canvas, iv0Var, o1Var);
                    }
                }
                f1 f1Var = p1Var.h;
                if (f1Var != null && f1Var.h != 0.0f) {
                    canvas.save();
                    f1 f1Var2 = p1Var.h;
                    canvas.rotate((float) (((-f1Var2.h) / 3.141592653589793d) * 180.0d), (f1Var2.f44457b / iv0Var.f27299a) * canvas.getWidth(), (p1Var.h.f44458c / iv0Var.f27300b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f44456a.o() == 4) {
                    float width = canvas.getWidth() * (p1Var.h.f44457b / iv0Var.f27299a);
                    float height = canvas.getHeight() * (p1Var.h.f44458c / iv0Var.f27300b);
                    float width2 = canvas.getWidth() * (p1Var.h.f44462i / iv0Var.f27299a);
                    float height2 = canvas.getHeight() * (p1Var.h.f44463j / iv0Var.f27300b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / iv0Var.f27299a), canvas2.getHeight() * (p1Var.h.f44459e / iv0Var.f27300b), canvas2.getWidth() * (p1Var.h.f44462i / iv0Var.f27299a), canvas2.getHeight() * (p1Var.h.f44463j / iv0Var.f27300b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f44528c && o1Var2.f44527b) {
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
        return this.f44425x;
    }

    public int getCurrentColor() {
        return this.f44424w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f44418c;
    }

    public t1 getUndoStore() {
        return this.f44417b;
    }

    public final void h() {
        this.f44426y = true;
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
        q0 q0Var = this.f44418c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f44552g.f27299a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        iv0 iv0Var = getPainting().f44552g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-iv0Var.f27299a) / 2.0f, (-iv0Var.f27300b) / 2.0f);
        if (this.f44425x instanceof l) {
            p1 p1Var = this.f44420f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f44544o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.f44419e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f44444t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f44568y = s6.c(s6.b(a1Var.f44402n, a1Var.f44403r), s6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44425x instanceof l;
        p1 p1Var = this.f44420f;
        if (z10) {
            p1Var.e();
        }
        this.f44425x = mVar;
        i();
        this.f44418c.q(this.f44425x);
        m mVar2 = this.f44425x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f44543n;
            ArrayList arrayList2 = p1Var.f44542m;
            c1 c1Var = p1Var.f44532a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o9));
                iv0 iv0Var = c1Var.getPainting().f44552g;
                f1 f1Var = p1Var.h;
                float f7 = iv0Var.f27299a;
                f1Var.f44457b = f7 / 2.0f;
                float f10 = iv0Var.f27300b;
                f1Var.f44458c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.f44459e = min;
                f1Var.d = min;
                p1Var.h.f44460f = c1Var.getCurrentWeight();
                p1Var.h.f44461g = AndroidUtilities.dp(32.0f);
                p1Var.h.f44465l = s0.e(UserConfig.selectedAccount).f44603k;
                if (p1Var.h.f44456a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = iv0Var.f27299a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f44457b = f11;
                    f1Var2.f44462i = f11 + 1.0f;
                    float f12 = iv0Var.f27300b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f44458c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f44463j = f15;
                    f1Var2.f44459e = f13 * 2.0f;
                    f1Var2.f44464k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f44456a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f44456a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f44456a.o() == 1 || p1Var.h.f44456a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f44456a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f44462i = (f1Var3.d * 0.8f) + f1Var3.f44457b;
                    f1Var3.f44463j = (f1Var3.f44459e * 1.2f) + f1Var3.f44458c + f1Var3.f44460f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f44527b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f44541l = new l1(p1Var, 5, false);
                if (p1Var.h.f44456a.o() != 4) {
                    p1Var.f44541l.f44528c = false;
                }
                l1 l1Var3 = p1Var.f44541l;
                l1Var3.f44527b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f44541l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44418c.f44552g.f27299a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44425x instanceof l) {
            p1 p1Var = this.f44420f;
            c1 c1Var = p1Var.f44532a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f44460f != c1Var.getCurrentWeight()) {
                p1Var.h.f44460f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44424w = i10;
        if (this.f44425x instanceof l) {
            p1 p1Var = this.f44420f;
            if (p1Var.h != null) {
                p1Var.f44532a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f44416a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f44417b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
