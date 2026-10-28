package rg;

import a8.ee;
import a8.ic;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import di.i6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.rw0;
public final class e0 {
    public static final ds B = new ds(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final c1 f47426a;
    public boolean f47427b;
    public boolean f47428c;
    public long d;
    public boolean e;
    public boolean f47429f;
    public u0 f47430g;
    public u0 h;
    public double f47431i;
    public boolean f47432j;
    public float f47433k;
    public boolean f47434l;
    public int f47436n;
    public int f47437o;
    public double f47438p;
    public double f47439q;
    public ValueAnimator f47440r;
    public final k1 f47441s;
    public Matrix f47442t;
    public long v;
    public float f47444w;
    public ValueAnimator f47445x;
    public boolean f47447z;
    public final u0[] f47435m = new u0[3];
    public final float[] f47443u = new float[2];
    public final a0 f47446y = new a0(this, 1);

    public e0(c1 c1Var) {
        this.f47426a = c1Var;
        Context context = c1Var.getContext();
        ig.o oVar = new ig.o(this, 16);
        final ?? obj = new Object();
        obj.f47487b = new ArrayList();
        obj.f47488c = new ArrayList();
        obj.f47491i = null;
        obj.f47492j = new AtomicBoolean(false);
        obj.f47493k = new AtomicBoolean(false);
        obj.f47494l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: rg.g1.run():void");
            }
        };
        obj.f47489f = context;
        obj.e = oVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f47490g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f47486a = sharedPreferences.getInt("scoreall", 0);
        k1.f47484m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: rg.g1.run():void");
            }
        });
        this.f47441s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f47434l) {
            c1 c1Var = this.f47426a;
            if (!c1Var.getPainting().G && this.f47430g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f47434l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f47541f.f(new n0(painting, 1));
                this.f47436n = 0;
                this.f47437o = 0;
                this.f47432j = false;
                this.f47427b = false;
                if (z10 && (b1Var = c1Var.f47410a) != null) {
                    b1Var.f();
                }
                rw0 rw0Var = c1Var.getPainting().f47542g;
                u0 u0Var = this.f47430g;
                float a2 = ic.a((float) u0Var.f47606a, (float) u0Var.f47607b, 0.0f, 0.0f);
                u0 u0Var2 = this.f47430g;
                float max = Math.max(a2, ic.a((float) u0Var2.f47606a, (float) u0Var2.f47607b, rw0Var.f32392a, 0.0f));
                u0 u0Var3 = this.f47430g;
                float a10 = ic.a((float) u0Var3.f47606a, (float) u0Var3.f47607b, 0.0f, rw0Var.f32393b);
                u0 u0Var4 = this.f47430g;
                final float max2 = Math.max(max, Math.max(a10, ic.a((float) u0Var4.f47606a, (float) u0Var4.f47607b, rw0Var.f32392a, rw0Var.f32393b))) / 0.84f;
                ValueAnimator valueAnimator = this.f47440r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f47440r = null;
                }
                ValueAnimator valueAnimator2 = this.f47445x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f47445x = null;
                }
                u0 u0Var5 = this.f47430g;
                final u0 u0Var6 = new u0(u0Var5.f47606a, u0Var5.f47607b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f47445x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = e0.this.f47426a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f47566c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f47541f.f(new i6(painting2, r0Var, true, true, null, 5));
                    }
                });
                this.f47445x.addListener(new d0(this, u0Var6, max2, r42, z10, w0Var));
                this.f47445x.setDuration(450L);
                this.f47445x.setInterpolator(ds.h);
                this.f47445x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f47426a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f47566c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f47429f) {
            this.f47431i = 0.0d;
        }
        r0Var.f47564a = this.f47431i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f47429f;
        c0 c0Var = new c0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f47541f.f(new i6(painting, r0Var, z10, false, c0Var, 5));
        }
        this.f47429f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f47436n;
        u0[] u0VarArr = this.f47435m;
        if (i10 > 2) {
            Vector vector = new Vector();
            u0 u0Var = u0VarArr[0];
            u0 u0Var2 = u0VarArr[1];
            u0 u0Var3 = u0VarArr[2];
            if (u0Var3 != null && u0Var2 != null && u0Var != null) {
                u0 b10 = u0Var2.b(u0Var);
                u0 b11 = u0Var3.b(u0Var2);
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
                    double d13 = (b11.f47606a * d10) + (u0Var2.f47606a * 2.0d * d12 * d) + (b10.f47606a * d11);
                    double d14 = (b11.f47607b * d10) + (u0Var2.f47607b * 2.0d * d12 * d) + (b10.f47607b * d11);
                    double lerp = ((((b11.f47608c * d10) + ((u0Var2.f47608c * ((2.0f * f13) * f12)) + (b10.f47608c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, ee.a(this.f47437o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, lerp);
                    if (this.f47428c) {
                        u0Var4.d = true;
                        this.f47428c = false;
                    }
                    vector.add(u0Var4);
                    this.f47438p += lerp;
                    this.f47439q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                u0[] u0VarArr2 = new u0[vector.size()];
                vector.toArray(u0VarArr2);
                b(new r0(u0VarArr2));
                System.arraycopy(u0VarArr, 1, u0VarArr, 0, 2);
                if (z10) {
                    this.f47436n = 0;
                    return;
                } else {
                    this.f47436n = 2;
                    return;
                }
            }
            return;
        }
        u0[] u0VarArr3 = new u0[i10];
        System.arraycopy(u0VarArr, 0, u0VarArr3, 0, i10);
        b(new r0(u0VarArr3));
    }
}
