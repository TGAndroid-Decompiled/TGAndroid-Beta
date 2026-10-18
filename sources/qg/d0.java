package qg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import ci.i6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dw0;
import v7.f7;
public final class d0 {
    public static final bs B = new bs(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final e1 f44488a;
    public boolean f44489b;
    public boolean f44490c;
    public long d;
    public boolean e;
    public boolean f44491f;
    public w0 f44492g;
    public w0 h;
    public double f44493i;
    public boolean f44494j;
    public float f44495k;
    public boolean f44496l;
    public int f44498n;
    public int f44499o;
    public double f44500p;
    public double f44501q;
    public ValueAnimator f44502r;
    public final m1 f44503s;
    public Matrix f44504t;
    public long v;
    public float f44506w;
    public ValueAnimator f44507x;
    public boolean f44509z;
    public final w0[] f44497m = new w0[3];
    public final float[] f44505u = new float[2];
    public final z f44508y = new z(this, 1);

    public d0(e1 e1Var) {
        this.f44488a = e1Var;
        Context context = e1Var.getContext();
        ig.l0 l0Var = new ig.l0(this, 12);
        final ?? obj = new Object();
        obj.f44568b = new ArrayList();
        obj.f44569c = new ArrayList();
        obj.f44572i = null;
        obj.f44573j = new AtomicBoolean(false);
        obj.f44574k = new AtomicBoolean(false);
        obj.f44575l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.i1.run():void");
            }
        };
        obj.f44570f = context;
        obj.e = l0Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f44571g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f44567a = sharedPreferences.getInt("scoreall", 0);
        m1.f44565m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: qg.i1.run():void");
            }
        });
        this.f44503s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        d1 d1Var;
        if (this.f44496l) {
            e1 e1Var = this.f44488a;
            if (!e1Var.getPainting().G && this.f44492g != null) {
                if (dVar == null) {
                    obj = e1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f44496l = false;
                if (r42 instanceof d) {
                    e1Var.getPainting().E = false;
                }
                s0 painting = e1Var.getPainting();
                painting.f44626f.f(new p0(painting, 1));
                this.f44498n = 0;
                this.f44499o = 0;
                this.f44494j = false;
                this.f44489b = false;
                if (z10 && (d1Var = e1Var.f44511a) != null) {
                    d1Var.f();
                }
                dw0 dw0Var = e1Var.getPainting().f44627g;
                w0 w0Var = this.f44492g;
                float a2 = f7.a((float) w0Var.f44690a, (float) w0Var.f44691b, 0.0f, 0.0f);
                w0 w0Var2 = this.f44492g;
                float max = Math.max(a2, f7.a((float) w0Var2.f44690a, (float) w0Var2.f44691b, dw0Var.f25720a, 0.0f));
                w0 w0Var3 = this.f44492g;
                float a10 = f7.a((float) w0Var3.f44690a, (float) w0Var3.f44691b, 0.0f, dw0Var.f25721b);
                w0 w0Var4 = this.f44492g;
                final float max2 = Math.max(max, Math.max(a10, f7.a((float) w0Var4.f44690a, (float) w0Var4.f44691b, dw0Var.f25720a, dw0Var.f25721b))) / 0.84f;
                ValueAnimator valueAnimator = this.f44502r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f44502r = null;
                }
                ValueAnimator valueAnimator2 = this.f44507x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f44507x = null;
                }
                w0 w0Var5 = this.f44492g;
                final w0 w0Var6 = new w0(w0Var5.f44690a, w0Var5.f44691b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f44507x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        e1 e1Var2 = d0.this.f44488a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = e1Var2.getCurrentColor();
                        }
                        t0Var.f44656c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.e = mVar;
                        s0 painting2 = e1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f44626f.f(new i6(painting2, t0Var, true, true, null, 5));
                    }
                });
                this.f44507x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f44507x.setDuration(450L);
                this.f44507x.setInterpolator(bs.h);
                this.f44507x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        e1 e1Var = this.f44488a;
        int currentColor = e1Var.getCurrentColor();
        float currentWeight = e1Var.getCurrentWeight();
        m currentBrush = e1Var.getCurrentBrush();
        t0Var.f44656c = currentColor;
        t0Var.d = currentWeight;
        t0Var.e = currentBrush;
        if (this.f44491f) {
            this.f44493i = 0.0d;
        }
        t0Var.f44654a = this.f44493i;
        s0 painting = e1Var.getPainting();
        boolean z10 = this.f44491f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f44626f.f(new i6(painting, t0Var, z10, false, b0Var, 5));
        }
        this.f44491f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f44498n;
        w0[] w0VarArr = this.f44497m;
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
                    double d13 = (b11.f44690a * d10) + (w0Var2.f44690a * 2.0d * d12 * d) + (b10.f44690a * d11);
                    double d14 = (b11.f44691b * d10) + (w0Var2.f44691b * 2.0d * d12 * d) + (b10.f44691b * d11);
                    double lerp = ((((b11.f44692c * d10) + ((w0Var2.f44692c * ((2.0f * f13) * f12)) + (b10.f44692c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.r.a(this.f44499o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f44490c) {
                        w0Var4.d = true;
                        this.f44490c = false;
                    }
                    vector.add(w0Var4);
                    this.f44500p += lerp;
                    this.f44501q += 1.0d;
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
                    this.f44498n = 0;
                    return;
                } else {
                    this.f44498n = 2;
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
