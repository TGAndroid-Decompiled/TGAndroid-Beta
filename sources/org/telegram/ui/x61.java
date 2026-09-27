package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x61 extends AnimatorListenerAdapter {
    public final boolean f39542a;
    public final Runnable f39543b;
    public final boolean[] f39544c;
    public final boolean d;
    public final Runnable e;
    public final y61 f39545f;

    public x61(y61 y61Var, boolean z10, Runnable runnable, boolean[] zArr, boolean z11, Runnable runnable2) {
        this.f39545f = y61Var;
        this.f39542a = z10;
        this.f39543b = runnable;
        this.f39544c = zArr;
        this.d = z11;
        this.e = runnable2;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        Runnable runnable;
        y61 y61Var = this.f39545f;
        l0 l0Var = y61Var.f40146s;
        boolean z10 = this.f39542a;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        y61Var.I = f7;
        AndroidUtilities.lerp(y61Var.f40142c, y61Var.d, f7, y61Var.e);
        l0Var.invalidate();
        if (!z10) {
            y61Var.v.setAlpha(y61Var.I);
        }
        if (y61Var.I < 0.5f && !z10 && (runnable = this.f39543b) != null) {
            boolean[] zArr = this.f39544c;
            if (!zArr[0]) {
                zArr[0] = true;
                runnable.run();
            }
        }
        if (!z10) {
            if (this.d) {
                y61Var.f40140a.f35256b = false;
                y61Var.P.f32585h0.invalidate();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        }
        y61Var.K = null;
        l0Var.invalidate();
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
        }
    }
}
