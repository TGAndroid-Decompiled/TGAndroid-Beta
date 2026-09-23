package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f37826a;
    public final int f37827b;
    public final Object f37828c;

    public u0(Object obj, int i10, int i11) {
        this.f37826a = i11;
        this.f37828c = obj;
        this.f37827b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37826a) {
            case 0:
                i4 i4Var = (i4) this.f37828c;
                i4Var.f34021u0[1].b();
                i4Var.f34021u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f34021u0[0].f35130b);
                org.telegram.ui.Cells.r9 r9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f34021u0;
                r9Var.E0 = m3VarArr[0].d;
                int i10 = this.f37827b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f34021u0[i10].setLayerType(0, null);
                i4Var.f34022v0 = null;
                i4Var.f34007f0.f19725f = false;
                return;
            case 1:
                ((av) this.f37828c).f31890c.d.setColorFilter(new PorterDuffColorFilter(this.f37827b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f37828c;
                int i11 = this.f37827b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f37828c).z0(this.f37827b);
                return;
        }
    }
}
