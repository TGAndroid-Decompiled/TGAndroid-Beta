package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dd0 f42950a;

    public vn(org.telegram.ui.Components.dd0 dd0Var) {
        this.f42950a = dd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f42950a.s(1.0f);
    }
}
