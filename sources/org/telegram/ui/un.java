package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class un extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.bc0 f38136a;

    public un(org.telegram.ui.Components.bc0 bc0Var) {
        this.f38136a = bc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38136a.s(1.0f);
    }
}
