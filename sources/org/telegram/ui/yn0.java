package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class yn0 extends AnimatorListenerAdapter {
    public final int f43896a;
    public final boolean f43897b;
    public final ho0 f43898c;

    public yn0(ho0 ho0Var, boolean z10, int i10) {
        this.f43896a = i10;
        this.f43898c = ho0Var;
        this.f43897b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f43896a) {
            case 0:
                ho0 ho0Var = this.f43898c;
                AnimatorSet animatorSet = ho0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ho0Var.v = null;
                    return;
                }
                return;
            default:
                ho0 ho0Var2 = this.f43898c;
                AnimatorSet animatorSet2 = ho0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ho0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43896a) {
            case 0:
                ho0 ho0Var = this.f43898c;
                AnimatorSet animatorSet = ho0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f43897b) {
                        ho0Var.f37941r.setVisibility(4);
                        return;
                    } else {
                        ho0Var.f37936n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ho0 ho0Var2 = this.f43898c;
                AnimatorSet animatorSet2 = ho0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f43897b) {
                        ho0Var2.f37943s.setVisibility(4);
                        return;
                    } else {
                        ho0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
