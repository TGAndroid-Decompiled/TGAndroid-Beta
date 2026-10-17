package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class v0 implements Utilities.Callback {
    public final int f47788a;
    public final x0 f47789b;
    public final boolean f47790c;

    public v0(x0 x0Var, boolean z10, int i10) {
        this.f47788a = i10;
        this.f47789b = x0Var;
        this.f47790c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47788a) {
            case 0:
                List list = (List) obj;
                x0 x0Var = this.f47789b;
                ArrayList arrayList = x0Var.f47800g0;
                if (this.f47790c) {
                    x0Var.f47801h0.addAll(list);
                }
                if (x0Var.f47810r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    x0Var.c0(true, true);
                    x0Var.Y(true);
                    return;
                }
                return;
            default:
                x0.Q(this.f47789b, this.f47790c, (Pair) obj);
                return;
        }
    }
}
