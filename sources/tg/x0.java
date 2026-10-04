package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f47112a;
    public final z0 f47113b;
    public final boolean f47114c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f47112a = i10;
        this.f47113b = z0Var;
        this.f47114c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47112a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f47113b;
                ArrayList arrayList = z0Var.f47125g0;
                if (this.f47114c) {
                    z0Var.f47126h0.addAll(list);
                }
                if (z0Var.f47135r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.W(true);
                    return;
                }
                return;
            default:
                z0.N(this.f47113b, this.f47114c, (Pair) obj);
                return;
        }
    }
}
