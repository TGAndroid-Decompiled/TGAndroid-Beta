package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final l4 f41782a;

    public u0(l4 l4Var) {
        this.f41782a = l4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new st0(this, 6));
    }
}
