package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f38263a;
    public final int f38264b;
    public final Object f38265c;

    public u0(Object obj, int i10, int i11) {
        this.f38263a = i11;
        this.f38265c = obj;
        this.f38264b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38263a) {
            case 0:
                i4 i4Var = (i4) this.f38265c;
                i4Var.f34408u0[1].b();
                i4Var.f34408u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f34408u0[0].f35461b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f34408u0;
                q9Var.E0 = m3VarArr[0].d;
                int i10 = this.f38264b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f34408u0[i10].setLayerType(0, null);
                i4Var.f34409v0 = null;
                i4Var.f34394f0.f19980f = false;
                return;
            case 1:
                ((zu) this.f38265c).f40582c.d.setColorFilter(new PorterDuffColorFilter(this.f38264b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f38265c;
                int i11 = this.f38264b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f38265c).z0(this.f38264b);
                return;
        }
    }
}
