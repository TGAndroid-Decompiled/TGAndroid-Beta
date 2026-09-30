package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43613a;
    public final z0 f43614b;
    public final boolean f43615c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43613a = i10;
        this.f43614b = z0Var;
        this.f43615c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43613a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43614b;
                ArrayList arrayList = z0Var.f43625g0;
                if (this.f43615c) {
                    z0Var.f43626h0.addAll(list);
                }
                if (z0Var.f43635r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43614b, this.f43615c, (Pair) obj);
                return;
        }
    }
}
