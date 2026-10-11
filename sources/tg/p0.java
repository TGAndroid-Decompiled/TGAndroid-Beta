package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final n0 f48496a;
    public final q0 f48497b;

    public p0(q0 q0Var, n0 n0Var) {
        this.f48497b = q0Var;
        this.f48496a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f48496a;
        n0Var.setLayerType(0, null);
        this.f48497b.d.removeView(n0Var);
    }
}
