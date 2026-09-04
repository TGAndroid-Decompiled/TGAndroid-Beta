package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dc0 f43169a;

    public yn(org.telegram.ui.Components.dc0 dc0Var) {
        this.f43169a = dc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43169a.s(1.0f);
    }
}
