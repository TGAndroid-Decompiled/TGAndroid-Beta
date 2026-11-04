package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import b8.be;
import ei.a6;
import gi.j8;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.p2;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.xq;
public final class w {
    public static final xq B = new xq(0.0d, 0.5d, 0.0d, 1.0d);
    public h A;
    public final u0 f55339a;
    public boolean f55340b;
    public boolean f55341c;
    public long d;
    public boolean f55342e;
    public boolean f55343f;
    public m0 f55344g;
    public m0 h;
    public double f55345i;
    public boolean f55346j;
    public float f55347k;
    public boolean f55348l;
    public int f55350n;
    public int f55351o;
    public double f55352p;
    public double f55353q;
    public ValueAnimator f55354r;
    public final b1 f55355s;
    public Matrix f55356t;
    public long v;
    public float f55358w;
    public ValueAnimator f55359x;
    public boolean f55361z;
    public final m0[] f55349m = new m0[3];
    public final float[] f55357u = new float[2];
    public final s f55360y = new s(this, 1);

    public w(u0 u0Var) {
        this.f55339a = u0Var;
        Context context = u0Var.getContext();
        j8 j8Var = new j8(this, 23);
        final ?? obj = new Object();
        obj.f55134b = new ArrayList();
        obj.f55135c = new ArrayList();
        obj.f55139i = null;
        obj.f55140j = new AtomicBoolean(false);
        obj.f55141k = new AtomicBoolean(false);
        obj.f55142l = new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: tg.y0.run():void");
            }
        };
        obj.f55137f = context;
        obj.f55136e = j8Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f55138g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f55133a = sharedPreferences.getInt("scoreall", 0);
        b1.f55131m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: tg.y0.run():void");
            }
        });
        this.f55355s = obj;
    }

    public final void a(d dVar, boolean z10, o0 o0Var) {
        Object obj;
        t0 t0Var;
        if (this.f55348l) {
            u0 u0Var = this.f55339a;
            if (!u0Var.getPainting().G && this.f55344g != null) {
                if (dVar == null) {
                    obj = u0Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f55348l = false;
                if (r42 instanceof d) {
                    u0Var.getPainting().E = false;
                }
                i0 painting = u0Var.getPainting();
                painting.f55193f.f(new f0(painting, 1));
                this.f55350n = 0;
                this.f55351o = 0;
                this.f55346j = false;
                this.f55340b = false;
                if (z10 && (t0Var = u0Var.f55321a) != null) {
                    t0Var.Z();
                }
                lt0 lt0Var = u0Var.getPainting().f55194g;
                m0 m0Var = this.f55344g;
                float a10 = a7.h.a((float) m0Var.f55252a, (float) m0Var.f55253b, 0.0f, 0.0f);
                m0 m0Var2 = this.f55344g;
                float max = Math.max(a10, a7.h.a((float) m0Var2.f55252a, (float) m0Var2.f55253b, lt0Var.f35877a, 0.0f));
                m0 m0Var3 = this.f55344g;
                float a11 = a7.h.a((float) m0Var3.f55252a, (float) m0Var3.f55253b, 0.0f, lt0Var.f35878b);
                m0 m0Var4 = this.f55344g;
                final float max2 = Math.max(max, Math.max(a11, a7.h.a((float) m0Var4.f55252a, (float) m0Var4.f55253b, lt0Var.f35877a, lt0Var.f35878b))) / 0.84f;
                ValueAnimator valueAnimator = this.f55354r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f55354r = null;
                }
                ValueAnimator valueAnimator2 = this.f55359x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f55359x = null;
                }
                m0 m0Var5 = this.f55344g;
                final m0 m0Var6 = new m0(m0Var5.f55252a, m0Var5.f55253b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f55359x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        u0 u0Var2 = w.this.f55339a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        j0 j0Var = new j0(new m0[]{m0Var6});
                        h hVar = r42;
                        hVar.getClass();
                        if (hVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = u0Var2.getCurrentColor();
                        }
                        j0Var.f55218c = currentColor;
                        j0Var.d = floatValue * max2;
                        j0Var.f55219e = hVar;
                        i0 painting2 = u0Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f55193f.f(new a6(painting2, j0Var, true, true, null, 5));
                    }
                });
                this.f55359x.addListener(new v(this, m0Var6, max2, r42, z10, o0Var));
                this.f55359x.setDuration(450L);
                this.f55359x.setInterpolator(xq.h);
                this.f55359x.start();
                if (z10) {
                    p2.IMPACT_HEAVY.a();
                }
            }
        }
    }

    public final void b(j0 j0Var) {
        u0 u0Var = this.f55339a;
        int currentColor = u0Var.getCurrentColor();
        float currentWeight = u0Var.getCurrentWeight();
        h currentBrush = u0Var.getCurrentBrush();
        j0Var.f55218c = currentColor;
        j0Var.d = currentWeight;
        j0Var.f55219e = currentBrush;
        if (this.f55343f) {
            this.f55345i = 0.0d;
        }
        j0Var.f55216a = this.f55345i;
        i0 painting = u0Var.getPainting();
        boolean z10 = this.f55343f;
        u uVar = new u(this, j0Var, 0);
        if (painting.L == null) {
            painting.f55193f.f(new a6(painting, j0Var, z10, false, uVar, 5));
        }
        this.f55343f = false;
    }

    public final void c(boolean z10, float f10) {
        int i3 = this.f55350n;
        m0[] m0VarArr = this.f55349m;
        if (i3 > 2) {
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
                    double d10 = f13 * f13;
                    double d11 = f14 * f14;
                    double d12 = f13;
                    double d13 = (b11.f55252a * d10) + (m0Var2.f55252a * 2.0d * d12 * d) + (b10.f55252a * d11);
                    double d14 = (b11.f55253b * d10) + (m0Var2.f55253b * 2.0d * d12 * d) + (b10.f55253b * d11);
                    double T1 = ((((b11.f55254c * d10) + ((m0Var2.f55254c * ((2.0f * f14) * f13)) + (b10.f55254c * pow))) - 1.0d) * org.telegram.messenger.g0.T1(f10, 1.0f, be.a(this.f55351o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    m0 m0Var4 = new m0(d13, d14, T1);
                    if (this.f55341c) {
                        m0Var4.d = true;
                        this.f55341c = false;
                    }
                    vector.add(m0Var4);
                    this.f55352p += T1;
                    this.f55353q += 1.0d;
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
                    this.f55350n = 0;
                    return;
                } else {
                    this.f55350n = 2;
                    return;
                }
            }
            return;
        }
        m0[] m0VarArr3 = new m0[i3];
        System.arraycopy(m0VarArr, 0, m0VarArr3, 0, i3);
        b(new j0(m0VarArr3));
    }
}
