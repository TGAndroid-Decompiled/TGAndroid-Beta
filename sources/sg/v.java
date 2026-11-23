package sg;

import a8.x9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import c8.m9;
import fi.q5;
import hi.c7;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q2;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.xt0;
public final class v {
    public static final kr B = new kr(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final t0 f57487a;
    public boolean f57488b;
    public boolean f57489c;
    public long d;
    public boolean f57490e;
    public boolean f57491f;
    public l0 f57492g;
    public l0 h;
    public double f57493i;
    public boolean f57494j;
    public float f57495k;
    public boolean f57496l;
    public int f57498n;
    public int f57499o;
    public double f57500p;
    public double f57501q;
    public ValueAnimator f57502r;
    public final a1 f57503s;
    public Matrix f57504t;
    public long v;
    public float f57506w;
    public ValueAnimator f57507x;
    public boolean f57509z;
    public final l0[] f57497m = new l0[3];
    public final float[] f57505u = new float[2];
    public final s f57508y = new s(this, 1);

    public v(t0 t0Var) {
        this.f57487a = t0Var;
        Context context = t0Var.getContext();
        c7 c7Var = new c7(this, 26);
        final ?? obj = new Object();
        obj.f57284b = new ArrayList();
        obj.f57285c = new ArrayList();
        obj.f57289i = null;
        obj.f57290j = new AtomicBoolean(false);
        obj.f57291k = new AtomicBoolean(false);
        obj.f57292l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.x0.run():void");
            }
        };
        obj.f57287f = context;
        obj.f57286e = c7Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f57288g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f57283a = sharedPreferences.getInt("scoreall", 0);
        a1.f57281m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.x0.run():void");
            }
        });
        this.f57503s = obj;
    }

    public final void a(d dVar, boolean z10, n0 n0Var) {
        Object obj;
        s0 s0Var;
        if (this.f57496l) {
            t0 t0Var = this.f57487a;
            if (!t0Var.getPainting().G && this.f57492g != null) {
                if (dVar == null) {
                    obj = t0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                ?? r42 = obj;
                this.f57496l = false;
                if (r42 instanceof d) {
                    t0Var.getPainting().E = false;
                }
                h0 painting = t0Var.getPainting();
                painting.f57343f.f(new e0(painting, 1));
                this.f57498n = 0;
                this.f57499o = 0;
                this.f57494j = false;
                this.f57488b = false;
                if (z10 && (s0Var = t0Var.f57469a) != null) {
                    s0Var.x0();
                }
                xt0 xt0Var = t0Var.getPainting().f57344g;
                l0 l0Var = this.f57492g;
                float a10 = x9.a((float) l0Var.f57398a, (float) l0Var.f57399b, 0.0f, 0.0f);
                l0 l0Var2 = this.f57492g;
                float max = Math.max(a10, x9.a((float) l0Var2.f57398a, (float) l0Var2.f57399b, xt0Var.f42189a, 0.0f));
                l0 l0Var3 = this.f57492g;
                float a11 = x9.a((float) l0Var3.f57398a, (float) l0Var3.f57399b, 0.0f, xt0Var.f42190b);
                l0 l0Var4 = this.f57492g;
                float max2 = Math.max(max, Math.max(a11, x9.a((float) l0Var4.f57398a, (float) l0Var4.f57399b, xt0Var.f42189a, xt0Var.f42190b))) / 0.84f;
                ValueAnimator valueAnimator = this.f57502r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f57502r = null;
                }
                ValueAnimator valueAnimator2 = this.f57507x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f57507x = null;
                }
                l0 l0Var5 = this.f57492g;
                l0 l0Var6 = new l0(l0Var5.f57398a, l0Var5.f57399b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f57507x = ofFloat;
                ofFloat.addUpdateListener(new wd(this, l0Var6, (h) r42, max2));
                this.f57507x.addListener(new u(this, l0Var6, max2, r42, z10, n0Var));
                this.f57507x.setDuration(450L);
                this.f57507x.setInterpolator(kr.h);
                this.f57507x.start();
                if (z10) {
                    q2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(i0 i0Var) {
        t0 t0Var = this.f57487a;
        int currentColor = t0Var.getCurrentColor();
        float currentWeight = t0Var.getCurrentWeight();
        h currentBrush = t0Var.getCurrentBrush();
        i0Var.f57366c = currentColor;
        i0Var.d = currentWeight;
        i0Var.f57367e = currentBrush;
        if (this.f57491f) {
            this.f57493i = 0.0d;
        }
        i0Var.f57364a = this.f57493i;
        h0 painting = t0Var.getPainting();
        boolean z10 = this.f57491f;
        t tVar = new t(this, i0Var, 0);
        if (painting.L == null) {
            painting.f57343f.f(new q5(painting, i0Var, z10, false, tVar, 5));
        }
        this.f57491f = false;
    }

    public final void c(boolean z10, float f10) {
        int i7 = this.f57498n;
        l0[] l0VarArr = this.f57497m;
        if (i7 > 2) {
            Vector vector = new Vector();
            l0 l0Var = l0VarArr[0];
            l0 l0Var2 = l0VarArr[1];
            l0 l0Var3 = l0VarArr[2];
            if (l0Var3 != null && l0Var2 != null && l0Var != null) {
                l0 b10 = l0Var2.b(l0Var);
                l0 b11 = l0Var3.b(l0Var2);
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
                    double d12 = (b11.f57398a * d2) + (l0Var2.f57398a * 2.0d * d11 * d) + (b10.f57398a * d10);
                    double d13 = (b11.f57399b * d2) + (l0Var2.f57399b * 2.0d * d11 * d) + (b10.f57399b * d10);
                    double T1 = ((((b11.f57400c * d2) + ((l0Var2.f57400c * ((2.0f * f14) * f13)) + (b10.f57400c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, m9.a(this.f57499o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    l0 l0Var4 = new l0(d12, d13, T1);
                    if (this.f57489c) {
                        l0Var4.d = true;
                        this.f57489c = false;
                    }
                    vector.add(l0Var4);
                    this.f57500p += T1;
                    this.f57501q += 1.0d;
                    f13 += f12;
                    i10++;
                    f11 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                l0[] l0VarArr2 = new l0[vector.size()];
                vector.toArray(l0VarArr2);
                b(new i0(l0VarArr2));
                System.arraycopy(l0VarArr, 1, l0VarArr, 0, 2);
                if (z10) {
                    this.f57498n = 0;
                    return;
                } else {
                    this.f57498n = 2;
                    return;
                }
            }
            return;
        }
        l0[] l0VarArr3 = new l0[i7];
        System.arraycopy(l0VarArr, 0, l0VarArr3, 0, i7);
        b(new i0(l0VarArr3));
    }
}
