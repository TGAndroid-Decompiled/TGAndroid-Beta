package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class v0 extends AnimatorListenerAdapter {
    public final int f42073a;
    public final int f42074b;
    public final Object f42075c;

    public v0(Object obj, int i10, int i11) {
        this.f42073a = i11;
        this.f42075c = obj;
        this.f42074b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42073a) {
            case 0:
                l4 l4Var = (l4) this.f42075c;
                l4Var.f38619r0[1].b();
                l4Var.f38619r0[1].setVisibility(8);
                l4Var.L0.T(l4Var.f38619r0[0].f39904b);
                org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
                p3[] p3VarArr = l4Var.f38619r0;
                m9Var.E0 = p3VarArr[0].d;
                int i10 = this.f42074b;
                p3VarArr[i10].setBackgroundDrawable(null);
                l4Var.f38619r0[i10].setLayerType(0, null);
                l4Var.f38620s0 = null;
                l4Var.f38605c0.f22511f = false;
                return;
            case 1:
                ((cv) this.f42075c).f35917c.d.setColorFilter(new PorterDuffColorFilter(this.f42074b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f42075c;
                int i11 = this.f42074b;
                boolean z4 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z4 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z4);
                return;
            default:
                ((LaunchActivity) this.f42075c).z0(this.f42074b);
                return;
        }
    }
}
