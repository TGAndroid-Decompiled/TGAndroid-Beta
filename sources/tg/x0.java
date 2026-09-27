package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43551a;
    public final z0 f43552b;
    public final boolean f43553c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43551a = i10;
        this.f43552b = z0Var;
        this.f43553c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43551a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43552b;
                ArrayList arrayList = z0Var.f43563g0;
                if (this.f43553c) {
                    z0Var.f43564h0.addAll(list);
                }
                if (z0Var.f43573r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43552b, this.f43553c, (Pair) obj);
                return;
        }
    }
}
