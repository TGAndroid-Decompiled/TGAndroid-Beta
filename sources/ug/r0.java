package ug;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final p0 f47200a;
    public final s0 f47201b;

    public r0(s0 s0Var, p0 p0Var) {
        this.f47201b = s0Var;
        this.f47200a = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.f47200a;
        p0Var.setLayerType(0, null);
        this.f47201b.d.removeView(p0Var);
    }
}
