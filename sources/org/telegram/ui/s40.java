package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s40 extends AnimatorListenerAdapter {
    public final k60 f37385a;

    public s40(k60 k60Var) {
        this.f37385a = k60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f37385a.X0 = null;
    }
}
