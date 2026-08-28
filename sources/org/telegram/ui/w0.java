package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends AnimatorListenerAdapter {
    public final int f43619a;
    public final int f43620b;
    public final Object f43621c;

    public w0(Object obj, int i9, int i10) {
        this.f43619a = i10;
        this.f43621c = obj;
        this.f43620b = i9;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43619a) {
            case 0:
                l4 l4Var = (l4) this.f43621c;
                l4Var.f40026q0[1].b();
                l4Var.f40026q0[1].setVisibility(8);
                l4Var.K0.T(l4Var.f40026q0[0].f41320b);
                org.telegram.ui.Cells.n9 n9Var = l4Var.K0;
                p3[] p3VarArr = l4Var.f40026q0;
                n9Var.E0 = p3VarArr[0].d;
                int i9 = this.f43620b;
                p3VarArr[i9].setBackgroundDrawable(null);
                l4Var.f40026q0[i9].setLayerType(0, null);
                l4Var.f40027r0 = null;
                l4Var.f40012b0.f24021f = false;
                return;
            case 1:
                ((su) this.f43621c).f42768c.d.setColorFilter(new PorterDuffColorFilter(this.f43620b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f43621c;
                int i10 = this.f43620b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i10, false);
                if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f43621c).z0(this.f43620b);
                return;
        }
    }
}
