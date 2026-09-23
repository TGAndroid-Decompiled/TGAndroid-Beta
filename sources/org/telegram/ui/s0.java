package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class s0 extends AnimatorListenerAdapter {
    public final i4 f37094a;

    public s0(i4 i4Var) {
        this.f37094a = i4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new fu0(this, 6));
    }
}
