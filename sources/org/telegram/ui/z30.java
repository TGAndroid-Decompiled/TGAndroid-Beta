package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class z30 extends AnimatorListenerAdapter {

    public final s50 f45014a;

    public z30(s50 s50Var) {
        this.f45014a = s50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f45014a.T0 = null;
    }
}
