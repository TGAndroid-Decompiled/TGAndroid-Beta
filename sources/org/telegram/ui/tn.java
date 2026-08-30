package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dc0 f38689a;

    public tn(org.telegram.ui.Components.dc0 dc0Var) {
        this.f38689a = dc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38689a.s(1.0f);
    }
}
