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
import org.telegram.ui.Components.vv0;
import v7.z6;
public final class e0 {
    public static final qr B = new qr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final e1 f41085a;
    public boolean f41086b;
    public boolean f41087c;
    public long d;
    public boolean e;
    public boolean f41088f;
    public w0 f41089g;
    public w0 h;
    public double f41090i;
    public boolean f41091j;
    public float f41092k;
    public boolean f41093l;
    public int f41095n;
    public int f41096o;
    public double f41097p;
    public double f41098q;
    public ValueAnimator f41099r;
    public final m1 f41100s;
    public Matrix f41101t;
    public long v;
    public float f41103w;
    public ValueAnimator f41104x;
    public boolean f41106z;
    public final w0[] f41094m = new w0[3];
    public final float[] f41102u = new float[2];
    public final z f41105y = new z(this, 1);

    public e0(e1 e1Var) {
        this.f41085a = e1Var;
        Context context = e1Var.getContext();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 3);
        final ?? obj = new Object();
        obj.f41165b = new ArrayList();
        obj.f41166c = new ArrayList();
        obj.f41169i = null;
        obj.f41170j = new AtomicBoolean(false);
        obj.f41171k = new AtomicBoolean(false);
        obj.f41172l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.i1.run():void");
            }
        };
        obj.f41167f = context;
        obj.e = b1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f41168g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f41164a = sharedPreferences.getInt("scoreall", 0);
        m1.f41162m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.i1.run():void");
            }
        });
        this.f41100s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        d1 d1Var;
        if (this.f41093l) {
            e1 e1Var = this.f41085a;
            if (!e1Var.getPainting().G && this.f41089g != null) {
                if (dVar == null) {
                    obj = e1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f41093l = false;
                if (r42 instanceof d) {
                    e1Var.getPainting().E = false;
                }
                s0 painting = e1Var.getPainting();
                painting.f41223f.f(new p0(painting, 1));
                this.f41095n = 0;
                this.f41096o = 0;
                this.f41091j = false;
                this.f41086b = false;
                if (z10 && (d1Var = e1Var.f41107a) != null) {
                    d1Var.f();
                }
                vv0 vv0Var = e1Var.getPainting().f41224g;
                w0 w0Var = this.f41089g;
                float a2 = z6.a((float) w0Var.f41287a, (float) w0Var.f41288b, 0.0f, 0.0f);
                w0 w0Var2 = this.f41089g;
                float max = Math.max(a2, z6.a((float) w0Var2.f41287a, (float) w0Var2.f41288b, vv0Var.f29776a, 0.0f));
                w0 w0Var3 = this.f41089g;
                float a10 = z6.a((float) w0Var3.f41287a, (float) w0Var3.f41288b, 0.0f, vv0Var.f29777b);
                w0 w0Var4 = this.f41089g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) w0Var4.f41287a, (float) w0Var4.f41288b, vv0Var.f29776a, vv0Var.f29777b))) / 0.84f;
                ValueAnimator valueAnimator = this.f41099r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f41099r = null;
                }
                ValueAnimator valueAnimator2 = this.f41104x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f41104x = null;
                }
                w0 w0Var5 = this.f41089g;
                final w0 w0Var6 = new w0(w0Var5.f41287a, w0Var5.f41288b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f41104x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        e1 e1Var2 = e0.this.f41085a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = e1Var2.getCurrentColor();
                        }
                        t0Var.f41253c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = e1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f41223f.f(new z7(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f41104x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f41104x.setDuration(450L);
                this.f41104x.setInterpolator(qr.h);
                this.f41104x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        e1 e1Var = this.f41085a;
        int currentColor = e1Var.getCurrentColor();
        float currentWeight = e1Var.getCurrentWeight();
        m currentBrush = e1Var.getCurrentBrush();
        t0Var.f41253c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f41088f) {
            this.f41090i = 0.0d;
        }
        t0Var.f41251a = this.f41090i;
        s0 painting = e1Var.getPainting();
        boolean z10 = this.f41088f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f41223f.f(new z7(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f41088f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f41095n;
        w0[] w0VarArr = this.f41094m;
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
                    double d13 = (b11.f41287a * d10) + (w0Var2.f41287a * 2.0d * d12 * d) + (b10.f41287a * d11);
                    double d14 = (b11.f41288b * d10) + (w0Var2.f41288b * 2.0d * d12 * d) + (b10.f41288b * d11);
                    double lerp = ((((b11.f41289c * d10) + ((w0Var2.f41289c * ((2.0f * f13) * f12)) + (b10.f41289c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.q.a(this.f41096o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f41087c) {
                        w0Var4.d = true;
                        this.f41087c = false;
                    }
                    vector.add(w0Var4);
                    this.f41097p += lerp;
                    this.f41098q += 1.0d;
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
                    this.f41095n = 0;
                    return;
                } else {
                    this.f41095n = 2;
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
