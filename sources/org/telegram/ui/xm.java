package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cb0 f53899a;

    public xm(org.telegram.ui.Components.cb0 cb0Var) {
        this.f53899a = cb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f53899a.r(1.0f);
    }
}
