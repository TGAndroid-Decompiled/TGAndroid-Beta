package sg;

import a8.w9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import c8.l9;
import fi.q5;
import hi.s6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q2;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.yt0;
public final class v {
    public static final nr B = new nr(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final u0 f57408a;
    public boolean f57409b;
    public boolean f57410c;
    public long d;
    public boolean f57411e;
    public boolean f57412f;
    public m0 f57413g;
    public m0 h;
    public double f57414i;
    public boolean f57415j;
    public float f57416k;
    public boolean f57417l;
    public int f57419n;
    public int f57420o;
    public double f57421p;
    public double f57422q;
    public ValueAnimator f57423r;
    public final b1 f57424s;
    public Matrix f57425t;
    public long v;
    public float f57427w;
    public ValueAnimator f57428x;
    public boolean f57430z;
    public final m0[] f57418m = new m0[3];
    public final float[] f57426u = new float[2];
    public final s f57429y = new s(this, 1);

    public v(u0 u0Var) {
        this.f57408a = u0Var;
        Context context = u0Var.getContext();
        s6 s6Var = new s6(this, 26);
        final ?? obj = new Object();
        obj.f57207b = new ArrayList();
        obj.f57208c = new ArrayList();
        obj.f57212i = null;
        obj.f57213j = new AtomicBoolean(false);
        obj.f57214k = new AtomicBoolean(false);
        obj.f57215l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.y0.run():void");
            }
        };
        obj.f57210f = context;
        obj.f57209e = s6Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f57211g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f57206a = sharedPreferences.getInt("scoreall", 0);
        b1.f57204m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.y0.run():void");
            }
        });
        this.f57424s = obj;
    }

    public final void a(d dVar, boolean z10, o0 o0Var) {
        Object obj;
        t0 t0Var;
        if (this.f57417l) {
            u0 u0Var = this.f57408a;
            if (!u0Var.getPainting().G && this.f57413g != null) {
                if (dVar == null) {
                    obj = u0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                ?? r42 = obj;
                this.f57417l = false;
                if (r42 instanceof d) {
                    u0Var.getPainting().E = false;
                }
                i0 painting = u0Var.getPainting();
                painting.f57266f.f(new e0(painting, 1));
                this.f57419n = 0;
                this.f57420o = 0;
                this.f57415j = false;
                this.f57409b = false;
                if (z10 && (t0Var = u0Var.f57397a) != null) {
                    t0Var.n0();
                }
                yt0 yt0Var = u0Var.getPainting().f57267g;
                m0 m0Var = this.f57413g;
                float a10 = w9.a((float) m0Var.f57325a, (float) m0Var.f57326b, 0.0f, 0.0f);
                m0 m0Var2 = this.f57413g;
                float max = Math.max(a10, w9.a((float) m0Var2.f57325a, (float) m0Var2.f57326b, yt0Var.f42553a, 0.0f));
                m0 m0Var3 = this.f57413g;
                float a11 = w9.a((float) m0Var3.f57325a, (float) m0Var3.f57326b, 0.0f, yt0Var.f42554b);
                m0 m0Var4 = this.f57413g;
                float max2 = Math.max(max, Math.max(a11, w9.a((float) m0Var4.f57325a, (float) m0Var4.f57326b, yt0Var.f42553a, yt0Var.f42554b))) / 0.84f;
                ValueAnimator valueAnimator = this.f57423r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f57423r = null;
                }
                ValueAnimator valueAnimator2 = this.f57428x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f57428x = null;
                }
                m0 m0Var5 = this.f57413g;
                m0 m0Var6 = new m0(m0Var5.f57325a, m0Var5.f57326b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f57428x = ofFloat;
                ofFloat.addUpdateListener(new wd(this, m0Var6, (h) r42, max2));
                this.f57428x.addListener(new u(this, m0Var6, max2, r42, z10, o0Var));
                this.f57428x.setDuration(450L);
                this.f57428x.setInterpolator(nr.h);
                this.f57428x.start();
                if (z10) {
                    q2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(j0 j0Var) {
        u0 u0Var = this.f57408a;
        int currentColor = u0Var.getCurrentColor();
        float currentWeight = u0Var.getCurrentWeight();
        h currentBrush = u0Var.getCurrentBrush();
        j0Var.f57291c = currentColor;
        j0Var.d = currentWeight;
        j0Var.f57292e = currentBrush;
        if (this.f57412f) {
            this.f57414i = 0.0d;
        }
        j0Var.f57289a = this.f57414i;
        i0 painting = u0Var.getPainting();
        boolean z10 = this.f57412f;
        t tVar = new t(this, j0Var, 0);
        if (painting.L == null) {
            painting.f57266f.f(new q5(painting, j0Var, z10, false, tVar, 5));
        }
        this.f57412f = false;
    }

    public final void c(boolean z10, float f10) {
        int i7 = this.f57419n;
        m0[] m0VarArr = this.f57418m;
        if (i7 > 2) {
            Vector vector = new Vector();
            m0 m0Var = m0VarArr[0];
            m0 m0Var2 = m0VarArr[1];
            m0 m0Var3 = m0VarArr[2];
            if (m0Var3 != null && m0Var2 != null && m0Var != null) {
                m0 b10 = m0Var2.b(m0Var);
                m0 b11 = m0Var3.b(m0Var2);
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
                    double d12 = (b11.f57325a * d2) + (m0Var2.f57325a * 2.0d * d11 * d) + (b10.f57325a * d10);
                    double d13 = (b11.f57326b * d2) + (m0Var2.f57326b * 2.0d * d11 * d) + (b10.f57326b * d10);
                    double T1 = ((((b11.f57327c * d2) + ((m0Var2.f57327c * ((2.0f * f14) * f13)) + (b10.f57327c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, l9.a(this.f57420o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    m0 m0Var4 = new m0(d12, d13, T1);
                    if (this.f57410c) {
                        m0Var4.d = true;
                        this.f57410c = false;
                    }
                    vector.add(m0Var4);
                    this.f57421p += T1;
                    this.f57422q += 1.0d;
                    f13 += f12;
                    i10++;
                    f11 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                m0[] m0VarArr2 = new m0[vector.size()];
                vector.toArray(m0VarArr2);
                b(new j0(m0VarArr2));
                System.arraycopy(m0VarArr, 1, m0VarArr, 0, 2);
                if (z10) {
                    this.f57419n = 0;
                    return;
                } else {
                    this.f57419n = 2;
                    return;
                }
            }
            return;
        }
        m0[] m0VarArr3 = new m0[i7];
        System.arraycopy(m0VarArr, 0, m0VarArr3, 0, i7);
        b(new j0(m0VarArr3));
    }
}
