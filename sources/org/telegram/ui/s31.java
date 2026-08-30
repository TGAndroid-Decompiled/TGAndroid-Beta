package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class s31 extends AnimatorListenerAdapter {
    public final int f38186a;
    public final t31 f38187b;

    public s31(t31 t31Var, int i10) {
        this.f38186a = i10;
        this.f38187b = t31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38186a) {
            case 0:
                t31 t31Var = this.f38187b;
                if (t31Var.h != null) {
                    t31Var.h = null;
                    t31Var.e = 0.0f;
                    t31Var.g();
                    t31Var.f38532n.unlock();
                    qx qxVar = t31Var.f38528a;
                    if (qxVar != null) {
                        qxVar.onPause();
                        t31Var.f38528a.onFragmentDestroy();
                        t31Var.removeAllViews();
                        t31Var.f38528a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    t31Var.d(false);
                    return;
                }
                return;
            default:
                t31 t31Var2 = this.f38187b;
                if (t31Var2.h != null) {
                    t31Var2.h = null;
                    t31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
