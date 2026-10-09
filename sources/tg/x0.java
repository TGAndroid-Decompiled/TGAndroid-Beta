package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f48427a;
    public final z0 f48428b;
    public final boolean f48429c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f48427a = i10;
        this.f48428b = z0Var;
        this.f48429c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48427a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f48428b;
                ArrayList arrayList = z0Var.f48440g0;
                if (this.f48429c) {
                    z0Var.f48441h0.addAll(list);
                }
                if (z0Var.f48450r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.c0(true, true);
                    z0Var.Y(true);
                    return;
                }
                return;
            default:
                z0.Q(this.f48428b, this.f48429c, (Pair) obj);
                return;
        }
    }
}
