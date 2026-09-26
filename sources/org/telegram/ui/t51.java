package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class t51 extends AnimatorListenerAdapter {
    public final int f37970a;
    public final boolean f37971b;
    public final a71 f37972c;

    public t51(a71 a71Var, boolean z10, int i10) {
        this.f37970a = i10;
        this.f37972c = a71Var;
        this.f37971b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f37970a) {
            case 0:
                a71 a71Var = this.f37972c;
                n51 n51Var = a71Var.f32029i0;
                int i12 = 8;
                boolean z10 = this.f37971b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                n51Var.setVisibility(i10);
                x51 x51Var = a71Var.f32027h0;
                if (!z10) {
                    i12 = 0;
                }
                x51Var.setVisibility(i12);
                a71Var.E1 = null;
                if (!z10 && (arrayList2 = a71Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = a71Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    a71Var.f32044q0.E(false);
                }
                if (!z10 && (arrayList = a71Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                a71 a71Var2 = this.f37972c;
                FrameLayout frameLayout = a71Var2.f32031j0;
                if (this.f37971b && a71Var2.f32029i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                a71Var2.H1 = null;
                return;
        }
    }
}
