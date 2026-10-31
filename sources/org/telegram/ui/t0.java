package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41676a;
    public final int f41677b;
    public final Object f41678c;

    public t0(Object obj, int i10, int i11) {
        this.f41676a = i11;
        this.f41678c = obj;
        this.f41677b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41676a) {
            case 0:
                h4 h4Var = (h4) this.f41678c;
                h4Var.f37746u0[1].b();
                h4Var.f37746u0[1].setVisibility(8);
                h4Var.P0.S(h4Var.f37746u0[0].f39038b);
                org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
                l3[] l3VarArr = h4Var.f37746u0;
                k9Var.f22196z0 = l3VarArr[0].d;
                int i10 = this.f41677b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.f37746u0[i10].setLayerType(0, null);
                h4Var.f37747v0 = null;
                h4Var.f37732f0.f21633f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f41678c;
                int i11 = this.f41677b;
                boolean z10 = false;
                org.telegram.messenger.i0.s3(activity, i11, false);
                if (org.telegram.messenger.i0.B(i11) >= 0.721f) {
                    z10 = true;
                }
                org.telegram.messenger.i0.l3(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f41678c).D0(this.f41677b);
                return;
        }
    }
}
