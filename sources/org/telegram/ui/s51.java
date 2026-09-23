package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class s51 extends AnimatorListenerAdapter {
    public final int f37127a;
    public final boolean f37128b;
    public final z61 f37129c;

    public s51(z61 z61Var, boolean z10, int i10) {
        this.f37127a = i10;
        this.f37129c = z61Var;
        this.f37128b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f37127a) {
            case 0:
                z61 z61Var = this.f37129c;
                m51 m51Var = z61Var.f40023i0;
                int i12 = 8;
                boolean z10 = this.f37128b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                m51Var.setVisibility(i10);
                w51 w51Var = z61Var.f40021h0;
                if (!z10) {
                    i12 = 0;
                }
                w51Var.setVisibility(i12);
                z61Var.E1 = null;
                if (!z10 && (arrayList2 = z61Var.A1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = z61Var.D1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    z61Var.f40038q0.E(false);
                }
                if (!z10 && (arrayList = z61Var.B1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                z61 z61Var2 = this.f37129c;
                FrameLayout frameLayout = z61Var2.f40025j0;
                if (this.f37128b && z61Var2.f40023i0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                z61Var2.H1 = null;
                return;
        }
    }
}
