package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class m0 extends AnimatorListenerAdapter {
    public final l0 f59213a;
    public final n0 f59214b;

    public m0(n0 n0Var, l0 l0Var) {
        this.f59214b = n0Var;
        this.f59213a = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l0 l0Var = this.f59213a;
        l0Var.setLayerType(0, null);
        this.f59214b.d.removeView(l0Var);
    }
}
