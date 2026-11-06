package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vy0 extends AnimatorListenerAdapter {
    public final int f50854a;
    public final wy0 f50855b;

    public vy0(wy0 wy0Var, int i7) {
        this.f50854a = i7;
        this.f50855b = wy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50854a) {
            case 0:
                wy0 wy0Var = this.f50855b;
                if (wy0Var.h != null) {
                    wy0Var.h = null;
                    wy0Var.f51682e = 0.0f;
                    wy0Var.g();
                    wy0Var.f51684n.e();
                    zv zvVar = wy0Var.f51679a;
                    if (zvVar != null) {
                        zvVar.onPause();
                        wy0Var.f51679a.onFragmentDestroy();
                        wy0Var.removeAllViews();
                        wy0Var.f51679a = null;
                        org.telegram.messenger.qs.e().k(268, new Object[0]);
                    }
                    wy0Var.d(false);
                    return;
                }
                return;
            default:
                wy0 wy0Var2 = this.f50855b;
                if (wy0Var2.h != null) {
                    wy0Var2.h = null;
                    wy0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
