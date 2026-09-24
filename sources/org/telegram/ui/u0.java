package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f38243a;
    public final int f38244b;
    public final Object f38245c;

    public u0(Object obj, int i10, int i11) {
        this.f38243a = i11;
        this.f38245c = obj;
        this.f38244b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38243a) {
            case 0:
                i4 i4Var = (i4) this.f38245c;
                i4Var.f34394u0[1].b();
                i4Var.f34394u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f34394u0[0].f35447b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f34394u0;
                q9Var.E0 = m3VarArr[0].d;
                int i10 = this.f38244b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f34394u0[i10].setLayerType(0, null);
                i4Var.f34395v0 = null;
                i4Var.f34380f0.f19965f = false;
                return;
            case 1:
                ((zu) this.f38245c).f40567c.d.setColorFilter(new PorterDuffColorFilter(this.f38244b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f38245c;
                int i11 = this.f38244b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f38245c).z0(this.f38244b);
                return;
        }
    }
}
