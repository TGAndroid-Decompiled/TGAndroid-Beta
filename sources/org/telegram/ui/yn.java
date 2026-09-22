package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cc0 f39912a;

    public yn(org.telegram.ui.Components.cc0 cc0Var) {
        this.f39912a = cc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f39912a.s(1.0f);
    }
}
