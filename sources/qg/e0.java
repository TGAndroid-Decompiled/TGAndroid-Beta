package qg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import ci.j6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ew0;
import v7.f7;
public final class e0 {
    public static final bs B = new bs(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f44487a;
    public boolean f44488b;
    public boolean f44489c;
    public long d;
    public boolean e;
    public boolean f44490f;
    public x0 f44491g;
    public x0 h;
    public double f44492i;
    public boolean f44493j;
    public float f44494k;
    public boolean f44495l;
    public int f44497n;
    public int f44498o;
    public double f44499p;
    public double f44500q;
    public ValueAnimator f44501r;
    public final n1 f44502s;
    public Matrix f44503t;
    public long v;
    public float f44505w;
    public ValueAnimator f44506x;
    public boolean f44508z;
    public final x0[] f44496m = new x0[3];
    public final float[] f44504u = new float[2];
    public final a0 f44507y = new a0(this, 1);

    public e0(f1 f1Var) {
        this.f44487a = f1Var;
        Context context = f1Var.getContext();
        ig.l0 l0Var = new ig.l0(this, 12);
        final ?? obj = new Object();
        obj.f44570b = new ArrayList();
        obj.f44571c = new ArrayList();
        obj.f44574i = null;
        obj.f44575j = new AtomicBoolean(false);
        obj.f44576k = new AtomicBoolean(false);
        obj.f44577l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.j1.run():void");
            }
        };
        obj.f44572f = context;
        obj.e = l0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44573g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44569a = sharedPreferences.getInt("scoreall", 0);
        n1.f44567m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.j1.run():void");
            }
        });
        this.f44502s = obj;
    }

    public final void a(d dVar, boolean z10, z0 z0Var) {
        Object obj;
        e1 e1Var;
        if (this.f44495l) {
            f1 f1Var = this.f44487a;
            if (!f1Var.getPainting().G && this.f44491g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44495l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                t0 painting = f1Var.getPainting();
                painting.f44628f.f(new q0(painting, 1));
                this.f44497n = 0;
                this.f44498o = 0;
                this.f44493j = false;
                this.f44488b = false;
                if (z10 && (e1Var = f1Var.f44510a) != null) {
                    e1Var.f();
                }
                ew0 ew0Var = f1Var.getPainting().f44629g;
                x0 x0Var = this.f44491g;
                float a2 = f7.a((float) x0Var.f44692a, (float) x0Var.f44693b, 0.0f, 0.0f);
                x0 x0Var2 = this.f44491g;
                float max = Math.max(a2, f7.a((float) x0Var2.f44692a, (float) x0Var2.f44693b, ew0Var.f26040a, 0.0f));
                x0 x0Var3 = this.f44491g;
                float a10 = f7.a((float) x0Var3.f44692a, (float) x0Var3.f44693b, 0.0f, ew0Var.f26041b);
                x0 x0Var4 = this.f44491g;
                final float max2 = Math.max(max, Math.max(a10, f7.a((float) x0Var4.f44692a, (float) x0Var4.f44693b, ew0Var.f26040a, ew0Var.f26041b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44501r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44501r = null;
                }
                ValueAnimator valueAnimator2 = this.f44506x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44506x = null;
                }
                x0 x0Var5 = this.f44491g;
                final x0 x0Var6 = new x0(x0Var5.f44692a, x0Var5.f44693b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44506x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f44487a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        u0 u0Var = new u0(new x0[]{x0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        u0Var.f44658c = currentColor;
                        u0Var.d = floatValue * max2;
                        u0Var.e = mVar;
                        t0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44628f.f(new j6(painting2, u0Var, true, true, null, 5));
                    }
                });
                this.f44506x.addListener(new d0(this, x0Var6, max2, r42, z10, z0Var));
                this.f44506x.setDuration(450L);
                this.f44506x.setInterpolator(bs.h);
                this.f44506x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(u0 u0Var) {
        f1 f1Var = this.f44487a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        u0Var.f44658c = currentColor;
        u0Var.d = currentWeight;
        u0Var.e = currentBrush;
        if (this.f44490f) {
            this.f44492i = 0.0d;
        }
        u0Var.f44656a = this.f44492i;
        t0 painting = f1Var.getPainting();
        boolean z10 = this.f44490f;
        c0 c0Var = new c0(this, u0Var, 0);
        if (painting.L == null) {
            painting.f44628f.f(new j6(painting, u0Var, z10, false, c0Var, 5));
        }
        this.f44490f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44497n;
        x0[] x0VarArr = this.f44496m;
        if (i10 > 2) {
            Vector vector = new Vector();
            x0 x0Var = x0VarArr[0];
            x0 x0Var2 = x0VarArr[1];
            x0 x0Var3 = x0VarArr[2];
            if (x0Var3 != null && x0Var2 != null && x0Var != null) {
                x0 b10 = x0Var2.b(x0Var);
                x0 b11 = x0Var3.b(x0Var2);
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
                    double d13 = (b11.f44692a * d10) + (x0Var2.f44692a * 2.0d * d12 * d) + (b10.f44692a * d11);
                    double d14 = (b11.f44693b * d10) + (x0Var2.f44693b * 2.0d * d12 * d) + (b10.f44693b * d11);
                    double lerp = ((((b11.f44694c * d10) + ((x0Var2.f44694c * ((2.0f * f13) * f12)) + (b10.f44694c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.r.a(this.f44498o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    x0 x0Var4 = new x0(d13, d14, lerp);
                    if (this.f44489c) {
                        x0Var4.d = true;
                        this.f44489c = false;
                    }
                    vector.add(x0Var4);
                    this.f44499p += lerp;
                    this.f44500q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                x0[] x0VarArr2 = new x0[vector.size()];
                vector.toArray(x0VarArr2);
                b(new u0(x0VarArr2));
                System.arraycopy(x0VarArr, 1, x0VarArr, 0, 2);
                if (z10) {
                    this.f44497n = 0;
                    return;
                } else {
                    this.f44497n = 2;
                    return;
                }
            }
            return;
        }
        x0[] x0VarArr3 = new x0[i10];
        System.arraycopy(x0VarArr, 0, x0VarArr3, 0, i10);
        b(new u0(x0VarArr3));
    }
}
