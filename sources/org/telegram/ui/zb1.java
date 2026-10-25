package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class zb1 extends AnimatorListenerAdapter {
    public final boolean f46246a;
    public final int f46247b;
    public final int f46248c;
    public final boolean d;
    public final tc1 e;

    public zb1(tc1 tc1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = tc1Var;
        this.f46246a = z10;
        this.f46247b = i10;
        this.f46248c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        tc1 tc1Var = this.e;
        FrameLayout[] frameLayoutArr = tc1Var.M0;
        tc1Var.f43785s1 = null;
        int i10 = this.f46248c;
        int i11 = this.f46247b;
        boolean z10 = this.f46246a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = tc1Var.f43736b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.v91[] v91VarArr = tc1Var.K0;
        if (this.d) {
            c10 = 0;
        }
        v91VarArr[c10].setVisibility(4);
    }
}
