package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class un extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dc0 f38978a;

    public un(org.telegram.ui.Components.dc0 dc0Var) {
        this.f38978a = dc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38978a.s(1.0f);
    }
}
