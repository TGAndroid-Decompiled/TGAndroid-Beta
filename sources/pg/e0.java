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
    public final f1 f44459a;
    public boolean f44460b;
    public boolean f44461c;
    public long d;
    public boolean f44462e;
    public boolean f44463f;
    public w0 f44464g;
    public w0 h;
    public double f44465i;
    public boolean f44466j;
    public float f44467k;
    public boolean f44468l;
    public int f44470n;
    public int f44471o;
    public double f44472p;
    public double f44473q;
    public ValueAnimator f44474r;
    public final n1 f44475s;
    public Matrix f44476t;
    public long v;
    public float f44478w;
    public ValueAnimator f44479x;
    public boolean f44481z;
    public final w0[] f44469m = new w0[3];
    public final float[] f44477u = new float[2];
    public final z f44480y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f44459a = f1Var;
        Context context = f1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f44547b = new ArrayList();
        obj.f44548c = new ArrayList();
        obj.f44552i = null;
        obj.f44553j = new AtomicBoolean(false);
        obj.f44554k = new AtomicBoolean(false);
        obj.f44555l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f44550f = context;
        obj.f44549e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44551g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44546a = sharedPreferences.getInt("scoreall", 0);
        n1.f44544m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f44475s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f44468l) {
            f1 f1Var = this.f44459a;
            if (!f1Var.getPainting().G && this.f44464g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44468l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f44594f.f(new p0(painting, 1));
                this.f44470n = 0;
                this.f44471o = 0;
                this.f44466j = false;
                this.f44460b = false;
                if (z10 && (e1Var = f1Var.f44484a) != null) {
                    e1Var.f();
                }
                fw0 fw0Var = f1Var.getPainting().f44595g;
                w0 w0Var = this.f44464g;
                float a2 = z6.a((float) w0Var.f44675a, (float) w0Var.f44676b, 0.0f, 0.0f);
                w0 w0Var2 = this.f44464g;
                float max = Math.max(a2, z6.a((float) w0Var2.f44675a, (float) w0Var2.f44676b, fw0Var.f26590a, 0.0f));
                w0 w0Var3 = this.f44464g;
                float a10 = z6.a((float) w0Var3.f44675a, (float) w0Var3.f44676b, 0.0f, fw0Var.f26591b);
                w0 w0Var4 = this.f44464g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) w0Var4.f44675a, (float) w0Var4.f44676b, fw0Var.f26590a, fw0Var.f26591b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44474r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44474r = null;
                }
                ValueAnimator valueAnimator2 = this.f44479x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44479x = null;
                }
                w0 w0Var5 = this.f44464g;
                final w0 w0Var6 = new w0(w0Var5.f44675a, w0Var5.f44676b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44479x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f44459a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f44636c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.f44637e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44594f.f(new b8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f44479x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f44479x.setDuration(450L);
                this.f44479x.setInterpolator(tr.h);
                this.f44479x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f44459a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f44636c = currentColor;
        t0Var.d = currentWeight;
        t0Var.f44637e = currentBrush;
        if (this.f44463f) {
            this.f44465i = 0.0d;
        }
        t0Var.f44634a = this.f44465i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f44463f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f44594f.f(new b8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f44463f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44470n;
        w0[] w0VarArr = this.f44469m;
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
                    double d13 = (b11.f44675a * d10) + (w0Var2.f44675a * 2.0d * d12 * d) + (b10.f44675a * d11);
                    double d14 = (b11.f44676b * d10) + (w0Var2.f44676b * 2.0d * d12 * d) + (b10.f44676b * d11);
                    double lerp = ((((b11.f44677c * d10) + ((w0Var2.f44677c * ((2.0f * f13) * f12)) + (b10.f44677c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f44471o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f44461c) {
                        w0Var4.d = true;
                        this.f44461c = false;
                    }
                    vector.add(w0Var4);
                    this.f44472p += lerp;
                    this.f44473q += 1.0d;
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
                    this.f44470n = 0;
                    return;
                } else {
                    this.f44470n = 2;
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
