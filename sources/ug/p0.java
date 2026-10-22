package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final n0 f47751a;
    public final q0 f47752b;

    public p0(q0 q0Var, n0 n0Var) {
        this.f47752b = q0Var;
        this.f47751a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f47751a;
        n0Var.setLayerType(0, null);
        this.f47752b.d.removeView(n0Var);
    }
}
