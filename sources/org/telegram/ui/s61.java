package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s61 extends AnimatorListenerAdapter {
    public final l71 f49405a;

    public s61(l71 l71Var) {
        this.f49405a = l71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l71 l71Var = this.f49405a;
        if (l71Var.Y0 == null) {
            l71Var.L0[0].setVisibility(4);
        }
    }
}
