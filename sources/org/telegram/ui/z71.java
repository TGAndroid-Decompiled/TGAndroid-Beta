package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class z71 extends AnimatorListenerAdapter {
    public final int f52579a;
    public final d81 f52580b;

    public z71(d81 d81Var, int i3) {
        this.f52579a = i3;
        this.f52580b = d81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52579a) {
            case 0:
                d81 d81Var = this.f52580b;
                d81Var.f44601w = 0;
                d81Var.f44598n.setVisibility(8);
                return;
            case 1:
                this.f52580b.f44601w = 0;
                return;
            default:
                this.f52580b.G.setVisibility(8);
                return;
        }
    }
}
