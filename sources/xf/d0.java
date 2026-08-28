package xf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import ih.u5;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qu0;
public final class d0 {
    public static final gr B = new gr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final c1 f49189a;
    public boolean f49190b;
    public boolean f49191c;
    public long d;
    public boolean f49192e;
    public boolean f49193f;
    public u0 f49194g;
    public u0 h;
    public double f49195i;
    public boolean f49196j;
    public float f49197k;
    public boolean f49198l;
    public int f49200n;
    public int f49201o;
    public double f49202p;
    public double f49203q;
    public ValueAnimator f49204r;
    public final k1 f49205s;
    public Matrix f49206t;
    public long v;
    public float f49208w;
    public ValueAnimator f49209x;
    public boolean f49211z;
    public final u0[] f49199m = new u0[3];
    public final float[] f49207u = new float[2];
    public final z f49210y = new z(this, 1);

    public d0(c1 c1Var) {
        this.f49189a = c1Var;
        Context context = c1Var.getContext();
        i9 i9Var = new i9(this, 20);
        final ?? obj = new Object();
        obj.f49257b = new ArrayList();
        obj.f49258c = new ArrayList();
        obj.f49262i = null;
        obj.f49263j = new AtomicBoolean(false);
        obj.f49264k = new AtomicBoolean(false);
        obj.f49265l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: xf.g1.run():void");
            }
        };
        obj.f49260f = context;
        obj.f49259e = i9Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f49261g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f49256a = sharedPreferences.getInt("scoreall", 0);
        k1.f49254m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: xf.g1.run():void");
            }
        });
        this.f49205s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f49198l) {
            c1 c1Var = this.f49189a;
            if (!c1Var.getPainting().G && this.f49194g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f49198l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f49314f.f(new m0(painting, 1));
                this.f49200n = 0;
                this.f49201o = 0;
                this.f49196j = false;
                this.f49190b = false;
                if (z10 && (b1Var = c1Var.f49178a) != null) {
                    b1Var.f();
                }
                qu0 qu0Var = c1Var.getPainting().f49315g;
                u0 u0Var = this.f49194g;
                float a2 = g7.w.a((float) u0Var.f49384a, (float) u0Var.f49385b, 0.0f, 0.0f);
                u0 u0Var2 = this.f49194g;
                float max = Math.max(a2, g7.w.a((float) u0Var2.f49384a, (float) u0Var2.f49385b, qu0Var.f32026a, 0.0f));
                u0 u0Var3 = this.f49194g;
                float a3 = g7.w.a((float) u0Var3.f49384a, (float) u0Var3.f49385b, 0.0f, qu0Var.f32027b);
                u0 u0Var4 = this.f49194g;
                final float max2 = Math.max(max, Math.max(a3, g7.w.a((float) u0Var4.f49384a, (float) u0Var4.f49385b, qu0Var.f32026a, qu0Var.f32027b))) / 0.84f;
                ValueAnimator valueAnimator = this.f49204r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f49204r = null;
                }
                ValueAnimator valueAnimator2 = this.f49209x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f49209x = null;
                }
                u0 u0Var5 = this.f49194g;
                final u0 u0Var6 = new u0(u0Var5.f49384a, u0Var5.f49385b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f49209x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = d0.this.f49189a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f49342c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.f49343e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f49314f.f(new u5(painting2, r0Var, true, true, null, 4));
                    }
                });
                this.f49209x.addListener(new c0(this, u0Var6, max2, r42, z10, w0Var));
                this.f49209x.setDuration(450L);
                this.f49209x.setInterpolator(gr.h);
                this.f49209x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f49189a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f49342c = currentColor;
        r0Var.d = currentWeight;
        r0Var.f49343e = currentBrush;
        if (this.f49193f) {
            this.f49195i = 0.0d;
        }
        r0Var.f49340a = this.f49195i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f49193f;
        b0 b0Var = new b0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f49314f.f(new u5(painting, r0Var, z10, false, b0Var, 4));
        }
        this.f49193f = false;
    }

    public final void c(float f10, boolean z10) {
        int i9 = this.f49200n;
        u0[] u0VarArr = this.f49199m;
        if (i9 > 2) {
            Vector vector = new Vector();
            u0 u0Var = u0VarArr[0];
            u0 u0Var2 = u0VarArr[1];
            u0 u0Var3 = u0VarArr[2];
            if (u0Var3 != null && u0Var2 != null && u0Var != null) {
                u0 b10 = u0Var2.b(u0Var);
                u0 b11 = u0Var3.b(u0Var2);
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
                float f11 = 1.0f;
                float f12 = 1.0f / min;
                int i10 = 0;
                float f13 = 0.0f;
                while (i10 < min) {
                    float f14 = f11 - f13;
                    double d = f14;
                    double pow = Math.pow(d, 2.0d);
                    double d9 = f13 * f13;
                    double d10 = f14 * f14;
                    double d11 = f13;
                    double d12 = (b11.f49384a * d9) + (u0Var2.f49384a * 2.0d * d11 * d) + (b10.f49384a * d10);
                    double d13 = (b11.f49385b * d9) + (u0Var2.f49385b * 2.0d * d11 * d) + (b10.f49385b * d10);
                    double lerp = ((((b11.f49386c * d9) + ((u0Var2.f49386c * ((2.0f * f14) * f13)) + (b10.f49386c * pow))) - 1.0d) * AndroidUtilities.lerp(f10, 1.0f, g7.n.a(this.f49201o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d12, d13, lerp);
                    if (this.f49191c) {
                        u0Var4.d = true;
                        this.f49191c = false;
                    }
                    vector.add(u0Var4);
                    this.f49202p += lerp;
                    this.f49203q += 1.0d;
                    f13 += f12;
                    i10++;
                    f11 = 1.0f;
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
                    this.f49200n = 0;
                    return;
                } else {
                    this.f49200n = 2;
                    return;
                }
            }
            return;
        }
        u0[] u0VarArr3 = new u0[i9];
        System.arraycopy(u0VarArr, 0, u0VarArr3, 0, i9);
        b(new r0(u0VarArr3));
    }
}
