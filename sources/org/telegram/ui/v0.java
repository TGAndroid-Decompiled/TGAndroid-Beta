package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class v0 extends AnimatorListenerAdapter {

    public final m4 f43317a;

    public v0(m4 m4Var) {
        this.f43317a = m4Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AndroidUtilities.runOnUIThread(new lt0(this, 6));
    }
}
