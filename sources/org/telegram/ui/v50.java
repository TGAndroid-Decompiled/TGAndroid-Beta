package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class v50 extends s4.j {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final h60 L;

    public v50(h60 h60Var) {
        this.L = h60Var;
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
        boolean isEmpty = this.f46597p.isEmpty();
        boolean isEmpty2 = this.f46599r.isEmpty();
        boolean isEmpty3 = this.f46598q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new c3(this, 16));
            this.G.addListener(new org.telegram.ui.Components.a91(this, 23));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.tr.f31147f);
            this.G.start();
            h60 h60Var = this.L;
            h60Var.Q.invalidate();
            h60Var.a2.invalidate();
        }
        super.m();
    }
}
