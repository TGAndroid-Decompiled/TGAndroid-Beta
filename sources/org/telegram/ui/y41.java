package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class y41 extends AnimatorListenerAdapter {
    public final int f45848a;
    public final boolean f45849b;
    public final f61 f45850c;

    public y41(f61 f61Var, boolean z10, int i10) {
        this.f45848a = i10;
        this.f45850c = f61Var;
        this.f45849b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f45848a) {
            case 0:
                f61 f61Var = this.f45850c;
                s41 s41Var = f61Var.f39204i0;
                int i12 = 8;
                boolean z10 = this.f45849b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                s41Var.setVisibility(i10);
                c51 c51Var = f61Var.f39202h0;
                if (!z10) {
                    i12 = 0;
                }
                c51Var.setVisibility(i12);
                f61Var.F1 = null;
                if (!z10 && (arrayList2 = f61Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = f61Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    f61Var.f39219q0.E(false);
                }
                if (!z10 && (arrayList = f61Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                f61 f61Var2 = this.f45850c;
                FrameLayout frameLayout = f61Var2.f39206j0;
                if (this.f45849b && f61Var2.f39204i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                f61Var2.I1 = null;
                return;
        }
    }
}
