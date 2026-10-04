package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class yc1 extends AnimatorListenerAdapter {
    public final boolean f43133a;
    public final int f43134b;
    public final int f43135c;
    public final boolean d;
    public final rd1 f43136e;

    public yc1(rd1 rd1Var, boolean z10, int i10, int i11, boolean z11) {
        this.f43136e = rd1Var;
        this.f43133a = z10;
        this.f43134b = i10;
        this.f43135c = i11;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        rd1 rd1Var = this.f43136e;
        FrameLayout[] frameLayoutArr = rd1Var.L0;
        rd1Var.f40086r1 = null;
        int i10 = this.f43135c;
        int i11 = this.f43134b;
        boolean z10 = this.f43133a;
        if (z10 && frameLayoutArr[i11].getVisibility() == 0) {
            frameLayoutArr[i11].setAlpha(1.0f);
            frameLayoutArr[i11].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i10].setVisibility(4);
        }
        int i12 = rd1Var.f40040b;
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
