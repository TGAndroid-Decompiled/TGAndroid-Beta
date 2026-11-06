package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o0 extends AnimatorListenerAdapter {
    public final n0 f57673a;
    public final p0 f57674b;

    public o0(p0 p0Var, n0 n0Var) {
        this.f57674b = p0Var;
        this.f57673a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f57673a;
        n0Var.setLayerType(0, null);
        this.f57674b.d.removeView(n0Var);
    }
}
