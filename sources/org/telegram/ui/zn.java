package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.gd0 f44881a;

    public zn(org.telegram.ui.Components.gd0 gd0Var) {
        this.f44881a = gd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f44881a.s(1.0f);
    }
}
