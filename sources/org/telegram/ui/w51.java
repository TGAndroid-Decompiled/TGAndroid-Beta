package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w51 extends AnimatorListenerAdapter {
    public final boolean f43674a;
    public final Runnable f43675b;
    public final boolean[] f43676c;
    public final boolean d;
    public final Runnable f43677e;
    public final x51 f43678f;

    public w51(x51 x51Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f43678f = x51Var;
        this.f43674a = z10;
        this.f43675b = runnable;
        this.f43676c = zArr;
        this.d = z11;
        this.f43677e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        Runnable runnable;
        x51 x51Var = this.f43678f;
        m0 m0Var = x51Var.f44374s;
        boolean z10 = this.f43674a;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        x51Var.E = f10;
        AndroidUtilities.lerp(x51Var.f44369c, x51Var.d, f10, x51Var.f44370e);
        m0Var.invalidate();
        if (!z10) {
            x51Var.v.setAlpha(x51Var.E);
        }
        if (x51Var.E < 0.5f && !z10 && (runnable = this.f43675b) != null) {
            boolean[] zArr = this.f43676c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                x51Var.f44367a.f39711b = false;
                x51Var.L.f36669d0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        x51Var.G = null;
        m0Var.invalidate();
        Runnable runnable2 = this.f43677e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
