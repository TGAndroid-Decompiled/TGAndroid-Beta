package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends AnimatorListenerAdapter {
    public final j4 f42821a;

    public r0(j4 j4Var) {
        this.f42821a = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new bu0(this, 6));
    }
}
