package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o0 extends AnimatorListenerAdapter {
    public final m0 f48184a;
    public final p0 f48185b;

    public o0(p0 p0Var, m0 m0Var) {
        this.f48185b = p0Var;
        this.f48184a = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f48184a;
        m0Var.setLayerType(0, null);
        this.f48185b.d.removeView(m0Var);
    }
}
