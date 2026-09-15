package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sm0 extends AnimatorListenerAdapter {
    public final int f37410a;
    public final boolean f37411b;
    public final on0 f37412c;

    public sm0(on0 on0Var, boolean z10, int i10) {
        this.f37410a = i10;
        this.f37412c = on0Var;
        this.f37411b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37410a) {
            case 0:
                on0 on0Var = this.f37412c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    on0Var.M = null;
                    return;
                }
                return;
            default:
                on0 on0Var2 = this.f37412c;
                AnimatorSet animatorSet2 = on0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    on0Var2.M = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37410a) {
            case 0:
                on0 on0Var = this.f37412c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37411b) {
                        on0Var.N.setVisibility(4);
                        return;
                    } else {
                        on0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                on0 on0Var2 = this.f37412c;
                AnimatorSet animatorSet2 = on0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37411b) {
                        on0Var2.P.setVisibility(4);
                        return;
                    } else {
                        on0Var2.O.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
