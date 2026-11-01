package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ra1 extends s4.s0 {
    public final int f41023a;
    public final nb1 f41024b;

    public ra1(nb1 nb1Var, int i10) {
        this.f41023a = i10;
        this.f41024b = nb1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        nb1 nb1Var;
        tg.f fVar;
        switch (this.f41023a) {
            case 0:
                nb1 nb1Var2 = this.f41024b;
                int L0 = nb1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f47909a.getTop();
                    } else {
                        i12 = 0;
                    }
                    if (L0 == 0) {
                        int i13 = 0 - i12;
                        if (i12 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Math.abs(i13);
                    } else if (L0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 || !nb1Var2.K) {
                        z11 = true;
                    }
                    nb1Var2.K0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f41024b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (nb1Var = this.f41024b).f39814g1) != null) {
                    fVar.f(i10, i11);
                    nb1Var.B0();
                    return;
                }
                return;
        }
    }
}
