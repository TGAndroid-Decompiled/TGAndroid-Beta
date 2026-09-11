package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r0 extends AnimatorListenerAdapter {
    public final i4 f40025a;

    public r0(i4 i4Var) {
        this.f40025a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new lu0(this, 6));
    }
}
