package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

public final class un0 extends AnimatorListenerAdapter {

    public final int f43262a;

    public final boolean f43263b;

    public final do0 f43264c;

    public un0(do0 do0Var, boolean z10, int i10) {
        this.f43262a = i10;
        this.f43264c = do0Var;
        this.f43263b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f43262a) {
            case 0:
                do0 do0Var = this.f43264c;
                AnimatorSet animatorSet = do0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    do0Var.v = null;
                    break;
                }
                break;
            default:
                do0 do0Var2 = this.f43264c;
                AnimatorSet animatorSet2 = do0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    do0Var2.v = null;
                    break;
                }
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43262a) {
            case 0:
                do0 do0Var = this.f43264c;
                AnimatorSet animatorSet = do0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f43263b) {
                        do0Var.f37475r.setVisibility(4);
                    } else {
                        do0Var.f37470n.getContentView().setVisibility(4);
                    }
                    break;
                }
                break;
            default:
                do0 do0Var2 = this.f43264c;
                AnimatorSet animatorSet2 = do0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f43263b) {
                        do0Var2.f37477s.setVisibility(4);
                    } else {
                        do0Var2.Q.setVisibility(4);
                    }
                    break;
                }
                break;
        }
    }
}
