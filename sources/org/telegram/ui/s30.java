package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class s30 extends v4.k {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final e40 L;

    public s30(e40 e40Var) {
        this.L = e40Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.H1.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f57113p.isEmpty();
        boolean isEmpty2 = this.f57115r.isEmpty();
        boolean isEmpty3 = this.f57114q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 14));
            this.G.addListener(new f30(this, 1));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.xq.f40458f);
            this.G.start();
            e40 e40Var = this.L;
            e40Var.H1.invalidate();
            e40Var.R3.invalidate();
        }
        super.m();
    }
}
