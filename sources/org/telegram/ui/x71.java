package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x71 extends AnimatorListenerAdapter {
    public final int f51883a;
    public final y71 f51884b;

    public x71(y71 y71Var, int i3) {
        this.f51883a = i3;
        this.f51884b = y71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51883a) {
            case 0:
                this.f51884b.f52222b.f44600s.setVisibility(8);
                return;
            default:
                this.f51884b.f52222b.f44593a.setVisibility(8);
                return;
        }
    }
}
