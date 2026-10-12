package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;
public final class w0 extends AnimatorListenerAdapter {
    public final int f41111a;
    public final int f41112b;
    public final Object f41113c;

    public w0(Object obj, int i10, int i11) {
        this.f41111a = i11;
        this.f41113c = obj;
        this.f41112b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41111a) {
            case 0:
                k4 k4Var = (k4) this.f41113c;
                k4Var.f37557u0[1].b();
                k4Var.f37557u0[1].setVisibility(8);
                k4Var.O0.S(k4Var.f37557u0[0].f38847b);
                org.telegram.ui.Cells.o9 o9Var = k4Var.O0;
                o3[] o3VarArr = k4Var.f37557u0;
                o9Var.f21647z0 = o3VarArr[0].d;
                int i10 = this.f41112b;
                o3VarArr[i10].setBackgroundDrawable(null);
                k4Var.f37557u0[i10].setLayerType(0, null);
                k4Var.f37558v0 = null;
                k4Var.f37543f0.f20868f = false;
                return;
            case 1:
                ((iv) this.f41113c).f37207c.d.setColorFilter(new PorterDuffColorFilter(this.f41112b, PorterDuff.Mode.SRC_IN));
                super.onAnimationEnd(animator);
                return;
            case 2:
                Activity activity = (Activity) this.f41113c;
                int i11 = this.f41112b;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor(activity, i11, false);
                if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.721f) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f41113c).z0(this.f41112b);
                return;
        }
    }
}
