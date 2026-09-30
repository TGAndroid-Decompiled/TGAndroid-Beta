package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class v61 extends AnimatorListenerAdapter {
    public final boolean f38741a;
    public final Runnable f38742b;
    public final boolean[] f38743c;
    public final boolean d;
    public final Runnable e;
    public final w61 f38744f;

    public v61(w61 w61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f38744f = w61Var;
        this.f38741a = z10;
        this.f38742b = runnable;
        this.f38743c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        w61 w61Var = this.f38744f;
        k0 k0Var = w61Var.f38997s;
        boolean z10 = this.f38741a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w61Var.I = f7;
        AndroidUtilities.lerp(w61Var.f38993c, w61Var.d, f7, w61Var.e);
        k0Var.invalidate();
        if (!z10) {
            w61Var.v.setAlpha(w61Var.I);
        }
        if (w61Var.I < 0.5f && !z10 && (runnable = this.f38742b) != null) {
            boolean[] zArr = this.f38743c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                w61Var.f38991a.f34752b = false;
                w61Var.P.f32101h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        w61Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
