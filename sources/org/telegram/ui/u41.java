package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class u41 extends AnimatorListenerAdapter {
    public final int f42165a;
    public final boolean f42166b;
    public final b61 f42167c;

    public u41(b61 b61Var, boolean z10, int i10) {
        this.f42165a = i10;
        this.f42167c = b61Var;
        this.f42166b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f42165a) {
            case 0:
                b61 b61Var = this.f42167c;
                o41 o41Var = b61Var.f35907i0;
                int i12 = 8;
                boolean z10 = this.f42166b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                o41Var.setVisibility(i10);
                y41 y41Var = b61Var.f35905h0;
                if (!z10) {
                    i12 = 0;
                }
                y41Var.setVisibility(i12);
                b61Var.F1 = null;
                if (!z10 && (arrayList2 = b61Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = b61Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    b61Var.f35922q0.E(false);
                }
                if (!z10 && (arrayList = b61Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                b61 b61Var2 = this.f42167c;
                FrameLayout frameLayout = b61Var2.f35909j0;
                if (this.f42166b && b61Var2.f35907i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                b61Var2.I1 = null;
                return;
        }
    }
}
