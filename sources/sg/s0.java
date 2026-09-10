package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s0 extends AnimatorListenerAdapter {
    public final q0 f42002a;
    public final t0 f42003b;

    public s0(t0 t0Var, q0 q0Var) {
        this.f42003b = t0Var;
        this.f42002a = q0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        q0 q0Var = this.f42002a;
        q0Var.setLayerType(0, null);
        this.f42003b.d.removeView(q0Var);
    }
}
