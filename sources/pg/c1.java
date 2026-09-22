package pg;

import ai.z7;
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
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jv0;
import w7.k6;
public class c1 extends TextureView {
    public b1 f40820a;
    public t1 f40821b;
    public final q0 f40822c;
    public a1 d;
    public final d0 e;
    public final p1 f40823f;
    public Bitmap h;
    public Bitmap f40824n;
    public boolean f40825r;
    public boolean f40826s;
    public float v;
    public int f40827w;
    public m f40828x;
    public boolean f40829y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, ha haVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f40824n = bitmap2;
        this.f40822c = q0Var;
        q0Var.f40947f = this;
        setSurfaceTextureListener(new y0(this, haVar));
        this.e = new d0(this);
        w0 w0Var = new w0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f40932c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f40933f = paint4;
        Paint paint5 = new Paint(1);
        obj.f40934g = paint5;
        obj.f40939m = new ArrayList();
        obj.f40940n = new ArrayList();
        obj.f40942p = new float[2];
        obj.f40930a = this;
        obj.f40931b = w0Var;
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
        this.f40823f = obj;
        q0Var.f40944a = new k2.u(this, 18);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        d0 d0Var = this.e;
        d0Var.f40834g = new u0(d0Var.f40830a.getPainting().f40948g.f25440a, 0.0d, 1.0d);
        d0Var.f40838l = true;
        d0Var.a(new Object(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f40823f;
        if (p1Var != null && (c1Var = p1Var.f40930a) != null && c1Var.getPainting() != null && p1Var.h != null) {
            q0 painting = c1Var.getPainting();
            painting.f40947f.f(new n0(painting, 0));
            p1Var.f40939m.clear();
            p1Var.f40940n.clear();
            p1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f40828x instanceof l) {
            this.f40823f.e();
        }
        a1 a1Var = this.d;
        if (a1Var != null && a1Var.f40806f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                a1Var.postRunnable(new z7(a1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f40828x instanceof l) {
            p1 p1Var = this.f40823f;
            Paint paint = p1Var.f40932c;
            ArrayList arrayList = p1Var.f40939m;
            c1 c1Var = p1Var.f40930a;
            if (c1Var != null && c1Var.getPainting() != null) {
                jv0 jv0Var = c1Var.getPainting().f40948g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    o1 o1Var = (o1) arrayList.get(i10);
                    if (o1Var.f40927c && !o1Var.f40926b) {
                        p1Var.b(canvas, jv0Var, o1Var);
                    }
                }
                f1 f1Var = p1Var.h;
                if (f1Var != null && f1Var.h != 0.0f) {
                    canvas.save();
                    f1 f1Var2 = p1Var.h;
                    canvas.rotate((float) (((-f1Var2.h) / 3.141592653589793d) * 180.0d), (f1Var2.f40859b / jv0Var.f25440a) * canvas.getWidth(), (p1Var.h.f40860c / jv0Var.f25441b) * canvas.getHeight());
                }
                f1 f1Var3 = p1Var.h;
                if (f1Var3 != null && f1Var3.f40858a.o() == 4) {
                    float width = canvas.getWidth() * (p1Var.h.f40859b / jv0Var.f25440a);
                    float height = canvas.getHeight() * (p1Var.h.f40860c / jv0Var.f25441b);
                    float width2 = canvas.getWidth() * (p1Var.h.f40863i / jv0Var.f25440a);
                    float height2 = canvas.getHeight() * (p1Var.h.f40864j / jv0Var.f25441b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / jv0Var.f25440a), canvas2.getHeight() * (p1Var.h.e / jv0Var.f25441b), canvas2.getWidth() * (p1Var.h.f40863i / jv0Var.f25440a), canvas2.getHeight() * (p1Var.h.f40864j / jv0Var.f25441b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    o1 o1Var2 = (o1) arrayList.get(i11);
                    if (o1Var2.f40927c && o1Var2.f40926b) {
                        p1Var.b(canvas2, jv0Var, o1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: pg.c1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        a1 a1Var = this.d;
        if (a1Var == null) {
            return;
        }
        a1Var.postRunnable(new p2.b(2, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f40828x;
    }

    public int getCurrentColor() {
        return this.f40827w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public q0 getPainting() {
        return this.f40822c;
    }

    public t1 getUndoStore() {
        return this.f40821b;
    }

    public final void h() {
        this.f40829y = true;
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
        q0 q0Var = this.f40822c;
        if (q0Var != null) {
            f7 = getWidth() / q0Var.f40948g.f25440a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        jv0 jv0Var = getPainting().f40948g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-jv0Var.f25440a) / 2.0f, (-jv0Var.f25441b) / 2.0f);
        if (this.f40828x instanceof l) {
            p1 p1Var = this.f40823f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.f40941o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f40846t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.f40964y = k6.c(k6.b(a1Var.f40807n, a1Var.f40808r), k6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f40828x instanceof l;
        p1 p1Var = this.f40823f;
        if (z10) {
            p1Var.e();
        }
        this.f40828x = mVar;
        i();
        this.f40822c.q(this.f40828x);
        m mVar2 = this.f40828x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.f40940n;
            ArrayList arrayList2 = p1Var.f40939m;
            c1 c1Var = p1Var.f40930a;
            if (c1Var != null && c1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                p1Var.h = new f1(l.p(o9));
                jv0 jv0Var = c1Var.getPainting().f40948g;
                f1 f1Var = p1Var.h;
                float f7 = jv0Var.f25440a;
                f1Var.f40859b = f7 / 2.0f;
                float f10 = jv0Var.f25441b;
                f1Var.f40860c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                f1Var.e = min;
                f1Var.d = min;
                p1Var.h.f40861f = c1Var.getCurrentWeight();
                p1Var.h.f40862g = AndroidUtilities.dp(32.0f);
                p1Var.h.f40866l = s0.e(UserConfig.selectedAccount).f40995k;
                if (p1Var.h.f40858a.o() == 4) {
                    f1 f1Var2 = p1Var.h;
                    float f11 = jv0Var.f25440a / 2.0f;
                    f1Var2.d = f11;
                    f1Var2.f40859b = f11;
                    f1Var2.f40863i = f11 + 1.0f;
                    float f12 = jv0Var.f25441b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    f1Var2.f40860c = f14;
                    float f15 = f12 / 2.0f;
                    f1Var2.f40864j = f15;
                    f1Var2.e = f13 * 2.0f;
                    f1Var2.f40865k = Math.abs(f14 - f15);
                    l1 l1Var = new l1(p1Var, 0);
                    arrayList2.add(l1Var);
                    m1 m1Var = new m1(p1Var, l1Var, 0);
                    arrayList2.add(m1Var);
                    arrayList.add(m1Var);
                    m1 m1Var2 = new m1(p1Var, l1Var, 1);
                    arrayList2.add(m1Var2);
                    arrayList.add(m1Var2);
                }
                if (p1Var.h.f40858a.o() == 0) {
                    arrayList2.add(new l1(p1Var, 1));
                }
                if (p1Var.h.f40858a.o() == 2) {
                    arrayList2.add(new l1(p1Var, 2));
                }
                if (p1Var.h.f40858a.o() == 1 || p1Var.h.f40858a.o() == 3) {
                    arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                    arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                    arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                    arrayList2.add(new l1(p1Var, 3, false));
                }
                if (p1Var.h.f40858a.o() == 3) {
                    f1 f1Var3 = p1Var.h;
                    f1Var3.f40863i = (f1Var3.d * 0.8f) + f1Var3.f40859b;
                    f1Var3.f40864j = (f1Var3.e * 1.2f) + f1Var3.f40860c + f1Var3.f40861f;
                    l1 l1Var2 = new l1(p1Var, 4);
                    arrayList2.add(l1Var2);
                    l1Var2.f40926b = false;
                    arrayList.add(l1Var2);
                }
                p1Var.f40938l = new l1(p1Var, 5, false);
                if (p1Var.h.f40858a.o() != 4) {
                    p1Var.f40938l.f40927c = false;
                }
                l1 l1Var3 = p1Var.f40938l;
                l1Var3.f40926b = false;
                arrayList.add(l1Var3);
                arrayList2.add(p1Var.f40938l);
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f40822c.f40948g.f25440a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f40828x instanceof l) {
            p1 p1Var = this.f40823f;
            c1 c1Var = p1Var.f40930a;
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.f40861f != c1Var.getCurrentWeight()) {
                p1Var.h.f40861f = c1Var.getCurrentWeight();
                c1Var.getPainting().k(p1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f40827w = i10;
        if (this.f40828x instanceof l) {
            p1 p1Var = this.f40823f;
            if (p1Var.h != null) {
                p1Var.f40930a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.f40820a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.f40821b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
