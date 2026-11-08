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
    public final w0 f55225a;
    public boolean f55226b;
    public boolean f55227c;
    public long d;
    public boolean f55228e;
    public boolean f55229f;
    public n0 f55230g;
    public n0 h;
    public double f55231i;
    public boolean f55232j;
    public float f55233k;
    public boolean f55234l;
    public int f55236n;
    public int f55237o;
    public double f55238p;
    public double f55239q;
    public ValueAnimator f55240r;
    public final d1 f55241s;
    public Matrix f55242t;
    public long v;
    public float f55244w;
    public ValueAnimator f55245x;
    public boolean f55247z;
    public final n0[] f55235m = new n0[3];
    public final float[] f55243u = new float[2];
    public final s f55246y = new s(this, 1);

    public w(w0 w0Var) {
        this.f55225a = w0Var;
        Context context = w0Var.getContext();
        ii.c cVar = new ii.c(this, 20);
        final ?? obj = new Object();
        obj.f55033b = new ArrayList();
        obj.f55034c = new ArrayList();
        obj.f55038i = null;
        obj.f55039j = new AtomicBoolean(false);
        obj.f55040k = new AtomicBoolean(false);
        obj.f55041l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.a1.run():void");
            }
        };
        obj.f55036f = context;
        obj.f55035e = cVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f55037g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f55032a = sharedPreferences.getInt("scoreall", 0);
        d1.f55030m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.a1.run():void");
            }
        });
        this.f55241s = obj;
    }

    public final void a(d dVar, boolean z9, p0 p0Var) {
        Object obj;
        v0 v0Var;
        if (this.f55234l) {
            w0 w0Var = this.f55225a;
            if (!w0Var.getPainting().G && this.f55230g != null) {
                if (dVar == null) {
                    obj = w0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f55234l = false;
                if (r42 instanceof d) {
                    w0Var.getPainting().E = false;
                }
                j0 painting = w0Var.getPainting();
                painting.f55089f.f(new f0(painting, 1));
                this.f55236n = 0;
                this.f55237o = 0;
                this.f55232j = false;
                this.f55226b = false;
                if (z9 && (v0Var = w0Var.f55248a) != null) {
                    v0Var.d0();
                }
                mt0 mt0Var = w0Var.getPainting().f55090g;
                n0 n0Var = this.f55230g;
                float a10 = r9.a((float) n0Var.f55155a, (float) n0Var.f55156b, 0.0f, 0.0f);
                n0 n0Var2 = this.f55230g;
                float max = Math.max(a10, r9.a((float) n0Var2.f55155a, (float) n0Var2.f55156b, mt0Var.f36114a, 0.0f));
                n0 n0Var3 = this.f55230g;
                float a11 = r9.a((float) n0Var3.f55155a, (float) n0Var3.f55156b, 0.0f, mt0Var.f36115b);
                n0 n0Var4 = this.f55230g;
                final float max2 = Math.max(max, Math.max(a11, r9.a((float) n0Var4.f55155a, (float) n0Var4.f55156b, mt0Var.f36114a, mt0Var.f36115b))) / 0.84f;
                ValueAnimator valueAnimator = this.f55240r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f55240r = null;
                }
                ValueAnimator valueAnimator2 = this.f55245x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f55245x = null;
                }
                n0 n0Var5 = this.f55230g;
                final n0 n0Var6 = new n0(n0Var5.f55155a, n0Var5.f55156b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f55245x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        w0 w0Var2 = w.this.f55225a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        k0 k0Var = new k0(new n0[]{n0Var6});
                        h hVar = r42;
                        hVar.getClass();
                        if (hVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = w0Var2.getCurrentColor();
                        }
                        k0Var.f55116c = currentColor;
                        k0Var.d = floatValue * max2;
                        k0Var.f55117e = hVar;
                        j0 painting2 = w0Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f55089f.f(new z5(painting2, k0Var, true, true, null, 5));
                    }
                });
                this.f55245x.addListener(new v(this, n0Var6, max2, r42, z9, p0Var));
                this.f55245x.setDuration(450L);
                this.f55245x.setInterpolator(xq.h);
                this.f55245x.start();
                if (z9) {
                    p2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(k0 k0Var) {
        w0 w0Var = this.f55225a;
        int currentColor = w0Var.getCurrentColor();
        float currentWeight = w0Var.getCurrentWeight();
        h currentBrush = w0Var.getCurrentBrush();
        k0Var.f55116c = currentColor;
        k0Var.d = currentWeight;
        k0Var.f55117e = currentBrush;
        if (this.f55229f) {
            this.f55231i = 0.0d;
        }
        k0Var.f55114a = this.f55231i;
        j0 painting = w0Var.getPainting();
        boolean z9 = this.f55229f;
        u uVar = new u(this, k0Var, 0);
        if (painting.L == null) {
            painting.f55089f.f(new z5(painting, k0Var, z9, false, uVar, 5));
        }
        this.f55229f = false;
    }

    public final void c(boolean z9, float f10) {
        int i7 = this.f55236n;
        n0[] n0VarArr = this.f55235m;
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
                    double d12 = (b11.f55155a * d2) + (n0Var2.f55155a * 2.0d * d11 * d) + (b10.f55155a * d10);
                    double d13 = (b11.f55156b * d2) + (n0Var2.f55156b * 2.0d * d11 * d) + (b10.f55156b * d10);
                    double T1 = ((((b11.f55157c * d2) + ((n0Var2.f55157c * ((2.0f * f14) * f13)) + (b10.f55157c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, j9.a(this.f55237o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    n0 n0Var4 = new n0(d12, d13, T1);
                    if (this.f55227c) {
                        n0Var4.d = true;
                        this.f55227c = false;
                    }
                    vector.add(n0Var4);
                    this.f55238p += T1;
                    this.f55239q += 1.0d;
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
                    this.f55236n = 0;
                    return;
                } else {
                    this.f55236n = 2;
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
