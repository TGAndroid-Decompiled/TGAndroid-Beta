package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends AnimatorListenerAdapter {
    public final int f40812a;
    public final int f40813b;
    public final Object f40814c;

    public w0(Object obj, int i10, int i11) {
        this.f40812a = i11;
        this.f40814c = obj;
        this.f40813b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40812a) {
            case 0:
                k4 k4Var = (k4) this.f40814c;
                k4Var.f37278u0[1].b();
                k4Var.f37278u0[1].setVisibility(8);
                k4Var.O0.S(k4Var.f37278u0[0].f38529b);
                org.telegram.ui.Cells.o9 o9Var = k4Var.O0;
                o3[] o3VarArr = k4Var.f37278u0;
                o9Var.f21364z0 = o3VarArr[0].d;
                int i10 = this.f40813b;
                o3VarArr[i10].setBackgroundDrawable(null);
                k4Var.f37278u0[i10].setLayerType(0, null);
                k4Var.f37279v0 = null;
                k4Var.f37264f0.f20568f = false;
                return;
            case 1:
                ((iv) this.f40814c).f36873c.d.setColorFilter(new PorterDuffColorFilter(this.f40813b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f40814c;
                int i11 = this.f40813b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f40814c).z0(this.f40813b);
                return;
        }
    }
}
