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
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.zr;
import v7.f7;
public final class e0 {
    public static final zr B = new zr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final e1 f44911a;
    public boolean f44912b;
    public boolean f44913c;
    public long d;
    public boolean e;
    public boolean f44914f;
    public w0 f44915g;
    public w0 h;
    public double f44916i;
    public boolean f44917j;
    public float f44918k;
    public boolean f44919l;
    public int f44921n;
    public int f44922o;
    public double f44923p;
    public double f44924q;
    public ValueAnimator f44925r;
    public final m1 f44926s;
    public Matrix f44927t;
    public long v;
    public float f44929w;
    public ValueAnimator f44930x;
    public boolean f44932z;
    public final w0[] f44920m = new w0[3];
    public final float[] f44928u = new float[2];
    public final a0 f44931y = new a0(this, 1);

    public e0(e1 e1Var) {
        this.f44911a = e1Var;
        Context context = e1Var.getContext();
        ig.k0 k0Var = new ig.k0(this, 12);
        final ?? obj = new Object();
        obj.f44990b = new ArrayList();
        obj.f44991c = new ArrayList();
        obj.f44994i = null;
        obj.f44995j = new AtomicBoolean(false);
        obj.f44996k = new AtomicBoolean(false);
        obj.f44997l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.i1.run():void");
            }
        };
        obj.f44992f = context;
        obj.e = k0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44993g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44989a = sharedPreferences.getInt("scoreall", 0);
        m1.f44987m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.i1.run():void");
            }
        });
        this.f44926s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        d1 d1Var;
        if (this.f44919l) {
            e1 e1Var = this.f44911a;
            if (!e1Var.getPainting().G && this.f44915g != null) {
                if (dVar == null) {
                    obj = e1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44919l = false;
                if (r42 instanceof d) {
                    e1Var.getPainting().E = false;
                }
                s0 painting = e1Var.getPainting();
                painting.f45046f.f(new p0(painting, 1));
                this.f44921n = 0;
                this.f44922o = 0;
                this.f44917j = false;
                this.f44912b = false;
                if (z10 && (d1Var = e1Var.f44933a) != null) {
                    d1Var.f();
                }
                hw0 hw0Var = e1Var.getPainting().f45047g;
                w0 w0Var = this.f44915g;
                float a2 = f7.a((float) w0Var.f45111a, (float) w0Var.f45112b, 0.0f, 0.0f);
                w0 w0Var2 = this.f44915g;
                float max = Math.max(a2, f7.a((float) w0Var2.f45111a, (float) w0Var2.f45112b, hw0Var.f27188a, 0.0f));
                w0 w0Var3 = this.f44915g;
                float a10 = f7.a((float) w0Var3.f45111a, (float) w0Var3.f45112b, 0.0f, hw0Var.f27189b);
                w0 w0Var4 = this.f44915g;
                final float max2 = Math.max(max, Math.max(a10, f7.a((float) w0Var4.f45111a, (float) w0Var4.f45112b, hw0Var.f27188a, hw0Var.f27189b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44925r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44925r = null;
                }
                ValueAnimator valueAnimator2 = this.f44930x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44930x = null;
                }
                w0 w0Var5 = this.f44915g;
                final w0 w0Var6 = new w0(w0Var5.f45111a, w0Var5.f45112b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44930x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        e1 e1Var2 = e0.this.f44911a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = e1Var2.getCurrentColor();
                        }
                        t0Var.f45075c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = e1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f45046f.f(new i6(painting2, t0Var, true, true, null, 5));
                    }
                });
                this.f44930x.addListener(new d0(this, w0Var6, max2, r42, z10, y0Var));
                this.f44930x.setDuration(450L);
                this.f44930x.setInterpolator(zr.h);
                this.f44930x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        e1 e1Var = this.f44911a;
        int currentColor = e1Var.getCurrentColor();
        float currentWeight = e1Var.getCurrentWeight();
        m currentBrush = e1Var.getCurrentBrush();
        t0Var.f45075c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f44914f) {
            this.f44916i = 0.0d;
        }
        t0Var.f45073a = this.f44916i;
        s0 painting = e1Var.getPainting();
        boolean z10 = this.f44914f;
        c0 c0Var = new c0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f45046f.f(new i6(painting, t0Var, z10, false, c0Var, 5));
        }
        this.f44914f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44921n;
        w0[] w0VarArr = this.f44920m;
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
                    double d13 = (b11.f45111a * d10) + (w0Var2.f45111a * 2.0d * d12 * d) + (b10.f45111a * d11);
                    double d14 = (b11.f45112b * d10) + (w0Var2.f45112b * 2.0d * d12 * d) + (b10.f45112b * d11);
                    double lerp = ((((b11.f45113c * d10) + ((w0Var2.f45113c * ((2.0f * f13) * f12)) + (b10.f45113c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.r.a(this.f44922o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f44913c) {
                        w0Var4.d = true;
                        this.f44913c = false;
                    }
                    vector.add(w0Var4);
                    this.f44923p += lerp;
                    this.f44924q += 1.0d;
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
                    this.f44921n = 0;
                    return;
                } else {
                    this.f44921n = 2;
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
