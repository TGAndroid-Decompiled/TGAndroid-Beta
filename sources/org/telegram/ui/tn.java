package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nc0 f37871a;

    public tn(org.telegram.ui.Components.nc0 nc0Var) {
        this.f37871a = nc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f37871a.s(1.0f);
    }
}
