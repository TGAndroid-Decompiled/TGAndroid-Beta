package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final int f37522a;
    public final int f37523b;
    public final Object f37524c;

    public t0(Object obj, int i10, int i11) {
        this.f37522a = i11;
        this.f37524c = obj;
        this.f37523b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37522a) {
            case 0:
                h4 h4Var = (h4) this.f37524c;
                h4Var.f34074u0[1].b();
                h4Var.f34074u0[1].setVisibility(8);
                h4Var.O0.T(h4Var.f34074u0[0].f35224b);
                org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
                l3[] l3VarArr = h4Var.f34074u0;
                q9Var.E0 = l3VarArr[0].d;
                int i10 = this.f37523b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.f34074u0[i10].setLayerType(0, null);
                h4Var.f34075v0 = null;
                h4Var.f34060f0.f19943f = false;
                return;
            case 1:
                ((ev) this.f37524c).f33364c.d.setColorFilter(new PorterDuffColorFilter(this.f37523b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f37524c;
                int i11 = this.f37523b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f37524c).z0(this.f37523b);
                return;
        }
    }
}
