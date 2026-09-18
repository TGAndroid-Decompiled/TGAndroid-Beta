package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43476a;
    public final z0 f43477b;
    public final boolean f43478c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43476a = i10;
        this.f43477b = z0Var;
        this.f43478c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43476a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43477b;
                ArrayList arrayList = z0Var.f43488g0;
                if (this.f43478c) {
                    z0Var.f43489h0.addAll(list);
                }
                if (z0Var.f43498r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43477b, this.f43478c, (Pair) obj);
                return;
        }
    }
}
