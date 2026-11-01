package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class rn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.jb0 f41109a;

    public rn(org.telegram.ui.Components.jb0 jb0Var) {
        this.f41109a = jb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41109a.r(1.0f);
    }
}
