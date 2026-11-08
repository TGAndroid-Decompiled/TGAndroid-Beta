package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class r0 extends AnimatorListenerAdapter {
    public final int f49342a;
    public final int f49343b;
    public final Object f49344c;

    public r0(Object obj, int i7, int i10) {
        this.f49342a = i10;
        this.f49344c = obj;
        this.f49343b = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49342a) {
            case 0:
                g4 g4Var = (g4) this.f49344c;
                g4Var.f45819u0[1].b();
                g4Var.f45819u0[1].setVisibility(8);
                g4Var.P0.S(g4Var.f45819u0[0].f47085b);
                org.telegram.ui.Cells.i9 i9Var = g4Var.P0;
                k3[] k3VarArr = g4Var.f45819u0;
                i9Var.f29327z0 = k3VarArr[0].d;
                int i7 = this.f49343b;
                k3VarArr[i7].setBackgroundDrawable(null);
                g4Var.f45819u0[i7].setLayerType(0, null);
                g4Var.f45820v0 = null;
                g4Var.f45805f0.f28843f = false;
                return;
            case 1:
                Activity activity = (Activity) this.f49344c;
                int i10 = this.f49343b;
                boolean z9 = false;
                org.telegram.messenger.g0.t3(activity, i10, false);
                if (org.telegram.messenger.g0.B(i10) >= 0.721f) {
                    z9 = true;
                }
                org.telegram.messenger.g0.m3(activity, z9);
                return;
            default:
                ((LaunchActivity) this.f49344c).D0(this.f49343b);
                return;
        }
    }
}
