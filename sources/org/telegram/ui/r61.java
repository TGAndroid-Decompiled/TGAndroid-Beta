package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r61 extends AnimatorListenerAdapter {
    public final l71 f49112a;

    public r61(l71 l71Var) {
        this.f49112a = l71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        char c2;
        l71 l71Var = this.f49112a;
        org.telegram.ui.Components.o61[] o61VarArr = l71Var.L0;
        if (l71Var.Y0 != null) {
            c2 = 0;
        } else {
            c2 = 2;
        }
        o61VarArr[c2].setVisibility(4);
    }
}
