package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class s81 extends AnimatorListenerAdapter {
    public final boolean f41288a;
    public final int f41289b;
    public final int f41290c;
    public final boolean d;
    public final k91 e;

    public s81(k91 k91Var, boolean z10, int i10, int i11, boolean z11) {
        this.e = k91Var;
        this.f41288a = z10;
        this.f41289b = i10;
        this.f41290c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        k91 k91Var = this.e;
        FrameLayout[] frameLayoutArr = k91Var.M0;
        k91Var.f38764s1 = null;
        int i10 = this.f41290c;
        int i11 = this.f41289b;
        boolean z10 = this.f41288a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = k91Var.f38715b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.y71[] y71VarArr = k91Var.K0;
        if (this.d) {
            c10 = 0;
        }
        y71VarArr[c10].setVisibility(4);
    }
}
