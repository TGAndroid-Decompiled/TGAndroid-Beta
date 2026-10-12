package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f48667a;
    public final z0 f48668b;
    public final boolean f48669c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f48667a = i10;
        this.f48668b = z0Var;
        this.f48669c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48667a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f48668b;
                ArrayList arrayList = z0Var.f48679g0;
                if (this.f48669c) {
                    z0Var.f48680h0.addAll(list);
                }
                if (z0Var.f48689r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.c0(true, true);
                    z0Var.Y(true);
                    return;
                }
                return;
            default:
                z0.Q(this.f48668b, this.f48669c, (Pair) obj);
                return;
        }
    }
}
