package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class t41 extends AnimatorListenerAdapter {
    public final int f41876a;
    public final boolean f41877b;
    public final a61 f41878c;

    public t41(a61 a61Var, boolean z10, int i10) {
        this.f41876a = i10;
        this.f41878c = a61Var;
        this.f41877b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f41876a) {
            case 0:
                a61 a61Var = this.f41878c;
                n41 n41Var = a61Var.f35624i0;
                int i12 = 8;
                boolean z10 = this.f41877b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                n41Var.setVisibility(i10);
                x41 x41Var = a61Var.f35622h0;
                if (!z10) {
                    i12 = 0;
                }
                x41Var.setVisibility(i12);
                a61Var.F1 = null;
                if (!z10 && (arrayList2 = a61Var.B1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = a61Var.E1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    a61Var.f35639q0.E(false);
                }
                if (!z10 && (arrayList = a61Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                a61 a61Var2 = this.f41878c;
                FrameLayout frameLayout = a61Var2.f35626j0;
                if (this.f41877b && a61Var2.f35624i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                a61Var2.I1 = null;
                return;
        }
    }
}
