package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class xn0 extends AnimatorListenerAdapter {
    public final int f43208a;
    public final boolean f43209b;
    public final go0 f43210c;

    public xn0(go0 go0Var, boolean z10, int i10) {
        this.f43208a = i10;
        this.f43210c = go0Var;
        this.f43209b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f43208a) {
            case 0:
                go0 go0Var = this.f43210c;
                AnimatorSet animatorSet = go0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    go0Var.v = null;
                    return;
                }
                return;
            default:
                go0 go0Var2 = this.f43210c;
                AnimatorSet animatorSet2 = go0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    go0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43208a) {
            case 0:
                go0 go0Var = this.f43210c;
                AnimatorSet animatorSet = go0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f43209b) {
                        go0Var.f37242r.setVisibility(4);
                        return;
                    } else {
                        go0Var.f37237n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                go0 go0Var2 = this.f43210c;
                AnimatorSet animatorSet2 = go0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f43209b) {
                        go0Var2.f37244s.setVisibility(4);
                        return;
                    } else {
                        go0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
