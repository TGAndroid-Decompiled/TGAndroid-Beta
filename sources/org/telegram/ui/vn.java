package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.pc0 f41782a;

    public vn(org.telegram.ui.Components.pc0 pc0Var) {
        this.f41782a = pc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f41782a.s(1.0f);
    }
}
