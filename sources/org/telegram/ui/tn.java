package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.oc0 f38154a;

    public tn(org.telegram.ui.Components.oc0 oc0Var) {
        this.f38154a = oc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38154a.s(1.0f);
    }
}
