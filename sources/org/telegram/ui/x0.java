package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class x0 extends AnimatorListenerAdapter {
    public final int f39795a;
    public final int f39796b;
    public final Object f39797c;

    public x0(Object obj, int i10, int i11) {
        this.f39795a = i11;
        this.f39797c = obj;
        this.f39796b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39795a) {
            case 0:
                n4 n4Var = (n4) this.f39797c;
                n4Var.f36375r0[1].b();
                n4Var.f36375r0[1].setVisibility(8);
                n4Var.L0.T(n4Var.f36375r0[0].f37684b);
                org.telegram.ui.Cells.l9 l9Var = n4Var.L0;
                r3[] r3VarArr = n4Var.f36375r0;
                l9Var.E0 = r3VarArr[0].d;
                int i10 = this.f39796b;
                r3VarArr[i10].setBackgroundDrawable(null);
                n4Var.f36375r0[i10].setLayerType(0, null);
                n4Var.f36376s0 = null;
                n4Var.f36361c0.f20767f = false;
                return;
            case 1:
                ((dv) this.f39797c).f33536c.d.setColorFilter(new PorterDuffColorFilter(this.f39796b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f39797c;
                int i11 = this.f39796b;
                boolean z4 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z4 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z4);
                return;
            default:
                ((LaunchActivity) this.f39797c).z0(this.f39796b);
                return;
        }
    }
}
