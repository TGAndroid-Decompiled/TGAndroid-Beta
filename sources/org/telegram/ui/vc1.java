package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class vc1 extends AnimatorListenerAdapter {
    public final boolean f38689a;
    public final int f38690b;
    public final int f38691c;
    public final boolean d;
    public final od1 e;

    public vc1(od1 od1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = od1Var;
        this.f38689a = z10;
        this.f38690b = i10;
        this.f38691c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        od1 od1Var = this.e;
        FrameLayout[] frameLayoutArr = od1Var.L0;
        od1Var.f36201r1 = null;
        int i10 = this.f38691c;
        int i11 = this.f38690b;
        boolean z10 = this.f38689a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = od1Var.f36156b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.x81[] x81VarArr = od1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        x81VarArr[c10].setVisibility(4);
    }
}
