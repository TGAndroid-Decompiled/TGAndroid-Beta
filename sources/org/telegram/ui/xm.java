package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.qa0 f51911a;

    public xm(org.telegram.ui.Components.qa0 qa0Var) {
        this.f51911a = qa0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f51911a.r(1.0f);
    }
}
