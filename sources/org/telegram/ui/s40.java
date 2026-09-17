package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s40 extends AnimatorListenerAdapter {
    public final k60 f37380a;

    public s40(k60 k60Var) {
        this.f37380a = k60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f37380a.X0 = null;
    }
}
