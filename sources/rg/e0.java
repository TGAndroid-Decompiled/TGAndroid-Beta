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
import org.telegram.ui.Components.qw0;
public final class e0 {
    public static final ds B = new ds(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final c1 f47391a;
    public boolean f47392b;
    public boolean f47393c;
    public long d;
    public boolean e;
    public boolean f47394f;
    public u0 f47395g;
    public u0 h;
    public double f47396i;
    public boolean f47397j;
    public float f47398k;
    public boolean f47399l;
    public int f47401n;
    public int f47402o;
    public double f47403p;
    public double f47404q;
    public ValueAnimator f47405r;
    public final k1 f47406s;
    public Matrix f47407t;
    public long v;
    public float f47409w;
    public ValueAnimator f47410x;
    public boolean f47412z;
    public final u0[] f47400m = new u0[3];
    public final float[] f47408u = new float[2];
    public final a0 f47411y = new a0(this, 1);

    public e0(c1 c1Var) {
        this.f47391a = c1Var;
        Context context = c1Var.getContext();
        ig.o oVar = new ig.o(this, 16);
        final ?? obj = new Object();
        obj.f47452b = new ArrayList();
        obj.f47453c = new ArrayList();
        obj.f47456i = null;
        obj.f47457j = new AtomicBoolean(false);
        obj.f47458k = new AtomicBoolean(false);
        obj.f47459l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: rg.g1.run():void");
            }
        };
        obj.f47454f = context;
        obj.e = oVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f47455g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f47451a = sharedPreferences.getInt("scoreall", 0);
        k1.f47449m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: rg.g1.run():void");
            }
        });
        this.f47406s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f47399l) {
            c1 c1Var = this.f47391a;
            if (!c1Var.getPainting().G && this.f47395g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f47399l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f47506f.f(new n0(painting, 1));
                this.f47401n = 0;
                this.f47402o = 0;
                this.f47397j = false;
                this.f47392b = false;
                if (z10 && (b1Var = c1Var.f47375a) != null) {
                    b1Var.f();
                }
                qw0 qw0Var = c1Var.getPainting().f47507g;
                u0 u0Var = this.f47395g;
                float a2 = ic.a((float) u0Var.f47571a, (float) u0Var.f47572b, 0.0f, 0.0f);
                u0 u0Var2 = this.f47395g;
                float max = Math.max(a2, ic.a((float) u0Var2.f47571a, (float) u0Var2.f47572b, qw0Var.f32054a, 0.0f));
                u0 u0Var3 = this.f47395g;
                float a10 = ic.a((float) u0Var3.f47571a, (float) u0Var3.f47572b, 0.0f, qw0Var.f32055b);
                u0 u0Var4 = this.f47395g;
                final float max2 = Math.max(max, Math.max(a10, ic.a((float) u0Var4.f47571a, (float) u0Var4.f47572b, qw0Var.f32054a, qw0Var.f32055b))) / 0.84f;
                ValueAnimator valueAnimator = this.f47405r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f47405r = null;
                }
                ValueAnimator valueAnimator2 = this.f47410x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f47410x = null;
                }
                u0 u0Var5 = this.f47395g;
                final u0 u0Var6 = new u0(u0Var5.f47571a, u0Var5.f47572b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f47410x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = e0.this.f47391a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f47531c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f47506f.f(new i6(painting2, r0Var, true, true, null, 5));
                    }
                });
                this.f47410x.addListener(new d0(this, u0Var6, max2, r42, z10, w0Var));
                this.f47410x.setDuration(450L);
                this.f47410x.setInterpolator(ds.h);
                this.f47410x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f47391a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f47531c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f47394f) {
            this.f47396i = 0.0d;
        }
        r0Var.f47529a = this.f47396i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f47394f;
        c0 c0Var = new c0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f47506f.f(new i6(painting, r0Var, z10, false, c0Var, 5));
        }
        this.f47394f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f47401n;
        u0[] u0VarArr = this.f47400m;
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
                    double d13 = (b11.f47571a * d10) + (u0Var2.f47571a * 2.0d * d12 * d) + (b10.f47571a * d11);
                    double d14 = (b11.f47572b * d10) + (u0Var2.f47572b * 2.0d * d12 * d) + (b10.f47572b * d11);
                    double lerp = ((((b11.f47573c * d10) + ((u0Var2.f47573c * ((2.0f * f13) * f12)) + (b10.f47573c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, ee.a(this.f47402o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, lerp);
                    if (this.f47393c) {
                        u0Var4.d = true;
                        this.f47393c = false;
                    }
                    vector.add(u0Var4);
                    this.f47403p += lerp;
                    this.f47404q += 1.0d;
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
                    this.f47401n = 0;
                    return;
                } else {
                    this.f47401n = 2;
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
