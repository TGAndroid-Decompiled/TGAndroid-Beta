package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sn0 extends AnimatorListenerAdapter {
    public final int f42432a;
    public final boolean f42433b;
    public final bo0 f42434c;

    public sn0(bo0 bo0Var, boolean z10, int i10) {
        this.f42432a = i10;
        this.f42434c = bo0Var;
        this.f42433b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f42432a) {
            case 0:
                bo0 bo0Var = this.f42434c;
                AnimatorSet animatorSet = bo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bo0Var.v = null;
                    return;
                }
                return;
            default:
                bo0 bo0Var2 = this.f42434c;
                AnimatorSet animatorSet2 = bo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42432a) {
            case 0:
                bo0 bo0Var = this.f42434c;
                AnimatorSet animatorSet = bo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f42433b) {
                        bo0Var.f36862r.setVisibility(4);
                        return;
                    } else {
                        bo0Var.f36857n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                bo0 bo0Var2 = this.f42434c;
                AnimatorSet animatorSet2 = bo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f42433b) {
                        bo0Var2.f36864s.setVisibility(4);
                        return;
                    } else {
                        bo0Var2.Q.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
