package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.la0 f49537a;

    public sm(org.telegram.ui.Components.la0 la0Var) {
        this.f49537a = la0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f49537a.r(1.0f);
    }
}
