package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f46408a;
    public final z0 f46409b;
    public final boolean f46410c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f46408a = i10;
        this.f46409b = z0Var;
        this.f46410c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46408a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f46409b;
                ArrayList arrayList = z0Var.f46420g0;
                if (this.f46410c) {
                    z0Var.f46421h0.addAll(list);
                }
                if (z0Var.f46430r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.c0(true, true);
                    z0Var.Y(true);
                    return;
                }
                return;
            default:
                z0.Q(this.f46409b, this.f46410c, (Pair) obj);
                return;
        }
    }
}
