package sg;

import a8.r9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import c8.j9;
import di.z5;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.xq;
public final class w {
    public static final xq B = new xq(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final w0 f55133a;
    public boolean f55134b;
    public boolean f55135c;
    public long d;
    public boolean f55136e;
    public boolean f55137f;
    public n0 f55138g;
    public n0 h;
    public double f55139i;
    public boolean f55140j;
    public float f55141k;
    public boolean f55142l;
    public int f55144n;
    public int f55145o;
    public double f55146p;
    public double f55147q;
    public ValueAnimator f55148r;
    public final d1 f55149s;
    public Matrix f55150t;
    public long v;
    public float f55152w;
    public ValueAnimator f55153x;
    public boolean f55155z;
    public final n0[] f55143m = new n0[3];
    public final float[] f55151u = new float[2];
    public final s f55154y = new s(this, 1);

    public w(w0 w0Var) {
        this.f55133a = w0Var;
        Context context = w0Var.getContext();
        ii.c cVar = new ii.c(this, 20);
        final ?? obj = new Object();
        obj.f54941b = new ArrayList();
        obj.f54942c = new ArrayList();
        obj.f54946i = null;
        obj.f54947j = new AtomicBoolean(false);
        obj.f54948k = new AtomicBoolean(false);
        obj.f54949l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.a1.run():void");
            }
        };
        obj.f54944f = context;
        obj.f54943e = cVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f54945g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f54940a = sharedPreferences.getInt("scoreall", 0);
        d1.f54938m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.a1.run():void");
            }
        });
        this.f55149s = obj;
    }

    public final void a(d dVar, boolean z9, p0 p0Var) {
        Object obj;
        v0 v0Var;
        if (this.f55142l) {
            w0 w0Var = this.f55133a;
            if (!w0Var.getPainting().G && this.f55138g != null) {
                if (dVar == null) {
                    obj = w0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f55142l = false;
                if (r42 instanceof d) {
                    w0Var.getPainting().E = false;
                }
                j0 painting = w0Var.getPainting();
                painting.f54997f.f(new f0(painting, 1));
                this.f55144n = 0;
                this.f55145o = 0;
                this.f55140j = false;
                this.f55134b = false;
                if (z9 && (v0Var = w0Var.f55156a) != null) {
                    v0Var.d0();
                }
                mt0 mt0Var = w0Var.getPainting().f54998g;
                n0 n0Var = this.f55138g;
                float a10 = r9.a((float) n0Var.f55063a, (float) n0Var.f55064b, 0.0f, 0.0f);
                n0 n0Var2 = this.f55138g;
                float max = Math.max(a10, r9.a((float) n0Var2.f55063a, (float) n0Var2.f55064b, mt0Var.f36086a, 0.0f));
                n0 n0Var3 = this.f55138g;
                float a11 = r9.a((float) n0Var3.f55063a, (float) n0Var3.f55064b, 0.0f, mt0Var.f36087b);
                n0 n0Var4 = this.f55138g;
                final float max2 = Math.max(max, Math.max(a11, r9.a((float) n0Var4.f55063a, (float) n0Var4.f55064b, mt0Var.f36086a, mt0Var.f36087b))) / 0.84f;
                ValueAnimator valueAnimator = this.f55148r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f55148r = null;
                }
                ValueAnimator valueAnimator2 = this.f55153x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f55153x = null;
                }
                n0 n0Var5 = this.f55138g;
                final n0 n0Var6 = new n0(n0Var5.f55063a, n0Var5.f55064b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f55153x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        w0 w0Var2 = w.this.f55133a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        k0 k0Var = new k0(new n0[]{n0Var6});
                        h hVar = r42;
                        hVar.getClass();
                        if (hVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = w0Var2.getCurrentColor();
                        }
                        k0Var.f55024c = currentColor;
                        k0Var.d = floatValue * max2;
                        k0Var.f55025e = hVar;
                        j0 painting2 = w0Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f54997f.f(new z5(painting2, k0Var, true, true, null, 5));
                    }
                });
                this.f55153x.addListener(new v(this, n0Var6, max2, r42, z9, p0Var));
                this.f55153x.setDuration(450L);
                this.f55153x.setInterpolator(xq.h);
                this.f55153x.start();
                if (z9) {
                    p2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(k0 k0Var) {
        w0 w0Var = this.f55133a;
        int currentColor = w0Var.getCurrentColor();
        float currentWeight = w0Var.getCurrentWeight();
        h currentBrush = w0Var.getCurrentBrush();
        k0Var.f55024c = currentColor;
        k0Var.d = currentWeight;
        k0Var.f55025e = currentBrush;
        if (this.f55137f) {
            this.f55139i = 0.0d;
        }
        k0Var.f55022a = this.f55139i;
        j0 painting = w0Var.getPainting();
        boolean z9 = this.f55137f;
        u uVar = new u(this, k0Var, 0);
        if (painting.L == null) {
            painting.f54997f.f(new z5(painting, k0Var, z9, false, uVar, 5));
        }
        this.f55137f = false;
    }

    public final void c(boolean z9, float f10) {
        int i7 = this.f55144n;
        n0[] n0VarArr = this.f55143m;
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
                    double d12 = (b11.f55063a * d2) + (n0Var2.f55063a * 2.0d * d11 * d) + (b10.f55063a * d10);
                    double d13 = (b11.f55064b * d2) + (n0Var2.f55064b * 2.0d * d11 * d) + (b10.f55064b * d10);
                    double T1 = ((((b11.f55065c * d2) + ((n0Var2.f55065c * ((2.0f * f14) * f13)) + (b10.f55065c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, j9.a(this.f55145o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    n0 n0Var4 = new n0(d12, d13, T1);
                    if (this.f55135c) {
                        n0Var4.d = true;
                        this.f55135c = false;
                    }
                    vector.add(n0Var4);
                    this.f55146p += T1;
                    this.f55147q += 1.0d;
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
                    this.f55144n = 0;
                    return;
                } else {
                    this.f55144n = 2;
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
