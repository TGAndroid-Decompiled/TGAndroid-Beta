package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u40 extends AnimatorListenerAdapter {
    public final n60 f40262a;

    public u40(n60 n60Var) {
        this.f40262a = n60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f40262a.X0 = null;
    }
}
