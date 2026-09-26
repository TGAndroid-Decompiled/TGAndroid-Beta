package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f38261a;
    public final int f38262b;
    public final Object f38263c;

    public u0(Object obj, int i10, int i11) {
        this.f38261a = i11;
        this.f38263c = obj;
        this.f38262b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38261a) {
            case 0:
                i4 i4Var = (i4) this.f38263c;
                i4Var.f34406u0[1].b();
                i4Var.f34406u0[1].setVisibility(8);
                i4Var.O0.T(i4Var.f34406u0[0].f35459b);
                org.telegram.ui.Cells.q9 q9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f34406u0;
                q9Var.E0 = m3VarArr[0].d;
                int i10 = this.f38262b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f34406u0[i10].setLayerType(0, null);
                i4Var.f34407v0 = null;
                i4Var.f34392f0.f19979f = false;
                return;
            case 1:
                ((zu) this.f38263c).f40580c.d.setColorFilter(new PorterDuffColorFilter(this.f38262b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f38263c;
                int i11 = this.f38262b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f38263c).z0(this.f38262b);
                return;
        }
    }
}
