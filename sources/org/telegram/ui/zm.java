package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.qa0 f52486a;

    public zm(org.telegram.ui.Components.qa0 qa0Var) {
        this.f52486a = qa0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f52486a.r(1.0f);
    }
}
