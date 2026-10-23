package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class v0 extends AnimatorListenerAdapter {
    public final int f42551a;
    public final int f42552b;
    public final Object f42553c;

    public v0(Object obj, int i10, int i11) {
        this.f42551a = i11;
        this.f42553c = obj;
        this.f42552b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42551a) {
            case 0:
                k4 k4Var = (k4) this.f42553c;
                k4Var.f38805u0[1].b();
                k4Var.f38805u0[1].setVisibility(8);
                k4Var.P0.S(k4Var.f38805u0[0].f39752b);
                org.telegram.ui.Cells.o9 o9Var = k4Var.P0;
                n3[] n3VarArr = k4Var.f38805u0;
                o9Var.f22871z0 = n3VarArr[0].d;
                int i10 = this.f42552b;
                n3VarArr[i10].setBackgroundDrawable(null);
                k4Var.f38805u0[i10].setLayerType(0, null);
                k4Var.f38806v0 = null;
                k4Var.f38791f0.f22049f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f42553c;
                int i11 = this.f42552b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f42553c).E0(this.f42552b);
                return;
        }
    }
}
