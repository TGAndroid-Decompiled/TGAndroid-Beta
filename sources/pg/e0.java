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
import org.telegram.ui.Components.wv0;
import v7.a7;
public final class e0 {
    public static final sr B = new sr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f41097a;
    public boolean f41098b;
    public boolean f41099c;
    public long d;
    public boolean e;
    public boolean f41100f;
    public w0 f41101g;
    public w0 h;
    public double f41102i;
    public boolean f41103j;
    public float f41104k;
    public boolean f41105l;
    public int f41107n;
    public int f41108o;
    public double f41109p;
    public double f41110q;
    public ValueAnimator f41111r;
    public final n1 f41112s;
    public Matrix f41113t;
    public long v;
    public float f41115w;
    public ValueAnimator f41116x;
    public boolean f41118z;
    public final w0[] f41106m = new w0[3];
    public final float[] f41114u = new float[2];
    public final z f41117y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f41097a = f1Var;
        Context context = f1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f41180b = new ArrayList();
        obj.f41181c = new ArrayList();
        obj.f41184i = null;
        obj.f41185j = new AtomicBoolean(false);
        obj.f41186k = new AtomicBoolean(false);
        obj.f41187l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f41182f = context;
        obj.e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f41183g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f41179a = sharedPreferences.getInt("scoreall", 0);
        n1.f41177m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f41112s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f41105l) {
            f1 f1Var = this.f41097a;
            if (!f1Var.getPainting().G && this.f41101g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f41105l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f41222f.f(new p0(painting, 1));
                this.f41107n = 0;
                this.f41108o = 0;
                this.f41103j = false;
                this.f41098b = false;
                if (z10 && (e1Var = f1Var.f41121a) != null) {
                    e1Var.f();
                }
                wv0 wv0Var = f1Var.getPainting().f41223g;
                w0 w0Var = this.f41101g;
                float a2 = a7.a((float) w0Var.f41296a, (float) w0Var.f41297b, 0.0f, 0.0f);
                w0 w0Var2 = this.f41101g;
                float max = Math.max(a2, a7.a((float) w0Var2.f41296a, (float) w0Var2.f41297b, wv0Var.f30196a, 0.0f));
                w0 w0Var3 = this.f41101g;
                float a10 = a7.a((float) w0Var3.f41296a, (float) w0Var3.f41297b, 0.0f, wv0Var.f30197b);
                w0 w0Var4 = this.f41101g;
                final float max2 = Math.max(max, Math.max(a10, a7.a((float) w0Var4.f41296a, (float) w0Var4.f41297b, wv0Var.f30196a, wv0Var.f30197b))) / 0.84f;
                ValueAnimator valueAnimator = this.f41111r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f41111r = null;
                }
                ValueAnimator valueAnimator2 = this.f41116x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f41116x = null;
                }
                w0 w0Var5 = this.f41101g;
                final w0 w0Var6 = new w0(w0Var5.f41296a, w0Var5.f41297b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41116x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f41097a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f41262c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f41222f.f(new b8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f41116x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f41116x.setDuration(450L);
                this.f41116x.setInterpolator(sr.h);
                this.f41116x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f41097a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f41262c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f41100f) {
            this.f41102i = 0.0d;
        }
        t0Var.f41260a = this.f41102i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f41100f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f41222f.f(new b8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f41100f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f41107n;
        w0[] w0VarArr = this.f41106m;
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
                    double d13 = (b11.f41296a * d10) + (w0Var2.f41296a * 2.0d * d12 * d) + (b10.f41296a * d11);
                    double d14 = (b11.f41297b * d10) + (w0Var2.f41297b * 2.0d * d12 * d) + (b10.f41297b * d11);
                    double lerp = ((((b11.f41298c * d10) + ((w0Var2.f41298c * ((2.0f * f13) * f12)) + (b10.f41298c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f41108o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f41099c) {
                        w0Var4.d = true;
                        this.f41099c = false;
                    }
                    vector.add(w0Var4);
                    this.f41109p += lerp;
                    this.f41110q += 1.0d;
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
                    this.f41107n = 0;
                    return;
                } else {
                    this.f41107n = 2;
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
