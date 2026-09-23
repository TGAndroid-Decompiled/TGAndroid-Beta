package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bc0 f37720a;

    public tn(org.telegram.ui.Components.bc0 bc0Var) {
        this.f37720a = bc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f37720a.s(1.0f);
    }
}
