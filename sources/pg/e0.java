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
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.tr;
import v7.z6;
public final class e0 {
    public static final tr B = new tr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f44466a;
    public boolean f44467b;
    public boolean f44468c;
    public long d;
    public boolean f44469e;
    public boolean f44470f;
    public w0 f44471g;
    public w0 h;
    public double f44472i;
    public boolean f44473j;
    public float f44474k;
    public boolean f44475l;
    public int f44477n;
    public int f44478o;
    public double f44479p;
    public double f44480q;
    public ValueAnimator f44481r;
    public final n1 f44482s;
    public Matrix f44483t;
    public long v;
    public float f44485w;
    public ValueAnimator f44486x;
    public boolean f44488z;
    public final w0[] f44476m = new w0[3];
    public final float[] f44484u = new float[2];
    public final z f44487y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f44466a = f1Var;
        Context context = f1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f44554b = new ArrayList();
        obj.f44555c = new ArrayList();
        obj.f44559i = null;
        obj.f44560j = new AtomicBoolean(false);
        obj.f44561k = new AtomicBoolean(false);
        obj.f44562l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f44557f = context;
        obj.f44556e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44558g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44553a = sharedPreferences.getInt("scoreall", 0);
        n1.f44551m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f44482s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f44475l) {
            f1 f1Var = this.f44466a;
            if (!f1Var.getPainting().G && this.f44471g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44475l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f44601f.f(new p0(painting, 1));
                this.f44477n = 0;
                this.f44478o = 0;
                this.f44473j = false;
                this.f44467b = false;
                if (z10 && (e1Var = f1Var.f44491a) != null) {
                    e1Var.f();
                }
                gw0 gw0Var = f1Var.getPainting().f44602g;
                w0 w0Var = this.f44471g;
                float a2 = z6.a((float) w0Var.f44682a, (float) w0Var.f44683b, 0.0f, 0.0f);
                w0 w0Var2 = this.f44471g;
                float max = Math.max(a2, z6.a((float) w0Var2.f44682a, (float) w0Var2.f44683b, gw0Var.f27002a, 0.0f));
                w0 w0Var3 = this.f44471g;
                float a10 = z6.a((float) w0Var3.f44682a, (float) w0Var3.f44683b, 0.0f, gw0Var.f27003b);
                w0 w0Var4 = this.f44471g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) w0Var4.f44682a, (float) w0Var4.f44683b, gw0Var.f27002a, gw0Var.f27003b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44481r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44481r = null;
                }
                ValueAnimator valueAnimator2 = this.f44486x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44486x = null;
                }
                w0 w0Var5 = this.f44471g;
                final w0 w0Var6 = new w0(w0Var5.f44682a, w0Var5.f44683b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44486x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f44466a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f44643c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.f44644e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44601f.f(new b8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f44486x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f44486x.setDuration(450L);
                this.f44486x.setInterpolator(tr.h);
                this.f44486x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f44466a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f44643c = currentColor;
        t0Var.d = currentWeight;
        t0Var.f44644e = currentBrush;
        if (this.f44470f) {
            this.f44472i = 0.0d;
        }
        t0Var.f44641a = this.f44472i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f44470f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f44601f.f(new b8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f44470f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44477n;
        w0[] w0VarArr = this.f44476m;
        if (i10 > 2) {
            Vector vector = new Vector();
            w0 w0Var = w0VarArr[0];
            w0 w0Var2 = w0VarArr[1];
            w0 w0Var3 = w0VarArr[2];
            if (w0Var3 != null && w0Var2 != null && w0Var != null) {
                w0 b10 = w0Var2.b(w0Var);
                w0 b11 = w0Var3.b(w0Var2);
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
                    double d13 = (b11.f44682a * d10) + (w0Var2.f44682a * 2.0d * d12 * d) + (b10.f44682a * d11);
                    double d14 = (b11.f44683b * d10) + (w0Var2.f44683b * 2.0d * d12 * d) + (b10.f44683b * d11);
                    double lerp = ((((b11.f44684c * d10) + ((w0Var2.f44684c * ((2.0f * f13) * f12)) + (b10.f44684c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f44478o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f44468c) {
                        w0Var4.d = true;
                        this.f44468c = false;
                    }
                    vector.add(w0Var4);
                    this.f44479p += lerp;
                    this.f44480q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                w0[] w0VarArr2 = new w0[vector.size()];
                vector.toArray(w0VarArr2);
                b(new t0(w0VarArr2));
                System.arraycopy(w0VarArr, 1, w0VarArr, 0, 2);
                if (z10) {
                    this.f44477n = 0;
                    return;
                } else {
                    this.f44477n = 2;
                    return;
                }
            }
            return;
        }
        w0[] w0VarArr3 = new w0[i10];
        System.arraycopy(w0VarArr, 0, w0VarArr3, 0, i10);
        b(new t0(w0VarArr3));
    }
}
