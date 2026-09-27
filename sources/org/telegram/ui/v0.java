package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class v0 extends AnimatorListenerAdapter {
    public final int f38394a;
    public final int f38395b;
    public final Object f38396c;

    public v0(Object obj, int i10, int i11) {
        this.f38394a = i11;
        this.f38396c = obj;
        this.f38395b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38394a) {
            case 0:
                j4 j4Var = (j4) this.f38396c;
                j4Var.f34627u0[1].b();
                j4Var.f34627u0[1].setVisibility(8);
                j4Var.O0.T(j4Var.f34627u0[0].f35795b);
                org.telegram.ui.Cells.q9 q9Var = j4Var.O0;
                n3[] n3VarArr = j4Var.f34627u0;
                q9Var.E0 = n3VarArr[0].d;
                int i10 = this.f38395b;
                n3VarArr[i10].setBackgroundDrawable(null);
                j4Var.f34627u0[i10].setLayerType(0, null);
                j4Var.f34628v0 = null;
                j4Var.f34613f0.f19981f = false;
                return;
            case 1:
                ((bv) this.f38396c).f32444c.d.setColorFilter(new PorterDuffColorFilter(this.f38395b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f38396c;
                int i11 = this.f38395b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f38396c).z0(this.f38395b);
                return;
        }
    }
}
