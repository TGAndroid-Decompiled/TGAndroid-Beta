package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final n0 f47748a;
    public final q0 f47749b;

    public p0(q0 q0Var, n0 n0Var) {
        this.f47749b = q0Var;
        this.f47748a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f47748a;
        n0Var.setLayerType(0, null);
        this.f47749b.d.removeView(n0Var);
    }
}
