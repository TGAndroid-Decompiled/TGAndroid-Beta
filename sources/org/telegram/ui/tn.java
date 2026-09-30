package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.pc0 f38263a;

    public tn(org.telegram.ui.Components.pc0 pc0Var) {
        this.f38263a = pc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38263a.s(1.0f);
    }
}
