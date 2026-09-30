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
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.xv0;
import w7.l6;
public class f1 extends TextureView {
    public e1 f41222a;
    public w1 f41223b;
    public final s0 f41224c;
    public d1 d;
    public final e0 e;
    public final s1 f41225f;
    public Bitmap h;
    public Bitmap f41226n;
    public boolean f41227r;
    public boolean f41228s;
    public float v;
    public int f41229w;
    public m f41230x;
    public boolean f41231y;

    public f1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ka kaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f41226n = bitmap2;
        this.f41224c = s0Var;
        s0Var.f41323f = this;
        setSurfaceTextureListener(new a1(this, kaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f41344c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f41345f = paint4;
        Paint paint5 = new Paint(1);
        obj.f41346g = paint5;
        obj.f41351m = new ArrayList();
        obj.f41352n = new ArrayList();
        obj.f41354p = new float[2];
        obj.f41342a = this;
        obj.f41343b = y0Var;
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
        this.f41225f = obj;
        s0Var.f41320a = new n2.e(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.e;
        e0Var.f41202g = new w0(e0Var.f41198a.getPainting().f41324g.f30521a, 0.0d, 1.0d);
        e0Var.f41206l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        f1 f1Var;
        s1 s1Var = this.f41225f;
        if (s1Var != null && (f1Var = s1Var.f41342a) != null && f1Var.getPainting() != null && s1Var.h != null) {
            s0 painting = f1Var.getPainting();
            painting.f41323f.f(new p0(painting, 0));
            s1Var.f41351m.clear();
            s1Var.f41352n.clear();
            s1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f41230x instanceof l) {
            this.f41225f.e();
        }
        d1 d1Var = this.d;
        if (d1Var != null && d1Var.f41191f) {
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
        if (this.f41230x instanceof l) {
            s1 s1Var = this.f41225f;
            Paint paint = s1Var.f41344c;
            ArrayList arrayList = s1Var.f41351m;
            f1 f1Var = s1Var.f41342a;
            if (f1Var != null && f1Var.getPainting() != null) {
                xv0 xv0Var = f1Var.getPainting().f41324g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r1 r1Var = (r1) arrayList.get(i10);
                    if (r1Var.f41314c && !r1Var.f41313b) {
                        s1Var.b(canvas, xv0Var, r1Var);
                    }
                }
                i1 i1Var = s1Var.h;
                if (i1Var != null && i1Var.h != 0.0f) {
                    canvas.save();
                    i1 i1Var2 = s1Var.h;
                    canvas.rotate((float) (((-i1Var2.h) / 3.141592653589793d) * 180.0d), (i1Var2.f41240b / xv0Var.f30521a) * canvas.getWidth(), (s1Var.h.f41241c / xv0Var.f30522b) * canvas.getHeight());
                }
                i1 i1Var3 = s1Var.h;
                if (i1Var3 != null && i1Var3.f41239a.o() == 4) {
                    float width = canvas.getWidth() * (s1Var.h.f41240b / xv0Var.f30521a);
                    float height = canvas.getHeight() * (s1Var.h.f41241c / xv0Var.f30522b);
                    float width2 = canvas.getWidth() * (s1Var.h.f41244i / xv0Var.f30521a);
                    float height2 = canvas.getHeight() * (s1Var.h.f41245j / xv0Var.f30522b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (s1Var.h.d / xv0Var.f30521a), canvas2.getHeight() * (s1Var.h.e / xv0Var.f30522b), canvas2.getWidth() * (s1Var.h.f41244i / xv0Var.f30521a), canvas2.getHeight() * (s1Var.h.f41245j / xv0Var.f30522b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    r1 r1Var2 = (r1) arrayList.get(i11);
                    if (r1Var2.f41314c && r1Var2.f41313b) {
                        s1Var.b(canvas2, xv0Var, r1Var2);
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
        d1Var.postRunnable(new org.telegram.ui.web.o1(7, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f41230x;
    }

    public int getCurrentColor() {
        return this.f41229w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f41224c;
    }

    public w1 getUndoStore() {
        return this.f41223b;
    }

    public final void h() {
        this.f41231y = true;
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
        s0 s0Var = this.f41224c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f41324g.f30521a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        xv0 xv0Var = getPainting().f41324g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-xv0Var.f30521a) / 2.0f, (-xv0Var.f30522b) / 2.0f);
        if (this.f41230x instanceof l) {
            s1 s1Var = this.f41225f;
            s1Var.getClass();
            Matrix matrix2 = new Matrix();
            s1Var.f41353o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f41214t = matrix3;
            matrix.invert(matrix3);
        }
        d1 d1Var = this.d;
        s0Var.f41340y = l6.c(l6.b(d1Var.f41192n, d1Var.f41193r), l6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f41230x instanceof l;
        s1 s1Var = this.f41225f;
        if (z10) {
            s1Var.e();
        }
        this.f41230x = mVar;
        i();
        this.f41224c.q(this.f41230x);
        m mVar2 = this.f41230x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = s1Var.f41352n;
            ArrayList arrayList2 = s1Var.f41351m;
            f1 f1Var = s1Var.f41342a;
            if (f1Var != null && f1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                s1Var.h = new i1(l.p(o9));
                xv0 xv0Var = f1Var.getPainting().f41324g;
                i1 i1Var = s1Var.h;
                float f7 = xv0Var.f30521a;
                i1Var.f41240b = f7 / 2.0f;
                float f10 = xv0Var.f30522b;
                i1Var.f41241c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                i1Var.e = min;
                i1Var.d = min;
                s1Var.h.f41242f = f1Var.getCurrentWeight();
                s1Var.h.f41243g = AndroidUtilities.dp(32.0f);
                s1Var.h.f41247l = u0.e(UserConfig.selectedAccount).f41380k;
                if (s1Var.h.f41239a.o() == 4) {
                    i1 i1Var2 = s1Var.h;
                    float f11 = xv0Var.f30521a / 2.0f;
                    i1Var2.d = f11;
                    i1Var2.f41240b = f11;
                    i1Var2.f41244i = f11 + 1.0f;
                    float f12 = xv0Var.f30522b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    i1Var2.f41241c = f14;
                    float f15 = f12 / 2.0f;
                    i1Var2.f41245j = f15;
                    i1Var2.e = f13 * 2.0f;
                    i1Var2.f41246k = Math.abs(f14 - f15);
                    o1 o1Var = new o1(s1Var, 0);
                    arrayList2.add(o1Var);
                    p1 p1Var = new p1(s1Var, o1Var, 0);
                    arrayList2.add(p1Var);
                    arrayList.add(p1Var);
                    p1 p1Var2 = new p1(s1Var, o1Var, 1);
                    arrayList2.add(p1Var2);
                    arrayList.add(p1Var2);
                }
                if (s1Var.h.f41239a.o() == 0) {
                    arrayList2.add(new o1(s1Var, 1));
                }
                if (s1Var.h.f41239a.o() == 2) {
                    arrayList2.add(new o1(s1Var, 2));
                }
                if (s1Var.h.f41239a.o() == 1 || s1Var.h.f41239a.o() == 3) {
                    arrayList2.add(new q1(s1Var, s1Var.h, false, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, false, true));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, true));
                    arrayList2.add(new o1(s1Var, 3, false));
                }
                if (s1Var.h.f41239a.o() == 3) {
                    i1 i1Var3 = s1Var.h;
                    i1Var3.f41244i = (i1Var3.d * 0.8f) + i1Var3.f41240b;
                    i1Var3.f41245j = (i1Var3.e * 1.2f) + i1Var3.f41241c + i1Var3.f41242f;
                    o1 o1Var2 = new o1(s1Var, 4);
                    arrayList2.add(o1Var2);
                    o1Var2.f41313b = false;
                    arrayList.add(o1Var2);
                }
                s1Var.f41350l = new o1(s1Var, 5, false);
                if (s1Var.h.f41239a.o() != 4) {
                    s1Var.f41350l.f41314c = false;
                }
                o1 o1Var3 = s1Var.f41350l;
                o1Var3.f41313b = false;
                arrayList.add(o1Var3);
                arrayList2.add(s1Var.f41350l);
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f41224c.f41324g.f30521a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f41230x instanceof l) {
            s1 s1Var = this.f41225f;
            f1 f1Var = s1Var.f41342a;
            i1 i1Var = s1Var.h;
            if (i1Var != null && i1Var.f41242f != f1Var.getCurrentWeight()) {
                s1Var.h.f41242f = f1Var.getCurrentWeight();
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f41229w = i10;
        if (this.f41230x instanceof l) {
            s1 s1Var = this.f41225f;
            if (s1Var.h != null) {
                s1Var.f41342a.getPainting().k(s1Var.h);
            }
        }
    }

    public void setDelegate(e1 e1Var) {
        this.f41222a = e1Var;
    }

    public void setUndoStore(w1 w1Var) {
        this.f41223b = w1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
