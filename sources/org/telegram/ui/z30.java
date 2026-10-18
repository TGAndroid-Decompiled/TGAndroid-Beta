package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z30 extends AnimatorListenerAdapter {
    public final s50 f43529a;

    public z30(s50 s50Var) {
        this.f43529a = s50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43529a.X0 = null;
    }
}
