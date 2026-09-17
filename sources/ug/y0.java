package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f47258a;
    public final a1 f47259b;
    public final boolean f47260c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f47258a = i10;
        this.f47259b = a1Var;
        this.f47260c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47258a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f47259b;
                ArrayList arrayList = a1Var.f47078g0;
                if (this.f47260c) {
                    a1Var.f47079h0.addAll(list);
                }
                if (a1Var.f47088r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f47259b, this.f47260c, (Pair) obj);
                return;
        }
    }
}
