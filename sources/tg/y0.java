package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f43270a;
    public final a1 f43271b;
    public final boolean f43272c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f43270a = i10;
        this.f43271b = a1Var;
        this.f43272c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43270a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f43271b;
                ArrayList arrayList = a1Var.f43097g0;
                if (this.f43272c) {
                    a1Var.f43098h0.addAll(list);
                }
                if (a1Var.f43107r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f43271b, this.f43272c, (Pair) obj);
                return;
        }
    }
}
