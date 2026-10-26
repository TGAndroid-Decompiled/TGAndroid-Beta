package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class v41 extends AnimatorListenerAdapter {
    public final int f44605a;
    public final boolean f44606b;
    public final c61 f44607c;

    public v41(c61 c61Var, boolean z10, int i10) {
        this.f44605a = i10;
        this.f44607c = c61Var;
        this.f44606b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f44605a) {
            case 0:
                c61 c61Var = this.f44607c;
                p41 p41Var = c61Var.f38301i0;
                int i12 = 8;
                boolean z10 = this.f44606b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p41Var.setVisibility(i10);
                z41 z41Var = c61Var.f38299h0;
                if (!z10) {
                    i12 = 0;
                }
                z41Var.setVisibility(i12);
                c61Var.F1 = null;
                if (!z10 && (arrayList2 = c61Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = c61Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    c61Var.f38316q0.E(false);
                }
                if (!z10 && (arrayList = c61Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                c61 c61Var2 = this.f44607c;
                FrameLayout frameLayout = c61Var2.f38303j0;
                if (this.f44606b && c61Var2.f38301i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                c61Var2.I1 = null;
                return;
        }
    }
}
