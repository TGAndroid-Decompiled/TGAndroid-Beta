package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r40 extends AnimatorListenerAdapter {
    public final j60 f36219a;

    public r40(j60 j60Var) {
        this.f36219a = j60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f36219a.X0 = null;
    }
}
