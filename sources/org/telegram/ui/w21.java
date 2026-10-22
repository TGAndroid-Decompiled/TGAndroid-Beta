package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
public final class w21 extends AnimatorListenerAdapter {
    public final int f42454a;
    public final x21 f42455b;

    public w21(x21 x21Var, int i10) {
        this.f42454a = i10;
        this.f42455b = x21Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42454a) {
            case 0:
                x21 x21Var = this.f42455b;
                if (x21Var.h != null) {
                    x21Var.h = null;
                    x21Var.e = 0.0f;
                    x21Var.g();
                    x21Var.f43006n.unlock();
                    dx dxVar = x21Var.f43002a;
                    if (dxVar != null) {
                        dxVar.onPause();
                        x21Var.f43002a.onFragmentDestroy();
                        x21Var.removeAllViews();
                        x21Var.f43002a = null;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
                    }
                    x21Var.d(false);
                    return;
                }
                return;
            default:
                x21 x21Var2 = this.f42455b;
                if (x21Var2.h != null) {
                    x21Var2.h = null;
                    x21Var2.d(true);
                    return;
                }
                return;
        }
    }
}
