package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class y50 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final k60 L;

    public y50(k60 k60Var) {
        this.L = k60Var;
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
        boolean isEmpty = this.f42760p.isEmpty();
        boolean isEmpty2 = this.f42762r.isEmpty();
        boolean isEmpty3 = this.f42761q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 16));
            this.G.addListener(new org.telegram.ui.Components.w81(this, 22));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.qr.f27383f);
            this.G.start();
            k60 k60Var = this.L;
            k60Var.Q.invalidate();
            k60Var.a2.invalidate();
        }
        super.m();
    }
}
