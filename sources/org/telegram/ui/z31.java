package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class z31 extends AnimatorListenerAdapter {
    public final int f43787a;
    public final a41 f43788b;

    public z31(a41 a41Var, int i10) {
        this.f43787a = i10;
        this.f43788b = a41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43787a) {
            case 0:
                a41 a41Var = this.f43788b;
                if (a41Var.h != null) {
                    a41Var.h = null;
                    a41Var.f35015e = 0.0f;
                    a41Var.g();
                    a41Var.f35017n.unlock();
                    rx rxVar = a41Var.f35012a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        a41Var.f35012a.onFragmentDestroy();
                        a41Var.removeAllViews();
                        a41Var.f35012a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    a41Var.d(false);
                    return;
                }
                return;
            default:
                a41 a41Var2 = this.f43788b;
                if (a41Var2.h != null) {
                    a41Var2.h = null;
                    a41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
