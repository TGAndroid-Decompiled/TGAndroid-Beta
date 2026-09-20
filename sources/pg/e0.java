package pg;

import ai.z7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.uv0;
import v7.a7;
public final class e0 {
    public static final qr B = new qr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final e1 f41126a;
    public boolean f41127b;
    public boolean f41128c;
    public long d;
    public boolean e;
    public boolean f41129f;
    public w0 f41130g;
    public w0 h;
    public double f41131i;
    public boolean f41132j;
    public float f41133k;
    public boolean f41134l;
    public int f41136n;
    public int f41137o;
    public double f41138p;
    public double f41139q;
    public ValueAnimator f41140r;
    public final m1 f41141s;
    public Matrix f41142t;
    public long v;
    public float f41144w;
    public ValueAnimator f41145x;
    public boolean f41147z;
    public final w0[] f41135m = new w0[3];
    public final float[] f41143u = new float[2];
    public final z f41146y = new z(this, 1);

    public e0(e1 e1Var) {
        this.f41126a = e1Var;
        Context context = e1Var.getContext();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 3);
        final ?? obj = new Object();
        obj.f41206b = new ArrayList();
        obj.f41207c = new ArrayList();
        obj.f41210i = null;
        obj.f41211j = new AtomicBoolean(false);
        obj.f41212k = new AtomicBoolean(false);
        obj.f41213l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.i1.run():void");
            }
        };
        obj.f41208f = context;
        obj.e = b1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f41209g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f41205a = sharedPreferences.getInt("scoreall", 0);
        m1.f41203m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.i1.run():void");
            }
        });
        this.f41141s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        d1 d1Var;
        if (this.f41134l) {
            e1 e1Var = this.f41126a;
            if (!e1Var.getPainting().G && this.f41130g != null) {
                if (dVar == null) {
                    obj = e1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f41134l = false;
                if (r42 instanceof d) {
                    e1Var.getPainting().E = false;
                }
                s0 painting = e1Var.getPainting();
                painting.f41264f.f(new p0(painting, 1));
                this.f41136n = 0;
                this.f41137o = 0;
                this.f41132j = false;
                this.f41127b = false;
                if (z10 && (d1Var = e1Var.f41148a) != null) {
                    d1Var.f();
                }
                uv0 uv0Var = e1Var.getPainting().f41265g;
                w0 w0Var = this.f41130g;
                float a2 = a7.a((float) w0Var.f41328a, (float) w0Var.f41329b, 0.0f, 0.0f);
                w0 w0Var2 = this.f41130g;
                float max = Math.max(a2, a7.a((float) w0Var2.f41328a, (float) w0Var2.f41329b, uv0Var.f28868a, 0.0f));
                w0 w0Var3 = this.f41130g;
                float a10 = a7.a((float) w0Var3.f41328a, (float) w0Var3.f41329b, 0.0f, uv0Var.f28869b);
                w0 w0Var4 = this.f41130g;
                final float max2 = Math.max(max, Math.max(a10, a7.a((float) w0Var4.f41328a, (float) w0Var4.f41329b, uv0Var.f28868a, uv0Var.f28869b))) / 0.84f;
                ValueAnimator valueAnimator = this.f41140r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f41140r = null;
                }
                ValueAnimator valueAnimator2 = this.f41145x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f41145x = null;
                }
                w0 w0Var5 = this.f41130g;
                final w0 w0Var6 = new w0(w0Var5.f41328a, w0Var5.f41329b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41145x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        e1 e1Var2 = e0.this.f41126a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = e1Var2.getCurrentColor();
                        }
                        t0Var.f41294c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = e1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f41264f.f(new z7(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f41145x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f41145x.setDuration(450L);
                this.f41145x.setInterpolator(qr.h);
                this.f41145x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        e1 e1Var = this.f41126a;
        int currentColor = e1Var.getCurrentColor();
        float currentWeight = e1Var.getCurrentWeight();
        m currentBrush = e1Var.getCurrentBrush();
        t0Var.f41294c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f41129f) {
            this.f41131i = 0.0d;
        }
        t0Var.f41292a = this.f41131i;
        s0 painting = e1Var.getPainting();
        boolean z10 = this.f41129f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f41264f.f(new z7(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f41129f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f41136n;
        w0[] w0VarArr = this.f41135m;
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
                    double d13 = (b11.f41328a * d10) + (w0Var2.f41328a * 2.0d * d12 * d) + (b10.f41328a * d11);
                    double d14 = (b11.f41329b * d10) + (w0Var2.f41329b * 2.0d * d12 * d) + (b10.f41329b * d11);
                    double lerp = ((((b11.f41330c * d10) + ((w0Var2.f41330c * ((2.0f * f13) * f12)) + (b10.f41330c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f41137o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f41128c) {
                        w0Var4.d = true;
                        this.f41128c = false;
                    }
                    vector.add(w0Var4);
                    this.f41138p += lerp;
                    this.f41139q += 1.0d;
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
                    this.f41136n = 0;
                    return;
                } else {
                    this.f41136n = 2;
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
