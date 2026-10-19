package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class s51 extends AnimatorListenerAdapter {
    public final boolean f41364a;
    public final Runnable f41365b;
    public final boolean[] f41366c;
    public final boolean d;
    public final Runnable e;
    public final t51 f41367f;

    public s51(t51 t51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f41367f = t51Var;
        this.f41364a = z10;
        this.f41365b = runnable;
        this.f41366c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        t51 t51Var = this.f41367f;
        m0 m0Var = t51Var.f41595s;
        boolean z10 = this.f41364a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        t51Var.I = f7;
        AndroidUtilities.lerp(t51Var.f41591c, t51Var.d, f7, t51Var.e);
        m0Var.invalidate();
        if (!z10) {
            t51Var.v.setAlpha(t51Var.I);
        }
        if (t51Var.I < 0.5f && !z10 && (runnable = this.f41365b) != null) {
            boolean[] zArr = this.f41366c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                t51Var.f41589a.f37183b = false;
                t51Var.P.f43055h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        t51Var.K = null;
        m0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
