package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class tn0 extends AnimatorListenerAdapter {
    public final int f43042a;
    public final boolean f43043b;
    public final co0 f43044c;

    public tn0(co0 co0Var, boolean z10, int i9) {
        this.f43042a = i9;
        this.f43044c = co0Var;
        this.f43043b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f43042a) {
            case 0:
                co0 co0Var = this.f43044c;
                AnimatorSet animatorSet = co0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    co0Var.v = null;
                    return;
                }
                return;
            default:
                co0 co0Var2 = this.f43044c;
                AnimatorSet animatorSet2 = co0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    co0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43042a) {
            case 0:
                co0 co0Var = this.f43044c;
                AnimatorSet animatorSet = co0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f43043b) {
                        co0Var.f37269r.setVisibility(4);
                        return;
                    } else {
                        co0Var.f37264n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                co0 co0Var2 = this.f43044c;
                AnimatorSet animatorSet2 = co0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f43043b) {
                        co0Var2.f37271s.setVisibility(4);
                        return;
                    } else {
                        co0Var2.Q.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
