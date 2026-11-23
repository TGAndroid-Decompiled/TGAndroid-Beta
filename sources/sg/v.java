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
    public final u0 f57412a;
    public boolean f57413b;
    public boolean f57414c;
    public long d;
    public boolean f57415e;
    public boolean f57416f;
    public m0 f57417g;
    public m0 h;
    public double f57418i;
    public boolean f57419j;
    public float f57420k;
    public boolean f57421l;
    public int f57423n;
    public int f57424o;
    public double f57425p;
    public double f57426q;
    public ValueAnimator f57427r;
    public final b1 f57428s;
    public Matrix f57429t;
    public long v;
    public float f57431w;
    public ValueAnimator f57432x;
    public boolean f57434z;
    public final m0[] f57422m = new m0[3];
    public final float[] f57430u = new float[2];
    public final s f57433y = new s(this, 1);

    public v(u0 u0Var) {
        this.f57412a = u0Var;
        Context context = u0Var.getContext();
        s6 s6Var = new s6(this, 26);
        final ?? obj = new Object();
        obj.f57211b = new ArrayList();
        obj.f57212c = new ArrayList();
        obj.f57216i = null;
        obj.f57217j = new AtomicBoolean(false);
        obj.f57218k = new AtomicBoolean(false);
        obj.f57219l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.y0.run():void");
            }
        };
        obj.f57214f = context;
        obj.f57213e = s6Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f57215g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f57210a = sharedPreferences.getInt("scoreall", 0);
        b1.f57208m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.y0.run():void");
            }
        });
        this.f57428s = obj;
    }

    public final void a(d dVar, boolean z10, o0 o0Var) {
        Object obj;
        t0 t0Var;
        if (this.f57421l) {
            u0 u0Var = this.f57412a;
            if (!u0Var.getPainting().G && this.f57417g != null) {
                if (dVar == null) {
                    obj = u0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                ?? r42 = obj;
                this.f57421l = false;
                if (r42 instanceof d) {
                    u0Var.getPainting().E = false;
                }
                i0 painting = u0Var.getPainting();
                painting.f57270f.f(new e0(painting, 1));
                this.f57423n = 0;
                this.f57424o = 0;
                this.f57419j = false;
                this.f57413b = false;
                if (z10 && (t0Var = u0Var.f57401a) != null) {
                    t0Var.n0();
                }
                yt0 yt0Var = u0Var.getPainting().f57271g;
                m0 m0Var = this.f57417g;
                float a10 = w9.a((float) m0Var.f57329a, (float) m0Var.f57330b, 0.0f, 0.0f);
                m0 m0Var2 = this.f57417g;
                float max = Math.max(a10, w9.a((float) m0Var2.f57329a, (float) m0Var2.f57330b, yt0Var.f42546a, 0.0f));
                m0 m0Var3 = this.f57417g;
                float a11 = w9.a((float) m0Var3.f57329a, (float) m0Var3.f57330b, 0.0f, yt0Var.f42547b);
                m0 m0Var4 = this.f57417g;
                float max2 = Math.max(max, Math.max(a11, w9.a((float) m0Var4.f57329a, (float) m0Var4.f57330b, yt0Var.f42546a, yt0Var.f42547b))) / 0.84f;
                ValueAnimator valueAnimator = this.f57427r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f57427r = null;
                }
                ValueAnimator valueAnimator2 = this.f57432x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f57432x = null;
                }
                m0 m0Var5 = this.f57417g;
                m0 m0Var6 = new m0(m0Var5.f57329a, m0Var5.f57330b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f57432x = ofFloat;
                ofFloat.addUpdateListener(new wd(this, m0Var6, (h) r42, max2));
                this.f57432x.addListener(new u(this, m0Var6, max2, r42, z10, o0Var));
                this.f57432x.setDuration(450L);
                this.f57432x.setInterpolator(nr.h);
                this.f57432x.start();
                if (z10) {
                    q2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(j0 j0Var) {
        u0 u0Var = this.f57412a;
        int currentColor = u0Var.getCurrentColor();
        float currentWeight = u0Var.getCurrentWeight();
        h currentBrush = u0Var.getCurrentBrush();
        j0Var.f57295c = currentColor;
        j0Var.d = currentWeight;
        j0Var.f57296e = currentBrush;
        if (this.f57416f) {
            this.f57418i = 0.0d;
        }
        j0Var.f57293a = this.f57418i;
        i0 painting = u0Var.getPainting();
        boolean z10 = this.f57416f;
        t tVar = new t(this, j0Var, 0);
        if (painting.L == null) {
            painting.f57270f.f(new q5(painting, j0Var, z10, false, tVar, 5));
        }
        this.f57416f = false;
    }

    public final void c(boolean z10, float f10) {
        int i7 = this.f57423n;
        m0[] m0VarArr = this.f57422m;
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
                    double d12 = (b11.f57329a * d2) + (m0Var2.f57329a * 2.0d * d11 * d) + (b10.f57329a * d10);
                    double d13 = (b11.f57330b * d2) + (m0Var2.f57330b * 2.0d * d11 * d) + (b10.f57330b * d10);
                    double T1 = ((((b11.f57331c * d2) + ((m0Var2.f57331c * ((2.0f * f14) * f13)) + (b10.f57331c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, l9.a(this.f57424o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    m0 m0Var4 = new m0(d12, d13, T1);
                    if (this.f57414c) {
                        m0Var4.d = true;
                        this.f57414c = false;
                    }
                    vector.add(m0Var4);
                    this.f57425p += T1;
                    this.f57426q += 1.0d;
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
                    this.f57423n = 0;
                    return;
                } else {
                    this.f57423n = 2;
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
