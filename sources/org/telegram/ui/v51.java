package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class v51 extends AnimatorListenerAdapter {
    public final int f41569a;
    public final boolean f41570b;
    public final c71 f41571c;

    public v51(c71 c71Var, boolean z10, int i10) {
        this.f41569a = i10;
        this.f41571c = c71Var;
        this.f41570b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f41569a) {
            case 0:
                c71 c71Var = this.f41571c;
                p51 p51Var = c71Var.f35322i0;
                int i12 = 8;
                boolean z10 = this.f41570b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                p51Var.setVisibility(i10);
                z51 z51Var = c71Var.f35320h0;
                if (!z10) {
                    i12 = 0;
                }
                z51Var.setVisibility(i12);
                c71Var.E1 = null;
                if (!z10 && (arrayList2 = c71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = c71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    c71Var.f35337q0.E(false);
                }
                if (!z10 && (arrayList = c71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                c71 c71Var2 = this.f41571c;
                FrameLayout frameLayout = c71Var2.f35324j0;
                if (this.f41570b && c71Var2.f35322i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                c71Var2.H1 = null;
                return;
        }
    }
}
