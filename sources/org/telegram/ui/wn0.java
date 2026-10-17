package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class wn0 extends AnimatorListenerAdapter {
    public final int f42898a;
    public final boolean f42899b;
    public final fo0 f42900c;

    public wn0(fo0 fo0Var, boolean z10, int i10) {
        this.f42898a = i10;
        this.f42900c = fo0Var;
        this.f42899b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f42898a) {
            case 0:
                fo0 fo0Var = this.f42900c;
                AnimatorSet animatorSet = fo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fo0Var.v = null;
                    return;
                }
                return;
            default:
                fo0 fo0Var2 = this.f42900c;
                AnimatorSet animatorSet2 = fo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42898a) {
            case 0:
                fo0 fo0Var = this.f42900c;
                AnimatorSet animatorSet = fo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f42899b) {
                        fo0Var.f36997r.setVisibility(4);
                        return;
                    } else {
                        fo0Var.f36992n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                fo0 fo0Var2 = this.f42900c;
                AnimatorSet animatorSet2 = fo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f42899b) {
                        fo0Var2.f36999s.setVisibility(4);
                        return;
                    } else {
                        fo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
