package qg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import ci.i6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iw0;
import v7.f7;
public final class e0 {
    public static final bs B = new bs(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final e1 f44912a;
    public boolean f44913b;
    public boolean f44914c;
    public long d;
    public boolean e;
    public boolean f44915f;
    public w0 f44916g;
    public w0 h;
    public double f44917i;
    public boolean f44918j;
    public float f44919k;
    public boolean f44920l;
    public int f44922n;
    public int f44923o;
    public double f44924p;
    public double f44925q;
    public ValueAnimator f44926r;
    public final m1 f44927s;
    public Matrix f44928t;
    public long v;
    public float f44930w;
    public ValueAnimator f44931x;
    public boolean f44933z;
    public final w0[] f44921m = new w0[3];
    public final float[] f44929u = new float[2];
    public final a0 f44932y = new a0(this, 1);

    public e0(e1 e1Var) {
        this.f44912a = e1Var;
        Context context = e1Var.getContext();
        ig.k0 k0Var = new ig.k0(this, 12);
        final ?? obj = new Object();
        obj.f44991b = new ArrayList();
        obj.f44992c = new ArrayList();
        obj.f44995i = null;
        obj.f44996j = new AtomicBoolean(false);
        obj.f44997k = new AtomicBoolean(false);
        obj.f44998l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.i1.run():void");
            }
        };
        obj.f44993f = context;
        obj.e = k0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44994g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44990a = sharedPreferences.getInt("scoreall", 0);
        m1.f44988m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.i1.run():void");
            }
        });
        this.f44927s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        d1 d1Var;
        if (this.f44920l) {
            e1 e1Var = this.f44912a;
            if (!e1Var.getPainting().G && this.f44916g != null) {
                if (dVar == null) {
                    obj = e1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44920l = false;
                if (r42 instanceof d) {
                    e1Var.getPainting().E = false;
                }
                s0 painting = e1Var.getPainting();
                painting.f45047f.f(new p0(painting, 1));
                this.f44922n = 0;
                this.f44923o = 0;
                this.f44918j = false;
                this.f44913b = false;
                if (z10 && (d1Var = e1Var.f44934a) != null) {
                    d1Var.f();
                }
                iw0 iw0Var = e1Var.getPainting().f45048g;
                w0 w0Var = this.f44916g;
                float a2 = f7.a((float) w0Var.f45112a, (float) w0Var.f45113b, 0.0f, 0.0f);
                w0 w0Var2 = this.f44916g;
                float max = Math.max(a2, f7.a((float) w0Var2.f45112a, (float) w0Var2.f45113b, iw0Var.f27465a, 0.0f));
                w0 w0Var3 = this.f44916g;
                float a10 = f7.a((float) w0Var3.f45112a, (float) w0Var3.f45113b, 0.0f, iw0Var.f27466b);
                w0 w0Var4 = this.f44916g;
                final float max2 = Math.max(max, Math.max(a10, f7.a((float) w0Var4.f45112a, (float) w0Var4.f45113b, iw0Var.f27465a, iw0Var.f27466b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44926r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44926r = null;
                }
                ValueAnimator valueAnimator2 = this.f44931x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44931x = null;
                }
                w0 w0Var5 = this.f44916g;
                final w0 w0Var6 = new w0(w0Var5.f45112a, w0Var5.f45113b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44931x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        e1 e1Var2 = e0.this.f44912a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = e1Var2.getCurrentColor();
                        }
                        t0Var.f45076c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = e1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f45047f.f(new i6(painting2, t0Var, true, true, null, 5));
                    }
                });
                this.f44931x.addListener(new d0(this, w0Var6, max2, r42, z10, y0Var));
                this.f44931x.setDuration(450L);
                this.f44931x.setInterpolator(bs.h);
                this.f44931x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        e1 e1Var = this.f44912a;
        int currentColor = e1Var.getCurrentColor();
        float currentWeight = e1Var.getCurrentWeight();
        m currentBrush = e1Var.getCurrentBrush();
        t0Var.f45076c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f44915f) {
            this.f44917i = 0.0d;
        }
        t0Var.f45074a = this.f44917i;
        s0 painting = e1Var.getPainting();
        boolean z10 = this.f44915f;
        c0 c0Var = new c0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f45047f.f(new i6(painting, t0Var, z10, false, c0Var, 5));
        }
        this.f44915f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44922n;
        w0[] w0VarArr = this.f44921m;
        if (i10 > 2) {
            Vector vector = new Vector();
            w0 w0Var = w0VarArr[0];
            w0 w0Var2 = w0VarArr[1];
            w0 w0Var3 = w0VarArr[2];
            if (w0Var3 != null && w0Var2 != null && w0Var != null) {
                w0 b10 = w0Var2.b(w0Var);
                w0 b11 = w0Var3.b(w0Var2);
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
                float f10 = 1.0f;
                float f11 = 1.0f / min;
                int i11 = 0;
                float f12 = 0.0f;
                while (i11 < min) {
                    float f13 = f10 - f12;
                    double d = f13;
                    double pow = Math.pow(d, 2.0d);
                    double d10 = f12 * f12;
                    double d11 = f13 * f13;
                    double d12 = f12;
                    double d13 = (b11.f45112a * d10) + (w0Var2.f45112a * 2.0d * d12 * d) + (b10.f45112a * d11);
                    double d14 = (b11.f45113b * d10) + (w0Var2.f45113b * 2.0d * d12 * d) + (b10.f45113b * d11);
                    double lerp = ((((b11.f45114c * d10) + ((w0Var2.f45114c * ((2.0f * f13) * f12)) + (b10.f45114c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.r.a(this.f44923o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f44914c) {
                        w0Var4.d = true;
                        this.f44914c = false;
                    }
                    vector.add(w0Var4);
                    this.f44924p += lerp;
                    this.f44925q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                w0[] w0VarArr2 = new w0[vector.size()];
                vector.toArray(w0VarArr2);
                b(new t0(w0VarArr2));
                System.arraycopy(w0VarArr, 1, w0VarArr, 0, 2);
                if (z10) {
                    this.f44922n = 0;
                    return;
                } else {
                    this.f44922n = 2;
                    return;
                }
            }
            return;
        }
        w0[] w0VarArr3 = new w0[i10];
        System.arraycopy(w0VarArr, 0, w0VarArr3, 0, i10);
        b(new t0(w0VarArr3));
    }
}
