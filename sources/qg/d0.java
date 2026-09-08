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
    public final c1 f44426a;
    public boolean f44427b;
    public boolean f44428c;
    public long d;
    public boolean f44429e;
    public boolean f44430f;
    public u0 f44431g;
    public u0 h;
    public double f44432i;
    public boolean f44433j;
    public float f44434k;
    public boolean f44435l;
    public int f44437n;
    public int f44438o;
    public double f44439p;
    public double f44440q;
    public ValueAnimator f44441r;
    public final k1 f44442s;
    public Matrix f44443t;
    public long v;
    public float f44445w;
    public ValueAnimator f44446x;
    public boolean f44448z;
    public final u0[] f44436m = new u0[3];
    public final float[] f44444u = new float[2];
    public final z f44447y = new z(this, 1);

    public d0(c1 c1Var) {
        this.f44426a = c1Var;
        Context context = c1Var.getContext();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 3);
        final ?? obj = new Object();
        obj.f44494b = new ArrayList();
        obj.f44495c = new ArrayList();
        obj.f44499i = null;
        obj.f44500j = new AtomicBoolean(false);
        obj.f44501k = new AtomicBoolean(false);
        obj.f44502l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.g1.run():void");
            }
        };
        obj.f44497f = context;
        obj.f44496e = b1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44498g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44493a = sharedPreferences.getInt("scoreall", 0);
        k1.f44491m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.g1.run():void");
            }
        });
        this.f44442s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f44435l) {
            c1 c1Var = this.f44426a;
            if (!c1Var.getPainting().G && this.f44431g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44435l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f44550f.f(new n0(painting, 1));
                this.f44437n = 0;
                this.f44438o = 0;
                this.f44433j = false;
                this.f44427b = false;
                if (z10 && (b1Var = c1Var.f44415a) != null) {
                    b1Var.f();
                }
                iv0 iv0Var = c1Var.getPainting().f44551g;
                u0 u0Var = this.f44431g;
                float a2 = z6.a((float) u0Var.f44620a, (float) u0Var.f44621b, 0.0f, 0.0f);
                u0 u0Var2 = this.f44431g;
                float max = Math.max(a2, z6.a((float) u0Var2.f44620a, (float) u0Var2.f44621b, iv0Var.f27298a, 0.0f));
                u0 u0Var3 = this.f44431g;
                float a10 = z6.a((float) u0Var3.f44620a, (float) u0Var3.f44621b, 0.0f, iv0Var.f27299b);
                u0 u0Var4 = this.f44431g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) u0Var4.f44620a, (float) u0Var4.f44621b, iv0Var.f27298a, iv0Var.f27299b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44441r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44441r = null;
                }
                ValueAnimator valueAnimator2 = this.f44446x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44446x = null;
                }
                u0 u0Var5 = this.f44431g;
                final u0 u0Var6 = new u0(u0Var5.f44620a, u0Var5.f44621b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44446x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = d0.this.f44426a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f44578c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.f44579e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44550f.f(new i7(painting2, r0Var, true, true, null, 4));
                    }
                });
                this.f44446x.addListener(new c0(this, u0Var6, max2, r42, z10, w0Var));
                this.f44446x.setDuration(450L);
                this.f44446x.setInterpolator(pr.h);
                this.f44446x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f44426a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f44578c = currentColor;
        r0Var.d = currentWeight;
        r0Var.f44579e = currentBrush;
        if (this.f44430f) {
            this.f44432i = 0.0d;
        }
        r0Var.f44576a = this.f44432i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f44430f;
        b0 b0Var = new b0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f44550f.f(new i7(painting, r0Var, z10, false, b0Var, 4));
        }
        this.f44430f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44437n;
        u0[] u0VarArr = this.f44436m;
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
                    double d13 = (b11.f44620a * d10) + (u0Var2.f44620a * 2.0d * d12 * d) + (b10.f44620a * d11);
                    double d14 = (b11.f44621b * d10) + (u0Var2.f44621b * 2.0d * d12 * d) + (b10.f44621b * d11);
                    double lerp = ((((b11.f44622c * d10) + ((u0Var2.f44622c * ((2.0f * f13) * f12)) + (b10.f44622c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.p.a(this.f44438o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, lerp);
                    if (this.f44428c) {
                        u0Var4.d = true;
                        this.f44428c = false;
                    }
                    vector.add(u0Var4);
                    this.f44439p += lerp;
                    this.f44440q += 1.0d;
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
                    this.f44437n = 0;
                    return;
                } else {
                    this.f44437n = 2;
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
