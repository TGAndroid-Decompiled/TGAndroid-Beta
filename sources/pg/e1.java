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
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.uv0;
import w7.m6;
public class e1 extends TextureView {
    public d1 f41148a;
    public v1 f41149b;
    public final s0 f41150c;
    public c1 d;
    public final e0 e;
    public final r1 f41151f;
    public Bitmap h;
    public Bitmap f41152n;
    public boolean f41153r;
    public boolean f41154s;
    public float v;
    public int f41155w;
    public m f41156x;
    public boolean f41157y;

    public e1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ia iaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f41152n = bitmap2;
        this.f41150c = s0Var;
        s0Var.f41264f = this;
        setSurfaceTextureListener(new a1(this, iaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f41245c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f41246f = paint4;
        Paint paint5 = new Paint(1);
        obj.f41247g = paint5;
        obj.f41252m = new ArrayList();
        obj.f41253n = new ArrayList();
        obj.f41255p = new float[2];
        obj.f41243a = this;
        obj.f41244b = y0Var;
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
        this.f41151f = obj;
        s0Var.f41261a = new n2.e(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.e;
        e0Var.f41130g = new w0(e0Var.f41126a.getPainting().f41265g.f28868a, 0.0d, 1.0d);
        e0Var.f41134l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        e1 e1Var;
        r1 r1Var = this.f41151f;
        if (r1Var != null && (e1Var = r1Var.f41243a) != null && e1Var.getPainting() != null && r1Var.h != null) {
            s0 painting = e1Var.getPainting();
            painting.f41264f.f(new p0(painting, 0));
            r1Var.f41252m.clear();
            r1Var.f41253n.clear();
            r1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f41156x instanceof l) {
            this.f41151f.e();
        }
        c1 c1Var = this.d;
        if (c1Var != null && c1Var.f41117f) {
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
        if (this.f41156x instanceof l) {
            r1 r1Var = this.f41151f;
            Paint paint = r1Var.f41245c;
            ArrayList arrayList = r1Var.f41252m;
            e1 e1Var = r1Var.f41243a;
            if (e1Var != null && e1Var.getPainting() != null) {
                uv0 uv0Var = e1Var.getPainting().f41265g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    q1 q1Var = (q1) arrayList.get(i10);
                    if (q1Var.f41237c && !q1Var.f41236b) {
                        r1Var.b(canvas, uv0Var, q1Var);
                    }
                }
                h1 h1Var = r1Var.h;
                if (h1Var != null && h1Var.h != 0.0f) {
                    canvas.save();
                    h1 h1Var2 = r1Var.h;
                    canvas.rotate((float) (((-h1Var2.h) / 3.141592653589793d) * 180.0d), (h1Var2.f41168b / uv0Var.f28868a) * canvas.getWidth(), (r1Var.h.f41169c / uv0Var.f28869b) * canvas.getHeight());
                }
                h1 h1Var3 = r1Var.h;
                if (h1Var3 != null && h1Var3.f41167a.o() == 4) {
                    float width = canvas.getWidth() * (r1Var.h.f41168b / uv0Var.f28868a);
                    float height = canvas.getHeight() * (r1Var.h.f41169c / uv0Var.f28869b);
                    float width2 = canvas.getWidth() * (r1Var.h.f41172i / uv0Var.f28868a);
                    float height2 = canvas.getHeight() * (r1Var.h.f41173j / uv0Var.f28869b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (r1Var.h.d / uv0Var.f28868a), canvas2.getHeight() * (r1Var.h.e / uv0Var.f28869b), canvas2.getWidth() * (r1Var.h.f41172i / uv0Var.f28868a), canvas2.getHeight() * (r1Var.h.f41173j / uv0Var.f28869b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    q1 q1Var2 = (q1) arrayList.get(i11);
                    if (q1Var2.f41237c && q1Var2.f41236b) {
                        r1Var.b(canvas2, uv0Var, q1Var2);
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
        c1Var.postRunnable(new org.telegram.ui.web.g1(8, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f41156x;
    }

    public int getCurrentColor() {
        return this.f41155w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f41150c;
    }

    public v1 getUndoStore() {
        return this.f41149b;
    }

    public final void h() {
        this.f41157y = true;
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
        s0 s0Var = this.f41150c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f41265g.f28868a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        uv0 uv0Var = getPainting().f41265g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-uv0Var.f28868a) / 2.0f, (-uv0Var.f28869b) / 2.0f);
        if (this.f41156x instanceof l) {
            r1 r1Var = this.f41151f;
            r1Var.getClass();
            Matrix matrix2 = new Matrix();
            r1Var.f41254o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f41142t = matrix3;
            matrix.invert(matrix3);
        }
        c1 c1Var = this.d;
        s0Var.f41281y = m6.c(m6.b(c1Var.f41118n, c1Var.f41119r), m6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f41156x instanceof l;
        r1 r1Var = this.f41151f;
        if (z10) {
            r1Var.e();
        }
        this.f41156x = mVar;
        i();
        this.f41150c.q(this.f41156x);
        m mVar2 = this.f41156x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = r1Var.f41253n;
            ArrayList arrayList2 = r1Var.f41252m;
            e1 e1Var = r1Var.f41243a;
            if (e1Var != null && e1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                r1Var.h = new h1(l.p(o9));
                uv0 uv0Var = e1Var.getPainting().f41265g;
                h1 h1Var = r1Var.h;
                float f7 = uv0Var.f28868a;
                h1Var.f41168b = f7 / 2.0f;
                float f10 = uv0Var.f28869b;
                h1Var.f41169c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                h1Var.e = min;
                h1Var.d = min;
                r1Var.h.f41170f = e1Var.getCurrentWeight();
                r1Var.h.f41171g = AndroidUtilities.dp(32.0f);
                r1Var.h.f41175l = u0.e(UserConfig.selectedAccount).f41310k;
                if (r1Var.h.f41167a.o() == 4) {
                    h1 h1Var2 = r1Var.h;
                    float f11 = uv0Var.f28868a / 2.0f;
                    h1Var2.d = f11;
                    h1Var2.f41168b = f11;
                    h1Var2.f41172i = f11 + 1.0f;
                    float f12 = uv0Var.f28869b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    h1Var2.f41169c = f14;
                    float f15 = f12 / 2.0f;
                    h1Var2.f41173j = f15;
                    h1Var2.e = f13 * 2.0f;
                    h1Var2.f41174k = Math.abs(f14 - f15);
                    n1 n1Var = new n1(r1Var, 0);
                    arrayList2.add(n1Var);
                    o1 o1Var = new o1(r1Var, n1Var, 0);
                    arrayList2.add(o1Var);
                    arrayList.add(o1Var);
                    o1 o1Var2 = new o1(r1Var, n1Var, 1);
                    arrayList2.add(o1Var2);
                    arrayList.add(o1Var2);
                }
                if (r1Var.h.f41167a.o() == 0) {
                    arrayList2.add(new n1(r1Var, 1));
                }
                if (r1Var.h.f41167a.o() == 2) {
                    arrayList2.add(new n1(r1Var, 2));
                }
                if (r1Var.h.f41167a.o() == 1 || r1Var.h.f41167a.o() == 3) {
                    arrayList2.add(new p1(r1Var, r1Var.h, false, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, false));
                    arrayList2.add(new p1(r1Var, r1Var.h, false, true));
                    arrayList2.add(new p1(r1Var, r1Var.h, true, true));
                    arrayList2.add(new n1(r1Var, 3, false));
                }
                if (r1Var.h.f41167a.o() == 3) {
                    h1 h1Var3 = r1Var.h;
                    h1Var3.f41172i = (h1Var3.d * 0.8f) + h1Var3.f41168b;
                    h1Var3.f41173j = (h1Var3.e * 1.2f) + h1Var3.f41169c + h1Var3.f41170f;
                    n1 n1Var2 = new n1(r1Var, 4);
                    arrayList2.add(n1Var2);
                    n1Var2.f41236b = false;
                    arrayList.add(n1Var2);
                }
                r1Var.f41251l = new n1(r1Var, 5, false);
                if (r1Var.h.f41167a.o() != 4) {
                    r1Var.f41251l.f41237c = false;
                }
                n1 n1Var3 = r1Var.f41251l;
                n1Var3.f41236b = false;
                arrayList.add(n1Var3);
                arrayList2.add(r1Var.f41251l);
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f41150c.f41265g.f28868a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f41156x instanceof l) {
            r1 r1Var = this.f41151f;
            e1 e1Var = r1Var.f41243a;
            h1 h1Var = r1Var.h;
            if (h1Var != null && h1Var.f41170f != e1Var.getCurrentWeight()) {
                r1Var.h.f41170f = e1Var.getCurrentWeight();
                e1Var.getPainting().k(r1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f41155w = i10;
        if (this.f41156x instanceof l) {
            r1 r1Var = this.f41151f;
            if (r1Var.h != null) {
                r1Var.f41243a.getPainting().k(r1Var.h);
            }
        }
    }

    public void setDelegate(d1 d1Var) {
        this.f41148a = d1Var;
    }

    public void setUndoStore(v1 v1Var) {
        this.f41149b = v1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
