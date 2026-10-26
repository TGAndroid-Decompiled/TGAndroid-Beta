package vg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f50275a;
    public final z0 f50276b;
    public final boolean f50277c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f50275a = i10;
        this.f50276b = z0Var;
        this.f50277c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50275a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f50276b;
                ArrayList arrayList = z0Var.f50287g0;
                if (this.f50277c) {
                    z0Var.f50288h0.addAll(list);
                }
                if (z0Var.f50297r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f50276b, this.f50277c, (Pair) obj);
                return;
        }
    }
}
