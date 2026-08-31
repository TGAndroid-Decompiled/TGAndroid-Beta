package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xd1 extends AnimatorListenerAdapter {
    public final int f43036a;
    public final be1 f43037b;

    public xd1(be1 be1Var, int i10) {
        this.f43036a = i10;
        this.f43037b = be1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43036a) {
            case 0:
                be1 be1Var = this.f43037b;
                be1Var.v = 0;
                be1Var.f35496n.setVisibility(8);
                return;
            case 1:
                this.f43037b.v = 0;
                return;
            default:
                this.f43037b.C.setVisibility(8);
                return;
        }
    }
}
