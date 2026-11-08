package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class o0 extends AnimatorListenerAdapter {
    public final n0 f57789a;
    public final p0 f57790b;

    public o0(p0 p0Var, n0 n0Var) {
        this.f57790b = p0Var;
        this.f57789a = n0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        n0 n0Var = this.f57789a;
        n0Var.setLayerType(0, null);
        this.f57790b.d.removeView(n0Var);
    }
}
