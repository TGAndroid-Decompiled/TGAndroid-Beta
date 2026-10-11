package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.dd0 f43092a;

    public vn(org.telegram.ui.Components.dd0 dd0Var) {
        this.f43092a = dd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f43092a.s(1.0f);
    }
}
