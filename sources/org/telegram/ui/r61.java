package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class r61 extends AnimatorListenerAdapter {
    public final boolean f37720a;
    public final Runnable f37721b;
    public final boolean[] f37722c;
    public final boolean d;
    public final Runnable e;
    public final t61 f37723f;

    public r61(t61 t61Var, boolean z4, Runnable runnable, boolean[] zArr, boolean z10, Runnable runnable2) {
        this.f37723f = t61Var;
        this.f37720a = z4;
        this.f37721b = runnable;
        this.f37722c = zArr;
        this.d = z10;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        t61 t61Var = this.f37723f;
        n0 n0Var = t61Var.f38398s;
        boolean z4 = this.f37720a;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        t61Var.F = f10;
        AndroidUtilities.lerp(t61Var.f38394c, t61Var.d, f10, t61Var.e);
        n0Var.invalidate();
        if (!z4) {
            t61Var.v.setAlpha(t61Var.F);
        }
        if (t61Var.F < 0.5f && !z4 && (runnable = this.f37721b) != null) {
            boolean[] zArr = this.f37722c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z4) {
            if (this.d) {
                t61Var.f38392a.f33964b = false;
                t61Var.M.f39862e0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        t61Var.H = null;
        n0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
