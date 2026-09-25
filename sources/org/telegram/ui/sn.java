package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.mc0 f37831a;

    public sn(org.telegram.ui.Components.mc0 mc0Var) {
        this.f37831a = mc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f37831a.s(1.0f);
    }
}
