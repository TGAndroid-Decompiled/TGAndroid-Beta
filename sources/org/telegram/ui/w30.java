package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w30 extends AnimatorListenerAdapter {
    public final o50 f43644a;

    public w30(o50 o50Var) {
        this.f43644a = o50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43644a.T0 = null;
    }
}
