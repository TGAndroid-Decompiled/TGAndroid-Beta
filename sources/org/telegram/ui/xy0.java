package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xy0 extends AnimatorListenerAdapter {
    public final int f53986a;
    public final yy0 f53987b;

    public xy0(yy0 yy0Var, int i7) {
        this.f53986a = i7;
        this.f53987b = yy0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53986a) {
            case 0:
                yy0 yy0Var = this.f53987b;
                if (yy0Var.h != null) {
                    yy0Var.h = null;
                    yy0Var.f54337e = 0.0f;
                    yy0Var.g();
                    yy0Var.f54339n.e();
                    ew ewVar = yy0Var.f54334a;
                    if (ewVar != null) {
                        ewVar.onPause();
                        yy0Var.f54334a.onFragmentDestroy();
                        yy0Var.removeAllViews();
                        yy0Var.f54334a = null;
                        org.telegram.messenger.ls.e().k(271, new Object[0]);
                    }
                    yy0Var.d(false);
                    return;
                }
                return;
            default:
                yy0 yy0Var2 = this.f53987b;
                if (yy0Var2.h != null) {
                    yy0Var2.h = null;
                    yy0Var2.d(true);
                    return;
                }
                return;
        }
    }
}
