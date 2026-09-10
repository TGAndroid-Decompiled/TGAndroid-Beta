package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class x50 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final j60 L;

    public x50(j60 j60Var) {
        this.L = j60Var;
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
        boolean isEmpty = this.f41668p.isEmpty();
        boolean isEmpty2 = this.f41670r.isEmpty();
        boolean isEmpty3 = this.f41669q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new d3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.voip.v2(this, 12));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            this.G.start();
            j60 j60Var = this.L;
            j60Var.Q.invalidate();
            j60Var.a2.invalidate();
        }
        super.m();
    }
}
