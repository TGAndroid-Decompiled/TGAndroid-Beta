package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t81 extends AnimatorListenerAdapter {
    public final m91 f41773a;

    public t81(m91 m91Var) {
        this.f41773a = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        m91 m91Var = this.f41773a;
        if (m91Var.X0 == null) {
            m91Var.K0[0].setVisibility(4);
        }
    }
}
