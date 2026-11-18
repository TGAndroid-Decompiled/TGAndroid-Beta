package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bb0 f54185a;

    public ym(org.telegram.ui.Components.bb0 bb0Var) {
        this.f54185a = bb0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f54185a.r(1.0f);
    }
}
