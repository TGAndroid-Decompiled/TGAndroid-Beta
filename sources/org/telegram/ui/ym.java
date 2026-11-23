package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.za0 f54398a;

    public ym(org.telegram.ui.Components.za0 za0Var) {
        this.f54398a = za0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f54398a.r(1.0f);
    }
}
