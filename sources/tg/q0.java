package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q0 extends AnimatorListenerAdapter {
    public final o0 f48398a;
    public final r0 f48399b;

    public q0(r0 r0Var, o0 o0Var) {
        this.f48399b = r0Var;
        this.f48398a = o0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o0 o0Var = this.f48398a;
        o0Var.setLayerType(0, null);
        this.f48399b.d.removeView(o0Var);
    }
}
