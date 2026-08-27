package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class v51 extends AnimatorListenerAdapter {

    public final boolean f43364a;

    public final Runnable f43365b;

    public final boolean[] f43366c;
    public final boolean d;

    public final Runnable f43367e;

    public final w51 f43368f;

    public v51(w51 w51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f43368f = w51Var;
        this.f43364a = z10;
        this.f43365b = runnable;
        this.f43366c = zArr;
        this.d = z11;
        this.f43367e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        Runnable runnable;
        w51 w51Var = this.f43368f;
        n0 n0Var = w51Var.f43617s;
        boolean z10 = this.f43364a;
        float f10 = z10 ? 1.0f : 0.0f;
        w51Var.E = f10;
        AndroidUtilities.lerp(w51Var.f43612c, w51Var.d, f10, w51Var.f43613e);
        n0Var.invalidate();
        if (!z10) {
            w51Var.v.setAlpha(w51Var.E);
        }
        if (w51Var.E < 0.5f && !z10 && (runnable = this.f43365b) != null) {
            boolean[] zArr = this.f43366c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                w51Var.f43610a.f39257b = false;
                w51Var.L.f36392d0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        w51Var.G = null;
        n0Var.invalidate();
        Runnable runnable2 = this.f43367e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
