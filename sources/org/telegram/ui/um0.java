package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class um0 extends AnimatorListenerAdapter {
    public final int f38094a;
    public final boolean f38095b;
    public final qn0 f38096c;

    public um0(qn0 qn0Var, boolean z10, int i10) {
        this.f38094a = i10;
        this.f38096c = qn0Var;
        this.f38095b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f38094a) {
            case 0:
                qn0 qn0Var = this.f38096c;
                AnimatorSet animatorSet = qn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qn0Var.M = null;
                    return;
                }
                return;
            default:
                qn0 qn0Var2 = this.f38096c;
                AnimatorSet animatorSet2 = qn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38094a) {
            case 0:
                qn0 qn0Var = this.f38096c;
                AnimatorSet animatorSet = qn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f38095b) {
                        qn0Var.N.setVisibility(4);
                        return;
                    } else {
                        qn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                qn0 qn0Var2 = this.f38096c;
                AnimatorSet animatorSet2 = qn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f38095b) {
                        qn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        qn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
