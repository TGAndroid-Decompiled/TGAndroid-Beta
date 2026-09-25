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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.uv0;
import v7.a7;
public final class e0 {
    public static final rr B = new rr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f41100a;
    public boolean f41101b;
    public boolean f41102c;
    public long d;
    public boolean e;
    public boolean f41103f;
    public w0 f41104g;
    public w0 h;
    public double f41105i;
    public boolean f41106j;
    public float f41107k;
    public boolean f41108l;
    public int f41110n;
    public int f41111o;
    public double f41112p;
    public double f41113q;
    public ValueAnimator f41114r;
    public final n1 f41115s;
    public Matrix f41116t;
    public long v;
    public float f41118w;
    public ValueAnimator f41119x;
    public boolean f41121z;
    public final w0[] f41109m = new w0[3];
    public final float[] f41117u = new float[2];
    public final z f41120y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f41100a = f1Var;
        Context context = f1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f41183b = new ArrayList();
        obj.f41184c = new ArrayList();
        obj.f41187i = null;
        obj.f41188j = new AtomicBoolean(false);
        obj.f41189k = new AtomicBoolean(false);
        obj.f41190l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f41185f = context;
        obj.e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f41186g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f41182a = sharedPreferences.getInt("scoreall", 0);
        n1.f41180m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f41115s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f41108l) {
            f1 f1Var = this.f41100a;
            if (!f1Var.getPainting().G && this.f41104g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f41108l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f41225f.f(new p0(painting, 1));
                this.f41110n = 0;
                this.f41111o = 0;
                this.f41106j = false;
                this.f41101b = false;
                if (z10 && (e1Var = f1Var.f41124a) != null) {
                    e1Var.f();
                }
                uv0 uv0Var = f1Var.getPainting().f41226g;
                w0 w0Var = this.f41104g;
                float a2 = a7.a((float) w0Var.f41299a, (float) w0Var.f41300b, 0.0f, 0.0f);
                w0 w0Var2 = this.f41104g;
                float max = Math.max(a2, a7.a((float) w0Var2.f41299a, (float) w0Var2.f41300b, uv0Var.f28933a, 0.0f));
                w0 w0Var3 = this.f41104g;
                float a10 = a7.a((float) w0Var3.f41299a, (float) w0Var3.f41300b, 0.0f, uv0Var.f28934b);
                w0 w0Var4 = this.f41104g;
                final float max2 = Math.max(max, Math.max(a10, a7.a((float) w0Var4.f41299a, (float) w0Var4.f41300b, uv0Var.f28933a, uv0Var.f28934b))) / 0.84f;
                ValueAnimator valueAnimator = this.f41114r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f41114r = null;
                }
                ValueAnimator valueAnimator2 = this.f41119x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f41119x = null;
                }
                w0 w0Var5 = this.f41104g;
                final w0 w0Var6 = new w0(w0Var5.f41299a, w0Var5.f41300b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41119x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f41100a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f41265c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f41225f.f(new b8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f41119x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f41119x.setDuration(450L);
                this.f41119x.setInterpolator(rr.h);
                this.f41119x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f41100a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f41265c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f41103f) {
            this.f41105i = 0.0d;
        }
        t0Var.f41263a = this.f41105i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f41103f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f41225f.f(new b8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f41103f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f41110n;
        w0[] w0VarArr = this.f41109m;
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
                    double d13 = (b11.f41299a * d10) + (w0Var2.f41299a * 2.0d * d12 * d) + (b10.f41299a * d11);
                    double d14 = (b11.f41300b * d10) + (w0Var2.f41300b * 2.0d * d12 * d) + (b10.f41300b * d11);
                    double lerp = ((((b11.f41301c * d10) + ((w0Var2.f41301c * ((2.0f * f13) * f12)) + (b10.f41301c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f41111o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f41102c) {
                        w0Var4.d = true;
                        this.f41102c = false;
                    }
                    vector.add(w0Var4);
                    this.f41112p += lerp;
                    this.f41113q += 1.0d;
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
                    this.f41110n = 0;
                    return;
                } else {
                    this.f41110n = 2;
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
