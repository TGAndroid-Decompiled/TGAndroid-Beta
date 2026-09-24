package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43491a;
    public final z0 f43492b;
    public final boolean f43493c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43491a = i10;
        this.f43492b = z0Var;
        this.f43493c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43491a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43492b;
                ArrayList arrayList = z0Var.f43503g0;
                if (this.f43493c) {
                    z0Var.f43504h0.addAll(list);
                }
                if (z0Var.f43513r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43492b, this.f43493c, (Pair) obj);
                return;
        }
    }
}
