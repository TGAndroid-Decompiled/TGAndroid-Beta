package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cb0 f54231a;

    public ym(org.telegram.ui.Components.cb0 cb0Var) {
        this.f54231a = cb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f54231a.r(1.0f);
    }
}
