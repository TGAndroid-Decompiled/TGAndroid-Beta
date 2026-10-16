package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f46407a;
    public final z0 f46408b;
    public final boolean f46409c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f46407a = i10;
        this.f46408b = z0Var;
        this.f46409c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f46407a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f46408b;
                ArrayList arrayList = z0Var.f46419g0;
                if (this.f46409c) {
                    z0Var.f46420h0.addAll(list);
                }
                if (z0Var.f46429r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.c0(true, true);
                    z0Var.Y(true);
                    return;
                }
                return;
            default:
                z0.Q(this.f46408b, this.f46409c, (Pair) obj);
                return;
        }
    }
}
