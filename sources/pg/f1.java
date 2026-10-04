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
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.ka;
import org.telegram.ui.web.x1;
import w7.m6;
public class f1 extends TextureView {
    public e1 f44476a;
    public w1 f44477b;
    public final s0 f44478c;
    public d1 d;
    public final e0 f44479e;
    public final s1 f44480f;
    public Bitmap h;
    public Bitmap f44481n;
    public boolean f44482r;
    public boolean f44483s;
    public float v;
    public int f44484w;
    public m f44485x;
    public boolean f44486y;

    public f1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ka kaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44481n = bitmap2;
        this.f44478c = s0Var;
        s0Var.f44586f = this;
        setSurfaceTextureListener(new a1(this, kaVar));
        this.f44479e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f44607c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f44608e = paint3;
        Paint paint4 = new Paint(1);
        obj.f44609f = paint4;
        Paint paint5 = new Paint(1);
        obj.f44610g = paint5;
        obj.f44615m = new ArrayList();
        obj.f44616n = new ArrayList();
        obj.f44618p = new float[2];
        obj.f44605a = this;
        obj.f44606b = y0Var;
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
        this.f44480f = obj;
        s0Var.f44582a = new l2.g(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.f44479e;
        e0Var.f44456g = new w0(e0Var.f44451a.getPainting().f44587g.f26584a, 0.0d, 1.0d);
        e0Var.f44460l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        f1 f1Var;
        s1 s1Var = this.f44480f;
        if (s1Var != null && (f1Var = s1Var.f44605a) != null && f1Var.getPainting() != null && s1Var.h != null) {
            s0 painting = f1Var.getPainting();
            painting.f44586f.f(new p0(painting, 0));
            s1Var.f44615m.clear();
            s1Var.f44616n.clear();
            s1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44485x instanceof l) {
            this.f44480f.e();
        }
        d1 d1Var = this.d;
        if (d1Var != null && d1Var.f44444f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                d1Var.postRunnable(new b8(d1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f44485x instanceof l) {
            s1 s1Var = this.f44480f;
            Paint paint = s1Var.f44607c;
            ArrayList arrayList = s1Var.f44615m;
            f1 f1Var = s1Var.f44605a;
            if (f1Var != null && f1Var.getPainting() != null) {
                fw0 fw0Var = f1Var.getPainting().f44587g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r1 r1Var = (r1) arrayList.get(i10);
                    if (r1Var.f44574c && !r1Var.f44573b) {
                        s1Var.b(canvas, fw0Var, r1Var);
                    }
                }
                i1 i1Var = s1Var.h;
                if (i1Var != null && i1Var.h != 0.0f) {
                    canvas.save();
                    i1 i1Var2 = s1Var.h;
                    canvas.rotate((float) (((-i1Var2.h) / 3.141592653589793d) * 180.0d), (i1Var2.f44495b / fw0Var.f26584a) * canvas.getWidth(), (s1Var.h.f44496c / fw0Var.f26585b) * canvas.getHeight());
                }
                i1 i1Var3 = s1Var.h;
                if (i1Var3 != null && i1Var3.f44494a.o() == 4) {
                    float width = canvas.getWidth() * (s1Var.h.f44495b / fw0Var.f26584a);
                    float height = canvas.getHeight() * (s1Var.h.f44496c / fw0Var.f26585b);
                    float width2 = canvas.getWidth() * (s1Var.h.f44500i / fw0Var.f26584a);
                    float height2 = canvas.getHeight() * (s1Var.h.f44501j / fw0Var.f26585b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (s1Var.h.d / fw0Var.f26584a), canvas2.getHeight() * (s1Var.h.f44497e / fw0Var.f26585b), canvas2.getWidth() * (s1Var.h.f44500i / fw0Var.f26584a), canvas2.getHeight() * (s1Var.h.f44501j / fw0Var.f26585b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    r1 r1Var2 = (r1) arrayList.get(i11);
                    if (r1Var2.f44574c && r1Var2.f44573b) {
                        s1Var.b(canvas2, fw0Var, r1Var2);
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
        d1Var.postRunnable(new x1(5, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f44485x;
    }

    public int getCurrentColor() {
        return this.f44484w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f44478c;
    }

    public w1 getUndoStore() {
        return this.f44477b;
    }

    public final void h() {
        this.f44486y = true;
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
        s0 s0Var = this.f44478c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f44587g.f26584a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        fw0 fw0Var = getPainting().f44587g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-fw0Var.f26584a) / 2.0f, (-fw0Var.f26585b) / 2.0f);
        if (this.f44485x instanceof l) {
            s1 s1Var = this.f44480f;
            s1Var.getClass();
            Matrix matrix2 = new Matrix();
            s1Var.f44617o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.f44479e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f44468t = matrix3;
            matrix.invert(matrix3);
        }
        d1 d1Var = this.d;
        s0Var.f44603y = m6.c(m6.b(d1Var.f44445n, d1Var.f44446r), m6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44485x instanceof l;
        s1 s1Var = this.f44480f;
        if (z10) {
            s1Var.e();
        }
        this.f44485x = mVar;
        i();
        this.f44478c.q(this.f44485x);
        m mVar2 = this.f44485x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = s1Var.f44616n;
            ArrayList arrayList2 = s1Var.f44615m;
            f1 f1Var = s1Var.f44605a;
            if (f1Var != null && f1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                s1Var.h = new i1(l.p(o9));
                fw0 fw0Var = f1Var.getPainting().f44587g;
                i1 i1Var = s1Var.h;
                float f7 = fw0Var.f26584a;
                i1Var.f44495b = f7 / 2.0f;
                float f10 = fw0Var.f26585b;
                i1Var.f44496c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                i1Var.f44497e = min;
                i1Var.d = min;
                s1Var.h.f44498f = f1Var.getCurrentWeight();
                s1Var.h.f44499g = AndroidUtilities.dp(32.0f);
                s1Var.h.f44503l = u0.e(UserConfig.selectedAccount).f44647k;
                if (s1Var.h.f44494a.o() == 4) {
                    i1 i1Var2 = s1Var.h;
                    float f11 = fw0Var.f26584a / 2.0f;
                    i1Var2.d = f11;
                    i1Var2.f44495b = f11;
                    i1Var2.f44500i = f11 + 1.0f;
                    float f12 = fw0Var.f26585b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    i1Var2.f44496c = f14;
                    float f15 = f12 / 2.0f;
                    i1Var2.f44501j = f15;
                    i1Var2.f44497e = f13 * 2.0f;
                    i1Var2.f44502k = Math.abs(f14 - f15);
                    o1 o1Var = new o1(s1Var, 0);
                    arrayList2.add(o1Var);
                    p1 p1Var = new p1(s1Var, o1Var, 0);
                    arrayList2.add(p1Var);
                    arrayList.add(p1Var);
                    p1 p1Var2 = new p1(s1Var, o1Var, 1);
                    arrayList2.add(p1Var2);
                    arrayList.add(p1Var2);
                }
                if (s1Var.h.f44494a.o() == 0) {
                    arrayList2.add(new o1(s1Var, 1));
                }
                if (s1Var.h.f44494a.o() == 2) {
                    arrayList2.add(new o1(s1Var, 2));
                }
                if (s1Var.h.f44494a.o() == 1 || s1Var.h.f44494a.o() == 3) {
                    arrayList2.add(new q1(s1Var, s1Var.h, false, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, false, true));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, true));
                    arrayList2.add(new o1(s1Var, 3, false));
                }
                if (s1Var.h.f44494a.o() == 3) {
                    i1 i1Var3 = s1Var.h;
                    i1Var3.f44500i = (i1Var3.d * 0.8f) + i1Var3.f44495b;
                    i1Var3.f44501j = (i1Var3.f44497e * 1.2f) + i1Var3.f44496c + i1Var3.f44498f;
                    o1 o1Var2 = new o1(s1Var, 4);
                    arrayList2.add(o1Var2);
                    o1Var2.f44573b = false;
                    arrayList.add(o1Var2);
                }
                s1Var.f44614l = new o1(s1Var, 5, false);
                if (s1Var.h.f44494a.o() != 4) {
                    s1Var.f44614l.f44574c = false;
                }
                o1 o1Var3 = s1Var.f44614l;
                o1Var3.f44573b = false;
                arrayList.add(o1Var3);
                arrayList2.add(s1Var.f44614l);
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44478c.f44587g.f26584a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44485x instanceof l) {
            s1 s1Var = this.f44480f;
            f1 f1Var = s1Var.f44605a;
            i1 i1Var = s1Var.h;
            if (i1Var != null && i1Var.f44498f != f1Var.getCurrentWeight()) {
                s1Var.h.f44498f = f1Var.getCurrentWeight();
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44484w = i10;
        if (this.f44485x instanceof l) {
            s1 s1Var = this.f44480f;
            if (s1Var.h != null) {
                s1Var.f44605a.getPainting().k(s1Var.h);
            }
        }
    }

    public void setDelegate(e1 e1Var) {
        this.f44476a = e1Var;
    }

    public void setUndoStore(w1 w1Var) {
        this.f44477b = w1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
