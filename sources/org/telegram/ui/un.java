package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class un extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.fc0 f41877a;

    public un(org.telegram.ui.Components.fc0 fc0Var) {
        this.f41877a = fc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41877a.s(1.0f);
    }
}
