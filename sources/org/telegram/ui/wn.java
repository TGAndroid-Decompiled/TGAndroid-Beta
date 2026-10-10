package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dd0 f43762a;

    public wn(org.telegram.ui.Components.dd0 dd0Var) {
        this.f43762a = dd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43762a.s(1.0f);
    }
}
