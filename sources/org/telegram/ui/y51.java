package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y51 extends AnimatorListenerAdapter {
    public final boolean f44748a;
    public final Runnable f44749b;
    public final boolean[] f44750c;
    public final boolean d;
    public final Runnable f44751e;
    public final z51 f44752f;

    public y51(z51 z51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f44752f = z51Var;
        this.f44748a = z10;
        this.f44749b = runnable;
        this.f44750c = zArr;
        this.d = z11;
        this.f44751e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f9;
        Runnable runnable;
        z51 z51Var = this.f44752f;
        n0 n0Var = z51Var.f45081s;
        boolean z10 = this.f44748a;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        z51Var.E = f9;
        AndroidUtilities.lerp(z51Var.f45076c, z51Var.d, f9, z51Var.f45077e);
        n0Var.invalidate();
        if (!z10) {
            z51Var.v.setAlpha(z51Var.E);
        }
        if (z51Var.E < 0.5f && !z10 && (runnable = this.f44749b) != null) {
            boolean[] zArr = this.f44750c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                z51Var.f45074a.f40427b = false;
                z51Var.L.f37326d0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        z51Var.G = null;
        n0Var.invalidate();
        Runnable runnable2 = this.f44751e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
