package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p0 extends AnimatorListenerAdapter {
    public final n0 f48462a;
    public final q0 f48463b;

    public p0(q0 q0Var, n0 n0Var) {
        this.f48463b = q0Var;
        this.f48462a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f48462a;
        n0Var.setLayerType(0, null);
        this.f48463b.d.removeView(n0Var);
    }
}
