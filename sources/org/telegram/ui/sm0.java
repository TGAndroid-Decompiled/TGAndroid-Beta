package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sm0 extends AnimatorListenerAdapter {
    public final int f37419a;
    public final boolean f37420b;
    public final on0 f37421c;

    public sm0(on0 on0Var, boolean z10, int i10) {
        this.f37419a = i10;
        this.f37421c = on0Var;
        this.f37420b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f37419a) {
            case 0:
                on0 on0Var = this.f37421c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    on0Var.M = null;
                    return;
                }
                return;
            default:
                on0 on0Var2 = this.f37421c;
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
        switch (this.f37419a) {
            case 0:
                on0 on0Var = this.f37421c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f37420b) {
                        on0Var.N.setVisibility(4);
                        return;
                    } else {
                        on0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                on0 on0Var2 = this.f37421c;
                AnimatorSet animatorSet2 = on0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f37420b) {
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
