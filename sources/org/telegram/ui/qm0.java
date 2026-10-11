package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class qm0 extends AnimatorListenerAdapter {
    public final int f41237a;
    public final boolean f41238b;
    public final mn0 f41239c;

    public qm0(mn0 mn0Var, boolean z10, int i10) {
        this.f41237a = i10;
        this.f41239c = mn0Var;
        this.f41238b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f41237a) {
            case 0:
                mn0 mn0Var = this.f41239c;
                AnimatorSet animatorSet = mn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mn0Var.M = null;
                    return;
                }
                return;
            default:
                mn0 mn0Var2 = this.f41239c;
                AnimatorSet animatorSet2 = mn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    mn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41237a) {
            case 0:
                mn0 mn0Var = this.f41239c;
                AnimatorSet animatorSet = mn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f41238b) {
                        mn0Var.N.setVisibility(4);
                        return;
                    } else {
                        mn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                mn0 mn0Var2 = this.f41239c;
                AnimatorSet animatorSet2 = mn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f41238b) {
                        mn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        mn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
