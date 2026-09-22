package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class w50 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final i60 L;

    public w50(i60 i60Var) {
        this.L = i60Var;
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
        boolean isEmpty = this.f42729p.isEmpty();
        boolean isEmpty2 = this.f42731r.isEmpty();
        boolean isEmpty3 = this.f42730q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.v81(this, 22));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.qr.f27420f);
            this.G.start();
            i60 i60Var = this.L;
            i60Var.Q.invalidate();
            i60Var.a2.invalidate();
        }
        super.m();
    }
}
