package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class vc1 extends AnimatorListenerAdapter {
    public final boolean f38687a;
    public final int f38688b;
    public final int f38689c;
    public final boolean d;
    public final od1 e;

    public vc1(od1 od1Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = od1Var;
        this.f38687a = z10;
        this.f38688b = i10;
        this.f38689c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        od1 od1Var = this.e;
        FrameLayout[] frameLayoutArr = od1Var.L0;
        od1Var.f36199r1 = null;
        int i10 = this.f38689c;
        int i11 = this.f38688b;
        boolean z10 = this.f38687a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = od1Var.f36154b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.y81[] y81VarArr = od1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        y81VarArr[c10].setVisibility(4);
    }
}
