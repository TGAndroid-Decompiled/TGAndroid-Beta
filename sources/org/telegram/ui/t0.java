package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final int f37576a;
    public final int f37577b;
    public final Object f37578c;

    public t0(Object obj, int i10, int i11) {
        this.f37576a = i11;
        this.f37578c = obj;
        this.f37577b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37576a) {
            case 0:
                h4 h4Var = (h4) this.f37578c;
                h4Var.f34114u0[1].b();
                h4Var.f34114u0[1].setVisibility(8);
                h4Var.O0.T(h4Var.f34114u0[0].f35287b);
                org.telegram.ui.Cells.r9 r9Var = h4Var.O0;
                l3[] l3VarArr = h4Var.f34114u0;
                r9Var.E0 = l3VarArr[0].d;
                int i10 = this.f37577b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.f34114u0[i10].setLayerType(0, null);
                h4Var.f34115v0 = null;
                h4Var.f34100f0.f19975f = false;
                return;
            case 1:
                ((ev) this.f37578c).f33408c.d.setColorFilter(new PorterDuffColorFilter(this.f37577b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f37578c;
                int i11 = this.f37577b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f37578c).z0(this.f37577b);
                return;
        }
    }
}
