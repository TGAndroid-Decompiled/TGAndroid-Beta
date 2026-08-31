package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class u31 extends AnimatorListenerAdapter {
    public final int f41782a;
    public final v31 f41783b;

    public u31(v31 v31Var, int i10) {
        this.f41782a = i10;
        this.f41783b = v31Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41782a) {
            case 0:
                v31 v31Var = this.f41783b;
                if (v31Var.h != null) {
                    v31Var.h = null;
                    v31Var.f42113e = 0.0f;
                    v31Var.g();
                    v31Var.f42115n.unlock();
                    rx rxVar = v31Var.f42110a;
                    if (rxVar != null) {
                        rxVar.onPause();
                        v31Var.f42110a.onFragmentDestroy();
                        v31Var.removeAllViews();
                        v31Var.f42110a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    v31Var.d(false);
                    return;
                }
                return;
            default:
                v31 v31Var2 = this.f41783b;
                if (v31Var2.h != null) {
                    v31Var2.h = null;
                    v31Var2.d(true);
                    return;
                }
                return;
        }
    }
}
