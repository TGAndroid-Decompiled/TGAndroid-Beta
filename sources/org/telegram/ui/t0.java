package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final l4 f41347a;

    public t0(l4 l4Var) {
        this.f41347a = l4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new yt0(this, 6));
    }
}
