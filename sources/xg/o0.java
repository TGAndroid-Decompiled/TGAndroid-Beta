package xg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o0 extends AnimatorListenerAdapter {
    public final n0 f58741a;
    public final p0 f58742b;

    public o0(p0 p0Var, n0 n0Var) {
        this.f58742b = p0Var;
        this.f58741a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f58741a;
        n0Var.setLayerType(0, null);
        this.f58742b.d.removeView(n0Var);
    }
}
