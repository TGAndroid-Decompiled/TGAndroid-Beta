package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.jb0 f40853a;

    public qn(org.telegram.ui.Components.jb0 jb0Var) {
        this.f40853a = jb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f40853a.r(1.0f);
    }
}
