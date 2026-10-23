package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import ci.i6;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.ja;
import w7.o6;
public class e1 extends TextureView {
    public d1 f44934a;
    public v1 f44935b;
    public final s0 f44936c;
    public c1 d;
    public final e0 e;
    public final r1 f44937f;
    public Bitmap h;
    public Bitmap f44938n;
    public boolean f44939r;
    public boolean f44940s;
    public float v;
    public int f44941w;
    public m f44942x;
    public boolean f44943y;

    public e1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44938n = bitmap2;
        this.f44936c = s0Var;
        s0Var.f45047f = this;
        setSurfaceTextureListener(new a1(this, jaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f45030c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f45031f = paint4;
        Paint paint5 = new Paint(1);
        obj.f45032g = paint5;
        obj.f45037m = new ArrayList();
        obj.f45038n = new ArrayList();
        obj.f45040p = new float[2];
        obj.f45028a = this;
        obj.f45029b = y0Var;
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
        this.f44937f = obj;
        s0Var.f45044a = new ki.t1(this, 22);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.e;
        e0Var.f44916g = new w0(e0Var.f44912a.getPainting().f45048g.f27465a, 0.0d, 1.0d);
        e0Var.f44920l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        e1 e1Var;
        r1 r1Var = this.f44937f;
        if (r1Var != null && (e1Var = r1Var.f45028a) != null && e1Var.getPainting() != null && r1Var.h != null) {
            s0 painting = e1Var.getPainting();
            painting.f45047f.f(new p0(painting, 0));
            r1Var.f45037m.clear();
            r1Var.f45038n.clear();
            r1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44942x instanceof l) {
            this.f44937f.e();
        }
        c1 c1Var = this.d;
        if (c1Var != null && c1Var.f44901f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                c1Var.postRunnable(new i6(c1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f44942x instanceof l) {
            r1 r1Var = this.f44937f;
            Paint paint = r1Var.f45030c;
            ArrayList arrayList = r1Var.f45037m;
            e1 e1Var = r1Var.f45028a;
            if (e1Var != null && e1Var.getPainting() != null) {
                iw0 iw0Var = e1Var.getPainting().f45048g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    q1 q1Var = (q1) arrayList.get(i10);
                    if (q1Var.f45024c && !q1Var.f45023b) {
                        r1Var.b(canvas, iw0Var, q1Var);
                    }
                }
                h1 h1Var2 = r1Var.h;
                if (h1Var2 != null && h1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-h1Var.h) / 3.141592653589793d) * 180.0d), (r1Var.h.f44953b / iw0Var.f27465a) * canvas.getWidth(), (r1Var.h.f44954c / iw0Var.f27466b) * canvas.getHeight());
                }
                h1 h1Var3 = r1Var.h;
                if (h1Var3 != null && h1Var3.f44952a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (r1Var.h.f44953b / iw0Var.f27465a), canvas.getHeight() * (r1Var.h.f44954c / iw0Var.f27466b), canvas.getWidth() * (r1Var.h.f44957i / iw0Var.f27465a), canvas.getHeight() * (r1Var.h.f44958j / iw0Var.f27466b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (r1Var.h.d / iw0Var.f27465a), canvas2.getHeight() * (r1Var.h.e / iw0Var.f27466b), canvas2.getWidth() * (r1Var.h.f44957i / iw0Var.f27465a), canvas2.getHeight() * (r1Var.h.f44958j / iw0Var.f27466b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q1 q1Var2 = (q1) arrayList.get(i11);
                    if (q1Var2.f45024c && q1Var2.f45023b) {
                        r1Var.b(canvas2, iw0Var, q1Var2);
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
        return this.f44942x;
    }

    public int getCurrentColor() {
        return this.f44941w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f44936c;
    }

    public v1 getUndoStore() {
        return this.f44935b;
    }

    public final void h() {
        this.f44943y = true;
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
        s0 s0Var = this.f44936c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f45048g.f27465a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        iw0 iw0Var = getPainting().f45048g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-iw0Var.f27465a) / 2.0f, (-iw0Var.f27466b) / 2.0f);
        if (this.f44942x instanceof l) {
            r1 r1Var = this.f44937f;
            r1Var.getClass();
            Matrix matrix2 = new Matrix();
            r1Var.f45039o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f44928t = matrix3;
            matrix.invert(matrix3);
        }
        c1 c1Var = this.d;
        s0Var.f45064y = o6.c(o6.b(c1Var.f44902n, c1Var.f44903r), o6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44942x instanceof l;
        r1 r1Var = this.f44937f;
        if (z10) {
            r1Var.e();
        }
        this.f44942x = mVar;
        i();
        this.f44936c.q(this.f44942x);
        m mVar2 = this.f44942x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = r1Var.f45038n;
            ArrayList arrayList2 = r1Var.f45037m;
            e1 e1Var = r1Var.f45028a;
            if (e1Var != null && e1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                r1Var.h = new h1(l.p(o10));
                iw0 iw0Var = e1Var.getPainting().f45048g;
                h1 h1Var = r1Var.h;
                float f7 = iw0Var.f27465a;
                h1Var.f44953b = f7 / 2.0f;
                float f10 = iw0Var.f27466b;
                h1Var.f44954c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                h1Var.e = min;
                h1Var.d = min;
                r1Var.h.f44955f = e1Var.getCurrentWeight();
                r1Var.h.f44956g = AndroidUtilities.dp(32.0f);
                r1Var.h.f44960l = u0.e(UserConfig.selectedAccount).f45098k;
                if (r1Var.h.f44952a.o() == 4) {
                    h1 h1Var2 = r1Var.h;
                    float f11 = iw0Var.f27465a / 2.0f;
                    h1Var2.d = f11;
                    h1Var2.f44953b = f11;
                    h1Var2.f44957i = f11 + 1.0f;
                    float f12 = iw0Var.f27466b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    h1Var2.f44954c = f14;
                    float f15 = f12 / 2.0f;
                    h1Var2.f44958j = f15;
                    h1Var2.e = f13 * 2.0f;
                    h1Var2.f44959k = Math.abs(f14 - f15);
                    n1 n1Var = new n1(r1Var, 0);
                    arrayList2.add(n1Var);
                    o1 o1Var = new o1(r1Var, n1Var, 0);
                    arrayList2.add(o1Var);
                    arrayList.add(o1Var);
                    o1 o1Var2 = new o1(r1Var, n1Var, 1);
                    arrayList2.add(o1Var2);
                    arrayList.add(o1Var2);
                }
                if (r1Var.h.f44952a.o() == 0) {
                    arrayList2.add(new n1(r1Var, 1));
                }
                if (r1Var.h.f44952a.o() == 2) {
                    arrayList2.add(new n1(r1Var, 2));
                }
                if (r1Var.h.f44952a.o() == 1 || r1Var.h.f44952a.o() == 3) {
                    arrayList2.add(new p1(r1Var, r1Var.h, false, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, false, true));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, true));
                    arrayList2.add(new n1(r1Var, 3, false));
                }
                if (r1Var.h.f44952a.o() == 3) {
                    h1 h1Var3 = r1Var.h;
                    h1Var3.f44957i = (h1Var3.d * 0.8f) + h1Var3.f44953b;
                    h1Var3.f44958j = (h1Var3.e * 1.2f) + h1Var3.f44954c + h1Var3.f44955f;
                    n1 n1Var2 = new n1(r1Var, 4);
                    arrayList2.add(n1Var2);
                    n1Var2.f45023b = false;
                    arrayList.add(n1Var2);
                }
                r1Var.f45036l = new n1(r1Var, 5, false);
                if (r1Var.h.f44952a.o() != 4) {
                    r1Var.f45036l.f45024c = false;
                }
                n1 n1Var3 = r1Var.f45036l;
                n1Var3.f45023b = false;
                arrayList.add(n1Var3);
                arrayList2.add(r1Var.f45036l);
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44936c.f45048g.f27465a;
        this.v = k3.t(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44942x instanceof l) {
            r1 r1Var = this.f44937f;
            e1 e1Var = r1Var.f45028a;
            h1 h1Var = r1Var.h;
            if (h1Var != null && h1Var.f44955f != e1Var.getCurrentWeight()) {
                r1Var.h.f44955f = e1Var.getCurrentWeight();
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44941w = i10;
        if (this.f44942x instanceof l) {
            r1 r1Var = this.f44937f;
            if (r1Var.h != null) {
                r1Var.f45028a.getPainting().k(r1Var.h);
            }
        }
    }

    public void setDelegate(d1 d1Var) {
        this.f44934a = d1Var;
    }

    public void setUndoStore(v1 v1Var) {
        this.f44935b = v1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
