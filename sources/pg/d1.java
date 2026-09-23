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
import org.telegram.ui.Components.jv0;
import w7.k6;
public class d1 extends TextureView {
    public c1 f40799a;
    public u1 f40800b;
    public final r0 f40801c;
    public b1 d;
    public final d0 e;
    public final q1 f40802f;
    public Bitmap h;
    public Bitmap f40803n;
    public boolean f40804r;
    public boolean f40805s;
    public float v;
    public int f40806w;
    public m f40807x;
    public boolean f40808y;

    public d1(Context context, r0 r0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f40803n = bitmap2;
        this.f40801c = r0Var;
        r0Var.f40908f = this;
        setSurfaceTextureListener(new z0(this, jaVar));
        this.e = new d0(this);
        x0 x0Var = new x0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f40891c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f40892f = paint4;
        Paint paint5 = new Paint(1);
        obj.f40893g = paint5;
        obj.f40898m = new ArrayList();
        obj.f40899n = new ArrayList();
        obj.f40901p = new float[2];
        obj.f40889a = this;
        obj.f40890b = x0Var;
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
        this.f40802f = obj;
        r0Var.f40905a = new k2.u(this, 18);
    }

    public final void a() {
        x0 x0Var = new x0(this, 2);
        d0 d0Var = this.e;
        d0Var.f40781g = new v0(d0Var.f40777a.getPainting().f40909g.f25428a, 0.0d, 1.0d);
        d0Var.f40785l = true;
        d0Var.a(new Object(), false, x0Var);
    }

    public final void b() {
        d1 d1Var;
        q1 q1Var = this.f40802f;
        if (q1Var != null && (d1Var = q1Var.f40889a) != null && d1Var.getPainting() != null && q1Var.h != null) {
            r0 painting = d1Var.getPainting();
            painting.f40908f.f(new o0(painting, 0));
            q1Var.f40898m.clear();
            q1Var.f40899n.clear();
            q1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f40807x instanceof l) {
            this.f40802f.e();
        }
        b1 b1Var = this.d;
        if (b1Var != null && b1Var.f40766f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                b1Var.postRunnable(new b8(b1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f40807x instanceof l) {
            q1 q1Var = this.f40802f;
            Paint paint = q1Var.f40891c;
            ArrayList arrayList = q1Var.f40898m;
            d1 d1Var = q1Var.f40889a;
            if (d1Var != null && d1Var.getPainting() != null) {
                jv0 jv0Var = d1Var.getPainting().f40909g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    p1 p1Var = (p1) arrayList.get(i10);
                    if (p1Var.f40885c && !p1Var.f40884b) {
                        q1Var.b(canvas, jv0Var, p1Var);
                    }
                }
                g1 g1Var = q1Var.h;
                if (g1Var != null && g1Var.h != 0.0f) {
                    canvas.save();
                    g1 g1Var2 = q1Var.h;
                    canvas.rotate((float) (((-g1Var2.h) / 3.141592653589793d) * 180.0d), (g1Var2.f40817b / jv0Var.f25428a) * canvas.getWidth(), (q1Var.h.f40818c / jv0Var.f25429b) * canvas.getHeight());
                }
                g1 g1Var3 = q1Var.h;
                if (g1Var3 != null && g1Var3.f40816a.o() == 4) {
                    float width = canvas.getWidth() * (q1Var.h.f40817b / jv0Var.f25428a);
                    float height = canvas.getHeight() * (q1Var.h.f40818c / jv0Var.f25429b);
                    float width2 = canvas.getWidth() * (q1Var.h.f40821i / jv0Var.f25428a);
                    float height2 = canvas.getHeight() * (q1Var.h.f40822j / jv0Var.f25429b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (q1Var.h.d / jv0Var.f25428a), canvas2.getHeight() * (q1Var.h.e / jv0Var.f25429b), canvas2.getWidth() * (q1Var.h.f40821i / jv0Var.f25428a), canvas2.getHeight() * (q1Var.h.f40822j / jv0Var.f25429b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    p1 p1Var2 = (p1) arrayList.get(i11);
                    if (p1Var2.f40885c && p1Var2.f40884b) {
                        q1Var.b(canvas2, jv0Var, p1Var2);
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
        b1Var.postRunnable(new p2.b(2, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f40807x;
    }

    public int getCurrentColor() {
        return this.f40806w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public r0 getPainting() {
        return this.f40801c;
    }

    public u1 getUndoStore() {
        return this.f40800b;
    }

    public final void h() {
        this.f40808y = true;
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
        r0 r0Var = this.f40801c;
        if (r0Var != null) {
            f7 = getWidth() / r0Var.f40909g.f25428a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        jv0 jv0Var = getPainting().f40909g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-jv0Var.f25428a) / 2.0f, (-jv0Var.f25429b) / 2.0f);
        if (this.f40807x instanceof l) {
            q1 q1Var = this.f40802f;
            q1Var.getClass();
            Matrix matrix2 = new Matrix();
            q1Var.f40900o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.f40793t = matrix3;
            matrix.invert(matrix3);
        }
        b1 b1Var = this.d;
        r0Var.f40925y = k6.c(k6.b(b1Var.f40767n, b1Var.f40768r), k6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f40807x instanceof l;
        q1 q1Var = this.f40802f;
        if (z10) {
            q1Var.e();
        }
        this.f40807x = mVar;
        i();
        this.f40801c.q(this.f40807x);
        m mVar2 = this.f40807x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = q1Var.f40899n;
            ArrayList arrayList2 = q1Var.f40898m;
            d1 d1Var = q1Var.f40889a;
            if (d1Var != null && d1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                q1Var.h = new g1(l.p(o9));
                jv0 jv0Var = d1Var.getPainting().f40909g;
                g1 g1Var = q1Var.h;
                float f7 = jv0Var.f25428a;
                g1Var.f40817b = f7 / 2.0f;
                float f10 = jv0Var.f25429b;
                g1Var.f40818c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                g1Var.e = min;
                g1Var.d = min;
                q1Var.h.f40819f = d1Var.getCurrentWeight();
                q1Var.h.f40820g = AndroidUtilities.dp(32.0f);
                q1Var.h.f40824l = t0.e(UserConfig.selectedAccount).f40959k;
                if (q1Var.h.f40816a.o() == 4) {
                    g1 g1Var2 = q1Var.h;
                    float f11 = jv0Var.f25428a / 2.0f;
                    g1Var2.d = f11;
                    g1Var2.f40817b = f11;
                    g1Var2.f40821i = f11 + 1.0f;
                    float f12 = jv0Var.f25429b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    g1Var2.f40818c = f14;
                    float f15 = f12 / 2.0f;
                    g1Var2.f40822j = f15;
                    g1Var2.e = f13 * 2.0f;
                    g1Var2.f40823k = Math.abs(f14 - f15);
                    m1 m1Var = new m1(q1Var, 0);
                    arrayList2.add(m1Var);
                    n1 n1Var = new n1(q1Var, m1Var, 0);
                    arrayList2.add(n1Var);
                    arrayList.add(n1Var);
                    n1 n1Var2 = new n1(q1Var, m1Var, 1);
                    arrayList2.add(n1Var2);
                    arrayList.add(n1Var2);
                }
                if (q1Var.h.f40816a.o() == 0) {
                    arrayList2.add(new m1(q1Var, 1));
                }
                if (q1Var.h.f40816a.o() == 2) {
                    arrayList2.add(new m1(q1Var, 2));
                }
                if (q1Var.h.f40816a.o() == 1 || q1Var.h.f40816a.o() == 3) {
                    arrayList2.add(new o1(q1Var, q1Var.h, false, false));
                    arrayList2.add(new o1(q1Var, q1Var.h, true, false));
                    arrayList2.add(new o1(q1Var, q1Var.h, false, true));
                    arrayList2.add(new o1(q1Var, q1Var.h, true, true));
                    arrayList2.add(new m1(q1Var, 3, false));
                }
                if (q1Var.h.f40816a.o() == 3) {
                    g1 g1Var3 = q1Var.h;
                    g1Var3.f40821i = (g1Var3.d * 0.8f) + g1Var3.f40817b;
                    g1Var3.f40822j = (g1Var3.e * 1.2f) + g1Var3.f40818c + g1Var3.f40819f;
                    m1 m1Var2 = new m1(q1Var, 4);
                    arrayList2.add(m1Var2);
                    m1Var2.f40884b = false;
                    arrayList.add(m1Var2);
                }
                q1Var.f40897l = new m1(q1Var, 5, false);
                if (q1Var.h.f40816a.o() != 4) {
                    q1Var.f40897l.f40885c = false;
                }
                m1 m1Var3 = q1Var.f40897l;
                m1Var3.f40884b = false;
                arrayList.add(m1Var3);
                arrayList2.add(q1Var.f40897l);
                d1Var.getPainting().k(q1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f40801c.f40909g.f25428a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f40807x instanceof l) {
            q1 q1Var = this.f40802f;
            d1 d1Var = q1Var.f40889a;
            g1 g1Var = q1Var.h;
            if (g1Var != null && g1Var.f40819f != d1Var.getCurrentWeight()) {
                q1Var.h.f40819f = d1Var.getCurrentWeight();
                d1Var.getPainting().k(q1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f40806w = i10;
        if (this.f40807x instanceof l) {
            q1 q1Var = this.f40802f;
            if (q1Var.h != null) {
                q1Var.f40889a.getPainting().k(q1Var.h);
            }
        }
    }

    public void setDelegate(c1 c1Var) {
        this.f40799a = c1Var;
    }

    public void setUndoStore(u1 u1Var) {
        this.f40800b = u1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
