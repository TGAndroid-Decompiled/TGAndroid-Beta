package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final p0 f43237a;
    public final s0 f43238b;

    public r0(s0 s0Var, p0 p0Var) {
        this.f43238b = s0Var;
        this.f43237a = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.f43237a;
        p0Var.setLayerType(0, null);
        this.f43238b.d.removeView(p0Var);
    }
}
