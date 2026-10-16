package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class se1 extends AnimatorListenerAdapter {
    public final int f39805a;
    public final te1 f39806b;

    public se1(te1 te1Var, int i10) {
        this.f39805a = i10;
        this.f39806b = te1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39805a) {
            case 0:
                this.f39806b.h.f42298s.setVisibility(8);
                return;
            default:
                this.f39806b.h.f42292a.setVisibility(8);
                return;
        }
    }
}
