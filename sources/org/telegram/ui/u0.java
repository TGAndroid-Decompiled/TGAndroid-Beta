package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f41001a;
    public final int f41002b;
    public final Object f41003c;

    public u0(Object obj, int i10, int i11) {
        this.f41001a = i11;
        this.f41003c = obj;
        this.f41002b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41001a) {
            case 0:
                i4 i4Var = (i4) this.f41003c;
                i4Var.f37275u0[1].b();
                i4Var.f37275u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f37275u0[0].f38394b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f37275u0;
                q9Var.E0 = m3VarArr[0].d;
                int i10 = this.f41002b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f37275u0[i10].setLayerType(0, null);
                i4Var.f37276v0 = null;
                i4Var.f37261f0.f21747f = false;
                return;
            case 1:
                ((dv) this.f41003c).f35842c.d.setColorFilter(new PorterDuffColorFilter(this.f41002b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f41003c;
                int i11 = this.f41002b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f41003c).z0(this.f41002b);
                return;
        }
    }
}
