package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final int f37505a;
    public final int f37506b;
    public final Object f37507c;

    public t0(Object obj, int i10, int i11) {
        this.f37505a = i11;
        this.f37507c = obj;
        this.f37506b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37505a) {
            case 0:
                h4 h4Var = (h4) this.f37507c;
                h4Var.f34151u0[1].b();
                h4Var.f34151u0[1].setVisibility(8);
                h4Var.O0.T(h4Var.f34151u0[0].f35311b);
                org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
                l3[] l3VarArr = h4Var.f34151u0;
                q9Var.E0 = l3VarArr[0].d;
                int i10 = this.f37506b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.f34151u0[i10].setLayerType(0, null);
                h4Var.f34152v0 = null;
                h4Var.f34137f0.f19756f = false;
                return;
            case 1:
                ((dv) this.f37507c).f33133c.d.setColorFilter(new PorterDuffColorFilter(this.f37506b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f37507c;
                int i11 = this.f37506b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f37507c).z0(this.f37506b);
                return;
        }
    }
}
