package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

public final class x0 extends AnimatorListenerAdapter {

    public final int f44229a;

    public final int f44230b;

    public final Object f44231c;

    public x0(Object obj, int i10, int i11) {
        this.f44229a = i11;
        this.f44231c = obj;
        this.f44230b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44229a) {
            case 0:
                m4 m4Var = (m4) this.f44231c;
                m4Var.f40347q0[1].b();
                m4Var.f40347q0[1].setVisibility(8);
                m4Var.K0.T(m4Var.f40347q0[0].f41496b);
                org.telegram.ui.Cells.j9 j9Var = m4Var.K0;
                q3[] q3VarArr = m4Var.f40347q0;
                j9Var.E0 = q3VarArr[0].d;
                int i10 = this.f44230b;
                q3VarArr[i10].setBackgroundDrawable(null);
                m4Var.f40347q0[i10].setLayerType(0, null);
                m4Var.f40348r0 = null;
                m4Var.f40333b0.f24028f = false;
                break;
            case 1:
                ((vu) this.f44231c).f43524c.d.setColorFilter(new PorterDuffColorFilter(this.f44230b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                break;
            case 2:
                Activity activity = (Activity) this.f44231c;
                int i11 = this.f44230b;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f);
                break;
            default:
                ((LaunchActivity) this.f44231c).z0(this.f44230b);
                break;
        }
    }
}
