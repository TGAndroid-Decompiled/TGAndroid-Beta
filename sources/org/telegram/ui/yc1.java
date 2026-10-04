package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class yc1 extends AnimatorListenerAdapter {
    public final boolean f43126a;
    public final int f43127b;
    public final int f43128c;
    public final boolean d;
    public final rd1 f43129e;

    public yc1(rd1 rd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f43129e = rd1Var;
        this.f43126a = z10;
        this.f43127b = i10;
        this.f43128c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rd1 rd1Var = this.f43129e;
        FrameLayout[] frameLayoutArr = rd1Var.L0;
        rd1Var.f40081r1 = null;
        int i10 = this.f43128c;
        int i11 = this.f43127b;
        boolean z10 = this.f43126a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = rd1Var.f40035b;
        char c10 = 2;
        if (i12 != 1 && i12 != 2) {
            if (i10 == 1) {
                frameLayoutArr[i11].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.h91[] h91VarArr = rd1Var.J0;
        if (this.d) {
            c10 = 0;
        }
        h91VarArr[c10].setVisibility(4);
    }
}
