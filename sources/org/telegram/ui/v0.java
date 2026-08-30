package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class v0 extends AnimatorListenerAdapter {
    public final int f39031a;
    public final int f39032b;
    public final Object f39033c;

    public v0(Object obj, int i10, int i11) {
        this.f39031a = i11;
        this.f39033c = obj;
        this.f39032b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39031a) {
            case 0:
                l4 l4Var = (l4) this.f39033c;
                l4Var.f35945r0[1].b();
                l4Var.f35945r0[1].setVisibility(8);
                l4Var.L0.T(l4Var.f35945r0[0].f37159b);
                org.telegram.ui.Cells.m9 m9Var = l4Var.L0;
                p3[] p3VarArr = l4Var.f35945r0;
                m9Var.E0 = p3VarArr[0].d;
                int i10 = this.f39032b;
                p3VarArr[i10].setBackgroundDrawable(null);
                l4Var.f35945r0[i10].setLayerType(0, null);
                l4Var.f35946s0 = null;
                l4Var.f35931c0.f20792f = false;
                return;
            case 1:
                ((bv) this.f39033c).f33036c.d.setColorFilter(new PorterDuffColorFilter(this.f39032b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f39033c;
                int i11 = this.f39032b;
                boolean z4 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z4 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z4);
                return;
            default:
                ((LaunchActivity) this.f39033c).z0(this.f39032b);
                return;
        }
    }
}
