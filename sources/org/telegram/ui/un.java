package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class un extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.pc0 f41257a;

    public un(org.telegram.ui.Components.pc0 pc0Var) {
        this.f41257a = pc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41257a.s(1.0f);
    }
}
