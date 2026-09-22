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
import org.telegram.ui.Components.wv0;
import v7.a7;
public final class e0 {
    public static final qr B = new qr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final f1 f41148a;
    public boolean f41149b;
    public boolean f41150c;
    public long d;
    public boolean e;
    public boolean f41151f;
    public w0 f41152g;
    public w0 h;
    public double f41153i;
    public boolean f41154j;
    public float f41155k;
    public boolean f41156l;
    public int f41158n;
    public int f41159o;
    public double f41160p;
    public double f41161q;
    public ValueAnimator f41162r;
    public final n1 f41163s;
    public Matrix f41164t;
    public long v;
    public float f41166w;
    public ValueAnimator f41167x;
    public boolean f41169z;
    public final w0[] f41157m = new w0[3];
    public final float[] f41165u = new float[2];
    public final z f41168y = new z(this, 1);

    public e0(f1 f1Var) {
        this.f41148a = f1Var;
        Context context = f1Var.getContext();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 3);
        final ?? obj = new Object();
        obj.f41231b = new ArrayList();
        obj.f41232c = new ArrayList();
        obj.f41235i = null;
        obj.f41236j = new AtomicBoolean(false);
        obj.f41237k = new AtomicBoolean(false);
        obj.f41238l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        };
        obj.f41233f = context;
        obj.e = b1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f41234g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f41230a = sharedPreferences.getInt("scoreall", 0);
        n1.f41228m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.j1.run():void");
            }
        });
        this.f41163s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        e1 e1Var;
        if (this.f41156l) {
            f1 f1Var = this.f41148a;
            if (!f1Var.getPainting().G && this.f41152g != null) {
                if (dVar == null) {
                    obj = f1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f41156l = false;
                if (r42 instanceof d) {
                    f1Var.getPainting().E = false;
                }
                s0 painting = f1Var.getPainting();
                painting.f41273f.f(new p0(painting, 1));
                this.f41158n = 0;
                this.f41159o = 0;
                this.f41154j = false;
                this.f41149b = false;
                if (z10 && (e1Var = f1Var.f41172a) != null) {
                    e1Var.f();
                }
                wv0 wv0Var = f1Var.getPainting().f41274g;
                w0 w0Var = this.f41152g;
                float a2 = a7.a((float) w0Var.f41347a, (float) w0Var.f41348b, 0.0f, 0.0f);
                w0 w0Var2 = this.f41152g;
                float max = Math.max(a2, a7.a((float) w0Var2.f41347a, (float) w0Var2.f41348b, wv0Var.f30161a, 0.0f));
                w0 w0Var3 = this.f41152g;
                float a10 = a7.a((float) w0Var3.f41347a, (float) w0Var3.f41348b, 0.0f, wv0Var.f30162b);
                w0 w0Var4 = this.f41152g;
                final float max2 = Math.max(max, Math.max(a10, a7.a((float) w0Var4.f41347a, (float) w0Var4.f41348b, wv0Var.f30161a, wv0Var.f30162b))) / 0.84f;
                ValueAnimator valueAnimator = this.f41162r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f41162r = null;
                }
                ValueAnimator valueAnimator2 = this.f41167x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f41167x = null;
                }
                w0 w0Var5 = this.f41152g;
                final w0 w0Var6 = new w0(w0Var5.f41347a, w0Var5.f41348b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41167x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        f1 f1Var2 = e0.this.f41148a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = f1Var2.getCurrentColor();
                        }
                        t0Var.f41313c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = f1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f41273f.f(new z7(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f41167x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f41167x.setDuration(450L);
                this.f41167x.setInterpolator(qr.h);
                this.f41167x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        f1 f1Var = this.f41148a;
        int currentColor = f1Var.getCurrentColor();
        float currentWeight = f1Var.getCurrentWeight();
        m currentBrush = f1Var.getCurrentBrush();
        t0Var.f41313c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f41151f) {
            this.f41153i = 0.0d;
        }
        t0Var.f41311a = this.f41153i;
        s0 painting = f1Var.getPainting();
        boolean z10 = this.f41151f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f41273f.f(new z7(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f41151f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f41158n;
        w0[] w0VarArr = this.f41157m;
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
                    double d13 = (b11.f41347a * d10) + (w0Var2.f41347a * 2.0d * d12 * d) + (b10.f41347a * d11);
                    double d14 = (b11.f41348b * d10) + (w0Var2.f41348b * 2.0d * d12 * d) + (b10.f41348b * d11);
                    double lerp = ((((b11.f41349c * d10) + ((w0Var2.f41349c * ((2.0f * f13) * f12)) + (b10.f41349c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f41159o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f41150c) {
                        w0Var4.d = true;
                        this.f41150c = false;
                    }
                    vector.add(w0Var4);
                    this.f41160p += lerp;
                    this.f41161q += 1.0d;
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
                    this.f41158n = 0;
                    return;
                } else {
                    this.f41158n = 2;
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
