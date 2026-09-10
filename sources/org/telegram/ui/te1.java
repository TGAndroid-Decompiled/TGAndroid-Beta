package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class te1 extends AnimatorListenerAdapter {
    public final int f36920a;
    public final xe1 f36921b;

    public te1(xe1 xe1Var, int i10) {
        this.f36920a = i10;
        this.f36921b = xe1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36920a) {
            case 0:
                xe1 xe1Var = this.f36921b;
                xe1Var.v = 0;
                xe1Var.f38698n.setVisibility(8);
                return;
            case 1:
                this.f36921b.v = 0;
                return;
            default:
                this.f36921b.F.setVisibility(8);
                return;
        }
    }
}
