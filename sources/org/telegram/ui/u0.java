package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f37066a;
    public final int f37067b;
    public final Object f37068c;

    public u0(Object obj, int i10, int i11) {
        this.f37066a = i11;
        this.f37068c = obj;
        this.f37067b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37066a) {
            case 0:
                j4 j4Var = (j4) this.f37068c;
                j4Var.f33920u0[1].b();
                j4Var.f33920u0[1].setVisibility(8);
                j4Var.O0.T(j4Var.f33920u0[0].f35102b);
                org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
                n3[] n3VarArr = j4Var.f33920u0;
                s9Var.E0 = n3VarArr[0].d;
                int i10 = this.f37067b;
                n3VarArr[i10].setBackgroundDrawable(null);
                j4Var.f33920u0[i10].setLayerType(0, null);
                j4Var.f33921v0 = null;
                j4Var.f33906f0.f18842f = false;
                return;
            case 1:
                ((fv) this.f37068c).f32923c.d.setColorFilter(new PorterDuffColorFilter(this.f37067b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f37068c;
                int i11 = this.f37067b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f37068c).z0(this.f37067b);
                return;
        }
    }
}
