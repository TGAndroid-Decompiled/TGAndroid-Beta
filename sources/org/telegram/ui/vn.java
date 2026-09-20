package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.kc0 f38577a;

    public vn(org.telegram.ui.Components.kc0 kc0Var) {
        this.f38577a = kc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38577a.s(1.0f);
    }
}
