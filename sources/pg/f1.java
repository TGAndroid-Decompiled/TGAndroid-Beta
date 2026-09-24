package pg;

import ai.b8;
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
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.uv0;
import w7.l6;
public class f1 extends TextureView {
    public e1 f41109a;
    public w1 f41110b;
    public final s0 f41111c;
    public d1 d;
    public final e0 e;
    public final s1 f41112f;
    public Bitmap h;
    public Bitmap f41113n;
    public boolean f41114r;
    public boolean f41115s;
    public float v;
    public int f41116w;
    public m f41117x;
    public boolean f41118y;

    public f1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f41113n = bitmap2;
        this.f41111c = s0Var;
        s0Var.f41210f = this;
        setSurfaceTextureListener(new a1(this, jaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f41231c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f41232f = paint4;
        Paint paint5 = new Paint(1);
        obj.f41233g = paint5;
        obj.f41238m = new ArrayList();
        obj.f41239n = new ArrayList();
        obj.f41241p = new float[2];
        obj.f41229a = this;
        obj.f41230b = y0Var;
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
        this.f41112f = obj;
        s0Var.f41207a = new n2.e(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.e;
        e0Var.f41089g = new w0(e0Var.f41085a.getPainting().f41211g.f28926a, 0.0d, 1.0d);
        e0Var.f41093l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        f1 f1Var;
        s1 s1Var = this.f41112f;
        if (s1Var != null && (f1Var = s1Var.f41229a) != null && f1Var.getPainting() != null && s1Var.h != null) {
            s0 painting = f1Var.getPainting();
            painting.f41210f.f(new p0(painting, 0));
            s1Var.f41238m.clear();
            s1Var.f41239n.clear();
            s1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f41117x instanceof l) {
            this.f41112f.e();
        }
        d1 d1Var = this.d;
        if (d1Var != null && d1Var.f41078f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                d1Var.postRunnable(new b8(d1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f41117x instanceof l) {
            s1 s1Var = this.f41112f;
            Paint paint = s1Var.f41231c;
            ArrayList arrayList = s1Var.f41238m;
            f1 f1Var = s1Var.f41229a;
            if (f1Var != null && f1Var.getPainting() != null) {
                uv0 uv0Var = f1Var.getPainting().f41211g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r1 r1Var = (r1) arrayList.get(i10);
                    if (r1Var.f41201c && !r1Var.f41200b) {
                        s1Var.b(canvas, uv0Var, r1Var);
                    }
                }
                i1 i1Var = s1Var.h;
                if (i1Var != null && i1Var.h != 0.0f) {
                    canvas.save();
                    i1 i1Var2 = s1Var.h;
                    canvas.rotate((float) (((-i1Var2.h) / 3.141592653589793d) * 180.0d), (i1Var2.f41127b / uv0Var.f28926a) * canvas.getWidth(), (s1Var.h.f41128c / uv0Var.f28927b) * canvas.getHeight());
                }
                i1 i1Var3 = s1Var.h;
                if (i1Var3 != null && i1Var3.f41126a.o() == 4) {
                    float width = canvas.getWidth() * (s1Var.h.f41127b / uv0Var.f28926a);
                    float height = canvas.getHeight() * (s1Var.h.f41128c / uv0Var.f28927b);
                    float width2 = canvas.getWidth() * (s1Var.h.f41131i / uv0Var.f28926a);
                    float height2 = canvas.getHeight() * (s1Var.h.f41132j / uv0Var.f28927b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (s1Var.h.d / uv0Var.f28926a), canvas2.getHeight() * (s1Var.h.e / uv0Var.f28927b), canvas2.getWidth() * (s1Var.h.f41131i / uv0Var.f28926a), canvas2.getHeight() * (s1Var.h.f41132j / uv0Var.f28927b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    r1 r1Var2 = (r1) arrayList.get(i11);
                    if (r1Var2.f41201c && r1Var2.f41200b) {
                        s1Var.b(canvas2, uv0Var, r1Var2);
                    }
                }
                i1 i1Var4 = s1Var.h;
                if (i1Var4 != null && i1Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: pg.f1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        d1 d1Var = this.d;
        if (d1Var == null) {
            return;
        }
        d1Var.postRunnable(new org.telegram.ui.web.f1(8, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f41117x;
    }

    public int getCurrentColor() {
        return this.f41116w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f41111c;
    }

    public w1 getUndoStore() {
        return this.f41110b;
    }

    public final void h() {
        this.f41118y = true;
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
        s0 s0Var = this.f41111c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f41211g.f28926a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        uv0 uv0Var = getPainting().f41211g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-uv0Var.f28926a) / 2.0f, (-uv0Var.f28927b) / 2.0f);
        if (this.f41117x instanceof l) {
            s1 s1Var = this.f41112f;
            s1Var.getClass();
            Matrix matrix2 = new Matrix();
            s1Var.f41240o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f41101t = matrix3;
            matrix.invert(matrix3);
        }
        d1 d1Var = this.d;
        s0Var.f41227y = l6.c(l6.b(d1Var.f41079n, d1Var.f41080r), l6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f41117x instanceof l;
        s1 s1Var = this.f41112f;
        if (z10) {
            s1Var.e();
        }
        this.f41117x = mVar;
        i();
        this.f41111c.q(this.f41117x);
        m mVar2 = this.f41117x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = s1Var.f41239n;
            ArrayList arrayList2 = s1Var.f41238m;
            f1 f1Var = s1Var.f41229a;
            if (f1Var != null && f1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                s1Var.h = new i1(l.p(o9));
                uv0 uv0Var = f1Var.getPainting().f41211g;
                i1 i1Var = s1Var.h;
                float f7 = uv0Var.f28926a;
                i1Var.f41127b = f7 / 2.0f;
                float f10 = uv0Var.f28927b;
                i1Var.f41128c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                i1Var.e = min;
                i1Var.d = min;
                s1Var.h.f41129f = f1Var.getCurrentWeight();
                s1Var.h.f41130g = AndroidUtilities.dp(32.0f);
                s1Var.h.f41134l = u0.e(UserConfig.selectedAccount).f41267k;
                if (s1Var.h.f41126a.o() == 4) {
                    i1 i1Var2 = s1Var.h;
                    float f11 = uv0Var.f28926a / 2.0f;
                    i1Var2.d = f11;
                    i1Var2.f41127b = f11;
                    i1Var2.f41131i = f11 + 1.0f;
                    float f12 = uv0Var.f28927b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    i1Var2.f41128c = f14;
                    float f15 = f12 / 2.0f;
                    i1Var2.f41132j = f15;
                    i1Var2.e = f13 * 2.0f;
                    i1Var2.f41133k = Math.abs(f14 - f15);
                    o1 o1Var = new o1(s1Var, 0);
                    arrayList2.add(o1Var);
                    p1 p1Var = new p1(s1Var, o1Var, 0);
                    arrayList2.add(p1Var);
                    arrayList.add(p1Var);
                    p1 p1Var2 = new p1(s1Var, o1Var, 1);
                    arrayList2.add(p1Var2);
                    arrayList.add(p1Var2);
                }
                if (s1Var.h.f41126a.o() == 0) {
                    arrayList2.add(new o1(s1Var, 1));
                }
                if (s1Var.h.f41126a.o() == 2) {
                    arrayList2.add(new o1(s1Var, 2));
                }
                if (s1Var.h.f41126a.o() == 1 || s1Var.h.f41126a.o() == 3) {
                    arrayList2.add(new q1(s1Var, s1Var.h, false, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, false, true));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, true));
                    arrayList2.add(new o1(s1Var, 3, false));
                }
                if (s1Var.h.f41126a.o() == 3) {
                    i1 i1Var3 = s1Var.h;
                    i1Var3.f41131i = (i1Var3.d * 0.8f) + i1Var3.f41127b;
                    i1Var3.f41132j = (i1Var3.e * 1.2f) + i1Var3.f41128c + i1Var3.f41129f;
                    o1 o1Var2 = new o1(s1Var, 4);
                    arrayList2.add(o1Var2);
                    o1Var2.f41200b = false;
                    arrayList.add(o1Var2);
                }
                s1Var.f41237l = new o1(s1Var, 5, false);
                if (s1Var.h.f41126a.o() != 4) {
                    s1Var.f41237l.f41201c = false;
                }
                o1 o1Var3 = s1Var.f41237l;
                o1Var3.f41200b = false;
                arrayList.add(o1Var3);
                arrayList2.add(s1Var.f41237l);
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f41111c.f41211g.f28926a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f41117x instanceof l) {
            s1 s1Var = this.f41112f;
            f1 f1Var = s1Var.f41229a;
            i1 i1Var = s1Var.h;
            if (i1Var != null && i1Var.f41129f != f1Var.getCurrentWeight()) {
                s1Var.h.f41129f = f1Var.getCurrentWeight();
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f41116w = i10;
        if (this.f41117x instanceof l) {
            s1 s1Var = this.f41112f;
            if (s1Var.h != null) {
                s1Var.f41229a.getPainting().k(s1Var.h);
            }
        }
    }

    public void setDelegate(e1 e1Var) {
        this.f41109a = e1Var;
    }

    public void setUndoStore(w1 w1Var) {
        this.f41110b = w1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
