package wg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n0 extends AnimatorListenerAdapter {
    public final m0 f59909a;
    public final o0 f59910b;

    public n0(o0 o0Var, m0 m0Var) {
        this.f59910b = o0Var;
        this.f59909a = m0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m0 m0Var = this.f59909a;
        m0Var.setLayerType(0, null);
        this.f59910b.d.removeView(m0Var);
    }
}
