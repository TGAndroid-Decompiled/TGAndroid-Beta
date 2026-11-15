package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ty0 extends AnimatorListenerAdapter {
    public final int f51699a;
    public final uy0 f51700b;

    public ty0(uy0 uy0Var, int i7) {
        this.f51699a = i7;
        this.f51700b = uy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51699a) {
            case 0:
                uy0 uy0Var = this.f51700b;
                if (uy0Var.h != null) {
                    uy0Var.h = null;
                    uy0Var.f52058e = 0.0f;
                    uy0Var.g();
                    uy0Var.f52060n.e();
                    bw bwVar = uy0Var.f52055a;
                    if (bwVar != null) {
                        bwVar.onPause();
                        uy0Var.f52055a.onFragmentDestroy();
                        uy0Var.removeAllViews();
                        uy0Var.f52055a = null;
                        org.telegram.messenger.ns.e().k(268, new Object[0]);
                    }
                    uy0Var.d(false);
                    return;
                }
                return;
            default:
                uy0 uy0Var2 = this.f51700b;
                if (uy0Var2.h != null) {
                    uy0Var2.h = null;
                    uy0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
