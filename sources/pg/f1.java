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
    public e1 f44477a;
    public w1 f44478b;
    public final s0 f44479c;
    public d1 d;
    public final e0 f44480e;
    public final s1 f44481f;
    public Bitmap h;
    public Bitmap f44482n;
    public boolean f44483r;
    public boolean f44484s;
    public float v;
    public int f44485w;
    public m f44486x;
    public boolean f44487y;

    public f1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ka kaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44482n = bitmap2;
        this.f44479c = s0Var;
        s0Var.f44587f = this;
        setSurfaceTextureListener(new a1(this, kaVar));
        this.f44480e = new e0(this);
        y0 y0Var = new y0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f44608c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f44609e = paint3;
        Paint paint4 = new Paint(1);
        obj.f44610f = paint4;
        Paint paint5 = new Paint(1);
        obj.f44611g = paint5;
        obj.f44616m = new ArrayList();
        obj.f44617n = new ArrayList();
        obj.f44619p = new float[2];
        obj.f44606a = this;
        obj.f44607b = y0Var;
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
        this.f44481f = obj;
        s0Var.f44583a = new l2.g(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.f44480e;
        e0Var.f44457g = new w0(e0Var.f44452a.getPainting().f44588g.f26585a, 0.0d, 1.0d);
        e0Var.f44461l = true;
        e0Var.a(new Object(), false, y0Var);
    }

    public final void b() {
        f1 f1Var;
        s1 s1Var = this.f44481f;
        if (s1Var != null && (f1Var = s1Var.f44606a) != null && f1Var.getPainting() != null && s1Var.h != null) {
            s0 painting = f1Var.getPainting();
            painting.f44587f.f(new p0(painting, 0));
            s1Var.f44616m.clear();
            s1Var.f44617n.clear();
            s1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44486x instanceof l) {
            this.f44481f.e();
        }
        d1 d1Var = this.d;
        if (d1Var != null && d1Var.f44445f) {
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
        if (this.f44486x instanceof l) {
            s1 s1Var = this.f44481f;
            Paint paint = s1Var.f44608c;
            ArrayList arrayList = s1Var.f44616m;
            f1 f1Var = s1Var.f44606a;
            if (f1Var != null && f1Var.getPainting() != null) {
                fw0 fw0Var = f1Var.getPainting().f44588g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r1 r1Var = (r1) arrayList.get(i10);
                    if (r1Var.f44575c && !r1Var.f44574b) {
                        s1Var.b(canvas, fw0Var, r1Var);
                    }
                }
                i1 i1Var = s1Var.h;
                if (i1Var != null && i1Var.h != 0.0f) {
                    canvas.save();
                    i1 i1Var2 = s1Var.h;
                    canvas.rotate((float) (((-i1Var2.h) / 3.141592653589793d) * 180.0d), (i1Var2.f44496b / fw0Var.f26585a) * canvas.getWidth(), (s1Var.h.f44497c / fw0Var.f26586b) * canvas.getHeight());
                }
                i1 i1Var3 = s1Var.h;
                if (i1Var3 != null && i1Var3.f44495a.o() == 4) {
                    float width = canvas.getWidth() * (s1Var.h.f44496b / fw0Var.f26585a);
                    float height = canvas.getHeight() * (s1Var.h.f44497c / fw0Var.f26586b);
                    float width2 = canvas.getWidth() * (s1Var.h.f44501i / fw0Var.f26585a);
                    float height2 = canvas.getHeight() * (s1Var.h.f44502j / fw0Var.f26586b);
                    canvas2 = canvas;
                    canvas2.drawLine(width, height, width2, height2, paint);
                    canvas2.drawLine(canvas2.getWidth() * (s1Var.h.d / fw0Var.f26585a), canvas2.getHeight() * (s1Var.h.f44498e / fw0Var.f26586b), canvas2.getWidth() * (s1Var.h.f44501i / fw0Var.f26585a), canvas2.getHeight() * (s1Var.h.f44502j / fw0Var.f26586b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    r1 r1Var2 = (r1) arrayList.get(i11);
                    if (r1Var2.f44575c && r1Var2.f44574b) {
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
        return this.f44486x;
    }

    public int getCurrentColor() {
        return this.f44485w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public s0 getPainting() {
        return this.f44479c;
    }

    public w1 getUndoStore() {
        return this.f44478b;
    }

    public final void h() {
        this.f44487y = true;
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
        s0 s0Var = this.f44479c;
        if (s0Var != null) {
            f7 = getWidth() / s0Var.f44588g.f26585a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        fw0 fw0Var = getPainting().f44588g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-fw0Var.f26585a) / 2.0f, (-fw0Var.f26586b) / 2.0f);
        if (this.f44486x instanceof l) {
            s1 s1Var = this.f44481f;
            s1Var.getClass();
            Matrix matrix2 = new Matrix();
            s1Var.f44618o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.f44480e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f44469t = matrix3;
            matrix.invert(matrix3);
        }
        d1 d1Var = this.d;
        s0Var.f44604y = m6.c(m6.b(d1Var.f44446n, d1Var.f44447r), m6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44486x instanceof l;
        s1 s1Var = this.f44481f;
        if (z10) {
            s1Var.e();
        }
        this.f44486x = mVar;
        i();
        this.f44479c.q(this.f44486x);
        m mVar2 = this.f44486x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = s1Var.f44617n;
            ArrayList arrayList2 = s1Var.f44616m;
            f1 f1Var = s1Var.f44606a;
            if (f1Var != null && f1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                s1Var.h = new i1(l.p(o9));
                fw0 fw0Var = f1Var.getPainting().f44588g;
                i1 i1Var = s1Var.h;
                float f7 = fw0Var.f26585a;
                i1Var.f44496b = f7 / 2.0f;
                float f10 = fw0Var.f26586b;
                i1Var.f44497c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                i1Var.f44498e = min;
                i1Var.d = min;
                s1Var.h.f44499f = f1Var.getCurrentWeight();
                s1Var.h.f44500g = AndroidUtilities.dp(32.0f);
                s1Var.h.f44504l = u0.e(UserConfig.selectedAccount).f44648k;
                if (s1Var.h.f44495a.o() == 4) {
                    i1 i1Var2 = s1Var.h;
                    float f11 = fw0Var.f26585a / 2.0f;
                    i1Var2.d = f11;
                    i1Var2.f44496b = f11;
                    i1Var2.f44501i = f11 + 1.0f;
                    float f12 = fw0Var.f26586b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    i1Var2.f44497c = f14;
                    float f15 = f12 / 2.0f;
                    i1Var2.f44502j = f15;
                    i1Var2.f44498e = f13 * 2.0f;
                    i1Var2.f44503k = Math.abs(f14 - f15);
                    o1 o1Var = new o1(s1Var, 0);
                    arrayList2.add(o1Var);
                    p1 p1Var = new p1(s1Var, o1Var, 0);
                    arrayList2.add(p1Var);
                    arrayList.add(p1Var);
                    p1 p1Var2 = new p1(s1Var, o1Var, 1);
                    arrayList2.add(p1Var2);
                    arrayList.add(p1Var2);
                }
                if (s1Var.h.f44495a.o() == 0) {
                    arrayList2.add(new o1(s1Var, 1));
                }
                if (s1Var.h.f44495a.o() == 2) {
                    arrayList2.add(new o1(s1Var, 2));
                }
                if (s1Var.h.f44495a.o() == 1 || s1Var.h.f44495a.o() == 3) {
                    arrayList2.add(new q1(s1Var, s1Var.h, false, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, false, true));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, true));
                    arrayList2.add(new o1(s1Var, 3, false));
                }
                if (s1Var.h.f44495a.o() == 3) {
                    i1 i1Var3 = s1Var.h;
                    i1Var3.f44501i = (i1Var3.d * 0.8f) + i1Var3.f44496b;
                    i1Var3.f44502j = (i1Var3.f44498e * 1.2f) + i1Var3.f44497c + i1Var3.f44499f;
                    o1 o1Var2 = new o1(s1Var, 4);
                    arrayList2.add(o1Var2);
                    o1Var2.f44574b = false;
                    arrayList.add(o1Var2);
                }
                s1Var.f44615l = new o1(s1Var, 5, false);
                if (s1Var.h.f44495a.o() != 4) {
                    s1Var.f44615l.f44575c = false;
                }
                o1 o1Var3 = s1Var.f44615l;
                o1Var3.f44574b = false;
                arrayList.add(o1Var3);
                arrayList2.add(s1Var.f44615l);
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44479c.f44588g.f26585a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44486x instanceof l) {
            s1 s1Var = this.f44481f;
            f1 f1Var = s1Var.f44606a;
            i1 i1Var = s1Var.h;
            if (i1Var != null && i1Var.f44499f != f1Var.getCurrentWeight()) {
                s1Var.h.f44499f = f1Var.getCurrentWeight();
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44485w = i10;
        if (this.f44486x instanceof l) {
            s1 s1Var = this.f44481f;
            if (s1Var.h != null) {
                s1Var.f44606a.getPainting().k(s1Var.h);
            }
        }
    }

    public void setDelegate(e1 e1Var) {
        this.f44477a = e1Var;
    }

    public void setUndoStore(w1 w1Var) {
        this.f44478b = w1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
