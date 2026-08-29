package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z30 extends AnimatorListenerAdapter {
    public final r50 f45055a;

    public z30(r50 r50Var) {
        this.f45055a = r50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f45055a.T0 = null;
    }
}
