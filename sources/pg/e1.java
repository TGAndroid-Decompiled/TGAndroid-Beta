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
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.web.w1;
import w7.k6;
public class e1 extends TextureView {
    public d1 f45677a;
    public v1 f45678b;
    public final s0 f45679c;
    public c1 d;
    public final d0 f45680e;
    public final r1 f45681f;
    public Bitmap h;
    public Bitmap f45682n;
    public boolean f45683r;
    public boolean f45684s;
    public float v;
    public int f45685w;
    public m f45686x;
    public boolean f45687y;

    public e1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ma maVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f45682n = bitmap2;
        this.f45679c = s0Var;
        s0Var.f45803f = this;
        setSurfaceTextureListener(new a1(this, maVar));
        this.f45680e = new d0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f45781c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f45782e = paint3;
        Paint paint4 = new Paint(1);
        obj.f45783f = paint4;
        Paint paint5 = new Paint(1);
        obj.f45784g = paint5;
        obj.f45789m = new ArrayList();
        obj.f45790n = new ArrayList();
        obj.f45792p = new float[2];
        obj.f45779a = this;
        obj.f45780b = y0Var;
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
        this.f45681f = obj;
        s0Var.f45799a = new f3(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        d0 d0Var = this.f45680e;
        d0Var.f45658g = new w0(d0Var.f45653a.getPainting().f45804g.f29260a, 0.0d, 1.0d);
        d0Var.f45662l = true;
        d0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        e1 e1Var;
        r1 r1Var = this.f45681f;
        if (r1Var != null && (e1Var = r1Var.f45779a) != null && e1Var.getPainting() != null && r1Var.h != null) {
            s0 painting = e1Var.getPainting();
            painting.f45803f.f(new p0(painting, 0));
            r1Var.f45789m.clear();
            r1Var.f45790n.clear();
            r1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f45686x instanceof l) {
            this.f45681f.e();
        }
        c1 c1Var = this.d;
        if (c1Var != null && c1Var.f45646f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                c1Var.postRunnable(new c8(c1Var, z10, z11, bitmapArr, countDownLatch));
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
        h1 h1Var;
        if (this.f45686x instanceof l) {
            r1 r1Var = this.f45681f;
            Paint paint = r1Var.f45781c;
            ArrayList arrayList = r1Var.f45789m;
            e1 e1Var = r1Var.f45779a;
            if (e1Var != null && e1Var.getPainting() != null) {
                nw0 nw0Var = e1Var.getPainting().f45804g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    q1 q1Var = (q1) arrayList.get(i10);
                    if (q1Var.f45771c && !q1Var.f45770b) {
                        r1Var.b(canvas, nw0Var, q1Var);
                    }
                }
                h1 h1Var2 = r1Var.h;
                if (h1Var2 != null && h1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-h1Var.h) / 3.141592653589793d) * 180.0d), (r1Var.h.f45698b / nw0Var.f29260a) * canvas.getWidth(), (r1Var.h.f45699c / nw0Var.f29261b) * canvas.getHeight());
                }
                h1 h1Var3 = r1Var.h;
                if (h1Var3 != null && h1Var3.f45697a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (r1Var.h.f45698b / nw0Var.f29260a), canvas.getHeight() * (r1Var.h.f45699c / nw0Var.f29261b), canvas.getWidth() * (r1Var.h.f45703i / nw0Var.f29260a), canvas.getHeight() * (r1Var.h.f45704j / nw0Var.f29261b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (r1Var.h.d / nw0Var.f29260a), canvas2.getHeight() * (r1Var.h.f45700e / nw0Var.f29261b), canvas2.getWidth() * (r1Var.h.f45703i / nw0Var.f29260a), canvas2.getHeight() * (r1Var.h.f45704j / nw0Var.f29261b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q1 q1Var2 = (q1) arrayList.get(i11);
                    if (q1Var2.f45771c && q1Var2.f45770b) {
                        r1Var.b(canvas2, nw0Var, q1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: pg.e1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        c1 c1Var = this.d;
        if (c1Var == null) {
            return;
        }
        c1Var.postRunnable(new w1(5, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f45686x;
    }

    public int getCurrentColor() {
        return this.f45685w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f45679c;
    }

    public v1 getUndoStore() {
        return this.f45678b;
    }

    public final void h() {
        this.f45687y = true;
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
        s0 s0Var = this.f45679c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f45804g.f29260a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        nw0 nw0Var = getPainting().f45804g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-nw0Var.f29260a) / 2.0f, (-nw0Var.f29261b) / 2.0f);
        if (this.f45686x instanceof l) {
            r1 r1Var = this.f45681f;
            r1Var.getClass();
            Matrix matrix2 = new Matrix();
            r1Var.f45791o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.f45680e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f45670t = matrix3;
            matrix.invert(matrix3);
        }
        c1 c1Var = this.d;
        s0Var.f45820y = k6.c(k6.b(c1Var.f45647n, c1Var.f45648r), k6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f45686x instanceof l;
        r1 r1Var = this.f45681f;
        if (z10) {
            r1Var.e();
        }
        this.f45686x = mVar;
        i();
        this.f45679c.q(this.f45686x);
        m mVar2 = this.f45686x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = r1Var.f45790n;
            ArrayList arrayList2 = r1Var.f45789m;
            e1 e1Var = r1Var.f45779a;
            if (e1Var != null && e1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                r1Var.h = new h1(l.p(o9));
                nw0 nw0Var = e1Var.getPainting().f45804g;
                h1 h1Var = r1Var.h;
                float f7 = nw0Var.f29260a;
                h1Var.f45698b = f7 / 2.0f;
                float f10 = nw0Var.f29261b;
                h1Var.f45699c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                h1Var.f45700e = min;
                h1Var.d = min;
                r1Var.h.f45701f = e1Var.getCurrentWeight();
                r1Var.h.f45702g = AndroidUtilities.dp(32.0f);
                r1Var.h.f45706l = u0.e(UserConfig.selectedAccount).f45852k;
                if (r1Var.h.f45697a.o() == 4) {
                    h1 h1Var2 = r1Var.h;
                    float f11 = nw0Var.f29260a / 2.0f;
                    h1Var2.d = f11;
                    h1Var2.f45698b = f11;
                    h1Var2.f45703i = f11 + 1.0f;
                    float f12 = nw0Var.f29261b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    h1Var2.f45699c = f14;
                    float f15 = f12 / 2.0f;
                    h1Var2.f45704j = f15;
                    h1Var2.f45700e = f13 * 2.0f;
                    h1Var2.f45705k = Math.abs(f14 - f15);
                    n1 n1Var = new n1(r1Var, 0);
                    arrayList2.add(n1Var);
                    o1 o1Var = new o1(r1Var, n1Var, 0);
                    arrayList2.add(o1Var);
                    arrayList.add(o1Var);
                    o1 o1Var2 = new o1(r1Var, n1Var, 1);
                    arrayList2.add(o1Var2);
                    arrayList.add(o1Var2);
                }
                if (r1Var.h.f45697a.o() == 0) {
                    arrayList2.add(new n1(r1Var, 1));
                }
                if (r1Var.h.f45697a.o() == 2) {
                    arrayList2.add(new n1(r1Var, 2));
                }
                if (r1Var.h.f45697a.o() == 1 || r1Var.h.f45697a.o() == 3) {
                    arrayList2.add(new p1(r1Var, r1Var.h, false, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, false, true));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, true));
                    arrayList2.add(new n1(r1Var, 3, false));
                }
                if (r1Var.h.f45697a.o() == 3) {
                    h1 h1Var3 = r1Var.h;
                    h1Var3.f45703i = (h1Var3.d * 0.8f) + h1Var3.f45698b;
                    h1Var3.f45704j = (h1Var3.f45700e * 1.2f) + h1Var3.f45699c + h1Var3.f45701f;
                    n1 n1Var2 = new n1(r1Var, 4);
                    arrayList2.add(n1Var2);
                    n1Var2.f45770b = false;
                    arrayList.add(n1Var2);
                }
                r1Var.f45788l = new n1(r1Var, 5, false);
                if (r1Var.h.f45697a.o() != 4) {
                    r1Var.f45788l.f45771c = false;
                }
                n1 n1Var3 = r1Var.f45788l;
                n1Var3.f45770b = false;
                arrayList.add(n1Var3);
                arrayList2.add(r1Var.f45788l);
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f45679c.f45804g.f29260a;
        this.v = e2.w(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f45686x instanceof l) {
            r1 r1Var = this.f45681f;
            e1 e1Var = r1Var.f45779a;
            h1 h1Var = r1Var.h;
            if (h1Var != null && h1Var.f45701f != e1Var.getCurrentWeight()) {
                r1Var.h.f45701f = e1Var.getCurrentWeight();
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f45685w = i10;
        if (this.f45686x instanceof l) {
            r1 r1Var = this.f45681f;
            if (r1Var.h != null) {
                r1Var.f45779a.getPainting().k(r1Var.h);
            }
        }
    }

    public void setDelegate(d1 d1Var) {
        this.f45677a = d1Var;
    }

    public void setUndoStore(v1 v1Var) {
        this.f45678b = v1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
