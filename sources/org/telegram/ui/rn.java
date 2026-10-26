package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.uc0 f43190a;

    public rn(org.telegram.ui.Components.uc0 uc0Var) {
        this.f43190a = uc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43190a.r(1.0f);
    }
}
