package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final n0 f47788a;
    public final q0 f47789b;

    public p0(q0 q0Var, n0 n0Var) {
        this.f47789b = q0Var;
        this.f47788a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f47788a;
        n0Var.setLayerType(0, null);
        this.f47789b.d.removeView(n0Var);
    }
}
