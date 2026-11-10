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
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.wq;
public final class w {
    public static final wq B = new wq(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final v0 f55244a;
    public boolean f55245b;
    public boolean f55246c;
    public long d;
    public boolean f55247e;
    public boolean f55248f;
    public n0 f55249g;
    public n0 h;
    public double f55250i;
    public boolean f55251j;
    public float f55252k;
    public boolean f55253l;
    public int f55255n;
    public int f55256o;
    public double f55257p;
    public double f55258q;
    public ValueAnimator f55259r;
    public final c1 f55260s;
    public Matrix f55261t;
    public long v;
    public float f55263w;
    public ValueAnimator f55264x;
    public boolean f55266z;
    public final n0[] f55254m = new n0[3];
    public final float[] f55262u = new float[2];
    public final s f55265y = new s(this, 1);

    public w(v0 v0Var) {
        this.f55244a = v0Var;
        Context context = v0Var.getContext();
        ii.c cVar = new ii.c(this, 20);
        final ?? obj = new Object();
        obj.f55041b = new ArrayList();
        obj.f55042c = new ArrayList();
        obj.f55046i = null;
        obj.f55047j = new AtomicBoolean(false);
        obj.f55048k = new AtomicBoolean(false);
        obj.f55049l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.z0.run():void");
            }
        };
        obj.f55044f = context;
        obj.f55043e = cVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f55045g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f55040a = sharedPreferences.getInt("scoreall", 0);
        c1.f55038m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.z0.run():void");
            }
        });
        this.f55260s = obj;
    }

    public final void a(d dVar, boolean z9, p0 p0Var) {
        Object obj;
        u0 u0Var;
        if (this.f55253l) {
            v0 v0Var = this.f55244a;
            if (!v0Var.getPainting().G && this.f55249g != null) {
                if (dVar == null) {
                    obj = v0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f55253l = false;
                if (r42 instanceof d) {
                    v0Var.getPainting().E = false;
                }
                j0 painting = v0Var.getPainting();
                painting.f55102f.f(new f0(painting, 1));
                this.f55255n = 0;
                this.f55256o = 0;
                this.f55251j = false;
                this.f55245b = false;
                if (z9 && (u0Var = v0Var.f55233a) != null) {
                    u0Var.d0();
                }
                nt0 nt0Var = v0Var.getPainting().f55103g;
                n0 n0Var = this.f55249g;
                float a10 = r9.a((float) n0Var.f55165a, (float) n0Var.f55166b, 0.0f, 0.0f);
                n0 n0Var2 = this.f55249g;
                float max = Math.max(a10, r9.a((float) n0Var2.f55165a, (float) n0Var2.f55166b, nt0Var.f36392a, 0.0f));
                n0 n0Var3 = this.f55249g;
                float a11 = r9.a((float) n0Var3.f55165a, (float) n0Var3.f55166b, 0.0f, nt0Var.f36393b);
                n0 n0Var4 = this.f55249g;
                final float max2 = Math.max(max, Math.max(a11, r9.a((float) n0Var4.f55165a, (float) n0Var4.f55166b, nt0Var.f36392a, nt0Var.f36393b))) / 0.84f;
                ValueAnimator valueAnimator = this.f55259r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f55259r = null;
                }
                ValueAnimator valueAnimator2 = this.f55264x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f55264x = null;
                }
                n0 n0Var5 = this.f55249g;
                final n0 n0Var6 = new n0(n0Var5.f55165a, n0Var5.f55166b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f55264x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        v0 v0Var2 = w.this.f55244a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        k0 k0Var = new k0(new n0[]{n0Var6});
                        h hVar = r42;
                        hVar.getClass();
                        if (hVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = v0Var2.getCurrentColor();
                        }
                        k0Var.f55128c = currentColor;
                        k0Var.d = floatValue * max2;
                        k0Var.f55129e = hVar;
                        j0 painting2 = v0Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f55102f.f(new a6(painting2, k0Var, true, true, null, 5));
                    }
                });
                this.f55264x.addListener(new v(this, n0Var6, max2, r42, z9, p0Var));
                this.f55264x.setDuration(450L);
                this.f55264x.setInterpolator(wq.h);
                this.f55264x.start();
                if (z9) {
                    p2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(k0 k0Var) {
        v0 v0Var = this.f55244a;
        int currentColor = v0Var.getCurrentColor();
        float currentWeight = v0Var.getCurrentWeight();
        h currentBrush = v0Var.getCurrentBrush();
        k0Var.f55128c = currentColor;
        k0Var.d = currentWeight;
        k0Var.f55129e = currentBrush;
        if (this.f55248f) {
            this.f55250i = 0.0d;
        }
        k0Var.f55126a = this.f55250i;
        j0 painting = v0Var.getPainting();
        boolean z9 = this.f55248f;
        u uVar = new u(this, k0Var, 0);
        if (painting.L == null) {
            painting.f55102f.f(new a6(painting, k0Var, z9, false, uVar, 5));
        }
        this.f55248f = false;
    }

    public final void c(boolean z9, float f10) {
        int i7 = this.f55255n;
        n0[] n0VarArr = this.f55254m;
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
                    double d12 = (b11.f55165a * d2) + (n0Var2.f55165a * 2.0d * d11 * d) + (b10.f55165a * d10);
                    double d13 = (b11.f55166b * d2) + (n0Var2.f55166b * 2.0d * d11 * d) + (b10.f55166b * d10);
                    double T1 = ((((b11.f55167c * d2) + ((n0Var2.f55167c * ((2.0f * f14) * f13)) + (b10.f55167c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, j9.a(this.f55256o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    n0 n0Var4 = new n0(d12, d13, T1);
                    if (this.f55246c) {
                        n0Var4.d = true;
                        this.f55246c = false;
                    }
                    vector.add(n0Var4);
                    this.f55257p += T1;
                    this.f55258q += 1.0d;
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
                    this.f55255n = 0;
                    return;
                } else {
                    this.f55255n = 2;
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
