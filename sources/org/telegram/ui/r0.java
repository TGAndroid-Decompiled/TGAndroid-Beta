package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r0 extends AnimatorListenerAdapter {
    public final h4 f40932a;

    public r0(h4 h4Var) {
        this.f40932a = h4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.messenger.i0.g3(new qr0(this, 6));
    }
}
