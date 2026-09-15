package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f43242a;
    public final a1 f43243b;
    public final boolean f43244c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f43242a = i10;
        this.f43243b = a1Var;
        this.f43244c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43242a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f43243b;
                ArrayList arrayList = a1Var.f43070g0;
                if (this.f43244c) {
                    a1Var.f43071h0.addAll(list);
                }
                if (a1Var.f43080r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f43243b, this.f43244c, (Pair) obj);
                return;
        }
    }
}
