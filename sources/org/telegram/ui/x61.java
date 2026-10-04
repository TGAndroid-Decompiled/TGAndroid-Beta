package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x61 extends AnimatorListenerAdapter {
    public final boolean f42754a;
    public final Runnable f42755b;
    public final boolean[] f42756c;
    public final boolean d;
    public final Runnable f42757e;
    public final y61 f42758f;

    public x61(y61 y61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f42758f = y61Var;
        this.f42754a = z10;
        this.f42755b = runnable;
        this.f42756c = zArr;
        this.d = z11;
        this.f42757e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        y61 y61Var = this.f42758f;
        k0 k0Var = y61Var.f43076s;
        boolean z10 = this.f42754a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        y61Var.I = f7;
        AndroidUtilities.lerp(y61Var.f43071c, y61Var.d, f7, y61Var.f43072e);
        k0Var.invalidate();
        if (!z10) {
            y61Var.v.setAlpha(y61Var.I);
        }
        if (y61Var.I < 0.5f && !z10 && (runnable = this.f42755b) != null) {
            boolean[] zArr = this.f42756c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                y61Var.f43069a.f38172b = false;
                y61Var.P.f35315h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        y61Var.K = null;
        k0Var.invalidate();
        Runnable runnable2 = this.f42757e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
