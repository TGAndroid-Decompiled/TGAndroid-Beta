package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s81 extends AnimatorListenerAdapter {
    public final m91 f41415a;

    public s81(m91 m91Var) {
        this.f41415a = m91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        m91 m91Var = this.f41415a;
        org.telegram.ui.Components.x71[] x71VarArr = m91Var.K0;
        if (m91Var.X0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        x71VarArr[c10].setVisibility(4);
    }
}
