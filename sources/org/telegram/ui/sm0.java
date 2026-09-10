package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class sm0 extends AnimatorListenerAdapter {
    public final int f36724a;
    public final boolean f36725b;
    public final on0 f36726c;

    public sm0(on0 on0Var, boolean z10, int i10) {
        this.f36724a = i10;
        this.f36726c = on0Var;
        this.f36725b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36724a) {
            case 0:
                on0 on0Var = this.f36726c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    on0Var.M = null;
                    return;
                }
                return;
            default:
                on0 on0Var2 = this.f36726c;
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
        switch (this.f36724a) {
            case 0:
                on0 on0Var = this.f36726c;
                AnimatorSet animatorSet = on0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36725b) {
                        on0Var.N.setVisibility(4);
                        return;
                    } else {
                        on0Var.L.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                on0 on0Var2 = this.f36726c;
                AnimatorSet animatorSet2 = on0Var2.M;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36725b) {
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
