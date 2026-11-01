package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class t0 extends AnimatorListenerAdapter {
    public final int f41497a;
    public final int f41498b;
    public final Object f41499c;

    public t0(Object obj, int i10, int i11) {
        this.f41497a = i11;
        this.f41499c = obj;
        this.f41498b = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41497a) {
            case 0:
                h4 h4Var = (h4) this.f41499c;
                h4Var.f37691u0[1].b();
                h4Var.f37691u0[1].setVisibility(8);
                h4Var.P0.S(h4Var.f37691u0[0].f39061b);
                org.telegram.ui.Cells.k9 k9Var = h4Var.P0;
                l3[] l3VarArr = h4Var.f37691u0;
                k9Var.f22197z0 = l3VarArr[0].d;
                int i10 = this.f41498b;
                l3VarArr[i10].setBackgroundDrawable(null);
                h4Var.f37691u0[i10].setLayerType(0, null);
                h4Var.f37692v0 = null;
                h4Var.f37677f0.f21634f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f41499c;
                int i11 = this.f41498b;
                boolean z10 = false;
                org.telegram.messenger.i0.s3(activity, i11, false);
                if (org.telegram.messenger.i0.B(i11) >= 0.721f) {
                    z10 = true;
                }
                org.telegram.messenger.i0.l3(activity, z10);
                return;
            default:
                ((LaunchActivity) this.f41499c).D0(this.f41498b);
                return;
        }
    }
}
