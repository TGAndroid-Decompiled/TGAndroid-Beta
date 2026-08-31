package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vd1 extends AnimatorListenerAdapter {
    public final int f42210a;
    public final wd1 f42211b;

    public vd1(wd1 wd1Var, int i10) {
        this.f42210a = i10;
        this.f42211b = wd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42210a) {
            case 0:
                this.f42211b.h.f35498s.setVisibility(8);
                return;
            default:
                this.f42211b.h.f35491a.setVisibility(8);
                return;
        }
    }
}
