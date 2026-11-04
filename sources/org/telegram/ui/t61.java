package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
public final class t61 extends AnimatorListenerAdapter {
    public final boolean f49718a;
    public final int f49719b;
    public final int f49720c;
    public final boolean d;
    public final l71 f49721e;

    public t61(l71 l71Var, boolean z10, int i3, int i10, boolean z11) {
        this.f49721e = l71Var;
        this.f49718a = z10;
        this.f49719b = i3;
        this.f49720c = i10;
        this.d = z11;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        l71 l71Var = this.f49721e;
        FrameLayout[] frameLayoutArr = l71Var.N0;
        l71Var.f47196t1 = null;
        int i3 = this.f49720c;
        int i10 = this.f49719b;
        boolean z10 = this.f49718a;
        if (z10 && frameLayoutArr[i10].getVisibility() == 0) {
            frameLayoutArr[i10].setAlpha(1.0f);
            frameLayoutArr[i10].setVisibility(4);
        } else if (!z10) {
            frameLayoutArr[i3].setVisibility(4);
        }
        int i11 = l71Var.f47145b;
        char c2 = 2;
        if (i11 != 1 && i11 != 2) {
            if (i3 == 1) {
                frameLayoutArr[i10].setAlpha(0.0f);
                return;
            }
            return;
        }
        org.telegram.ui.Components.o61[] o61VarArr = l71Var.L0;
        if (this.d) {
            c2 = 0;
        }
        o61VarArr[c2].setVisibility(4);
    }
}
