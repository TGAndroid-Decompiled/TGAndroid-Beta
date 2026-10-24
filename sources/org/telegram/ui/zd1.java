package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class zd1 extends s4.r0 {
    public final int f44079a;
    public final xe1 f44080b;

    public zd1(xe1 xe1Var, int i10) {
        this.f44079a = i10;
        this.f44080b = xe1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        xe1 xe1Var;
        bh.f fVar;
        switch (this.f44079a) {
            case 0:
                xe1 xe1Var2 = this.f44080b;
                int L0 = xe1Var2.F.L0();
                if (L0 != -1) {
                    s4.b1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f46342a.getTop();
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
                    if (z10 || !xe1Var2.K) {
                        z11 = true;
                    }
                    xe1Var2.F0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f44080b.x0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (xe1Var = this.f44080b).f43562g1) != null) {
                    fVar.f(i10, i11);
                    xe1Var.w0();
                    return;
                }
                return;
        }
    }
}
