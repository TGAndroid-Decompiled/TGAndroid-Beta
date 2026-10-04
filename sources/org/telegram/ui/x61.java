package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x61 extends AnimatorListenerAdapter {
    public final boolean f42761a;
    public final Runnable f42762b;
    public final boolean[] f42763c;
    public final boolean d;
    public final Runnable f42764e;
    public final y61 f42765f;

    public x61(y61 y61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f42765f = y61Var;
        this.f42761a = z10;
        this.f42762b = runnable;
        this.f42763c = zArr;
        this.d = z11;
        this.f42764e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        y61 y61Var = this.f42765f;
        k0 k0Var = y61Var.f43083s;
        boolean z10 = this.f42761a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        y61Var.I = f7;
        AndroidUtilities.lerp(y61Var.f43078c, y61Var.d, f7, y61Var.f43079e);
        k0Var.invalidate();
        if (!z10) {
            y61Var.v.setAlpha(y61Var.I);
        }
        if (y61Var.I < 0.5f && !z10 && (runnable = this.f42762b) != null) {
            boolean[] zArr = this.f42763c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                y61Var.f43076a.f38177b = false;
                y61Var.P.f35320h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        y61Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f42764e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
