package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class w21 extends AnimatorListenerAdapter {
    public final int f42451a;
    public final x21 f42452b;

    public w21(x21 x21Var, int i10) {
        this.f42451a = i10;
        this.f42452b = x21Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42451a) {
            case 0:
                x21 x21Var = this.f42452b;
                if (x21Var.h != null) {
                    x21Var.h = null;
                    x21Var.e = 0.0f;
                    x21Var.g();
                    x21Var.f43003n.unlock();
                    dx dxVar = x21Var.f42999a;
                    if (dxVar != null) {
                        dxVar.onPause();
                        x21Var.f42999a.onFragmentDestroy();
                        x21Var.removeAllViews();
                        x21Var.f42999a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    x21Var.d(false);
                    return;
                }
                return;
            default:
                x21 x21Var2 = this.f42452b;
                if (x21Var2.h != null) {
                    x21Var2.h = null;
                    x21Var2.d(true);
                    return;
                }
                return;
        }
    }
}
