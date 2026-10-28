package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.vc0 f43363a;

    public sn(org.telegram.ui.Components.vc0 vc0Var) {
        this.f43363a = vc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43363a.r(1.0f);
    }
}
