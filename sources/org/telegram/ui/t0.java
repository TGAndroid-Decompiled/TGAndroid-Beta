package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class t0 extends AnimatorListenerAdapter {
    public final int f42054a;
    public final int f42055b;
    public final Object f42056c;

    public t0(Object obj, int i10, int i11) {
        this.f42054a = i11;
        this.f42056c = obj;
        this.f42055b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42054a) {
            case 0:
                h4 h4Var = (h4) this.f42056c;
                h4Var.f38319u0[1].b();
                h4Var.f38319u0[1].setVisibility(8);
                h4Var.O0.S(h4Var.f38319u0[0].f39530b);
                org.telegram.ui.Cells.o9 o9Var = h4Var.O0;
                l3[] l3VarArr = h4Var.f38319u0;
                o9Var.f22647z0 = l3VarArr[0].d;
                int i10 = this.f42055b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.f38319u0[i10].setLayerType(0, null);
                h4Var.f38320v0 = null;
                h4Var.f38305f0.f21780f = false;
                return;
            case 1:
                ((bv) this.f42056c).f36496c.d.setColorFilter(new PorterDuffColorFilter(this.f42055b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f42056c;
                int i11 = this.f42055b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f42056c).z0(this.f42055b);
                return;
        }
    }
}
