package vg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f50272a;
    public final z0 f50273b;
    public final boolean f50274c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f50272a = i10;
        this.f50273b = z0Var;
        this.f50274c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50272a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f50273b;
                ArrayList arrayList = z0Var.f50284g0;
                if (this.f50274c) {
                    z0Var.f50285h0.addAll(list);
                }
                if (z0Var.f50294r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f50273b, this.f50274c, (Pair) obj);
                return;
        }
    }
}
