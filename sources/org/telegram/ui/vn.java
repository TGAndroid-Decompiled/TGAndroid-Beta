package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lc0 f38597a;

    public vn(org.telegram.ui.Components.lc0 lc0Var) {
        this.f38597a = lc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38597a.s(1.0f);
    }
}
