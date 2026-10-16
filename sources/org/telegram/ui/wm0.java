package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class wm0 extends AnimatorListenerAdapter {
    public final int f41324a;
    public final boolean f41325b;
    public final sn0 f41326c;

    public wm0(sn0 sn0Var, boolean z10, int i10) {
        this.f41324a = i10;
        this.f41326c = sn0Var;
        this.f41325b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f41324a) {
            case 0:
                sn0 sn0Var = this.f41326c;
                AnimatorSet animatorSet = sn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    sn0Var.M = null;
                    return;
                }
                return;
            default:
                sn0 sn0Var2 = this.f41326c;
                AnimatorSet animatorSet2 = sn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    sn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41324a) {
            case 0:
                sn0 sn0Var = this.f41326c;
                AnimatorSet animatorSet = sn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f41325b) {
                        sn0Var.N.setVisibility(4);
                        return;
                    } else {
                        sn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                sn0 sn0Var2 = this.f41326c;
                AnimatorSet animatorSet2 = sn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f41325b) {
                        sn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        sn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
