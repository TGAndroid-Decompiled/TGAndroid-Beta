package sg;

import a8.t9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import c8.i9;
import fi.r5;
import hi.g7;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.nt0;
public final class v {
    public static final er B = new er(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final u0 f56793a;
    public boolean f56794b;
    public boolean f56795c;
    public long d;
    public boolean f56796e;
    public boolean f56797f;
    public m0 f56798g;
    public m0 h;
    public double f56799i;
    public boolean f56800j;
    public float f56801k;
    public boolean f56802l;
    public int f56804n;
    public int f56805o;
    public double f56806p;
    public double f56807q;
    public ValueAnimator f56808r;
    public final b1 f56809s;
    public Matrix f56810t;
    public long v;
    public float f56812w;
    public ValueAnimator f56813x;
    public boolean f56815z;
    public final m0[] f56803m = new m0[3];
    public final float[] f56811u = new float[2];
    public final s f56814y = new s(this, 1);

    public v(u0 u0Var) {
        this.f56793a = u0Var;
        Context context = u0Var.getContext();
        g7 g7Var = new g7(this, 25);
        final ?? obj = new Object();
        obj.f56592b = new ArrayList();
        obj.f56593c = new ArrayList();
        obj.f56597i = null;
        obj.f56598j = new AtomicBoolean(false);
        obj.f56599k = new AtomicBoolean(false);
        obj.f56600l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.y0.run():void");
            }
        };
        obj.f56595f = context;
        obj.f56594e = g7Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f56596g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f56591a = sharedPreferences.getInt("scoreall", 0);
        b1.f56589m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: sg.y0.run():void");
            }
        });
        this.f56809s = obj;
    }

    public final void a(d dVar, boolean z10, o0 o0Var) {
        Object obj;
        t0 t0Var;
        if (this.f56802l) {
            u0 u0Var = this.f56793a;
            if (!u0Var.getPainting().G && this.f56798g != null) {
                if (dVar == null) {
                    obj = u0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                ?? r42 = obj;
                this.f56802l = false;
                if (r42 instanceof d) {
                    u0Var.getPainting().E = false;
                }
                i0 painting = u0Var.getPainting();
                painting.f56651f.f(new e0(painting, 1));
                this.f56804n = 0;
                this.f56805o = 0;
                this.f56800j = false;
                this.f56794b = false;
                if (z10 && (t0Var = u0Var.f56782a) != null) {
                    t0Var.q0();
                }
                nt0 nt0Var = u0Var.getPainting().f56652g;
                m0 m0Var = this.f56798g;
                float a10 = t9.a((float) m0Var.f56710a, (float) m0Var.f56711b, 0.0f, 0.0f);
                m0 m0Var2 = this.f56798g;
                float max = Math.max(a10, t9.a((float) m0Var2.f56710a, (float) m0Var2.f56711b, nt0Var.f37713a, 0.0f));
                m0 m0Var3 = this.f56798g;
                float a11 = t9.a((float) m0Var3.f56710a, (float) m0Var3.f56711b, 0.0f, nt0Var.f37714b);
                m0 m0Var4 = this.f56798g;
                float max2 = Math.max(max, Math.max(a11, t9.a((float) m0Var4.f56710a, (float) m0Var4.f56711b, nt0Var.f37713a, nt0Var.f37714b))) / 0.84f;
                ValueAnimator valueAnimator = this.f56808r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f56808r = null;
                }
                ValueAnimator valueAnimator2 = this.f56813x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f56813x = null;
                }
                m0 m0Var5 = this.f56798g;
                m0 m0Var6 = new m0(m0Var5.f56710a, m0Var5.f56711b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f56813x = ofFloat;
                ofFloat.addUpdateListener(new md(this, m0Var6, (h) r42, max2));
                this.f56813x.addListener(new u(this, m0Var6, max2, r42, z10, o0Var));
                this.f56813x.setDuration(450L);
                this.f56813x.setInterpolator(er.h);
                this.f56813x.start();
                if (z10) {
                    p2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(j0 j0Var) {
        u0 u0Var = this.f56793a;
        int currentColor = u0Var.getCurrentColor();
        float currentWeight = u0Var.getCurrentWeight();
        h currentBrush = u0Var.getCurrentBrush();
        j0Var.f56676c = currentColor;
        j0Var.d = currentWeight;
        j0Var.f56677e = currentBrush;
        if (this.f56797f) {
            this.f56799i = 0.0d;
        }
        j0Var.f56674a = this.f56799i;
        i0 painting = u0Var.getPainting();
        boolean z10 = this.f56797f;
        t tVar = new t(this, j0Var, 0);
        if (painting.L == null) {
            painting.f56651f.f(new r5(painting, j0Var, z10, false, tVar, 5));
        }
        this.f56797f = false;
    }

    public final void c(boolean z10, float f10) {
        int i7 = this.f56804n;
        m0[] m0VarArr = this.f56803m;
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
                    double d12 = (b11.f56710a * d2) + (m0Var2.f56710a * 2.0d * d11 * d) + (b10.f56710a * d10);
                    double d13 = (b11.f56711b * d2) + (m0Var2.f56711b * 2.0d * d11 * d) + (b10.f56711b * d10);
                    double T1 = ((((b11.f56712c * d2) + ((m0Var2.f56712c * ((2.0f * f14) * f13)) + (b10.f56712c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, i9.a(this.f56805o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    m0 m0Var4 = new m0(d12, d13, T1);
                    if (this.f56795c) {
                        m0Var4.d = true;
                        this.f56795c = false;
                    }
                    vector.add(m0Var4);
                    this.f56806p += T1;
                    this.f56807q += 1.0d;
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
                    this.f56804n = 0;
                    return;
                } else {
                    this.f56804n = 2;
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
