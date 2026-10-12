package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u40 extends AnimatorListenerAdapter {
    public final n60 f40536a;

    public u40(n60 n60Var) {
        this.f40536a = n60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40536a.X0 = null;
    }
}
