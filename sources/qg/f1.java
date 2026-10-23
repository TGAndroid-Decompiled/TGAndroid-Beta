package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.TextureView;
import ci.j6;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.ja;
import w7.o6;
public class f1 extends TextureView {
    public e1 f44524a;
    public w1 f44525b;
    public final t0 f44526c;
    public d1 d;
    public final e0 e;
    public final s1 f44527f;
    public Bitmap h;
    public Bitmap f44528n;
    public boolean f44529r;
    public boolean f44530s;
    public float v;
    public int f44531w;
    public m f44532x;
    public boolean f44533y;

    public f1(Context context, t0 t0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.f44528n = bitmap2;
        this.f44526c = t0Var;
        t0Var.f44642f = this;
        setSurfaceTextureListener(new b1(this, jaVar));
        this.e = new e0(this);
        z0 z0Var = new z0(this, 0);
        ?? obj = new Object();
        Paint paint = new Paint(1);
        obj.f44623c = paint;
        Paint paint2 = new Paint(1);
        obj.d = paint2;
        Paint paint3 = new Paint(1);
        obj.e = paint3;
        Paint paint4 = new Paint(1);
        obj.f44624f = paint4;
        Paint paint5 = new Paint(1);
        obj.f44625g = paint5;
        obj.f44630m = new ArrayList();
        obj.f44631n = new ArrayList();
        obj.f44633p = new float[2];
        obj.f44621a = this;
        obj.f44622b = z0Var;
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
        this.f44527f = obj;
        t0Var.f44639a = new ki.t1(this, 22);
    }

    public final void a() {
        z0 z0Var = new z0(this, 2);
        e0 e0Var = this.e;
        e0Var.f44505g = new x0(e0Var.f44501a.getPainting().f44643g.f26432a, 0.0d, 1.0d);
        e0Var.f44509l = true;
        e0Var.a(new Object(), false, z0Var);
    }

    public final void b() {
        f1 f1Var;
        s1 s1Var = this.f44527f;
        if (s1Var != null && (f1Var = s1Var.f44621a) != null && f1Var.getPainting() != null && s1Var.h != null) {
            t0 painting = f1Var.getPainting();
            painting.f44642f.f(new q0(painting, 0));
            s1Var.f44630m.clear();
            s1Var.f44631n.clear();
            s1Var.h = null;
        }
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.f44532x instanceof l) {
            this.f44527f.e();
        }
        d1 d1Var = this.d;
        if (d1Var != null && d1Var.f44494f) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                d1Var.postRunnable(new j6(d1Var, z10, z11, bitmapArr, countDownLatch));
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
        i1 i1Var;
        if (this.f44532x instanceof l) {
            s1 s1Var = this.f44527f;
            Paint paint = s1Var.f44623c;
            ArrayList arrayList = s1Var.f44630m;
            f1 f1Var = s1Var.f44621a;
            if (f1Var != null && f1Var.getPainting() != null) {
                fw0 fw0Var = f1Var.getPainting().f44643g;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r1 r1Var = (r1) arrayList.get(i10);
                    if (r1Var.f44615c && !r1Var.f44614b) {
                        s1Var.b(canvas, fw0Var, r1Var);
                    }
                }
                i1 i1Var2 = s1Var.h;
                if (i1Var2 != null && i1Var2.h != 0.0f) {
                    canvas.save();
                    canvas.rotate((float) (((-i1Var.h) / 3.141592653589793d) * 180.0d), (s1Var.h.f44543b / fw0Var.f26432a) * canvas.getWidth(), (s1Var.h.f44544c / fw0Var.f26433b) * canvas.getHeight());
                }
                i1 i1Var3 = s1Var.h;
                if (i1Var3 != null && i1Var3.f44542a.o() == 4) {
                    canvas2 = canvas;
                    canvas2.drawLine(canvas.getWidth() * (s1Var.h.f44543b / fw0Var.f26432a), canvas.getHeight() * (s1Var.h.f44544c / fw0Var.f26433b), canvas.getWidth() * (s1Var.h.f44547i / fw0Var.f26432a), canvas.getHeight() * (s1Var.h.f44548j / fw0Var.f26433b), paint);
                    canvas2.drawLine(canvas2.getWidth() * (s1Var.h.d / fw0Var.f26432a), canvas2.getHeight() * (s1Var.h.e / fw0Var.f26433b), canvas2.getWidth() * (s1Var.h.f44547i / fw0Var.f26432a), canvas2.getHeight() * (s1Var.h.f44548j / fw0Var.f26433b), paint);
                } else {
                    canvas2 = canvas;
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    r1 r1Var2 = (r1) arrayList.get(i11);
                    if (r1Var2.f44615c && r1Var2.f44614b) {
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
        throw new UnsupportedOperationException("Method not decompiled: qg.f1.e(android.view.MotionEvent):void");
    }

    public final void f(Runnable runnable) {
        d1 d1Var = this.d;
        if (d1Var == null) {
            return;
        }
        d1Var.postRunnable(new p2.b(2, this, runnable));
    }

    public m getCurrentBrush() {
        return this.f44532x;
    }

    public int getCurrentColor() {
        return this.f44531w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public t0 getPainting() {
        return this.f44526c;
    }

    public w1 getUndoStore() {
        return this.f44525b;
    }

    public final void h() {
        this.f44533y = true;
        if (this.d != null) {
            f(new z0(this, 1));
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
        t0 t0Var = this.f44526c;
        if (t0Var != null) {
            f7 = getWidth() / t0Var.f44643g.f26432a;
        } else {
            f7 = 1.0f;
        }
        if (f7 > 0.0f) {
            f10 = f7;
        }
        fw0 fw0Var = getPainting().f44643g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-fw0Var.f26432a) / 2.0f, (-fw0Var.f26433b) / 2.0f);
        if (this.f44532x instanceof l) {
            s1 s1Var = this.f44527f;
            s1Var.getClass();
            Matrix matrix2 = new Matrix();
            s1Var.f44632o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.f44517t = matrix3;
            matrix.invert(matrix3);
        }
        d1 d1Var = this.d;
        t0Var.f44659y = o6.c(o6.b(d1Var.f44495n, d1Var.f44496r), o6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.f44532x instanceof l;
        s1 s1Var = this.f44527f;
        if (z10) {
            s1Var.e();
        }
        this.f44532x = mVar;
        i();
        this.f44526c.q(this.f44532x);
        m mVar2 = this.f44532x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = s1Var.f44631n;
            ArrayList arrayList2 = s1Var.f44630m;
            f1 f1Var = s1Var.f44621a;
            if (f1Var != null && f1Var.getPainting() != null) {
                arrayList2.clear();
                arrayList.clear();
                s1Var.h = new i1(l.p(o10));
                fw0 fw0Var = f1Var.getPainting().f44643g;
                i1 i1Var = s1Var.h;
                float f7 = fw0Var.f26432a;
                i1Var.f44543b = f7 / 2.0f;
                float f10 = fw0Var.f26433b;
                i1Var.f44544c = f10 / 2.0f;
                float min = Math.min(f7, f10) / 5.0f;
                i1Var.e = min;
                i1Var.d = min;
                s1Var.h.f44545f = f1Var.getCurrentWeight();
                s1Var.h.f44546g = AndroidUtilities.dp(32.0f);
                s1Var.h.f44550l = v0.e(UserConfig.selectedAccount).f44688k;
                if (s1Var.h.f44542a.o() == 4) {
                    i1 i1Var2 = s1Var.h;
                    float f11 = fw0Var.f26432a / 2.0f;
                    i1Var2.d = f11;
                    i1Var2.f44543b = f11;
                    i1Var2.f44547i = f11 + 1.0f;
                    float f12 = fw0Var.f26433b;
                    float f13 = f12 / 3.0f;
                    float f14 = 1.0f * f13;
                    i1Var2.f44544c = f14;
                    float f15 = f12 / 2.0f;
                    i1Var2.f44548j = f15;
                    i1Var2.e = f13 * 2.0f;
                    i1Var2.f44549k = Math.abs(f14 - f15);
                    o1 o1Var = new o1(s1Var, 0);
                    arrayList2.add(o1Var);
                    p1 p1Var = new p1(s1Var, o1Var, 0);
                    arrayList2.add(p1Var);
                    arrayList.add(p1Var);
                    p1 p1Var2 = new p1(s1Var, o1Var, 1);
                    arrayList2.add(p1Var2);
                    arrayList.add(p1Var2);
                }
                if (s1Var.h.f44542a.o() == 0) {
                    arrayList2.add(new o1(s1Var, 1));
                }
                if (s1Var.h.f44542a.o() == 2) {
                    arrayList2.add(new o1(s1Var, 2));
                }
                if (s1Var.h.f44542a.o() == 1 || s1Var.h.f44542a.o() == 3) {
                    arrayList2.add(new q1(s1Var, s1Var.h, false, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, false));
                    arrayList2.add(new q1(s1Var, s1Var.h, false, true));
                    arrayList2.add(new q1(s1Var, s1Var.h, true, true));
                    arrayList2.add(new o1(s1Var, 3, false));
                }
                if (s1Var.h.f44542a.o() == 3) {
                    i1 i1Var3 = s1Var.h;
                    i1Var3.f44547i = (i1Var3.d * 0.8f) + i1Var3.f44543b;
                    i1Var3.f44548j = (i1Var3.e * 1.2f) + i1Var3.f44544c + i1Var3.f44545f;
                    o1 o1Var2 = new o1(s1Var, 4);
                    arrayList2.add(o1Var2);
                    o1Var2.f44614b = false;
                    arrayList.add(o1Var2);
                }
                s1Var.f44629l = new o1(s1Var, 5, false);
                if (s1Var.h.f44542a.o() != 4) {
                    s1Var.f44629l.f44615c = false;
                }
                o1 o1Var3 = s1Var.f44629l;
                o1Var3.f44614b = false;
                arrayList.add(o1Var3);
                arrayList2.add(s1Var.f44629l);
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.f44526c.f44643g.f26432a;
        this.v = k3.t(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.f44532x instanceof l) {
            s1 s1Var = this.f44527f;
            f1 f1Var = s1Var.f44621a;
            i1 i1Var = s1Var.h;
            if (i1Var != null && i1Var.f44545f != f1Var.getCurrentWeight()) {
                s1Var.h.f44545f = f1Var.getCurrentWeight();
                f1Var.getPainting().k(s1Var.h);
            }
        }
    }

    public void setColor(int i10) {
        this.f44531w = i10;
        if (this.f44532x instanceof l) {
            s1 s1Var = this.f44527f;
            if (s1Var.h != null) {
                s1Var.f44621a.getPainting().k(s1Var.h);
            }
        }
    }

    public void setDelegate(e1 e1Var) {
        this.f44524a = e1Var;
    }

    public void setUndoStore(w1 w1Var) {
        this.f44525b = w1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
