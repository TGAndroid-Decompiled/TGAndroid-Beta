package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.qa0 f51459a;

    public wm(org.telegram.ui.Components.qa0 qa0Var) {
        this.f51459a = qa0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f51459a.r(1.0f);
    }
}
