package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cd0 f43718a;

    public wn(org.telegram.ui.Components.cd0 cd0Var) {
        this.f43718a = cd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43718a.s(1.0f);
    }
}
