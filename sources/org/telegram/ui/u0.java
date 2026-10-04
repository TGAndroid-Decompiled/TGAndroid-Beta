package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f41000a;
    public final int f41001b;
    public final Object f41002c;

    public u0(Object obj, int i10, int i11) {
        this.f41000a = i11;
        this.f41002c = obj;
        this.f41001b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41000a) {
            case 0:
                i4 i4Var = (i4) this.f41002c;
                i4Var.f37274u0[1].b();
                i4Var.f37274u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f37274u0[0].f38393b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f37274u0;
                q9Var.E0 = m3VarArr[0].d;
                int i10 = this.f41001b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f37274u0[i10].setLayerType(0, null);
                i4Var.f37275v0 = null;
                i4Var.f37260f0.f21746f = false;
                return;
            case 1:
                ((dv) this.f41002c).f35841c.d.setColorFilter(new PorterDuffColorFilter(this.f41001b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f41002c;
                int i11 = this.f41001b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f41002c).z0(this.f41001b);
                return;
        }
    }
}
