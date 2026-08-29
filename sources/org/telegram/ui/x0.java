package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class x0 extends AnimatorListenerAdapter {
    public final int f44420a;
    public final int f44421b;
    public final Object f44422c;

    public x0(Object obj, int i10, int i11) {
        this.f44420a = i11;
        this.f44422c = obj;
        this.f44421b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44420a) {
            case 0:
                m4 m4Var = (m4) this.f44422c;
                m4Var.f40404q0[1].b();
                m4Var.f40404q0[1].setVisibility(8);
                m4Var.K0.T(m4Var.f40404q0[0].f41513b);
                org.telegram.ui.Cells.k9 k9Var = m4Var.K0;
                q3[] q3VarArr = m4Var.f40404q0;
                k9Var.E0 = q3VarArr[0].d;
                int i10 = this.f44421b;
                q3VarArr[i10].setBackgroundDrawable(null);
                m4Var.f40404q0[i10].setLayerType(0, null);
                m4Var.f40405r0 = null;
                m4Var.f40390b0.f24041f = false;
                return;
            case 1:
                ((tu) this.f44422c).f43098c.d.setColorFilter(new PorterDuffColorFilter(this.f44421b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f44422c;
                int i11 = this.f44421b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f44422c).z0(this.f44421b);
                return;
        }
    }
}
