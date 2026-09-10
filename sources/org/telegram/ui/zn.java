package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.lc0 f39415a;

    public zn(org.telegram.ui.Components.lc0 lc0Var) {
        this.f39415a = lc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39415a.s(1.0f);
    }
}
