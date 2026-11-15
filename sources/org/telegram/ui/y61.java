package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y61 extends AnimatorListenerAdapter {
    public final t71 f53464a;

    public y61(t71 t71Var) {
        this.f53464a = t71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c10;
        t71 t71Var = this.f53464a;
        org.telegram.ui.Components.x61[] x61VarArr = t71Var.L0;
        if (t71Var.Y0 != null) {
            c10 = 0;
        } else {
            c10 = 2;
        }
        x61VarArr[c10].setVisibility(4);
    }
}
