package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y91 extends AnimatorListenerAdapter {
    public final int f43610a;
    public final ca1 f43611b;

    public y91(ca1 ca1Var, int i10) {
        this.f43610a = i10;
        this.f43611b = ca1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43610a) {
            case 0:
                ca1 ca1Var = this.f43611b;
                ca1Var.f36277w = 0;
                ca1Var.f36274n.setVisibility(8);
                return;
            case 1:
                this.f43611b.f36277w = 0;
                return;
            default:
                this.f43611b.F.setVisibility(8);
                return;
        }
    }
}
