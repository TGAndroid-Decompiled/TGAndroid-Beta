package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final l4 f38466a;

    public t0(l4 l4Var) {
        this.f38466a = l4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new rt0(this, 6));
    }
}
