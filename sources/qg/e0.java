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
    public final f1 f44489a;
    public boolean f44490b;
    public boolean f44491c;
    public long d;
    public boolean e;
    public boolean f44492f;
    public x0 f44493g;
    public x0 h;
    public double f44494i;
    public boolean f44495j;
    public float f44496k;
    public boolean f44497l;
    public int f44499n;
    public int f44500o;
    public double f44501p;
    public double f44502q;
    public ValueAnimator f44503r;
    public final n1 f44504s;
    public Matrix f44505t;
    public long v;
    public float f44507w;
    public ValueAnimator f44508x;
    public boolean f44510z;
    public final x0[] f44498m = new x0[3];
    public final float[] f44506u = new float[2];
    public final a0 f44509y = new a0(this, 1);

    public e0(f1 f1Var) {
        this.f44489a = f1Var;
        Context context = f1Var.getContext();
        ig.l0 l0Var = new ig.l0(this, 12);
        final ?? obj = new Object();
        obj.f44572b = new ArrayList();
        obj.f44573c = new ArrayList();
        obj.f44576i = null;
        obj.f44577j = new AtomicBoolean(false);
        obj.f44578k = new AtomicBoolean(false);
        obj.f44579l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.j1.run():void");
            }
        };
        obj.f44574f = context;
        obj.e = l0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44575g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44571a = sharedPreferences.getInt("scoreall", 0);
        n1.f44569m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.j1.run():void");
            }
        });
        this.f44504s = obj;
    }

    public final void a(d dVar, boolean z10, z0 z0Var) {
        Object obj;
        e1 e1Var;
        if (this.f44497l) {
            f1 f1Var = this.f44489a;
            if (!f1Var.getPainting().G && this.f44493g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44497l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                t0 painting = f1Var.getPainting();
                painting.f44630f.f(new q0(painting, 1));
                this.f44499n = 0;
                this.f44500o = 0;
                this.f44495j = false;
                this.f44490b = false;
                if (z10 && (e1Var = f1Var.f44512a) != null) {
                    e1Var.f();
                }
                ew0 ew0Var = f1Var.getPainting().f44631g;
                x0 x0Var = this.f44493g;
                float a2 = f7.a((float) x0Var.f44694a, (float) x0Var.f44695b, 0.0f, 0.0f);
                x0 x0Var2 = this.f44493g;
                float max = Math.max(a2, f7.a((float) x0Var2.f44694a, (float) x0Var2.f44695b, ew0Var.f26038a, 0.0f));
                x0 x0Var3 = this.f44493g;
                float a10 = f7.a((float) x0Var3.f44694a, (float) x0Var3.f44695b, 0.0f, ew0Var.f26039b);
                x0 x0Var4 = this.f44493g;
                final float max2 = Math.max(max, Math.max(a10, f7.a((float) x0Var4.f44694a, (float) x0Var4.f44695b, ew0Var.f26038a, ew0Var.f26039b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44503r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44503r = null;
                }
                ValueAnimator valueAnimator2 = this.f44508x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44508x = null;
                }
                x0 x0Var5 = this.f44493g;
                final x0 x0Var6 = new x0(x0Var5.f44694a, x0Var5.f44695b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44508x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f44489a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        u0 u0Var = new u0(new x0[]{x0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        u0Var.f44660c = currentColor;
                        u0Var.d = floatValue * max2;
                        u0Var.e = mVar;
                        t0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44630f.f(new j6(painting2, u0Var, true, true, null, 5));
                    }
                });
                this.f44508x.addListener(new d0(this, x0Var6, max2, r42, z10, z0Var));
                this.f44508x.setDuration(450L);
                this.f44508x.setInterpolator(bs.h);
                this.f44508x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(u0 u0Var) {
        f1 f1Var = this.f44489a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        u0Var.f44660c = currentColor;
        u0Var.d = currentWeight;
        u0Var.e = currentBrush;
        if (this.f44492f) {
            this.f44494i = 0.0d;
        }
        u0Var.f44658a = this.f44494i;
        t0 painting = f1Var.getPainting();
        boolean z10 = this.f44492f;
        c0 c0Var = new c0(this, u0Var, 0);
        if (painting.L == null) {
            painting.f44630f.f(new j6(painting, u0Var, z10, false, c0Var, 5));
        }
        this.f44492f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44499n;
        x0[] x0VarArr = this.f44498m;
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
                    double d13 = (b11.f44694a * d10) + (x0Var2.f44694a * 2.0d * d12 * d) + (b10.f44694a * d11);
                    double d14 = (b11.f44695b * d10) + (x0Var2.f44695b * 2.0d * d12 * d) + (b10.f44695b * d11);
                    double lerp = ((((b11.f44696c * d10) + ((x0Var2.f44696c * ((2.0f * f13) * f12)) + (b10.f44696c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.r.a(this.f44500o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    x0 x0Var4 = new x0(d13, d14, lerp);
                    if (this.f44491c) {
                        x0Var4.d = true;
                        this.f44491c = false;
                    }
                    vector.add(x0Var4);
                    this.f44501p += lerp;
                    this.f44502q += 1.0d;
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
                    this.f44499n = 0;
                    return;
                } else {
                    this.f44499n = 2;
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
