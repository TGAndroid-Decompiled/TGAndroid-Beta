package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

public final class t41 extends AnimatorListenerAdapter {

    public final int f42780a;

    public final boolean f42781b;

    public final a61 f42782c;

    public t41(a61 a61Var, boolean z10, int i10) {
        this.f42780a = i10;
        this.f42782c = a61Var;
        this.f42781b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.f42780a) {
            case 0:
                a61 a61Var = this.f42782c;
                n41 n41Var = a61Var.f36395e0;
                boolean z10 = this.f42781b;
                n41Var.setVisibility(z10 ? 0 : 8);
                a61Var.f36392d0.setVisibility(z10 ? 8 : 0);
                a61Var.A1 = null;
                if (!z10 && (arrayList2 = a61Var.f36435w1) != null) {
                    arrayList2.clear();
                    ArrayList arrayList3 = a61Var.f36443z1;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                    a61Var.m0.E(false);
                }
                if (!z10 && (arrayList = a61Var.f36438x1) != null) {
                    arrayList.clear();
                    break;
                }
                break;
            default:
                a61 a61Var2 = this.f42782c;
                a61Var2.f36398f0.setVisibility((this.f42781b && a61Var2.f36395e0.getVisibility() == 0) ? 0 : 8);
                a61Var2.D1 = null;
                break;
        }
    }
}
