package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends AnimatorListenerAdapter {
    public final int f42302a;
    public final int f42303b;
    public final Object f42304c;

    public w0(Object obj, int i10, int i11) {
        this.f42302a = i11;
        this.f42304c = obj;
        this.f42303b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42302a) {
            case 0:
                l4 l4Var = (l4) this.f42304c;
                l4Var.f38725u0[1].b();
                l4Var.f38725u0[1].setVisibility(8);
                l4Var.O0.S(l4Var.f38725u0[0].f39646b);
                org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
                o3[] o3VarArr = l4Var.f38725u0;
                n9Var.f22663z0 = o3VarArr[0].d;
                int i10 = this.f42303b;
                o3VarArr[i10].setBackgroundDrawable(null);
                l4Var.f38725u0[i10].setLayerType(0, null);
                l4Var.f38726v0 = null;
                l4Var.f38711f0.f21927f = false;
                return;
            case 1:
                ((ru) this.f42304c).f40797c.d.setColorFilter(new PorterDuffColorFilter(this.f42303b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f42304c;
                int i11 = this.f42303b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f42304c).D0(this.f42303b);
                return;
        }
    }
}
