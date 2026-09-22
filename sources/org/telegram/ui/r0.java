package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends AnimatorListenerAdapter {
    public final h4 f37030a;

    public r0(h4 h4Var) {
        this.f37030a = h4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new mu0(this, 6));
    }
}
