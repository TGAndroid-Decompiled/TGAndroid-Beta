package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x30 extends AnimatorListenerAdapter {
    public final q50 f43013a;

    public x30(q50 q50Var) {
        this.f43013a = q50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43013a.X0 = null;
    }
}
