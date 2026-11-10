package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s20 extends AnimatorListenerAdapter {
    public final f40 f49628a;

    public s20(f40 f40Var) {
        this.f49628a = f40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f49628a.R2 = null;
    }
}
