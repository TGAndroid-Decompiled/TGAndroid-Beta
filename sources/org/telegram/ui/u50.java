package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class u50 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final g60 L;

    public u50(g60 g60Var) {
        this.L = g60Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.Q.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47717p.isEmpty();
        boolean isEmpty2 = this.f47719r.isEmpty();
        boolean isEmpty3 = this.f47718q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.i91(this, 23));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.hs.f27118f);
            this.G.start();
            g60 g60Var = this.L;
            g60Var.Q.invalidate();
            g60Var.a2.invalidate();
        }
        super.m();
    }
}
