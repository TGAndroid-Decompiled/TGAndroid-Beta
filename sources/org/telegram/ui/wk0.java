package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class wk0 extends AnimatorListenerAdapter {
    public final int f51193a;
    public final boolean f51194b;
    public final dl0 f51195c;

    public wk0(dl0 dl0Var, boolean z10, int i3) {
        this.f51193a = i3;
        this.f51195c = dl0Var;
        this.f51194b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f51193a) {
            case 0:
                dl0 dl0Var = this.f51195c;
                AnimatorSet animatorSet = dl0Var.f44772w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dl0Var.f44772w = null;
                    return;
                }
                return;
            default:
                dl0 dl0Var2 = this.f51195c;
                AnimatorSet animatorSet2 = dl0Var2.f44772w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dl0Var2.f44772w = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51193a) {
            case 0:
                dl0 dl0Var = this.f51195c;
                AnimatorSet animatorSet = dl0Var.f44772w;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f51194b) {
                        dl0Var.f44765r.setVisibility(4);
                        return;
                    } else {
                        dl0Var.f44760n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                dl0 dl0Var2 = this.f51195c;
                AnimatorSet animatorSet2 = dl0Var2.f44772w;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f51194b) {
                        dl0Var2.f44767s.setVisibility(4);
                        return;
                    } else {
                        dl0Var2.V.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
