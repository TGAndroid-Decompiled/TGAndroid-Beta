package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y91 extends AnimatorListenerAdapter {
    public final int f43764a;
    public final z91 f43765b;

    public y91(z91 z91Var, int i10) {
        this.f43764a = i10;
        this.f43765b = z91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43764a) {
            case 0:
                this.f43765b.f44056b.f37005s.setVisibility(8);
                return;
            default:
                this.f43765b.f44056b.f36999a.setVisibility(8);
                return;
        }
    }
}
