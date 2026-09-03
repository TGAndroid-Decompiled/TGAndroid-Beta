package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class z31 extends AnimatorListenerAdapter {
    public final int f40392a;
    public final a41 f40393b;

    public z31(a41 a41Var, int i10) {
        this.f40392a = i10;
        this.f40393b = a41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40392a) {
            case 0:
                a41 a41Var = this.f40393b;
                if (a41Var.h != null) {
                    a41Var.h = null;
                    a41Var.e = 0.0f;
                    a41Var.g();
                    a41Var.f32457n.unlock();
                    sx sxVar = a41Var.f32453a;
                    if (sxVar != null) {
                        sxVar.onPause();
                        a41Var.f32453a.onFragmentDestroy();
                        a41Var.removeAllViews();
                        a41Var.f32453a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    a41Var.d(false);
                    return;
                }
                return;
            default:
                a41 a41Var2 = this.f40393b;
                if (a41Var2.h != null) {
                    a41Var2.h = null;
                    a41Var2.d(true);
                    return;
                }
                return;
        }
    }
}
