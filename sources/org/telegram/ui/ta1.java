package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ta1 extends s4.s0 {
    public final int f41784a;
    public final pb1 f41785b;

    public ta1(pb1 pb1Var, int i10) {
        this.f41784a = i10;
        this.f41785b = pb1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        pb1 pb1Var;
        tg.f fVar;
        switch (this.f41784a) {
            case 0:
                pb1 pb1Var2 = this.f41785b;
                int L0 = pb1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f47898a.getTop();
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
                    if (z10 || !pb1Var2.K) {
                        z11 = true;
                    }
                    pb1Var2.J0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f41785b.B0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (pb1Var = this.f41785b).f40583g1) != null) {
                    fVar.f(i10, i11);
                    pb1Var.A0();
                    return;
                }
                return;
        }
    }
}
