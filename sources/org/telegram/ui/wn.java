package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.ec0 f39737a;

    public wn(org.telegram.ui.Components.ec0 ec0Var) {
        this.f39737a = ec0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39737a.s(1.0f);
    }
}
