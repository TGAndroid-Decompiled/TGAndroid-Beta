package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import c8.ic;
import com.google.android.gms.internal.vision.e2;
import fi.q5;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.i10;
import org.telegram.messenger.r5;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.web.t1;
public class t0 extends TextureView {
    public boolean E;
    public s0 f57469a;
    public j1 f57470b;
    public final h0 f57471c;
    public r0 d;
    public final v f57472e;
    public final f1 f57473f;
    public Bitmap h;
    public Bitmap f57474n;
    public boolean f57475r;
    public boolean f57476s;
    public float f57477w;
    public int f57478x;
    public h f57479y;

    public t0(Context context, h0 h0Var, Bitmap bitmap, Bitmap bitmap2, ba baVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f57474n = bitmap2;
        this.f57471c = h0Var;
        h0Var.f57343f = this;
        setSurfaceTextureListener(new p0(this, baVar));
        this.f57472e = new v(this);
        n0 n0Var = new n0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f57319c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.f57320e = paint3;
        Paint paint4 = new Paint(1);
        obj.f57321f = paint4;
        Paint paint5 = new Paint(1);
        obj.f57322g = paint5;
        obj.f57327m = new ArrayList();
        obj.f57328n = new ArrayList();
        obj.f57330p = new float[2];
        obj.f57317a = this;
        obj.f57318b = n0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, 1073741824);
        this.f57473f = obj;
        h0Var.f57339a = new nd0(this, 14);
    }

    public final void a() {
        n0 n0Var = new n0(this, 2);
        v vVar = this.f57472e;
        vVar.f57492g = new l0(vVar.f57487a.getPainting().f57344g.f42189a, 0.0d, 1.0d);
        vVar.f57496l = true;
        vVar.a(new Object(), false, n0Var);
    }

    public final void b() {
        t0 t0Var;
        f1 f1Var = this.f57473f;
        if (f1Var != null && (t0Var = f1Var.f57317a) != null && t0Var.getPainting() != null && f1Var.h != null) {
            h0 painting = t0Var.getPainting();
            painting.f57343f.f(new e0(painting, 0));
            f1Var.f57327m.clear();
            f1Var.f57328n.clear();
            f1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f57479y instanceof g) {
            this.f57473f.e();
        }
        r0 r0Var = this.d;
        if (r0Var != null && r0Var.f57457f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                r0Var.postRunnable(new q5(r0Var, z10, z11, bitmapArr, countDownLatch));
                countDownLatch.await();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        w0 w0Var;
        if (this.f57479y instanceof g) {
            f1 f1Var = this.f57473f;
            Paint paint = f1Var.f57319c;
            ArrayList arrayList = f1Var.f57327m;
            t0 t0Var = f1Var.f57317a;
            if (t0Var != null && t0Var.getPainting() != null) {
                xt0 xt0Var = t0Var.getPainting().f57344g;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    e1 e1Var = (e1) arrayList.get(i7);
                    if (e1Var.f57312c && !e1Var.f57311b) {
                        f1Var.b(canvas, xt0Var, e1Var);
                    }
                }
                w0 w0Var2 = f1Var.h;
                if (w0Var2 != null && w0Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-w0Var.h) / 3.141592653589793d) * 180.0d), (f1Var.h.f57513b / xt0Var.f42189a) * canvas.getWidth(), (f1Var.h.f57514c / xt0Var.f42190b) * canvas.getHeight());
                }
                w0 w0Var3 = f1Var.h;
                if (w0Var3 != null && w0Var3.f57512a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (f1Var.h.f57513b / xt0Var.f42189a), canvas.getHeight() * (f1Var.h.f57514c / xt0Var.f42190b), canvas.getWidth() * (f1Var.h.f57518i / xt0Var.f42189a), canvas.getHeight() * (f1Var.h.f57519j / xt0Var.f42190b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (f1Var.h.d / xt0Var.f42189a), canvas2.getHeight() * (f1Var.h.f57515e / xt0Var.f42190b), canvas2.getWidth() * (f1Var.h.f57518i / xt0Var.f42189a), canvas2.getHeight() * (f1Var.h.f57519j / xt0Var.f42190b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    e1 e1Var2 = (e1) arrayList.get(i10);
                    if (e1Var2.f57312c && e1Var2.f57311b) {
                        f1Var.b(canvas2, xt0Var, e1Var2);
                    }
                }
                w0 w0Var4 = f1Var.h;
                if (w0Var4 != null && w0Var4.h != 0.0f) {
                    canvas2.restore();
                }
            }
        }
    }

    public final void e(android.view.MotionEvent r33) {
        throw new UnsupportedOperationException("Method not decompiled: sg.t0.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        r0 r0Var = this.d;
        if (r0Var == null) {
            return;
        }
        r0Var.postRunnable(new t1(15, this, runnable));
    }

    public h getCurrentBrush() {
        return this.f57479y;
    }

    public int getCurrentColor() {
        return this.f57478x;
    }

    public float getCurrentWeight() {
        return this.f57477w;
    }

    public h0 getPainting() {
        return this.f57471c;
    }

    public j1 getUndoStore() {
        return this.f57470b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new n0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        float f10;
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        float f11 = 1.0f;
        h0 h0Var = this.f57471c;
        if (h0Var != null) {
            f10 = getWidth() / h0Var.f57344g.f42189a;
        } else {
            f10 = 1.0f;
        }
        if (f10 > 0.0f) {
            f11 = f10;
        }
        xt0 xt0Var = getPainting().f57344g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f11, -f11);
        matrix.preTranslate((-xt0Var.f42189a) / 2.0f, (-xt0Var.f42190b) / 2.0f);
        if (this.f57479y instanceof g) {
            f1 f1Var = this.f57473f;
            f1Var.getClass();
            Matrix matrix2 = new Matrix();
            f1Var.f57329o = matrix2;
            matrix.invert(matrix2);
        } else {
            v vVar = this.f57472e;
            vVar.getClass();
            Matrix matrix3 = new Matrix();
            vVar.f57504t = matrix3;
            matrix.invert(matrix3);
        }
        r0 r0Var = this.d;
        h0Var.f57360y = ic.c(ic.b(r0Var.f57458n, r0Var.f57459r), ic.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.f57479y instanceof g;
        f1 f1Var = this.f57473f;
        if (z10) {
            f1Var.e();
        }
        this.f57479y = hVar;
        i();
        this.f57471c.q(this.f57479y);
        h hVar2 = this.f57479y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = f1Var.f57328n;
            ArrayList arrayList2 = f1Var.f57327m;
            t0 t0Var = f1Var.f57317a;
            if (t0Var != null && t0Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                f1Var.h = new w0(g.p(o4));
                xt0 xt0Var = t0Var.getPainting().f57344g;
                w0 w0Var = f1Var.h;
                float f10 = xt0Var.f42189a;
                w0Var.f57513b = f10 / 2.0f;
                float f11 = xt0Var.f42190b;
                w0Var.f57514c = f11 / 2.0f;
                float min = Math.min(f10, f11) / 5.0f;
                w0Var.f57515e = min;
                w0Var.d = min;
                f1Var.h.f57516f = t0Var.getCurrentWeight();
                f1Var.h.f57517g = org.telegram.messenger.g0.L(32.0f);
                f1Var.h.f57521l = j0.e(i10.f24637t0).f57384k;
                if (f1Var.h.f57512a.o() == 4) {
                    w0 w0Var2 = f1Var.h;
                    float f12 = xt0Var.f42189a / 2.0f;
                    w0Var2.d = f12;
                    w0Var2.f57513b = f12;
                    w0Var2.f57518i = f12 + 1.0f;
                    float f13 = xt0Var.f42190b;
                    float f14 = f13 / 3.0f;
                    float f15 = 1.0f * f14;
                    w0Var2.f57514c = f15;
                    float f16 = f13 / 2.0f;
                    w0Var2.f57519j = f16;
                    w0Var2.f57515e = f14 * 2.0f;
                    w0Var2.f57520k = Math.abs(f15 - f16);
                    b1 b1Var = new b1(f1Var, 0);
                    arrayList2.add(b1Var);
                    c1 c1Var = new c1(f1Var, b1Var, 0);
                    arrayList2.add(c1Var);
                    arrayList.add(c1Var);
                    c1 c1Var2 = new c1(f1Var, b1Var, 1);
                    arrayList2.add(c1Var2);
                    arrayList.add(c1Var2);
                }
                if (f1Var.h.f57512a.o() == 0) {
                    arrayList2.add(new b1(f1Var, 1));
                }
                if (f1Var.h.f57512a.o() == 2) {
                    arrayList2.add(new b1(f1Var, 2));
                }
                if (f1Var.h.f57512a.o() == 1 || f1Var.h.f57512a.o() == 3) {
                    arrayList2.add(new d1(f1Var, f1Var.h, false, false));
                    arrayList2.add(new d1(f1Var, f1Var.h, true, false));
                    arrayList2.add(new d1(f1Var, f1Var.h, false, true));
                    arrayList2.add(new d1(f1Var, f1Var.h, true, true));
                    arrayList2.add(new b1(f1Var, 3, false));
                }
                if (f1Var.h.f57512a.o() == 3) {
                    w0 w0Var3 = f1Var.h;
                    w0Var3.f57518i = (w0Var3.d * 0.8f) + w0Var3.f57513b;
                    w0Var3.f57519j = (w0Var3.f57515e * 1.2f) + w0Var3.f57514c + w0Var3.f57516f;
                    b1 b1Var2 = new b1(f1Var, 4);
                    arrayList2.add(b1Var2);
                    b1Var2.f57311b = false;
                    arrayList.add(b1Var2);
                }
                f1Var.f57326l = new b1(f1Var, 5, false);
                if (f1Var.h.f57512a.o() != 4) {
                    f1Var.f57326l.f57312c = false;
                }
                b1 b1Var3 = f1Var.f57326l;
                b1Var3.f57311b = false;
                arrayList.add(b1Var3);
                arrayList2.add(f1Var.f57326l);
                t0Var.getPainting().k(f1Var.h);
            }
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.f57471c.f57344g.f42189a;
        this.f57477w = e2.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.f57479y instanceof g) {
            f1 f1Var = this.f57473f;
            t0 t0Var = f1Var.f57317a;
            w0 w0Var = f1Var.h;
            if (w0Var != null && w0Var.f57516f != t0Var.getCurrentWeight()) {
                f1Var.h.f57516f = t0Var.getCurrentWeight();
                t0Var.getPainting().k(f1Var.h);
            }
        }
    }

    public void setColor(int i7) {
        this.f57478x = i7;
        if (this.f57479y instanceof g) {
            f1 f1Var = this.f57473f;
            if (f1Var.h != null) {
                f1Var.f57317a.getPainting().k(f1Var.h);
            }
        }
    }

    public void setDelegate(s0 s0Var) {
        this.f57469a = s0Var;
    }

    public void setUndoStore(j1 j1Var) {
        this.f57470b = j1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(r5 r5Var) {
    }
}
