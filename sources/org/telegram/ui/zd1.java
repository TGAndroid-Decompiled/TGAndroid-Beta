package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

public final class zd1 extends f2.b1 {

    public final int f45147a;

    public final we1 f45148b;

    public zd1(we1 we1Var, int i10) {
        this.f45147a = i10;
        this.f45148b = we1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        we1 we1Var;
        jg.e eVar;
        switch (this.f45147a) {
            case 0:
                we1 we1Var2 = this.f45148b;
                int iL0 = we1Var2.B.L0();
                if (iL0 != -1) {
                    f2.o1 o1VarK = recyclerView.K(iL0);
                    int top = o1VarK != null ? o1VarK.f5789a.getTop() : 0;
                    if (iL0 == 0) {
                        int i12 = 0 - top;
                        z10 = top < 0;
                        Math.abs(i12);
                    } else {
                        z10 = iL0 > 0;
                    }
                    we1Var2.G0(z10 || !we1Var2.G, true);
                }
                break;
            case 1:
                this.f45148b.y0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (we1Var = this.f45148b).f43724b1) != null) {
                    eVar.f(i10, i11);
                    we1Var.x0();
                    break;
                }
                break;
        }
    }
}
