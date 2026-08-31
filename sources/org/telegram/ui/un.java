package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class un extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.fc0 f41977a;

    public un(org.telegram.ui.Components.fc0 fc0Var) {
        this.f41977a = fc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41977a.s(1.0f);
    }
}
