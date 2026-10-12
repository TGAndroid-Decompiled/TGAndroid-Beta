package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final k4 f40256a;

    public t0(k4 k4Var) {
        this.f40256a = k4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new tu0(this, 6));
    }
}
