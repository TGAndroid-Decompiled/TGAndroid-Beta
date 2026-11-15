package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ty0 extends AnimatorListenerAdapter {
    public final int f51698a;
    public final uy0 f51699b;

    public ty0(uy0 uy0Var, int i7) {
        this.f51698a = i7;
        this.f51699b = uy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f51698a) {
            case 0:
                uy0 uy0Var = this.f51699b;
                if (uy0Var.h != null) {
                    uy0Var.h = null;
                    uy0Var.f52060e = 0.0f;
                    uy0Var.g();
                    uy0Var.f52062n.e();
                    bw bwVar = uy0Var.f52057a;
                    if (bwVar != null) {
                        bwVar.onPause();
                        uy0Var.f52057a.onFragmentDestroy();
                        uy0Var.removeAllViews();
                        uy0Var.f52057a = null;
                        org.telegram.messenger.ns.e().k(268, new Object[0]);
                    }
                    uy0Var.d(false);
                    return;
                }
                return;
            default:
                uy0 uy0Var2 = this.f51699b;
                if (uy0Var2.h != null) {
                    uy0Var2.h = null;
                    uy0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
