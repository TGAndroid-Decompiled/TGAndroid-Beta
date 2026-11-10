package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ym extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.qa0 f52068a;

    public ym(org.telegram.ui.Components.qa0 qa0Var) {
        this.f52068a = qa0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f52068a.r(1.0f);
    }
}
