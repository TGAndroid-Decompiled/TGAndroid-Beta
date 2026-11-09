package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yy0 extends AnimatorListenerAdapter {
    public final int f52360a;
    public final zy0 f52361b;

    public yy0(zy0 zy0Var, int i7) {
        this.f52360a = i7;
        this.f52361b = zy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52360a) {
            case 0:
                zy0 zy0Var = this.f52361b;
                if (zy0Var.h != null) {
                    zy0Var.h = null;
                    zy0Var.f52708e = 0.0f;
                    zy0Var.g();
                    zy0Var.f52710n.e();
                    bw bwVar = zy0Var.f52705a;
                    if (bwVar != null) {
                        bwVar.onPause();
                        zy0Var.f52705a.onFragmentDestroy();
                        zy0Var.removeAllViews();
                        zy0Var.f52705a = null;
                        org.telegram.messenger.qs.e().k(268, new Object[0]);
                    }
                    zy0Var.d(false);
                    return;
                }
                return;
            default:
                zy0 zy0Var2 = this.f52361b;
                if (zy0Var2.h != null) {
                    zy0Var2.h = null;
                    zy0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
