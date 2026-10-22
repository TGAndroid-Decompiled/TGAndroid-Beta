package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class vn0 extends AnimatorListenerAdapter {
    public final int f42347a;
    public final boolean f42348b;
    public final eo0 f42349c;

    public vn0(eo0 eo0Var, boolean z10, int i10) {
        this.f42347a = i10;
        this.f42349c = eo0Var;
        this.f42348b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f42347a) {
            case 0:
                eo0 eo0Var = this.f42349c;
                AnimatorSet animatorSet = eo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    eo0Var.v = null;
                    return;
                }
                return;
            default:
                eo0 eo0Var2 = this.f42349c;
                AnimatorSet animatorSet2 = eo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    eo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42347a) {
            case 0:
                eo0 eo0Var = this.f42349c;
                AnimatorSet animatorSet = eo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f42348b) {
                        eo0Var.f36729r.setVisibility(4);
                        return;
                    } else {
                        eo0Var.f36724n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                eo0 eo0Var2 = this.f42349c;
                AnimatorSet animatorSet2 = eo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f42348b) {
                        eo0Var2.f36731s.setVisibility(4);
                        return;
                    } else {
                        eo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
