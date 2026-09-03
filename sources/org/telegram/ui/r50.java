package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class r50 extends f2.l {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final d60 L;

    public r50(d60 d60Var) {
        this.L = d60Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.N.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f5853p.isEmpty();
        boolean isEmpty2 = this.f5855r.isEmpty();
        boolean isEmpty3 = this.f5854q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.f91(this, 21));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.pr.f30168f);
            this.G.start();
            d60 d60Var = this.L;
            d60Var.N.invalidate();
            d60Var.X1.invalidate();
        }
        super.m();
    }
}
