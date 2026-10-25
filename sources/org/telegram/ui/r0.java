package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends AnimatorListenerAdapter {
    public final j4 f42959a;

    public r0(j4 j4Var) {
        this.f42959a = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new zt0(this, 6));
    }
}
