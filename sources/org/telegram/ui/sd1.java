package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sd1 extends AnimatorListenerAdapter {
    public final int f38307a;
    public final td1 f38308b;

    public sd1(td1 td1Var, int i10) {
        this.f38307a = i10;
        this.f38308b = td1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38307a) {
            case 0:
                this.f38308b.h.f40498s.setVisibility(8);
                return;
            default:
                this.f38308b.h.f40492a.setVisibility(8);
                return;
        }
    }
}
