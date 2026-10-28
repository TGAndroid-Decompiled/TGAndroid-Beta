package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.vc0 f43676a;

    public tn(org.telegram.ui.Components.vc0 vc0Var) {
        this.f43676a = vc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43676a.r(1.0f);
    }
}
