package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ze1 extends s4.s0 {
    public final int f40439a;
    public final wf1 f40440b;

    public ze1(wf1 wf1Var, int i10) {
        this.f40439a = i10;
        this.f40440b = wf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        wf1 wf1Var;
        ah.h hVar;
        switch (this.f40439a) {
            case 0:
                wf1 wf1Var2 = this.f40440b;
                int L0 = wf1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f42946a.getTop();
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
                    wf1Var2.G0((z10 || !wf1Var2.K) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f40440b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar = (wf1Var = this.f40440b).f39308f1) != null) {
                    hVar.f(i10, i11);
                    wf1Var.x0();
                    return;
                }
                return;
        }
    }
}
