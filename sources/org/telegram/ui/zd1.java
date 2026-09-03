package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zd1 extends AnimatorListenerAdapter {
    public final int f40455a;
    public final ae1 f40456b;

    public zd1(ae1 ae1Var, int i10) {
        this.f40455a = i10;
        this.f40456b = ae1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40455a) {
            case 0:
                this.f40456b.h.f34433s.setVisibility(8);
                return;
            default:
                this.f40456b.h.f34427a.setVisibility(8);
                return;
        }
    }
}
