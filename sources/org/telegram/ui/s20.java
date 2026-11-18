package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s20 extends AnimatorListenerAdapter {
    public final f40 f51849a;

    public s20(f40 f40Var) {
        this.f51849a = f40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f51849a.S2 = null;
    }
}
