package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class s41 extends AnimatorListenerAdapter {
    public final int f40891a;
    public final boolean f40892b;
    public final z51 f40893c;

    public s41(z51 z51Var, boolean z10, int i10) {
        this.f40891a = i10;
        this.f40893c = z51Var;
        this.f40892b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f40891a) {
            case 0:
                z51 z51Var = this.f40893c;
                m41 m41Var = z51Var.f43588i0;
                int i12 = 8;
                boolean z10 = this.f40892b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                m41Var.setVisibility(i10);
                w41 w41Var = z51Var.f43586h0;
                if (!z10) {
                    i12 = 0;
                }
                w41Var.setVisibility(i12);
                z51Var.E1 = null;
                if (!z10 && (arrayList2 = z51Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = z51Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    z51Var.f43603q0.E(false);
                }
                if (!z10 && (arrayList = z51Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                z51 z51Var2 = this.f40893c;
                FrameLayout frameLayout = z51Var2.f43590j0;
                if (this.f40892b && z51Var2.f43588i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                z51Var2.H1 = null;
                return;
        }
    }
}
