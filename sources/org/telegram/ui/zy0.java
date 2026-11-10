package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zy0 extends AnimatorListenerAdapter {
    public final int f52710a;
    public final az0 f52711b;

    public zy0(az0 az0Var, int i7) {
        this.f52710a = i7;
        this.f52711b = az0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f52710a) {
            case 0:
                az0 az0Var = this.f52711b;
                if (az0Var.h != null) {
                    az0Var.h = null;
                    az0Var.f43847e = 0.0f;
                    az0Var.g();
                    az0Var.f43849n.e();
                    cw cwVar = az0Var.f43844a;
                    if (cwVar != null) {
                        cwVar.onPause();
                        az0Var.f43844a.onFragmentDestroy();
                        az0Var.removeAllViews();
                        az0Var.f43844a = null;
                        org.telegram.messenger.qs.e().k(268, new Object[0]);
                    }
                    az0Var.d(false);
                    return;
                }
                return;
            default:
                az0 az0Var2 = this.f52711b;
                if (az0Var2.h != null) {
                    az0Var2.h = null;
                    az0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
