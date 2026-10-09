package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f48425a;
    public final z0 f48426b;
    public final boolean f48427c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f48425a = i10;
        this.f48426b = z0Var;
        this.f48427c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48425a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f48426b;
                ArrayList arrayList = z0Var.f48438g0;
                if (this.f48427c) {
                    z0Var.f48439h0.addAll(list);
                }
                if (z0Var.f48448r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.c0(true, true);
                    z0Var.Y(true);
                    return;
                }
                return;
            default:
                z0.Q(this.f48426b, this.f48427c, (Pair) obj);
                return;
        }
    }
}
