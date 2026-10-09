package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class rm0 extends AnimatorListenerAdapter {
    public final int f41455a;
    public final boolean f41456b;
    public final nn0 f41457c;

    public rm0(nn0 nn0Var, boolean z10, int i10) {
        this.f41455a = i10;
        this.f41457c = nn0Var;
        this.f41456b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f41455a) {
            case 0:
                nn0 nn0Var = this.f41457c;
                AnimatorSet animatorSet = nn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nn0Var.M = null;
                    return;
                }
                return;
            default:
                nn0 nn0Var2 = this.f41457c;
                AnimatorSet animatorSet2 = nn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    nn0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41455a) {
            case 0:
                nn0 nn0Var = this.f41457c;
                AnimatorSet animatorSet = nn0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f41456b) {
                        nn0Var.N.setVisibility(4);
                        return;
                    } else {
                        nn0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                nn0 nn0Var2 = this.f41457c;
                AnimatorSet animatorSet2 = nn0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f41456b) {
                        nn0Var2.P.setVisibility(4);
                        return;
                    } else {
                        nn0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
