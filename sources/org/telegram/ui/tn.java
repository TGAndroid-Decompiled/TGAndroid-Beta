package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.nc0 f38153a;

    public tn(org.telegram.ui.Components.nc0 nc0Var) {
        this.f38153a = nc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f38153a.s(1.0f);
    }
}
