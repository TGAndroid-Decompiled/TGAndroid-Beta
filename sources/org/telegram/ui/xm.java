package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.za0 f53997a;

    public xm(org.telegram.ui.Components.za0 za0Var) {
        this.f53997a = za0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f53997a.r(1.0f);
    }
}
