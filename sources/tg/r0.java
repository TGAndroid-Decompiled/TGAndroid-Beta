package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final p0 f43165a;
    public final s0 f43166b;

    public r0(s0 s0Var, p0 p0Var) {
        this.f43166b = s0Var;
        this.f43165a = p0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        p0 p0Var = this.f43165a;
        p0Var.setLayerType(0, null);
        this.f43166b.d.removeView(p0Var);
    }
}
