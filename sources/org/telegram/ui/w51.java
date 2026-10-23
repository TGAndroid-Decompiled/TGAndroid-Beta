package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w51 extends AnimatorListenerAdapter {
    public final boolean f42929a;
    public final Runnable f42930b;
    public final boolean[] f42931c;
    public final boolean d;
    public final Runnable e;
    public final x51 f42932f;

    public w51(x51 x51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f42932f = x51Var;
        this.f42929a = z10;
        this.f42930b = runnable;
        this.f42931c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        x51 x51Var = this.f42932f;
        l0 l0Var = x51Var.f43505s;
        boolean z10 = this.f42929a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        x51Var.I = f7;
        AndroidUtilities.lerp(x51Var.f43501c, x51Var.d, f7, x51Var.e);
        l0Var.invalidate();
        if (!z10) {
            x51Var.v.setAlpha(x51Var.I);
        }
        if (x51Var.I < 0.5f && !z10 && (runnable = this.f42930b) != null) {
            boolean[] zArr = this.f42931c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                x51Var.f43499a.f38823b = false;
                x51Var.P.f35905h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        x51Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
