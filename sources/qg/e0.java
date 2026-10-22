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
import org.telegram.ui.Components.fw0;
import v7.f7;
public final class e0 {
    public static final bs B = new bs(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f44500a;
    public boolean f44501b;
    public boolean f44502c;
    public long d;
    public boolean e;
    public boolean f44503f;
    public x0 f44504g;
    public x0 h;
    public double f44505i;
    public boolean f44506j;
    public float f44507k;
    public boolean f44508l;
    public int f44510n;
    public int f44511o;
    public double f44512p;
    public double f44513q;
    public ValueAnimator f44514r;
    public final n1 f44515s;
    public Matrix f44516t;
    public long v;
    public float f44518w;
    public ValueAnimator f44519x;
    public boolean f44521z;
    public final x0[] f44509m = new x0[3];
    public final float[] f44517u = new float[2];
    public final a0 f44520y = new a0(this, 1);

    public e0(f1 f1Var) {
        this.f44500a = f1Var;
        Context context = f1Var.getContext();
        ig.l0 l0Var = new ig.l0(this, 12);
        final ?? obj = new Object();
        obj.f44583b = new ArrayList();
        obj.f44584c = new ArrayList();
        obj.f44587i = null;
        obj.f44588j = new AtomicBoolean(false);
        obj.f44589k = new AtomicBoolean(false);
        obj.f44590l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.j1.run():void");
            }
        };
        obj.f44585f = context;
        obj.e = l0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44586g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44582a = sharedPreferences.getInt("scoreall", 0);
        n1.f44580m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.j1.run():void");
            }
        });
        this.f44515s = obj;
    }

    public final void a(d dVar, boolean z10, z0 z0Var) {
        Object obj;
        e1 e1Var;
        if (this.f44508l) {
            f1 f1Var = this.f44500a;
            if (!f1Var.getPainting().G && this.f44504g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44508l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                t0 painting = f1Var.getPainting();
                painting.f44641f.f(new q0(painting, 1));
                this.f44510n = 0;
                this.f44511o = 0;
                this.f44506j = false;
                this.f44501b = false;
                if (z10 && (e1Var = f1Var.f44523a) != null) {
                    e1Var.f();
                }
                fw0 fw0Var = f1Var.getPainting().f44642g;
                x0 x0Var = this.f44504g;
                float a2 = f7.a((float) x0Var.f44705a, (float) x0Var.f44706b, 0.0f, 0.0f);
                x0 x0Var2 = this.f44504g;
                float max = Math.max(a2, f7.a((float) x0Var2.f44705a, (float) x0Var2.f44706b, fw0Var.f26431a, 0.0f));
                x0 x0Var3 = this.f44504g;
                float a10 = f7.a((float) x0Var3.f44705a, (float) x0Var3.f44706b, 0.0f, fw0Var.f26432b);
                x0 x0Var4 = this.f44504g;
                final float max2 = Math.max(max, Math.max(a10, f7.a((float) x0Var4.f44705a, (float) x0Var4.f44706b, fw0Var.f26431a, fw0Var.f26432b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44514r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44514r = null;
                }
                ValueAnimator valueAnimator2 = this.f44519x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44519x = null;
                }
                x0 x0Var5 = this.f44504g;
                final x0 x0Var6 = new x0(x0Var5.f44705a, x0Var5.f44706b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44519x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f44500a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        u0 u0Var = new u0(new x0[]{x0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        u0Var.f44671c = currentColor;
                        u0Var.d = floatValue * max2;
                        u0Var.e = mVar;
                        t0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44641f.f(new j6(painting2, u0Var, true, true, null, 5));
                    }
                });
                this.f44519x.addListener(new d0(this, x0Var6, max2, r42, z10, z0Var));
                this.f44519x.setDuration(450L);
                this.f44519x.setInterpolator(bs.h);
                this.f44519x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(u0 u0Var) {
        f1 f1Var = this.f44500a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        u0Var.f44671c = currentColor;
        u0Var.d = currentWeight;
        u0Var.e = currentBrush;
        if (this.f44503f) {
            this.f44505i = 0.0d;
        }
        u0Var.f44669a = this.f44505i;
        t0 painting = f1Var.getPainting();
        boolean z10 = this.f44503f;
        c0 c0Var = new c0(this, u0Var, 0);
        if (painting.L == null) {
            painting.f44641f.f(new j6(painting, u0Var, z10, false, c0Var, 5));
        }
        this.f44503f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44510n;
        x0[] x0VarArr = this.f44509m;
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
                    double d13 = (b11.f44705a * d10) + (x0Var2.f44705a * 2.0d * d12 * d) + (b10.f44705a * d11);
                    double d14 = (b11.f44706b * d10) + (x0Var2.f44706b * 2.0d * d12 * d) + (b10.f44706b * d11);
                    double lerp = ((((b11.f44707c * d10) + ((x0Var2.f44707c * ((2.0f * f13) * f12)) + (b10.f44707c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.r.a(this.f44511o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    x0 x0Var4 = new x0(d13, d14, lerp);
                    if (this.f44502c) {
                        x0Var4.d = true;
                        this.f44502c = false;
                    }
                    vector.add(x0Var4);
                    this.f44512p += lerp;
                    this.f44513q += 1.0d;
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
                    this.f44510n = 0;
                    return;
                } else {
                    this.f44510n = 2;
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
