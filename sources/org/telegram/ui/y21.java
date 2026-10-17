package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class y21 extends AnimatorListenerAdapter {
    public final int f43315a;
    public final z21 f43316b;

    public y21(z21 z21Var, int i10) {
        this.f43315a = i10;
        this.f43316b = z21Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43315a) {
            case 0:
                z21 z21Var = this.f43316b;
                if (z21Var.h != null) {
                    z21Var.h = null;
                    z21Var.e = 0.0f;
                    z21Var.g();
                    z21Var.f43533n.unlock();
                    fx fxVar = z21Var.f43529a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        z21Var.f43529a.onFragmentDestroy();
                        z21Var.removeAllViews();
                        z21Var.f43529a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    z21Var.d(false);
                    return;
                }
                return;
            default:
                z21 z21Var2 = this.f43316b;
                if (z21Var2.h != null) {
                    z21Var2.h = null;
                    z21Var2.d(true);
                    return;
                }
                return;
        }
    }
}
