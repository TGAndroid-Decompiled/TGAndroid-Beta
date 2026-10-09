package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vn extends AnimatorListenerAdapter {
    public final org.telegram.ui.Components.cd0 f42904a;

    public vn(org.telegram.ui.Components.cd0 cd0Var) {
        this.f42904a = cd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f42904a.s(1.0f);
    }
}
