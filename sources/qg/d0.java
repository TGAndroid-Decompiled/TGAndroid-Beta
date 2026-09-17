package qg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import bi.i7;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.pr;
import v7.z6;
public final class d0 {
    public static final pr B = new pr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final c1 f44399a;
    public boolean f44400b;
    public boolean f44401c;
    public long d;
    public boolean f44402e;
    public boolean f44403f;
    public u0 f44404g;
    public u0 h;
    public double f44405i;
    public boolean f44406j;
    public float f44407k;
    public boolean f44408l;
    public int f44410n;
    public int f44411o;
    public double f44412p;
    public double f44413q;
    public ValueAnimator f44414r;
    public final k1 f44415s;
    public Matrix f44416t;
    public long v;
    public float f44418w;
    public ValueAnimator f44419x;
    public boolean f44421z;
    public final u0[] f44409m = new u0[3];
    public final float[] f44417u = new float[2];
    public final z f44420y = new z(this, 1);

    public d0(c1 c1Var) {
        this.f44399a = c1Var;
        Context context = c1Var.getContext();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 3);
        final ?? obj = new Object();
        obj.f44467b = new ArrayList();
        obj.f44468c = new ArrayList();
        obj.f44472i = null;
        obj.f44473j = new AtomicBoolean(false);
        obj.f44474k = new AtomicBoolean(false);
        obj.f44475l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.g1.run():void");
            }
        };
        obj.f44470f = context;
        obj.f44469e = b1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44471g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44466a = sharedPreferences.getInt("scoreall", 0);
        k1.f44464m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.g1.run():void");
            }
        });
        this.f44415s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f44408l) {
            c1 c1Var = this.f44399a;
            if (!c1Var.getPainting().G && this.f44404g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44408l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f44523f.f(new n0(painting, 1));
                this.f44410n = 0;
                this.f44411o = 0;
                this.f44406j = false;
                this.f44400b = false;
                if (z10 && (b1Var = c1Var.f44388a) != null) {
                    b1Var.f();
                }
                iv0 iv0Var = c1Var.getPainting().f44524g;
                u0 u0Var = this.f44404g;
                float a2 = z6.a((float) u0Var.f44593a, (float) u0Var.f44594b, 0.0f, 0.0f);
                u0 u0Var2 = this.f44404g;
                float max = Math.max(a2, z6.a((float) u0Var2.f44593a, (float) u0Var2.f44594b, iv0Var.f27272a, 0.0f));
                u0 u0Var3 = this.f44404g;
                float a10 = z6.a((float) u0Var3.f44593a, (float) u0Var3.f44594b, 0.0f, iv0Var.f27273b);
                u0 u0Var4 = this.f44404g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) u0Var4.f44593a, (float) u0Var4.f44594b, iv0Var.f27272a, iv0Var.f27273b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44414r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44414r = null;
                }
                ValueAnimator valueAnimator2 = this.f44419x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44419x = null;
                }
                u0 u0Var5 = this.f44404g;
                final u0 u0Var6 = new u0(u0Var5.f44593a, u0Var5.f44594b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44419x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = d0.this.f44399a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f44551c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.f44552e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44523f.f(new i7(painting2, r0Var, true, true, null, 4));
                    }
                });
                this.f44419x.addListener(new c0(this, u0Var6, max2, r42, z10, w0Var));
                this.f44419x.setDuration(450L);
                this.f44419x.setInterpolator(pr.h);
                this.f44419x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f44399a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f44551c = currentColor;
        r0Var.d = currentWeight;
        r0Var.f44552e = currentBrush;
        if (this.f44403f) {
            this.f44405i = 0.0d;
        }
        r0Var.f44549a = this.f44405i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f44403f;
        b0 b0Var = new b0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f44523f.f(new i7(painting, r0Var, z10, false, b0Var, 4));
        }
        this.f44403f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44410n;
        u0[] u0VarArr = this.f44409m;
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
                    double d13 = (b11.f44593a * d10) + (u0Var2.f44593a * 2.0d * d12 * d) + (b10.f44593a * d11);
                    double d14 = (b11.f44594b * d10) + (u0Var2.f44594b * 2.0d * d12 * d) + (b10.f44594b * d11);
                    double lerp = ((((b11.f44595c * d10) + ((u0Var2.f44595c * ((2.0f * f13) * f12)) + (b10.f44595c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.p.a(this.f44411o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, lerp);
                    if (this.f44401c) {
                        u0Var4.d = true;
                        this.f44401c = false;
                    }
                    vector.add(u0Var4);
                    this.f44412p += lerp;
                    this.f44413q += 1.0d;
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
                    this.f44410n = 0;
                    return;
                } else {
                    this.f44410n = 2;
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
