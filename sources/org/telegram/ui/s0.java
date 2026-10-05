package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class s0 extends AnimatorListenerAdapter {
    public final i4 f40294a;

    public s0(i4 i4Var) {
        this.f40294a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new hu0(this, 6));
    }
}
