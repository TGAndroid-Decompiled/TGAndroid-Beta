package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dc0 f43467a;

    public zn(org.telegram.ui.Components.dc0 dc0Var) {
        this.f43467a = dc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43467a.s(1.0f);
    }
}
