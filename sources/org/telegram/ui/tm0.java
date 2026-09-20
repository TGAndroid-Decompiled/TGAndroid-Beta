package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class tm0 extends AnimatorListenerAdapter {
    public final int f37850a;
    public final boolean f37851b;
    public final pn0 f37852c;

    public tm0(pn0 pn0Var, boolean z10, int i10) {
        this.f37850a = i10;
        this.f37852c = pn0Var;
        this.f37851b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37850a) {
            case 0:
                pn0 pn0Var = this.f37852c;
                AnimatorSet animatorSet = pn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pn0Var.M = null;
                    return;
                }
                return;
            default:
                pn0 pn0Var2 = this.f37852c;
                AnimatorSet animatorSet2 = pn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37850a) {
            case 0:
                pn0 pn0Var = this.f37852c;
                AnimatorSet animatorSet = pn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37851b) {
                        pn0Var.N.setVisibility(4);
                        return;
                    } else {
                        pn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                pn0 pn0Var2 = this.f37852c;
                AnimatorSet animatorSet2 = pn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37851b) {
                        pn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        pn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
