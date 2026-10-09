package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f42285a;
    public final int f42286b;
    public final Object f42287c;

    public u0(Object obj, int i10, int i11) {
        this.f42285a = i11;
        this.f42287c = obj;
        this.f42286b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42285a) {
            case 0:
                i4 i4Var = (i4) this.f42287c;
                i4Var.f38513u0[1].b();
                i4Var.f38513u0[1].setVisibility(8);
                i4Var.O0.S(i4Var.f38513u0[0].f39750b);
                org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f38513u0;
                o9Var.f22619z0 = m3VarArr[0].d;
                int i10 = this.f42286b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f38513u0[i10].setLayerType(0, null);
                i4Var.f38514v0 = null;
                i4Var.f38499f0.f21752f = false;
                return;
            case 1:
                ((cv) this.f42287c).f36741c.d.setColorFilter(new PorterDuffColorFilter(this.f42286b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f42287c;
                int i11 = this.f42286b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f42287c).z0(this.f42286b);
                return;
        }
    }
}
