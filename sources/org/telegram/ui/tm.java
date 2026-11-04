package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.la0 f49828a;

    public tm(org.telegram.ui.Components.la0 la0Var) {
        this.f49828a = la0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f49828a.r(1.0f);
    }
}
