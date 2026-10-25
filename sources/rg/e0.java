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
    public final c1 f47388a;
    public boolean f47389b;
    public boolean f47390c;
    public long d;
    public boolean e;
    public boolean f47391f;
    public u0 f47392g;
    public u0 h;
    public double f47393i;
    public boolean f47394j;
    public float f47395k;
    public boolean f47396l;
    public int f47398n;
    public int f47399o;
    public double f47400p;
    public double f47401q;
    public ValueAnimator f47402r;
    public final k1 f47403s;
    public Matrix f47404t;
    public long v;
    public float f47406w;
    public ValueAnimator f47407x;
    public boolean f47409z;
    public final u0[] f47397m = new u0[3];
    public final float[] f47405u = new float[2];
    public final a0 f47408y = new a0(this, 1);

    public e0(c1 c1Var) {
        this.f47388a = c1Var;
        Context context = c1Var.getContext();
        ig.o oVar = new ig.o(this, 16);
        final ?? obj = new Object();
        obj.f47449b = new ArrayList();
        obj.f47450c = new ArrayList();
        obj.f47453i = null;
        obj.f47454j = new AtomicBoolean(false);
        obj.f47455k = new AtomicBoolean(false);
        obj.f47456l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: rg.g1.run():void");
            }
        };
        obj.f47451f = context;
        obj.e = oVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f47452g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f47448a = sharedPreferences.getInt("scoreall", 0);
        k1.f47446m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: rg.g1.run():void");
            }
        });
        this.f47403s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f47396l) {
            c1 c1Var = this.f47388a;
            if (!c1Var.getPainting().G && this.f47392g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f47396l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f47503f.f(new n0(painting, 1));
                this.f47398n = 0;
                this.f47399o = 0;
                this.f47394j = false;
                this.f47389b = false;
                if (z10 && (b1Var = c1Var.f47372a) != null) {
                    b1Var.f();
                }
                qw0 qw0Var = c1Var.getPainting().f47504g;
                u0 u0Var = this.f47392g;
                float a2 = ic.a((float) u0Var.f47568a, (float) u0Var.f47569b, 0.0f, 0.0f);
                u0 u0Var2 = this.f47392g;
                float max = Math.max(a2, ic.a((float) u0Var2.f47568a, (float) u0Var2.f47569b, qw0Var.f32052a, 0.0f));
                u0 u0Var3 = this.f47392g;
                float a10 = ic.a((float) u0Var3.f47568a, (float) u0Var3.f47569b, 0.0f, qw0Var.f32053b);
                u0 u0Var4 = this.f47392g;
                final float max2 = Math.max(max, Math.max(a10, ic.a((float) u0Var4.f47568a, (float) u0Var4.f47569b, qw0Var.f32052a, qw0Var.f32053b))) / 0.84f;
                ValueAnimator valueAnimator = this.f47402r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f47402r = null;
                }
                ValueAnimator valueAnimator2 = this.f47407x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f47407x = null;
                }
                u0 u0Var5 = this.f47392g;
                final u0 u0Var6 = new u0(u0Var5.f47568a, u0Var5.f47569b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f47407x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = e0.this.f47388a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f47528c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f47503f.f(new i6(painting2, r0Var, true, true, null, 5));
                    }
                });
                this.f47407x.addListener(new d0(this, u0Var6, max2, r42, z10, w0Var));
                this.f47407x.setDuration(450L);
                this.f47407x.setInterpolator(ds.h);
                this.f47407x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f47388a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f47528c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f47391f) {
            this.f47393i = 0.0d;
        }
        r0Var.f47526a = this.f47393i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f47391f;
        c0 c0Var = new c0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f47503f.f(new i6(painting, r0Var, z10, false, c0Var, 5));
        }
        this.f47391f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f47398n;
        u0[] u0VarArr = this.f47397m;
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
                    double d13 = (b11.f47568a * d10) + (u0Var2.f47568a * 2.0d * d12 * d) + (b10.f47568a * d11);
                    double d14 = (b11.f47569b * d10) + (u0Var2.f47569b * 2.0d * d12 * d) + (b10.f47569b * d11);
                    double lerp = ((((b11.f47570c * d10) + ((u0Var2.f47570c * ((2.0f * f13) * f12)) + (b10.f47570c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, ee.a(this.f47399o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, lerp);
                    if (this.f47390c) {
                        u0Var4.d = true;
                        this.f47390c = false;
                    }
                    vector.add(u0Var4);
                    this.f47400p += lerp;
                    this.f47401q += 1.0d;
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
                    this.f47398n = 0;
                    return;
                } else {
                    this.f47398n = 2;
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
