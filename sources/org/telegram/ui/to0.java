package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class to0 extends AnimatorListenerAdapter {
    public final int f40426a;
    public final boolean f40427b;
    public final cp0 f40428c;

    public to0(cp0 cp0Var, boolean z10, int i10) {
        this.f40426a = i10;
        this.f40428c = cp0Var;
        this.f40427b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f40426a) {
            case 0:
                cp0 cp0Var = this.f40428c;
                AnimatorSet animatorSet = cp0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    cp0Var.v = null;
                    return;
                }
                return;
            default:
                cp0 cp0Var2 = this.f40428c;
                AnimatorSet animatorSet2 = cp0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    cp0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40426a) {
            case 0:
                cp0 cp0Var = this.f40428c;
                AnimatorSet animatorSet = cp0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40427b) {
                        cp0Var.f35022r.setVisibility(4);
                        return;
                    } else {
                        cp0Var.f35017n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                cp0 cp0Var2 = this.f40428c;
                AnimatorSet animatorSet2 = cp0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f40427b) {
                        cp0Var2.f35024s.setVisibility(4);
                        return;
                    } else {
                        cp0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
