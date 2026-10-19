package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ud1 extends s4.r0 {
    public final int f41933a;
    public final re1 f41934b;

    public ud1(re1 re1Var, int i10) {
        this.f41933a = i10;
        this.f41934b = re1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        re1 re1Var;
        bh.f fVar;
        switch (this.f41933a) {
            case 0:
                re1 re1Var2 = this.f41934b;
                int L0 = re1Var2.F.L0();
                if (L0 != -1) {
                    s4.b1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f45912a.getTop();
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
                    if (z10 || !re1Var2.K) {
                        z11 = true;
                    }
                    re1Var2.G0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f41934b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (re1Var = this.f41934b).f41157f1) != null) {
                    fVar.f(i10, i11);
                    re1Var.x0();
                    return;
                }
                return;
        }
    }
}
