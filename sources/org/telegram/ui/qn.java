package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.uc0 f42873a;

    public qn(org.telegram.ui.Components.uc0 uc0Var) {
        this.f42873a = uc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f42873a.r(1.0f);
    }
}
