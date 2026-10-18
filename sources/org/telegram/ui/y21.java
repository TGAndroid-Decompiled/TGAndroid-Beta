package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class y21 extends AnimatorListenerAdapter {
    public final int f43339a;
    public final z21 f43340b;

    public y21(z21 z21Var, int i10) {
        this.f43339a = i10;
        this.f43340b = z21Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43339a) {
            case 0:
                z21 z21Var = this.f43340b;
                if (z21Var.h != null) {
                    z21Var.h = null;
                    z21Var.e = 0.0f;
                    z21Var.g();
                    z21Var.f43559n.unlock();
                    fx fxVar = z21Var.f43555a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        z21Var.f43555a.onFragmentDestroy();
                        z21Var.removeAllViews();
                        z21Var.f43555a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    z21Var.d(false);
                    return;
                }
                return;
            default:
                z21 z21Var2 = this.f43340b;
                if (z21Var2.h != null) {
                    z21Var2.h = null;
                    z21Var2.d(true);
                    return;
                }
                return;
        }
    }
}
