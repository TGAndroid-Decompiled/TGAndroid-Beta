package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.mc0 f38137a;

    public tn(org.telegram.ui.Components.mc0 mc0Var) {
        this.f38137a = mc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38137a.s(1.0f);
    }
}
