package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o0 extends AnimatorListenerAdapter {
    public final m0 f47760a;
    public final p0 f47761b;

    public o0(p0 p0Var, m0 m0Var) {
        this.f47761b = p0Var;
        this.f47760a = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f47760a;
        m0Var.setLayerType(0, null);
        this.f47761b.d.removeView(m0Var);
    }
}
