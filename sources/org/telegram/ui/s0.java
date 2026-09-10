package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class s0 extends AnimatorListenerAdapter {
    public final j4 f36498a;

    public s0(j4 j4Var) {
        this.f36498a = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new mu0(this, 6));
    }
}
