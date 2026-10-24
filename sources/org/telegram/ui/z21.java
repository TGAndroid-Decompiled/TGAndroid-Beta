package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class z21 extends AnimatorListenerAdapter {
    public final int f44008a;
    public final a31 f44009b;

    public z21(a31 a31Var, int i10) {
        this.f44008a = i10;
        this.f44009b = a31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44008a) {
            case 0:
                a31 a31Var = this.f44009b;
                if (a31Var.h != null) {
                    a31Var.h = null;
                    a31Var.e = 0.0f;
                    a31Var.g();
                    a31Var.f35565n.unlock();
                    fx fxVar = a31Var.f35561a;
                    if (fxVar != null) {
                        fxVar.onPause();
                        a31Var.f35561a.onFragmentDestroy();
                        a31Var.removeAllViews();
                        a31Var.f35561a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    a31Var.d(false);
                    return;
                }
                return;
            default:
                a31 a31Var2 = this.f44009b;
                if (a31Var2.h != null) {
                    a31Var2.h = null;
                    a31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
