package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.ra0 f53266a;

    public xm(org.telegram.ui.Components.ra0 ra0Var) {
        this.f53266a = ra0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f53266a.r(1.0f);
    }
}
