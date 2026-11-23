package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r20 extends AnimatorListenerAdapter {
    public final e40 f51594a;

    public r20(e40 e40Var) {
        this.f51594a = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f51594a.S2 = null;
    }
}
