package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ue1 extends f2.z0 {
    public final int f38797a;
    public final sf1 f38798b;

    public ue1(sf1 sf1Var, int i10) {
        this.f38797a = i10;
        this.f38798b = sf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z4;
        sf1 sf1Var;
        ng.e eVar;
        switch (this.f38797a) {
            case 0:
                sf1 sf1Var2 = this.f38798b;
                int L0 = sf1Var2.C.L0();
                if (L0 != -1) {
                    f2.l1 K = recyclerView.K(L0);
                    boolean z10 = false;
                    if (K != null) {
                        i12 = K.f5774a.getTop();
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
                this.f38798b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (sf1Var = this.f38798b).f38183c1) != null) {
                    eVar.f(i10, i11);
                    sf1Var.x0();
                    return;
                }
                return;
        }
    }
}
