package sg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class z0 implements Utilities.Callback {
    public final int f42030a;
    public final c1 f42031b;
    public final boolean f42032c;

    public z0(c1 c1Var, boolean z10, int i10) {
        this.f42030a = i10;
        this.f42031b = c1Var;
        this.f42032c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42030a) {
            case 0:
                List list = (List) obj;
                c1 c1Var = this.f42031b;
                ArrayList arrayList = c1Var.f41885g0;
                if (this.f42032c) {
                    c1Var.f41886h0.addAll(list);
                }
                if (c1Var.f41895r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    c1Var.b0(true, true);
                    c1Var.X(true);
                    return;
                }
                return;
            default:
                c1.P(this.f42031b, this.f42032c, (Pair) obj);
                return;
        }
    }
}
