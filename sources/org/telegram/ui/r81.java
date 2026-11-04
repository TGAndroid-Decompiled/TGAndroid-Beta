package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class r81 extends u4.t0 {
    public final int f49135a;
    public final m91 f49136b;

    public r81(m91 m91Var, int i3) {
        this.f49135a = i3;
        this.f49136b = m91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        int i11;
        boolean z10;
        m91 m91Var;
        eh.g gVar;
        switch (this.f49135a) {
            case 0:
                m91 m91Var2 = this.f49136b;
                int L0 = m91Var2.G.L0();
                if (L0 != -1) {
                    u4.d1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i11 = K.f55540a.getTop();
                    } else {
                        i11 = 0;
                    }
                    if (L0 == 0) {
                        int i12 = 0 - i11;
                        if (i11 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Math.abs(i12);
                    } else if (L0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 || !m91Var2.L) {
                        z11 = true;
                    }
                    m91Var2.K0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f49136b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (m91Var = this.f49136b).f47595h1) != null) {
                    gVar.f(i3, i10);
                    m91Var.B0();
                    return;
                }
                return;
        }
    }
}
