package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.kc0 f39183a;

    public wn(org.telegram.ui.Components.kc0 kc0Var) {
        this.f39183a = kc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39183a.s(1.0f);
    }
}
