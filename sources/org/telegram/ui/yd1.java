package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class yd1 extends f2.d1 {
    public final int f44842a;
    public final we1 f44843b;

    public yd1(we1 we1Var, int i9) {
        this.f44842a = i9;
        this.f44843b = we1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        boolean z10;
        we1 we1Var;
        ig.e eVar;
        switch (this.f44842a) {
            case 0:
                we1 we1Var2 = this.f44843b;
                int L0 = we1Var2.B.L0();
                if (L0 != -1) {
                    f2.q1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i11 = K.f5501a.getTop();
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
                    we1Var2.F0((z10 || !we1Var2.G) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f44843b.x0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (we1Var = this.f44843b).f43746b1) != null) {
                    eVar.f(i9, i10);
                    we1Var.w0();
                    return;
                }
                return;
        }
    }
}
