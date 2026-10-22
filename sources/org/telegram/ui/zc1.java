package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zc1 extends AnimatorListenerAdapter {
    public final int f43726a;
    public final ad1 f43727b;

    public zc1(ad1 ad1Var, int i10) {
        this.f43726a = i10;
        this.f43727b = ad1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43726a) {
            case 0:
                this.f43727b.f35355s.f37294s.setVisibility(8);
                return;
            default:
                this.f43727b.f35355s.f37288a.setVisibility(8);
                return;
        }
    }
}
