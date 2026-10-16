package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ve1 extends AnimatorListenerAdapter {
    public final int f40686a;
    public final ze1 f40687b;

    public ve1(ze1 ze1Var, int i10) {
        this.f40686a = i10;
        this.f40687b = ze1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40686a) {
            case 0:
                ze1 ze1Var = this.f40687b;
                ze1Var.v = 0;
                ze1Var.f42296n.setVisibility(8);
                return;
            case 1:
                this.f40687b.v = 0;
                return;
            default:
                this.f40687b.F.setVisibility(8);
                return;
        }
    }
}
