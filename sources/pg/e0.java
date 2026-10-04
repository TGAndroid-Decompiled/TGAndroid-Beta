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
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.tr;
import v7.z6;
public final class e0 {
    public static final tr B = new tr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f44452a;
    public boolean f44453b;
    public boolean f44454c;
    public long d;
    public boolean f44455e;
    public boolean f44456f;
    public w0 f44457g;
    public w0 h;
    public double f44458i;
    public boolean f44459j;
    public float f44460k;
    public boolean f44461l;
    public int f44463n;
    public int f44464o;
    public double f44465p;
    public double f44466q;
    public ValueAnimator f44467r;
    public final n1 f44468s;
    public Matrix f44469t;
    public long v;
    public float f44471w;
    public ValueAnimator f44472x;
    public boolean f44474z;
    public final w0[] f44462m = new w0[3];
    public final float[] f44470u = new float[2];
    public final z f44473y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f44452a = f1Var;
        Context context = f1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f44540b = new ArrayList();
        obj.f44541c = new ArrayList();
        obj.f44545i = null;
        obj.f44546j = new AtomicBoolean(false);
        obj.f44547k = new AtomicBoolean(false);
        obj.f44548l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f44543f = context;
        obj.f44542e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44544g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44539a = sharedPreferences.getInt("scoreall", 0);
        n1.f44537m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f44468s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f44461l) {
            f1 f1Var = this.f44452a;
            if (!f1Var.getPainting().G && this.f44457g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44461l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f44587f.f(new p0(painting, 1));
                this.f44463n = 0;
                this.f44464o = 0;
                this.f44459j = false;
                this.f44453b = false;
                if (z10 && (e1Var = f1Var.f44477a) != null) {
                    e1Var.f();
                }
                fw0 fw0Var = f1Var.getPainting().f44588g;
                w0 w0Var = this.f44457g;
                float a2 = z6.a((float) w0Var.f44668a, (float) w0Var.f44669b, 0.0f, 0.0f);
                w0 w0Var2 = this.f44457g;
                float max = Math.max(a2, z6.a((float) w0Var2.f44668a, (float) w0Var2.f44669b, fw0Var.f26585a, 0.0f));
                w0 w0Var3 = this.f44457g;
                float a10 = z6.a((float) w0Var3.f44668a, (float) w0Var3.f44669b, 0.0f, fw0Var.f26586b);
                w0 w0Var4 = this.f44457g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) w0Var4.f44668a, (float) w0Var4.f44669b, fw0Var.f26585a, fw0Var.f26586b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44467r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44467r = null;
                }
                ValueAnimator valueAnimator2 = this.f44472x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44472x = null;
                }
                w0 w0Var5 = this.f44457g;
                final w0 w0Var6 = new w0(w0Var5.f44668a, w0Var5.f44669b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44472x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f44452a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f44629c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.f44630e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44587f.f(new b8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f44472x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f44472x.setDuration(450L);
                this.f44472x.setInterpolator(tr.h);
                this.f44472x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f44452a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f44629c = currentColor;
        t0Var.d = currentWeight;
        t0Var.f44630e = currentBrush;
        if (this.f44456f) {
            this.f44458i = 0.0d;
        }
        t0Var.f44627a = this.f44458i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f44456f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f44587f.f(new b8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f44456f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44463n;
        w0[] w0VarArr = this.f44462m;
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
                    double d13 = (b11.f44668a * d10) + (w0Var2.f44668a * 2.0d * d12 * d) + (b10.f44668a * d11);
                    double d14 = (b11.f44669b * d10) + (w0Var2.f44669b * 2.0d * d12 * d) + (b10.f44669b * d11);
                    double lerp = ((((b11.f44670c * d10) + ((w0Var2.f44670c * ((2.0f * f13) * f12)) + (b10.f44670c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f44464o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f44454c) {
                        w0Var4.d = true;
                        this.f44454c = false;
                    }
                    vector.add(w0Var4);
                    this.f44465p += lerp;
                    this.f44466q += 1.0d;
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
                    this.f44463n = 0;
                    return;
                } else {
                    this.f44463n = 2;
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
