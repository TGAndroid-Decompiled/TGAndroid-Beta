package pg;

import ai.b8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.rr;
import v7.z6;
public final class d0 {
    public static final rr B = new rr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final d1 f40777a;
    public boolean f40778b;
    public boolean f40779c;
    public long d;
    public boolean e;
    public boolean f40780f;
    public v0 f40781g;
    public v0 h;
    public double f40782i;
    public boolean f40783j;
    public float f40784k;
    public boolean f40785l;
    public int f40787n;
    public int f40788o;
    public double f40789p;
    public double f40790q;
    public ValueAnimator f40791r;
    public final l1 f40792s;
    public Matrix f40793t;
    public long v;
    public float f40795w;
    public ValueAnimator f40796x;
    public boolean f40798z;
    public final v0[] f40786m = new v0[3];
    public final float[] f40794u = new float[2];
    public final z f40797y = new z(this, 1);

    public d0(d1 d1Var) {
        this.f40777a = d1Var;
        Context context = d1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f40854b = new ArrayList();
        obj.f40855c = new ArrayList();
        obj.f40858i = null;
        obj.f40859j = new AtomicBoolean(false);
        obj.f40860k = new AtomicBoolean(false);
        obj.f40861l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.h1.run():void");
            }
        };
        obj.f40856f = context;
        obj.e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f40857g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f40853a = sharedPreferences.getInt("scoreall", 0);
        l1.f40851m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.h1.run():void");
            }
        });
        this.f40792s = obj;
    }

    public final void a(d dVar, boolean z10, x0 x0Var) {
        Object obj;
        c1 c1Var;
        if (this.f40785l) {
            d1 d1Var = this.f40777a;
            if (!d1Var.getPainting().G && this.f40781g != null) {
                if (dVar == null) {
                    obj = d1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f40785l = false;
                if (r42 instanceof d) {
                    d1Var.getPainting().E = false;
                }
                r0 painting = d1Var.getPainting();
                painting.f40908f.f(new o0(painting, 1));
                this.f40787n = 0;
                this.f40788o = 0;
                this.f40783j = false;
                this.f40778b = false;
                if (z10 && (c1Var = d1Var.f40799a) != null) {
                    c1Var.f();
                }
                jv0 jv0Var = d1Var.getPainting().f40909g;
                v0 v0Var = this.f40781g;
                float a2 = z6.a((float) v0Var.f40973a, (float) v0Var.f40974b, 0.0f, 0.0f);
                v0 v0Var2 = this.f40781g;
                float max = Math.max(a2, z6.a((float) v0Var2.f40973a, (float) v0Var2.f40974b, jv0Var.f25428a, 0.0f));
                v0 v0Var3 = this.f40781g;
                float a10 = z6.a((float) v0Var3.f40973a, (float) v0Var3.f40974b, 0.0f, jv0Var.f25429b);
                v0 v0Var4 = this.f40781g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) v0Var4.f40973a, (float) v0Var4.f40974b, jv0Var.f25428a, jv0Var.f25429b))) / 0.84f;
                ValueAnimator valueAnimator = this.f40791r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f40791r = null;
                }
                ValueAnimator valueAnimator2 = this.f40796x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f40796x = null;
                }
                v0 v0Var5 = this.f40781g;
                final v0 v0Var6 = new v0(v0Var5.f40973a, v0Var5.f40974b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40796x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        d1 d1Var2 = d0.this.f40777a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        s0 s0Var = new s0(new v0[]{v0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = d1Var2.getCurrentColor();
                        }
                        s0Var.f40937c = currentColor;
                        s0Var.d = floatValue * max2;
                        s0Var.e = mVar;
                        r0 painting2 = d1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f40908f.f(new b8(painting2, s0Var, true, true, null, 4));
                    }
                });
                this.f40796x.addListener(new c0(this, v0Var6, max2, r42, z10, x0Var));
                this.f40796x.setDuration(450L);
                this.f40796x.setInterpolator(rr.h);
                this.f40796x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(s0 s0Var) {
        d1 d1Var = this.f40777a;
        int currentColor = d1Var.getCurrentColor();
        float currentWeight = d1Var.getCurrentWeight();
        m currentBrush = d1Var.getCurrentBrush();
        s0Var.f40937c = currentColor;
        s0Var.d = currentWeight;
        s0Var.e = currentBrush;
        if (this.f40780f) {
            this.f40782i = 0.0d;
        }
        s0Var.f40935a = this.f40782i;
        r0 painting = d1Var.getPainting();
        boolean z10 = this.f40780f;
        b0 b0Var = new b0(this, s0Var, 0);
        if (painting.L == null) {
            painting.f40908f.f(new b8(painting, s0Var, z10, false, b0Var, 4));
        }
        this.f40780f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f40787n;
        v0[] v0VarArr = this.f40786m;
        if (i10 > 2) {
            Vector vector = new Vector();
            v0 v0Var = v0VarArr[0];
            v0 v0Var2 = v0VarArr[1];
            v0 v0Var3 = v0VarArr[2];
            if (v0Var3 != null && v0Var2 != null && v0Var != null) {
                v0 b10 = v0Var2.b(v0Var);
                v0 b11 = v0Var3.b(v0Var2);
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
                    double d13 = (b11.f40973a * d10) + (v0Var2.f40973a * 2.0d * d12 * d) + (b10.f40973a * d11);
                    double d14 = (b11.f40974b * d10) + (v0Var2.f40974b * 2.0d * d12 * d) + (b10.f40974b * d11);
                    double lerp = ((((b11.f40975c * d10) + ((v0Var2.f40975c * ((2.0f * f13) * f12)) + (b10.f40975c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.p.a(this.f40788o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    v0 v0Var4 = new v0(d13, d14, lerp);
                    if (this.f40779c) {
                        v0Var4.d = true;
                        this.f40779c = false;
                    }
                    vector.add(v0Var4);
                    this.f40789p += lerp;
                    this.f40790q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                v0[] v0VarArr2 = new v0[vector.size()];
                vector.toArray(v0VarArr2);
                b(new s0(v0VarArr2));
                System.arraycopy(v0VarArr, 1, v0VarArr, 0, 2);
                if (z10) {
                    this.f40787n = 0;
                    return;
                } else {
                    this.f40787n = 2;
                    return;
                }
            }
            return;
        }
        v0[] v0VarArr3 = new v0[i10];
        System.arraycopy(v0VarArr, 0, v0VarArr3, 0, i10);
        b(new s0(v0VarArr3));
    }
}
