package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ro0 extends AnimatorListenerAdapter {
    public final int f39563a;
    public final boolean f39564b;
    public final ap0 f39565c;

    public ro0(ap0 ap0Var, boolean z10, int i10) {
        this.f39563a = i10;
        this.f39565c = ap0Var;
        this.f39564b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39563a) {
            case 0:
                ap0 ap0Var = this.f39565c;
                AnimatorSet animatorSet = ap0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ap0Var.v = null;
                    return;
                }
                return;
            default:
                ap0 ap0Var2 = this.f39565c;
                AnimatorSet animatorSet2 = ap0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ap0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39563a) {
            case 0:
                ap0 ap0Var = this.f39565c;
                AnimatorSet animatorSet = ap0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39564b) {
                        ap0Var.f34034r.setVisibility(4);
                        return;
                    } else {
                        ap0Var.f34029n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ap0 ap0Var2 = this.f39565c;
                AnimatorSet animatorSet2 = ap0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39564b) {
                        ap0Var2.f34036s.setVisibility(4);
                        return;
                    } else {
                        ap0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
