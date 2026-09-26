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
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vv0;
import v7.a7;
public final class e0 {
    public static final sr B = new sr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f41098a;
    public boolean f41099b;
    public boolean f41100c;
    public long d;
    public boolean e;
    public boolean f41101f;
    public w0 f41102g;
    public w0 h;
    public double f41103i;
    public boolean f41104j;
    public float f41105k;
    public boolean f41106l;
    public int f41108n;
    public int f41109o;
    public double f41110p;
    public double f41111q;
    public ValueAnimator f41112r;
    public final n1 f41113s;
    public Matrix f41114t;
    public long v;
    public float f41116w;
    public ValueAnimator f41117x;
    public boolean f41119z;
    public final w0[] f41107m = new w0[3];
    public final float[] f41115u = new float[2];
    public final z f41118y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f41098a = f1Var;
        Context context = f1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f41181b = new ArrayList();
        obj.f41182c = new ArrayList();
        obj.f41185i = null;
        obj.f41186j = new AtomicBoolean(false);
        obj.f41187k = new AtomicBoolean(false);
        obj.f41188l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f41183f = context;
        obj.e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f41184g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f41180a = sharedPreferences.getInt("scoreall", 0);
        n1.f41178m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f41113s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f41106l) {
            f1 f1Var = this.f41098a;
            if (!f1Var.getPainting().G && this.f41102g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f41106l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f41223f.f(new p0(painting, 1));
                this.f41108n = 0;
                this.f41109o = 0;
                this.f41104j = false;
                this.f41099b = false;
                if (z10 && (e1Var = f1Var.f41122a) != null) {
                    e1Var.f();
                }
                vv0 vv0Var = f1Var.getPainting().f41224g;
                w0 w0Var = this.f41102g;
                float a2 = a7.a((float) w0Var.f41297a, (float) w0Var.f41298b, 0.0f, 0.0f);
                w0 w0Var2 = this.f41102g;
                float max = Math.max(a2, a7.a((float) w0Var2.f41297a, (float) w0Var2.f41298b, vv0Var.f29774a, 0.0f));
                w0 w0Var3 = this.f41102g;
                float a10 = a7.a((float) w0Var3.f41297a, (float) w0Var3.f41298b, 0.0f, vv0Var.f29775b);
                w0 w0Var4 = this.f41102g;
                final float max2 = Math.max(max, Math.max(a10, a7.a((float) w0Var4.f41297a, (float) w0Var4.f41298b, vv0Var.f29774a, vv0Var.f29775b))) / 0.84f;
                ValueAnimator valueAnimator = this.f41112r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f41112r = null;
                }
                ValueAnimator valueAnimator2 = this.f41117x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f41117x = null;
                }
                w0 w0Var5 = this.f41102g;
                final w0 w0Var6 = new w0(w0Var5.f41297a, w0Var5.f41298b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41117x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f41098a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f41263c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f41223f.f(new b8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f41117x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f41117x.setDuration(450L);
                this.f41117x.setInterpolator(sr.h);
                this.f41117x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f41098a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f41263c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f41101f) {
            this.f41103i = 0.0d;
        }
        t0Var.f41261a = this.f41103i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f41101f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f41223f.f(new b8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f41101f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f41108n;
        w0[] w0VarArr = this.f41107m;
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
                    double d13 = (b11.f41297a * d10) + (w0Var2.f41297a * 2.0d * d12 * d) + (b10.f41297a * d11);
                    double d14 = (b11.f41298b * d10) + (w0Var2.f41298b * 2.0d * d12 * d) + (b10.f41298b * d11);
                    double lerp = ((((b11.f41299c * d10) + ((w0Var2.f41299c * ((2.0f * f13) * f12)) + (b10.f41299c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f41109o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f41100c) {
                        w0Var4.d = true;
                        this.f41100c = false;
                    }
                    vector.add(w0Var4);
                    this.f41110p += lerp;
                    this.f41111q += 1.0d;
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
                    this.f41108n = 0;
                    return;
                } else {
                    this.f41108n = 2;
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
