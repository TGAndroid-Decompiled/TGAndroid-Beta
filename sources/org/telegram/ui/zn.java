package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dc0 f43466a;

    public zn(org.telegram.ui.Components.dc0 dc0Var) {
        this.f43466a = dc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43466a.s(1.0f);
    }
}
