package sg;

import a8.r9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import c8.j9;
import di.a6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.xq;
public final class w {
    public static final xq B = new xq(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final v0 f55245a;
    public boolean f55246b;
    public boolean f55247c;
    public long d;
    public boolean f55248e;
    public boolean f55249f;
    public n0 f55250g;
    public n0 h;
    public double f55251i;
    public boolean f55252j;
    public float f55253k;
    public boolean f55254l;
    public int f55256n;
    public int f55257o;
    public double f55258p;
    public double f55259q;
    public ValueAnimator f55260r;
    public final c1 f55261s;
    public Matrix f55262t;
    public long v;
    public float f55264w;
    public ValueAnimator f55265x;
    public boolean f55267z;
    public final n0[] f55255m = new n0[3];
    public final float[] f55263u = new float[2];
    public final s f55266y = new s(this, 1);

    public w(v0 v0Var) {
        this.f55245a = v0Var;
        Context context = v0Var.getContext();
        ii.c cVar = new ii.c(this, 20);
        final ?? obj = new Object();
        obj.f55042b = new ArrayList();
        obj.f55043c = new ArrayList();
        obj.f55047i = null;
        obj.f55048j = new AtomicBoolean(false);
        obj.f55049k = new AtomicBoolean(false);
        obj.f55050l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.z0.run():void");
            }
        };
        obj.f55045f = context;
        obj.f55044e = cVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f55046g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f55041a = sharedPreferences.getInt("scoreall", 0);
        c1.f55039m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.z0.run():void");
            }
        });
        this.f55261s = obj;
    }

    public final void a(d dVar, boolean z9, p0 p0Var) {
        Object obj;
        u0 u0Var;
        if (this.f55254l) {
            v0 v0Var = this.f55245a;
            if (!v0Var.getPainting().G && this.f55250g != null) {
                if (dVar == null) {
                    obj = v0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f55254l = false;
                if (r42 instanceof d) {
                    v0Var.getPainting().E = false;
                }
                j0 painting = v0Var.getPainting();
                painting.f55103f.f(new f0(painting, 1));
                this.f55256n = 0;
                this.f55257o = 0;
                this.f55252j = false;
                this.f55246b = false;
                if (z9 && (u0Var = v0Var.f55234a) != null) {
                    u0Var.d0();
                }
                ot0 ot0Var = v0Var.getPainting().f55104g;
                n0 n0Var = this.f55250g;
                float a10 = r9.a((float) n0Var.f55166a, (float) n0Var.f55167b, 0.0f, 0.0f);
                n0 n0Var2 = this.f55250g;
                float max = Math.max(a10, r9.a((float) n0Var2.f55166a, (float) n0Var2.f55167b, ot0Var.f36801a, 0.0f));
                n0 n0Var3 = this.f55250g;
                float a11 = r9.a((float) n0Var3.f55166a, (float) n0Var3.f55167b, 0.0f, ot0Var.f36802b);
                n0 n0Var4 = this.f55250g;
                final float max2 = Math.max(max, Math.max(a11, r9.a((float) n0Var4.f55166a, (float) n0Var4.f55167b, ot0Var.f36801a, ot0Var.f36802b))) / 0.84f;
                ValueAnimator valueAnimator = this.f55260r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f55260r = null;
                }
                ValueAnimator valueAnimator2 = this.f55265x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f55265x = null;
                }
                n0 n0Var5 = this.f55250g;
                final n0 n0Var6 = new n0(n0Var5.f55166a, n0Var5.f55167b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f55265x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        v0 v0Var2 = w.this.f55245a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        k0 k0Var = new k0(new n0[]{n0Var6});
                        h hVar = r42;
                        hVar.getClass();
                        if (hVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = v0Var2.getCurrentColor();
                        }
                        k0Var.f55129c = currentColor;
                        k0Var.d = floatValue * max2;
                        k0Var.f55130e = hVar;
                        j0 painting2 = v0Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f55103f.f(new a6(painting2, k0Var, true, true, null, 5));
                    }
                });
                this.f55265x.addListener(new v(this, n0Var6, max2, r42, z9, p0Var));
                this.f55265x.setDuration(450L);
                this.f55265x.setInterpolator(xq.h);
                this.f55265x.start();
                if (z9) {
                    p2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(k0 k0Var) {
        v0 v0Var = this.f55245a;
        int currentColor = v0Var.getCurrentColor();
        float currentWeight = v0Var.getCurrentWeight();
        h currentBrush = v0Var.getCurrentBrush();
        k0Var.f55129c = currentColor;
        k0Var.d = currentWeight;
        k0Var.f55130e = currentBrush;
        if (this.f55249f) {
            this.f55251i = 0.0d;
        }
        k0Var.f55127a = this.f55251i;
        j0 painting = v0Var.getPainting();
        boolean z9 = this.f55249f;
        u uVar = new u(this, k0Var, 0);
        if (painting.L == null) {
            painting.f55103f.f(new a6(painting, k0Var, z9, false, uVar, 5));
        }
        this.f55249f = false;
    }

    public final void c(boolean z9, float f10) {
        int i7 = this.f55256n;
        n0[] n0VarArr = this.f55255m;
        if (i7 > 2) {
            Vector vector = new Vector();
            n0 n0Var = n0VarArr[0];
            n0 n0Var2 = n0VarArr[1];
            n0 n0Var3 = n0VarArr[2];
            if (n0Var3 != null && n0Var2 != null && n0Var != null) {
                n0 b10 = n0Var2.b(n0Var);
                n0 b11 = n0Var3.b(n0Var2);
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
                float f11 = 1.0f;
                float f12 = 1.0f / min;
                int i10 = 0;
                float f13 = 0.0f;
                while (i10 < min) {
                    float f14 = f11 - f13;
                    double d = f14;
                    double pow = Math.pow(d, 2.0d);
                    double d2 = f13 * f13;
                    double d10 = f14 * f14;
                    double d11 = f13;
                    double d12 = (b11.f55166a * d2) + (n0Var2.f55166a * 2.0d * d11 * d) + (b10.f55166a * d10);
                    double d13 = (b11.f55167b * d2) + (n0Var2.f55167b * 2.0d * d11 * d) + (b10.f55167b * d10);
                    double T1 = ((((b11.f55168c * d2) + ((n0Var2.f55168c * ((2.0f * f14) * f13)) + (b10.f55168c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, j9.a(this.f55257o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    n0 n0Var4 = new n0(d12, d13, T1);
                    if (this.f55247c) {
                        n0Var4.d = true;
                        this.f55247c = false;
                    }
                    vector.add(n0Var4);
                    this.f55258p += T1;
                    this.f55259q += 1.0d;
                    f13 += f12;
                    i10++;
                    f11 = 1.0f;
                }
                if (z9) {
                    b11.d = true;
                }
                vector.add(b11);
                n0[] n0VarArr2 = new n0[vector.size()];
                vector.toArray(n0VarArr2);
                b(new k0(n0VarArr2));
                System.arraycopy(n0VarArr, 1, n0VarArr, 0, 2);
                if (z9) {
                    this.f55256n = 0;
                    return;
                } else {
                    this.f55256n = 2;
                    return;
                }
            }
            return;
        }
        n0[] n0VarArr3 = new n0[i7];
        System.arraycopy(n0VarArr, 0, n0VarArr3, 0, i7);
        b(new k0(n0VarArr3));
    }
}
