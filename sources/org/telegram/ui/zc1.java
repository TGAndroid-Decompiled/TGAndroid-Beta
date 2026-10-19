package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zc1 extends AnimatorListenerAdapter {
    public final int f43717a;
    public final ad1 f43718b;

    public zc1(ad1 ad1Var, int i10) {
        this.f43717a = i10;
        this.f43718b = ad1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43717a) {
            case 0:
                this.f43718b.f35345s.f37284s.setVisibility(8);
                return;
            default:
                this.f43718b.f35345s.f37278a.setVisibility(8);
                return;
        }
    }
}
