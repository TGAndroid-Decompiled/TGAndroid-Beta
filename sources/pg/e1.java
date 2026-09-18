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
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.vv0;
import w7.l6;
public class e1 extends TextureView {
    public d1 f41107a;
    public v1 f41108b;
    public final s0 f41109c;
    public c1 d;
    public final e0 e;
    public final r1 f41110f;
    public Bitmap h;
    public Bitmap f41111n;
    public boolean f41112r;
    public boolean f41113s;
    public float v;
    public int f41114w;
    public m f41115x;
    public boolean f41116y;

    public e1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f41111n = bitmap2;
        this.f41109c = s0Var;
        s0Var.f41223f = this;
        setSurfaceTextureListener(new a1(this, jaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f41204c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f41205f = paint4;
        Paint paint5 = new Paint(1);
        obj.f41206g = paint5;
        obj.f41211m = new ArrayList();
        obj.f41212n = new ArrayList();
        obj.f41214p = new float[2];
        obj.f41202a = this;
        obj.f41203b = y0Var;
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
        this.f41110f = obj;
        s0Var.f41220a = new n2.e(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.e;
        e0Var.f41089g = new w0(e0Var.f41085a.getPainting().f41224g.f29776a, 0.0d, 1.0d);
        e0Var.f41093l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        e1 e1Var;
        r1 r1Var = this.f41110f;
        if (r1Var != null && (e1Var = r1Var.f41202a) != null && e1Var.getPainting() != null && r1Var.h != null) {
            s0 painting = e1Var.getPainting();
            painting.f41223f.f(new p0(painting, 0));
            r1Var.f41211m.clear();
            r1Var.f41212n.clear();
            r1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f41115x instanceof l) {
            this.f41110f.e();
        }
        c1 c1Var = this.d;
        if (c1Var != null && c1Var.f41076f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                c1Var.postRunnable(new z7(c1Var, z10, z11, bitmapArr, countDownLatch));
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
        if (this.f41115x instanceof l) {
            r1 r1Var = this.f41110f;
            Paint paint = r1Var.f41204c;
            ArrayList arrayList = r1Var.f41211m;
            e1 e1Var = r1Var.f41202a;
            if (e1Var != null && e1Var.getPainting() != null) {
                vv0 vv0Var = e1Var.getPainting().f41224g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    q1 q1Var = (q1) arrayList.get(i10);
                    if (q1Var.f41196c && !q1Var.f41195b) {
                        r1Var.b(canvas, vv0Var, q1Var);
                    }
                }
                h1 h1Var = r1Var.h;
                if (h1Var != null && h1Var.h != 0.0f) {
                    canvas.save();
                    h1 h1Var2 = r1Var.h;
                    canvas.rotate((float) (((-h1Var2.h) / 3.141592653589793d) * 180.0d), (h1Var2.f41127b / vv0Var.f29776a) * canvas.getWidth(), (r1Var.h.f41128c / vv0Var.f29777b) * canvas.getHeight());
                }
                h1 h1Var3 = r1Var.h;
                if (h1Var3 != null && h1Var3.f41126a.o() == 4) {
                    float width = canvas.getWidth() * (r1Var.h.f41127b / vv0Var.f29776a);
                    float height = canvas.getHeight() * (r1Var.h.f41128c / vv0Var.f29777b);
                    float width2 = canvas.getWidth() * (r1Var.h.f41131i / vv0Var.f29776a);
                    float height2 = canvas.getHeight() * (r1Var.h.f41132j / vv0Var.f29777b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (r1Var.h.d / vv0Var.f29776a), canvas2.getHeight() * (r1Var.h.e / vv0Var.f29777b), canvas2.getWidth() * (r1Var.h.f41131i / vv0Var.f29776a), canvas2.getHeight() * (r1Var.h.f41132j / vv0Var.f29777b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q1 q1Var2 = (q1) arrayList.get(i11);
                    if (q1Var2.f41196c && q1Var2.f41195b) {
                        r1Var.b(canvas2, vv0Var, q1Var2);
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
        c1Var.postRunnable(new org.telegram.ui.web.p1(6, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f41115x;
    }

    public int getCurrentColor() {
        return this.f41114w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f41109c;
    }

    public v1 getUndoStore() {
        return this.f41108b;
    }

    public final void h() {
        this.f41116y = true;
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
        s0 s0Var = this.f41109c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f41224g.f29776a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        vv0 vv0Var = getPainting().f41224g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-vv0Var.f29776a) / 2.0f, (-vv0Var.f29777b) / 2.0f);
        if (this.f41115x instanceof l) {
            r1 r1Var = this.f41110f;
            r1Var.getClass();
            Matrix matrix2 = new Matrix();
            r1Var.f41213o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f41101t = matrix3;
            matrix.invert(matrix3);
        }
        c1 c1Var = this.d;
        s0Var.f41240y = l6.c(l6.b(c1Var.f41077n, c1Var.f41078r), l6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f41115x instanceof l;
        r1 r1Var = this.f41110f;
        if (z10) {
            r1Var.e();
        }
        this.f41115x = mVar;
        i();
        this.f41109c.q(this.f41115x);
        m mVar2 = this.f41115x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = r1Var.f41212n;
            ArrayList arrayList2 = r1Var.f41211m;
            e1 e1Var = r1Var.f41202a;
            if (e1Var != null && e1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                r1Var.h = new h1(l.p(o9));
                vv0 vv0Var = e1Var.getPainting().f41224g;
                h1 h1Var = r1Var.h;
                float f7 = vv0Var.f29776a;
                h1Var.f41127b = f7 / 2.0f;
                float f10 = vv0Var.f29777b;
                h1Var.f41128c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                h1Var.e = min;
                h1Var.d = min;
                r1Var.h.f41129f = e1Var.getCurrentWeight();
                r1Var.h.f41130g = AndroidUtilities.dp(32.0f);
                r1Var.h.f41134l = u0.e(UserConfig.selectedAccount).f41269k;
                if (r1Var.h.f41126a.o() == 4) {
                    h1 h1Var2 = r1Var.h;
                    float f11 = vv0Var.f29776a / 2.0f;
                    h1Var2.d = f11;
                    h1Var2.f41127b = f11;
                    h1Var2.f41131i = f11 + 1.0f;
                    float f12 = vv0Var.f29777b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    h1Var2.f41128c = f14;
                    float f15 = f12 / 2.0f;
                    h1Var2.f41132j = f15;
                    h1Var2.e = f13 * 2.0f;
                    h1Var2.f41133k = Math.abs(f14 - f15);
                    n1 n1Var = new n1(r1Var, 0);
                    arrayList2.add(n1Var);
                    o1 o1Var = new o1(r1Var, n1Var, 0);
                    arrayList2.add(o1Var);
                    arrayList.add(o1Var);
                    o1 o1Var2 = new o1(r1Var, n1Var, 1);
                    arrayList2.add(o1Var2);
                    arrayList.add(o1Var2);
                }
                if (r1Var.h.f41126a.o() == 0) {
                    arrayList2.add(new n1(r1Var, 1));
                }
                if (r1Var.h.f41126a.o() == 2) {
                    arrayList2.add(new n1(r1Var, 2));
                }
                if (r1Var.h.f41126a.o() == 1 || r1Var.h.f41126a.o() == 3) {
                    arrayList2.add(new p1(r1Var, r1Var.h, false, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, false, true));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, true));
                    arrayList2.add(new n1(r1Var, 3, false));
                }
                if (r1Var.h.f41126a.o() == 3) {
                    h1 h1Var3 = r1Var.h;
                    h1Var3.f41131i = (h1Var3.d * 0.8f) + h1Var3.f41127b;
                    h1Var3.f41132j = (h1Var3.e * 1.2f) + h1Var3.f41128c + h1Var3.f41129f;
                    n1 n1Var2 = new n1(r1Var, 4);
                    arrayList2.add(n1Var2);
                    n1Var2.f41195b = false;
                    arrayList.add(n1Var2);
                }
                r1Var.f41210l = new n1(r1Var, 5, false);
                if (r1Var.h.f41126a.o() != 4) {
                    r1Var.f41210l.f41196c = false;
                }
                n1 n1Var3 = r1Var.f41210l;
                n1Var3.f41195b = false;
                arrayList.add(n1Var3);
                arrayList2.add(r1Var.f41210l);
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f41109c.f41224g.f29776a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f41115x instanceof l) {
            r1 r1Var = this.f41110f;
            e1 e1Var = r1Var.f41202a;
            h1 h1Var = r1Var.h;
            if (h1Var != null && h1Var.f41129f != e1Var.getCurrentWeight()) {
                r1Var.h.f41129f = e1Var.getCurrentWeight();
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f41114w = i10;
        if (this.f41115x instanceof l) {
            r1 r1Var = this.f41110f;
            if (r1Var.h != null) {
                r1Var.f41202a.getPainting().k(r1Var.h);
            }
        }
    }

    public void setDelegate(d1 d1Var) {
        this.f41107a = d1Var;
    }

    public void setUndoStore(v1 v1Var) {
        this.f41108b = v1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
