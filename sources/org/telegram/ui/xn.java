package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cc0 f39675a;

    public xn(org.telegram.ui.Components.cc0 cc0Var) {
        this.f39675a = cc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39675a.s(1.0f);
    }
}
