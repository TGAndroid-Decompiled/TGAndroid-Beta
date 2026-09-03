package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.fc0 f41598a;

    public tn(org.telegram.ui.Components.fc0 fc0Var) {
        this.f41598a = fc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41598a.s(1.0f);
    }
}
