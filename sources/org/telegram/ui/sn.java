package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.pc0 f37924a;

    public sn(org.telegram.ui.Components.pc0 pc0Var) {
        this.f37924a = pc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f37924a.s(1.0f);
    }
}
