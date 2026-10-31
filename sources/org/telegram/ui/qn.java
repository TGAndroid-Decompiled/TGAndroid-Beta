package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.jb0 f41006a;

    public qn(org.telegram.ui.Components.jb0 jb0Var) {
        this.f41006a = jb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41006a.r(1.0f);
    }
}
