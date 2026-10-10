package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f42331a;
    public final int f42332b;
    public final Object f42333c;

    public u0(Object obj, int i10, int i11) {
        this.f42331a = i11;
        this.f42333c = obj;
        this.f42332b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42331a) {
            case 0:
                i4 i4Var = (i4) this.f42333c;
                i4Var.f38559u0[1].b();
                i4Var.f38559u0[1].setVisibility(8);
                i4Var.O0.S(i4Var.f38559u0[0].f39796b);
                org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f38559u0;
                o9Var.f22623z0 = m3VarArr[0].d;
                int i10 = this.f42332b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f38559u0[i10].setLayerType(0, null);
                i4Var.f38560v0 = null;
                i4Var.f38545f0.f21756f = false;
                return;
            case 1:
                ((cv) this.f42333c).f36787c.d.setColorFilter(new PorterDuffColorFilter(this.f42332b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f42333c;
                int i11 = this.f42332b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f42333c).z0(this.f42332b);
                return;
        }
    }
}
