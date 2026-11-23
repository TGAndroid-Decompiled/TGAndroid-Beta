package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wy0 extends AnimatorListenerAdapter {
    public final int f53793a;
    public final xy0 f53794b;

    public wy0(xy0 xy0Var, int i7) {
        this.f53793a = i7;
        this.f53794b = xy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53793a) {
            case 0:
                xy0 xy0Var = this.f53794b;
                if (xy0Var.h != null) {
                    xy0Var.h = null;
                    xy0Var.f54122e = 0.0f;
                    xy0Var.g();
                    xy0Var.f54124n.e();
                    dw dwVar = xy0Var.f54119a;
                    if (dwVar != null) {
                        dwVar.onPause();
                        xy0Var.f54119a.onFragmentDestroy();
                        xy0Var.removeAllViews();
                        xy0Var.f54119a = null;
                        org.telegram.messenger.ks.e().k(271, new Object[0]);
                    }
                    xy0Var.d(false);
                    return;
                }
                return;
            default:
                xy0 xy0Var2 = this.f53794b;
                if (xy0Var2.h != null) {
                    xy0Var2.h = null;
                    xy0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
