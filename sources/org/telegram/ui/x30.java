package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x30 extends AnimatorListenerAdapter {
    public final q50 f43019a;

    public x30(q50 q50Var) {
        this.f43019a = q50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43019a.X0 = null;
    }
}
