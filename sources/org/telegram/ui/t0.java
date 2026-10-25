package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final int f43633a;
    public final int f43634b;
    public final Object f43635c;

    public t0(Object obj, int i10, int i11) {
        this.f43633a = i11;
        this.f43635c = obj;
        this.f43634b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43633a) {
            case 0:
                j4 j4Var = (j4) this.f43635c;
                j4Var.f40446u0[1].b();
                j4Var.f40446u0[1].setVisibility(8);
                j4Var.P0.S(j4Var.f40446u0[0].f41440b);
                org.telegram.ui.Cells.s9 s9Var = j4Var.P0;
                m3[] m3VarArr = j4Var.f40446u0;
                s9Var.f25418z0 = m3VarArr[0].d;
                int i10 = this.f43634b;
                m3VarArr[i10].setBackgroundDrawable(null);
                j4Var.f40446u0[i10].setLayerType(0, null);
                j4Var.f40447v0 = null;
                j4Var.f40432f0.f23813f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f43635c;
                int i11 = this.f43634b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f43635c).E0(this.f43634b);
                return;
        }
    }
}
