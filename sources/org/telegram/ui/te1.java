package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class te1 extends AnimatorListenerAdapter {
    public final int f40371a;
    public final ue1 f40372b;

    public te1(ue1 ue1Var, int i10) {
        this.f40371a = i10;
        this.f40372b = ue1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40371a) {
            case 0:
                this.f40372b.h.f34205s.setVisibility(8);
                return;
            default:
                this.f40372b.h.f34199a.setVisibility(8);
                return;
        }
    }
}
