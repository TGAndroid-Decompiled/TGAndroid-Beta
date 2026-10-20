package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zc1 extends AnimatorListenerAdapter {
    public final int f43723a;
    public final ad1 f43724b;

    public zc1(ad1 ad1Var, int i10) {
        this.f43723a = i10;
        this.f43724b = ad1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43723a) {
            case 0:
                this.f43724b.f35351s.f37290s.setVisibility(8);
                return;
            default:
                this.f43724b.f35351s.f37284a.setVisibility(8);
                return;
        }
    }
}
