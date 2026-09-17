package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final p0 f47229a;
    public final s0 f47230b;

    public r0(s0 s0Var, p0 p0Var) {
        this.f47230b = s0Var;
        this.f47229a = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.f47229a;
        p0Var.setLayerType(0, null);
        this.f47230b.d.removeView(p0Var);
    }
}
