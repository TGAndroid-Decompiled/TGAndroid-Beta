package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.ec0 f39135a;

    public vn(org.telegram.ui.Components.ec0 ec0Var) {
        this.f39135a = ec0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39135a.s(1.0f);
    }
}
