package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class v51 extends AnimatorListenerAdapter {
    public final boolean f42580a;
    public final Runnable f42581b;
    public final boolean[] f42582c;
    public final boolean d;
    public final Runnable e;
    public final w51 f42583f;

    public v51(w51 w51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f42583f = w51Var;
        this.f42580a = z10;
        this.f42581b = runnable;
        this.f42582c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        w51 w51Var = this.f42583f;
        l0 l0Var = w51Var.f42910s;
        boolean z10 = this.f42580a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w51Var.I = f7;
        AndroidUtilities.lerp(w51Var.f42906c, w51Var.d, f7, w51Var.e);
        l0Var.invalidate();
        if (!z10) {
            w51Var.v.setAlpha(w51Var.I);
        }
        if (w51Var.I < 0.5f && !z10 && (runnable = this.f42581b) != null) {
            boolean[] zArr = this.f42582c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                w51Var.f42904a.f38463b = false;
                w51Var.P.f35622h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        w51Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
