package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ze1 extends s4.s0 {
    public final int f43764a;
    public final wf1 f43765b;

    public ze1(wf1 wf1Var, int i10) {
        this.f43764a = i10;
        this.f43765b = wf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        wf1 wf1Var;
        ah.i iVar;
        switch (this.f43764a) {
            case 0:
                wf1 wf1Var2 = this.f43765b;
                int L0 = wf1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f46538a.getTop();
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
                this.f43765b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar = (wf1Var = this.f43765b).f42483f1) != null) {
                    iVar.f(i10, i11);
                    wf1Var.x0();
                    return;
                }
                return;
        }
    }
}
