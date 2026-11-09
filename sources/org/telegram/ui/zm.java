package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zm extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.ra0 f52597a;

    public zm(org.telegram.ui.Components.ra0 ra0Var) {
        this.f52597a = ra0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f52597a.r(1.0f);
    }
}
