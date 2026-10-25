package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class v41 extends AnimatorListenerAdapter {
    public final int f44602a;
    public final boolean f44603b;
    public final c61 f44604c;

    public v41(c61 c61Var, boolean z10, int i10) {
        this.f44602a = i10;
        this.f44604c = c61Var;
        this.f44603b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f44602a) {
            case 0:
                c61 c61Var = this.f44604c;
                p41 p41Var = c61Var.f38298i0;
                int i12 = 8;
                boolean z10 = this.f44603b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p41Var.setVisibility(i10);
                z41 z41Var = c61Var.f38296h0;
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
                    c61Var.f38313q0.E(false);
                }
                if (!z10 && (arrayList = c61Var.C1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                c61 c61Var2 = this.f44604c;
                FrameLayout frameLayout = c61Var2.f38300j0;
                if (this.f44603b && c61Var2.f38298i0.getVisibility() == 0) {
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
