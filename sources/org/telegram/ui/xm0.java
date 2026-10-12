package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class xm0 extends AnimatorListenerAdapter {
    public final int f41900a;
    public final boolean f41901b;
    public final un0 f41902c;

    public xm0(un0 un0Var, boolean z10, int i10) {
        this.f41900a = i10;
        this.f41902c = un0Var;
        this.f41901b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f41900a) {
            case 0:
                un0 un0Var = this.f41902c;
                AnimatorSet animatorSet = un0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    un0Var.M = null;
                    return;
                }
                return;
            default:
                un0 un0Var2 = this.f41902c;
                AnimatorSet animatorSet2 = un0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    un0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41900a) {
            case 0:
                un0 un0Var = this.f41902c;
                AnimatorSet animatorSet = un0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f41901b) {
                        un0Var.N.setVisibility(4);
                        return;
                    } else {
                        un0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                un0 un0Var2 = this.f41902c;
                AnimatorSet animatorSet2 = un0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f41901b) {
                        un0Var2.P.setVisibility(4);
                        return;
                    } else {
                        un0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
