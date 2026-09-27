package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final j4 f37610a;

    public t0(j4 j4Var) {
        this.f37610a = j4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new hu0(this, 6));
    }
}
