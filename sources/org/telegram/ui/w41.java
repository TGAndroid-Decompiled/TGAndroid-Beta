package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class w41 extends AnimatorListenerAdapter {
    public final int f43834a;
    public final boolean f43835b;
    public final d61 f43836c;

    public w41(d61 d61Var, boolean z10, int i10) {
        this.f43834a = i10;
        this.f43836c = d61Var;
        this.f43835b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        switch (this.f43834a) {
            case 0:
                d61 d61Var = this.f43836c;
                q41 q41Var = d61Var.f37329e0;
                int i12 = 8;
                boolean z10 = this.f43835b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                q41Var.setVisibility(i10);
                a51 a51Var = d61Var.f37326d0;
                if (!z10) {
                    i12 = 0;
                }
                a51Var.setVisibility(i12);
                d61Var.A1 = null;
                if (!z10 && (arrayList2 = d61Var.f37369w1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = d61Var.f37377z1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    d61Var.m0.E(false);
                }
                if (!z10 && (arrayList = d61Var.f37372x1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                d61 d61Var2 = this.f43836c;
                FrameLayout frameLayout = d61Var2.f37332f0;
                if (this.f43835b && d61Var2.f37329e0.getVisibility() == 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                frameLayout.setVisibility(i11);
                d61Var2.D1 = null;
                return;
        }
    }
}
