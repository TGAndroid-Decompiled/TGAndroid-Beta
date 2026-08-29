package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.yb0 f41754a;

    public qn(org.telegram.ui.Components.yb0 yb0Var) {
        this.f41754a = yb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41754a.s(1.0f);
    }
}
