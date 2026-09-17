package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f43265a;
    public final a1 f43266b;
    public final boolean f43267c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f43265a = i10;
        this.f43266b = a1Var;
        this.f43267c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43265a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f43266b;
                ArrayList arrayList = a1Var.f43092g0;
                if (this.f43267c) {
                    a1Var.f43093h0.addAll(list);
                }
                if (a1Var.f43102r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f43266b, this.f43267c, (Pair) obj);
                return;
        }
    }
}
