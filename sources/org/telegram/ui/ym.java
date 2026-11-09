package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.ra0 f52142a;

    public ym(org.telegram.ui.Components.ra0 ra0Var) {
        this.f52142a = ra0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f52142a.r(1.0f);
    }
}
