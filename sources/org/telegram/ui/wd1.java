package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class wd1 extends s4.r0 {
    public final int f42492a;
    public final te1 f42493b;

    public wd1(te1 te1Var, int i10) {
        this.f42492a = i10;
        this.f42493b = te1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        te1 te1Var;
        bh.f fVar;
        switch (this.f42492a) {
            case 0:
                te1 te1Var2 = this.f42493b;
                int L0 = te1Var2.F.L0();
                if (L0 != -1) {
                    s4.b1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f45910a.getTop();
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
                    if (z10 || !te1Var2.K) {
                        z11 = true;
                    }
                    te1Var2.G0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f42493b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (te1Var = this.f42493b).f41685f1) != null) {
                    fVar.f(i10, i11);
                    te1Var.x0();
                    return;
                }
                return;
        }
    }
}
