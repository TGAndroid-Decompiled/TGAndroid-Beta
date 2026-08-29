package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class zl0 extends AnimatorListenerAdapter {
    public final int f45257a;
    public final boolean f45258b;
    public final vm0 f45259c;

    public zl0(vm0 vm0Var, boolean z10, int i10) {
        this.f45257a = i10;
        this.f45259c = vm0Var;
        this.f45258b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f45257a) {
            case 0:
                vm0 vm0Var = this.f45259c;
                AnimatorSet animatorSet = vm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vm0Var.I = null;
                    return;
                }
                return;
            default:
                vm0 vm0Var2 = this.f45259c;
                AnimatorSet animatorSet2 = vm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vm0Var2.I = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45257a) {
            case 0:
                vm0 vm0Var = this.f45259c;
                AnimatorSet animatorSet = vm0Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f45258b) {
                        vm0Var.J.setVisibility(4);
                        return;
                    } else {
                        vm0Var.H.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                vm0 vm0Var2 = this.f45259c;
                AnimatorSet animatorSet2 = vm0Var2.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f45258b) {
                        vm0Var2.L.setVisibility(4);
                        return;
                    } else {
                        vm0Var2.K.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
