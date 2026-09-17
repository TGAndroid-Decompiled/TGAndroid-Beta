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
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.qr;
import v7.z6;
public final class d0 {
    public static final qr B = new qr(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final c1 f40856a;
    public boolean f40857b;
    public boolean f40858c;
    public long d;
    public boolean e;
    public boolean f40859f;
    public u0 f40860g;
    public u0 h;
    public double f40861i;
    public boolean f40862j;
    public float f40863k;
    public boolean f40864l;
    public int f40866n;
    public int f40867o;
    public double f40868p;
    public double f40869q;
    public ValueAnimator f40870r;
    public final k1 f40871s;
    public Matrix f40872t;
    public long v;
    public float f40874w;
    public ValueAnimator f40875x;
    public boolean f40877z;
    public final u0[] f40865m = new u0[3];
    public final float[] f40873u = new float[2];
    public final z f40876y = new z(this, 1);

    public d0(c1 c1Var) {
        this.f40856a = c1Var;
        Context context = c1Var.getContext();
        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 3);
        final ?? obj = new Object();
        obj.f40921b = new ArrayList();
        obj.f40922c = new ArrayList();
        obj.f40925i = null;
        obj.f40926j = new AtomicBoolean(false);
        obj.f40927k = new AtomicBoolean(false);
        obj.f40928l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.g1.run():void");
            }
        };
        obj.f40923f = context;
        obj.e = b1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f40924g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f40920a = sharedPreferences.getInt("scoreall", 0);
        k1.f40918m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: pg.g1.run():void");
            }
        });
        this.f40871s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f40864l) {
            c1 c1Var = this.f40856a;
            if (!c1Var.getPainting().G && this.f40860g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f40864l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f40973f.f(new n0(painting, 1));
                this.f40866n = 0;
                this.f40867o = 0;
                this.f40862j = false;
                this.f40857b = false;
                if (z10 && (b1Var = c1Var.f40846a) != null) {
                    b1Var.f();
                }
                kv0 kv0Var = c1Var.getPainting().f40974g;
                u0 u0Var = this.f40860g;
                float a2 = z6.a((float) u0Var.f41037a, (float) u0Var.f41038b, 0.0f, 0.0f);
                u0 u0Var2 = this.f40860g;
                float max = Math.max(a2, z6.a((float) u0Var2.f41037a, (float) u0Var2.f41038b, kv0Var.f25695a, 0.0f));
                u0 u0Var3 = this.f40860g;
                float a10 = z6.a((float) u0Var3.f41037a, (float) u0Var3.f41038b, 0.0f, kv0Var.f25696b);
                u0 u0Var4 = this.f40860g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) u0Var4.f41037a, (float) u0Var4.f41038b, kv0Var.f25695a, kv0Var.f25696b))) / 0.84f;
                ValueAnimator valueAnimator = this.f40870r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f40870r = null;
                }
                ValueAnimator valueAnimator2 = this.f40875x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f40875x = null;
                }
                u0 u0Var5 = this.f40860g;
                final u0 u0Var6 = new u0(u0Var5.f41037a, u0Var5.f41038b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f40875x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = d0.this.f40856a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f41000c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f40973f.f(new z7(painting2, r0Var, true, true, null, 4));
                    }
                });
                this.f40875x.addListener(new c0(this, u0Var6, max2, r42, z10, w0Var));
                this.f40875x.setDuration(450L);
                this.f40875x.setInterpolator(qr.h);
                this.f40875x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f40856a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f41000c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f40859f) {
            this.f40861i = 0.0d;
        }
        r0Var.f40998a = this.f40861i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f40859f;
        b0 b0Var = new b0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f40973f.f(new z7(painting, r0Var, z10, false, b0Var, 4));
        }
        this.f40859f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f40866n;
        u0[] u0VarArr = this.f40865m;
        if (i10 > 2) {
            Vector vector = new Vector();
            u0 u0Var = u0VarArr[0];
            u0 u0Var2 = u0VarArr[1];
            u0 u0Var3 = u0VarArr[2];
            if (u0Var3 != null && u0Var2 != null && u0Var != null) {
                u0 b10 = u0Var2.b(u0Var);
                u0 b11 = u0Var3.b(u0Var2);
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
                    double d13 = (b11.f41037a * d10) + (u0Var2.f41037a * 2.0d * d12 * d) + (b10.f41037a * d11);
                    double d14 = (b11.f41038b * d10) + (u0Var2.f41038b * 2.0d * d12 * d) + (b10.f41038b * d11);
                    double lerp = ((((b11.f41039c * d10) + ((u0Var2.f41039c * ((2.0f * f13) * f12)) + (b10.f41039c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.p.a(this.f40867o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, lerp);
                    if (this.f40858c) {
                        u0Var4.d = true;
                        this.f40858c = false;
                    }
                    vector.add(u0Var4);
                    this.f40868p += lerp;
                    this.f40869q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                u0[] u0VarArr2 = new u0[vector.size()];
                vector.toArray(u0VarArr2);
                b(new r0(u0VarArr2));
                System.arraycopy(u0VarArr, 1, u0VarArr, 0, 2);
                if (z10) {
                    this.f40866n = 0;
                    return;
                } else {
                    this.f40866n = 2;
                    return;
                }
            }
            return;
        }
        u0[] u0VarArr3 = new u0[i10];
        System.arraycopy(u0VarArr, 0, u0VarArr3, 0, i10);
        b(new r0(u0VarArr3));
    }
}
