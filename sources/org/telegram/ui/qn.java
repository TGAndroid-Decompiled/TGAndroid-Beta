package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.uc0 f42876a;

    public qn(org.telegram.ui.Components.uc0 uc0Var) {
        this.f42876a = uc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f42876a.r(1.0f);
    }
}
