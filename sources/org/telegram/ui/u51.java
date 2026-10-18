package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u51 extends AnimatorListenerAdapter {
    public final boolean f41899a;
    public final Runnable f41900b;
    public final boolean[] f41901c;
    public final boolean d;
    public final Runnable e;
    public final v51 f41902f;

    public u51(v51 v51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f41902f = v51Var;
        this.f41899a = z10;
        this.f41900b = runnable;
        this.f41901c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        v51 v51Var = this.f41902f;
        m0 m0Var = v51Var.f42146s;
        boolean z10 = this.f41899a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v51Var.I = f7;
        AndroidUtilities.lerp(v51Var.f42142c, v51Var.d, f7, v51Var.e);
        m0Var.invalidate();
        if (!z10) {
            v51Var.v.setAlpha(v51Var.I);
        }
        if (v51Var.I < 0.5f && !z10 && (runnable = this.f41900b) != null) {
            boolean[] zArr = this.f41901c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                v51Var.f42140a.f37763b = false;
                v51Var.P.f43622h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        v51Var.K = null;
        m0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
