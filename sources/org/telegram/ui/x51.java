package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x51 extends AnimatorListenerAdapter {
    public final boolean f45659a;
    public final Runnable f45660b;
    public final boolean[] f45661c;
    public final boolean d;
    public final Runnable e;
    public final y51 f45662f;

    public x51(y51 y51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f45662f = y51Var;
        this.f45659a = z10;
        this.f45660b = runnable;
        this.f45661c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        y51 y51Var = this.f45662f;
        k0 k0Var = y51Var.f45965s;
        boolean z10 = this.f45659a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        y51Var.I = f7;
        AndroidUtilities.lerp(y51Var.f45961c, y51Var.d, f7, y51Var.e);
        k0Var.invalidate();
        if (!z10) {
            y51Var.v.setAlpha(y51Var.I);
        }
        if (y51Var.I < 0.5f && !z10 && (runnable = this.f45660b) != null) {
            boolean[] zArr = this.f45661c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                y51Var.f45959a.f41142b = false;
                y51Var.P.f38299h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        y51Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
