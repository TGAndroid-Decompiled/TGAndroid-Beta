package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class u41 extends AnimatorListenerAdapter {
    public final int f43125a;
    public final boolean f43126b;
    public final b61 f43127c;

    public u41(b61 b61Var, boolean z10, int i9) {
        this.f43125a = i9;
        this.f43127c = b61Var;
        this.f43126b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        switch (this.f43125a) {
            case 0:
                b61 b61Var = this.f43127c;
                o41 o41Var = b61Var.f36672e0;
                int i11 = 8;
                boolean z10 = this.f43126b;
                if (z10) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                o41Var.setVisibility(i9);
                y41 y41Var = b61Var.f36669d0;
                if (!z10) {
                    i11 = 0;
                }
                y41Var.setVisibility(i11);
                b61Var.A1 = null;
                if (!z10 && (arrayList2 = b61Var.f36712w1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = b61Var.f36720z1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    b61Var.m0.E(false);
                }
                if (!z10 && (arrayList = b61Var.f36715x1) != null) {
                    arrayList.clear();
                    return;
                }
                return;
            default:
                b61 b61Var2 = this.f43127c;
                FrameLayout frameLayout = b61Var2.f36675f0;
                if (this.f43126b && b61Var2.f36672e0.getVisibility() == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                frameLayout.setVisibility(i10);
                b61Var2.D1 = null;
                return;
        }
    }
}
