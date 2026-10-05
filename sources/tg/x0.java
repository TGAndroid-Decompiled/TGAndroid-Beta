package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f47128a;
    public final z0 f47129b;
    public final boolean f47130c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f47128a = i10;
        this.f47129b = z0Var;
        this.f47130c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47128a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f47129b;
                ArrayList arrayList = z0Var.f47141g0;
                if (this.f47130c) {
                    z0Var.f47142h0.addAll(list);
                }
                if (z0Var.f47151r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.W(true);
                    return;
                }
                return;
            default:
                z0.N(this.f47129b, this.f47130c, (Pair) obj);
                return;
        }
    }
}
