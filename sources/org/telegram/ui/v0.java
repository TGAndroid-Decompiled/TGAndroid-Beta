package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class v0 extends AnimatorListenerAdapter {
    public final int f41961a;
    public final int f41962b;
    public final Object f41963c;

    public v0(Object obj, int i10, int i11) {
        this.f41961a = i11;
        this.f41963c = obj;
        this.f41962b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41961a) {
            case 0:
                l4 l4Var = (l4) this.f41963c;
                l4Var.f38524r0[1].b();
                l4Var.f38524r0[1].setVisibility(8);
                l4Var.L0.T(l4Var.f38524r0[0].f39862b);
                org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
                p3[] p3VarArr = l4Var.f38524r0;
                m9Var.E0 = p3VarArr[0].d;
                int i10 = this.f41962b;
                p3VarArr[i10].setBackgroundDrawable(null);
                l4Var.f38524r0[i10].setLayerType(0, null);
                l4Var.f38525s0 = null;
                l4Var.f38510c0.f22513f = false;
                return;
            case 1:
                ((cv) this.f41963c).f35862c.d.setColorFilter(new PorterDuffColorFilter(this.f41962b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f41963c;
                int i11 = this.f41962b;
                boolean z4 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z4 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z4);
                return;
            default:
                ((LaunchActivity) this.f41963c).z0(this.f41962b);
                return;
        }
    }
}
