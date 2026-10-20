package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class s51 extends AnimatorListenerAdapter {
    public final boolean f41370a;
    public final Runnable f41371b;
    public final boolean[] f41372c;
    public final boolean d;
    public final Runnable e;
    public final t51 f41373f;

    public s51(t51 t51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f41373f = t51Var;
        this.f41370a = z10;
        this.f41371b = runnable;
        this.f41372c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        t51 t51Var = this.f41373f;
        m0 m0Var = t51Var.f41601s;
        boolean z10 = this.f41370a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        t51Var.I = f7;
        AndroidUtilities.lerp(t51Var.f41597c, t51Var.d, f7, t51Var.e);
        m0Var.invalidate();
        if (!z10) {
            t51Var.v.setAlpha(t51Var.I);
        }
        if (t51Var.I < 0.5f && !z10 && (runnable = this.f41371b) != null) {
            boolean[] zArr = this.f41372c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                t51Var.f41595a.f37189b = false;
                t51Var.P.f43061h0.invalidate();
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
