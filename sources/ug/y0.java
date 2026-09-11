package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f47229a;
    public final a1 f47230b;
    public final boolean f47231c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f47229a = i10;
        this.f47230b = a1Var;
        this.f47231c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47229a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f47230b;
                ArrayList arrayList = a1Var.f47049g0;
                if (this.f47231c) {
                    a1Var.f47050h0.addAll(list);
                }
                if (a1Var.f47059r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f47230b, this.f47231c, (Pair) obj);
                return;
        }
    }
}
