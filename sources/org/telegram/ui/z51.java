package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class z51 extends AnimatorListenerAdapter {
    public final int f39975a;
    public final boolean f39976b;
    public final g71 f39977c;

    public z51(g71 g71Var, boolean z10, int i10) {
        this.f39975a = i10;
        this.f39977c = g71Var;
        this.f39976b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f39975a) {
            case 0:
                g71 g71Var = this.f39977c;
                t51 t51Var = g71Var.f33730i0;
                int i12 = 8;
                boolean z10 = this.f39976b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                t51Var.setVisibility(i10);
                d61 d61Var = g71Var.f33728h0;
                if (!z10) {
                    i12 = 0;
                }
                d61Var.setVisibility(i12);
                g71Var.E1 = null;
                if (!z10 && (arrayList2 = g71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = g71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    g71Var.f33745q0.E(false);
                }
                if (!z10 && (arrayList = g71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                g71 g71Var2 = this.f39977c;
                FrameLayout frameLayout = g71Var2.f33732j0;
                if (this.f39976b && g71Var2.f33730i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                g71Var2.H1 = null;
                return;
        }
    }
}
