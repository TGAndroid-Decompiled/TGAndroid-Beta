package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r20 extends AnimatorListenerAdapter {
    public final e40 f49250a;

    public r20(e40 e40Var) {
        this.f49250a = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f49250a.O2 = null;
    }
}
