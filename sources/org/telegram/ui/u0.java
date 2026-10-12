package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class u0 extends AnimatorListenerAdapter {
    public final int f42324a;
    public final int f42325b;
    public final Object f42326c;

    public u0(Object obj, int i10, int i11) {
        this.f42324a = i11;
        this.f42326c = obj;
        this.f42325b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42324a) {
            case 0:
                i4 i4Var = (i4) this.f42326c;
                i4Var.f38664u0[1].b();
                i4Var.f38664u0[1].setVisibility(8);
                i4Var.O0.S(i4Var.f38664u0[0].f39895b);
                org.telegram.ui.Cells.o9 o9Var = i4Var.O0;
                m3[] m3VarArr = i4Var.f38664u0;
                o9Var.f22383z0 = m3VarArr[0].d;
                int i10 = this.f42325b;
                m3VarArr[i10].setBackgroundDrawable(null);
                i4Var.f38664u0[i10].setLayerType(0, null);
                i4Var.f38665v0 = null;
                i4Var.f38650f0.f21519f = false;
                return;
            case 1:
                ((fv) this.f42326c).f37852c.d.setColorFilter(new PorterDuffColorFilter(this.f42325b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f42326c;
                int i11 = this.f42325b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f42326c).z0(this.f42325b);
                return;
        }
    }
}
