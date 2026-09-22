package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final int f37515a;
    public final int f37516b;
    public final Object f37517c;

    public t0(Object obj, int i10, int i11) {
        this.f37515a = i11;
        this.f37517c = obj;
        this.f37516b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37515a) {
            case 0:
                h4 h4Var = (h4) this.f37517c;
                h4Var.f34090u0[1].b();
                h4Var.f34090u0[1].setVisibility(8);
                h4Var.O0.T(h4Var.f34090u0[0].f35307b);
                org.telegram.ui.Cells.q9 q9Var = h4Var.O0;
                l3[] l3VarArr = h4Var.f34090u0;
                q9Var.E0 = l3VarArr[0].d;
                int i10 = this.f37516b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.f34090u0[i10].setLayerType(0, null);
                h4Var.f34091v0 = null;
                h4Var.f34076f0.f19752f = false;
                return;
            case 1:
                ((dv) this.f37517c).f33095c.d.setColorFilter(new PorterDuffColorFilter(this.f37516b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f37517c;
                int i11 = this.f37516b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f37517c).z0(this.f37516b);
                return;
        }
    }
}
