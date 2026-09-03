package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class r61 extends AnimatorListenerAdapter {
    public final boolean f40758a;
    public final Runnable f40759b;
    public final boolean[] f40760c;
    public final boolean d;
    public final Runnable f40761e;
    public final s61 f40762f;

    public r61(s61 s61Var, boolean z4, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f40762f = s61Var;
        this.f40758a = z4;
        this.f40759b = runnable;
        this.f40760c = zArr;
        this.d = z10;
        this.f40761e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        s61 s61Var = this.f40762f;
        l0 l0Var = s61Var.f41036s;
        boolean z4 = this.f40758a;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        s61Var.F = f10;
        AndroidUtilities.lerp(s61Var.f41031c, s61Var.d, f10, s61Var.f41032e);
        l0Var.invalidate();
        if (!z4) {
            s61Var.v.setAlpha(s61Var.F);
        }
        if (s61Var.F < 0.5f && !z4 && (runnable = this.f40759b) != null) {
            boolean[] zArr = this.f40760c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z4) {
            if (this.d) {
                s61Var.f41029a.f36678b = false;
                s61Var.M.f42314e0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        s61Var.H = null;
        l0Var.invalidate();
        Runnable runnable2 = this.f40761e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
