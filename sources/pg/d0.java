package pg;

import ai.c8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.mw0;
import v7.z6;
public final class d0 {
    public static final hs B = new hs(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final e1 f45609a;
    public boolean f45610b;
    public boolean f45611c;
    public long d;
    public boolean f45612e;
    public boolean f45613f;
    public w0 f45614g;
    public w0 h;
    public double f45615i;
    public boolean f45616j;
    public float f45617k;
    public boolean f45618l;
    public int f45620n;
    public int f45621o;
    public double f45622p;
    public double f45623q;
    public ValueAnimator f45624r;
    public final m1 f45625s;
    public Matrix f45626t;
    public long v;
    public float f45628w;
    public ValueAnimator f45629x;
    public boolean f45631z;
    public final w0[] f45619m = new w0[3];
    public final float[] f45627u = new float[2];
    public final z f45630y = new z(this, 1);

    public d0(e1 e1Var) {
        this.f45609a = e1Var;
        Context context = e1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f45695b = new ArrayList();
        obj.f45696c = new ArrayList();
        obj.f45700i = null;
        obj.f45701j = new AtomicBoolean(false);
        obj.f45702k = new AtomicBoolean(false);
        obj.f45703l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.i1.run():void");
            }
        };
        obj.f45698f = context;
        obj.f45697e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f45699g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f45694a = sharedPreferences.getInt("scoreall", 0);
        m1.f45692m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.i1.run():void");
            }
        });
        this.f45625s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        d1 d1Var;
        if (this.f45618l) {
            e1 e1Var = this.f45609a;
            if (!e1Var.getPainting().G && this.f45614g != null) {
                if (dVar == null) {
                    obj = e1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f45618l = false;
                if (r42 instanceof d) {
                    e1Var.getPainting().E = false;
                }
                s0 painting = e1Var.getPainting();
                painting.f45759f.f(new p0(painting, 1));
                this.f45620n = 0;
                this.f45621o = 0;
                this.f45616j = false;
                this.f45610b = false;
                if (z10 && (d1Var = e1Var.f45633a) != null) {
                    d1Var.f();
                }
                mw0 mw0Var = e1Var.getPainting().f45760g;
                w0 w0Var = this.f45614g;
                float a2 = z6.a((float) w0Var.f45829a, (float) w0Var.f45830b, 0.0f, 0.0f);
                w0 w0Var2 = this.f45614g;
                float max = Math.max(a2, z6.a((float) w0Var2.f45829a, (float) w0Var2.f45830b, mw0Var.f28963a, 0.0f));
                w0 w0Var3 = this.f45614g;
                float a10 = z6.a((float) w0Var3.f45829a, (float) w0Var3.f45830b, 0.0f, mw0Var.f28964b);
                w0 w0Var4 = this.f45614g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) w0Var4.f45829a, (float) w0Var4.f45830b, mw0Var.f28963a, mw0Var.f28964b))) / 0.84f;
                ValueAnimator valueAnimator = this.f45624r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f45624r = null;
                }
                ValueAnimator valueAnimator2 = this.f45629x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f45629x = null;
                }
                w0 w0Var5 = this.f45614g;
                final w0 w0Var6 = new w0(w0Var5.f45829a, w0Var5.f45830b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f45629x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        e1 e1Var2 = d0.this.f45609a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = e1Var2.getCurrentColor();
                        }
                        t0Var.f45790c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.f45791e = mVar;
                        s0 painting2 = e1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f45759f.f(new c8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f45629x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f45629x.setDuration(450L);
                this.f45629x.setInterpolator(hs.h);
                this.f45629x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        e1 e1Var = this.f45609a;
        int currentColor = e1Var.getCurrentColor();
        float currentWeight = e1Var.getCurrentWeight();
        m currentBrush = e1Var.getCurrentBrush();
        t0Var.f45790c = currentColor;
        t0Var.d = currentWeight;
        t0Var.f45791e = currentBrush;
        if (this.f45613f) {
            this.f45615i = 0.0d;
        }
        t0Var.f45788a = this.f45615i;
        s0 painting = e1Var.getPainting();
        boolean z10 = this.f45613f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f45759f.f(new c8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f45613f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f45620n;
        w0[] w0VarArr = this.f45619m;
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
                    double d13 = (b11.f45829a * d10) + (w0Var2.f45829a * 2.0d * d12 * d) + (b10.f45829a * d11);
                    double d14 = (b11.f45830b * d10) + (w0Var2.f45830b * 2.0d * d12 * d) + (b10.f45830b * d11);
                    double lerp = ((((b11.f45831c * d10) + ((w0Var2.f45831c * ((2.0f * f13) * f12)) + (b10.f45831c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.o.a(this.f45621o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f45611c) {
                        w0Var4.d = true;
                        this.f45611c = false;
                    }
                    vector.add(w0Var4);
                    this.f45622p += lerp;
                    this.f45623q += 1.0d;
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
                    this.f45620n = 0;
                    return;
                } else {
                    this.f45620n = 2;
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
