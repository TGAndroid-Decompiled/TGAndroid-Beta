package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ue1 extends f2.a1 {
    public final int f41812a;
    public final sf1 f41813b;

    public ue1(sf1 sf1Var, int i10) {
        this.f41812a = i10;
        this.f41813b = sf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z4;
        sf1 sf1Var;
        og.e eVar;
        switch (this.f41812a) {
            case 0:
                sf1 sf1Var2 = this.f41813b;
                int L0 = sf1Var2.C.L0();
                if (L0 != -1) {
                    f2.m1 K = recyclerView.K(L0);
                    boolean z10 = false;
                    if (K != null) {
                        i12 = K.f5875a.getTop();
                    } else {
                        i12 = 0;
                    }
                    if (L0 == 0) {
                        int i13 = 0 - i12;
                        if (i12 < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Math.abs(i13);
                    } else if (L0 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sf1Var2.G0((z4 || !sf1Var2.H) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f41813b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (sf1Var = this.f41813b).f41196c1) != null) {
                    eVar.f(i10, i11);
                    sf1Var.x0();
                    return;
                }
                return;
        }
    }
}
