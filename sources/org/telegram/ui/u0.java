package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f41063a;
    public final int f41064b;
    public final Object f41065c;

    public u0(Object obj, int i10, int i11) {
        this.f41063a = i11;
        this.f41065c = obj;
        this.f41064b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41063a) {
            case 0:
                i4 i4Var = (i4) this.f41065c;
                i4Var.f37283u0[1].b();
                i4Var.f37283u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f37283u0[0].f38453b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f37283u0;
                q9Var.E0 = m3VarArr[0].d;
                int i10 = this.f41064b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f37283u0[i10].setLayerType(0, null);
                i4Var.f37284v0 = null;
                i4Var.f37269f0.f21755f = false;
                return;
            case 1:
                ((dv) this.f41065c).f35886c.d.setColorFilter(new PorterDuffColorFilter(this.f41064b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f41065c;
                int i11 = this.f41064b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f41065c).z0(this.f41064b);
                return;
        }
    }
}
