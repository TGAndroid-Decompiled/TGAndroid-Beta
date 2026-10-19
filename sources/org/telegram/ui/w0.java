package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends AnimatorListenerAdapter {
    public final int f42415a;
    public final int f42416b;
    public final Object f42417c;

    public w0(Object obj, int i10, int i11) {
        this.f42415a = i11;
        this.f42417c = obj;
        this.f42416b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42415a) {
            case 0:
                l4 l4Var = (l4) this.f42417c;
                l4Var.f38774u0[1].b();
                l4Var.f38774u0[1].setVisibility(8);
                l4Var.O0.S(l4Var.f38774u0[0].f39748b);
                org.telegram.ui.Cells.n9 n9Var = l4Var.O0;
                o3[] o3VarArr = l4Var.f38774u0;
                n9Var.f22666z0 = o3VarArr[0].d;
                int i10 = this.f42416b;
                o3VarArr[i10].setBackgroundDrawable(null);
                l4Var.f38774u0[i10].setLayerType(0, null);
                l4Var.f38775v0 = null;
                l4Var.f38760f0.f21930f = false;
                return;
            case 1:
                ((pu) this.f42417c).f40299c.d.setColorFilter(new PorterDuffColorFilter(this.f42416b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f42417c;
                int i11 = this.f42416b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f42417c).D0(this.f42416b);
                return;
        }
    }
}
