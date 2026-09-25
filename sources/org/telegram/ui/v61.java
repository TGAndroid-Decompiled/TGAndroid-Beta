package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class v61 extends AnimatorListenerAdapter {
    public final boolean f38653a;
    public final Runnable f38654b;
    public final boolean[] f38655c;
    public final boolean d;
    public final Runnable e;
    public final w61 f38656f;

    public v61(w61 w61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f38656f = w61Var;
        this.f38653a = z10;
        this.f38654b = runnable;
        this.f38655c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        w61 w61Var = this.f38656f;
        k0 k0Var = w61Var.f38910s;
        boolean z10 = this.f38653a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w61Var.I = f7;
        AndroidUtilities.lerp(w61Var.f38906c, w61Var.d, f7, w61Var.e);
        k0Var.invalidate();
        if (!z10) {
            w61Var.v.setAlpha(w61Var.I);
        }
        if (w61Var.I < 0.5f && !z10 && (runnable = this.f38654b) != null) {
            boolean[] zArr = this.f38655c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                w61Var.f38904a.f34664b = false;
                w61Var.P.f32028h0.invalidate();
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
