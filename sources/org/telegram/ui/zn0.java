package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class zn0 extends AnimatorListenerAdapter {
    public final int f44179a;
    public final boolean f44180b;
    public final io0 f44181c;

    public zn0(io0 io0Var, boolean z10, int i10) {
        this.f44179a = i10;
        this.f44181c = io0Var;
        this.f44180b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f44179a) {
            case 0:
                io0 io0Var = this.f44181c;
                AnimatorSet animatorSet = io0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    io0Var.v = null;
                    return;
                }
                return;
            default:
                io0 io0Var2 = this.f44181c;
                AnimatorSet animatorSet2 = io0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    io0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44179a) {
            case 0:
                io0 io0Var = this.f44181c;
                AnimatorSet animatorSet = io0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f44180b) {
                        io0Var.f38314r.setVisibility(4);
                        return;
                    } else {
                        io0Var.f38309n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                io0 io0Var2 = this.f44181c;
                AnimatorSet animatorSet2 = io0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f44180b) {
                        io0Var2.f38316s.setVisibility(4);
                        return;
                    } else {
                        io0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
