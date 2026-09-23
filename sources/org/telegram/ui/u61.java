package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u61 extends AnimatorListenerAdapter {
    public final boolean f37924a;
    public final Runnable f37925b;
    public final boolean[] f37926c;
    public final boolean d;
    public final Runnable e;
    public final v61 f37927f;

    public u61(v61 v61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f37927f = v61Var;
        this.f37924a = z10;
        this.f37925b = runnable;
        this.f37926c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        v61 v61Var = this.f37927f;
        k0 k0Var = v61Var.f38310s;
        boolean z10 = this.f37924a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v61Var.I = f7;
        AndroidUtilities.lerp(v61Var.f38306c, v61Var.d, f7, v61Var.e);
        k0Var.invalidate();
        if (!z10) {
            v61Var.v.setAlpha(v61Var.I);
        }
        if (v61Var.I < 0.5f && !z10 && (runnable = this.f37925b) != null) {
            boolean[] zArr = this.f37926c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                v61Var.f38304a.f34034b = false;
                v61Var.P.f40021h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        v61Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
