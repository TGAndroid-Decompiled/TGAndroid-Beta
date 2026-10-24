package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class v0 implements Utilities.Callback {
    public final int f48212a;
    public final x0 f48213b;
    public final boolean f48214c;

    public v0(x0 x0Var, boolean z10, int i10) {
        this.f48212a = i10;
        this.f48213b = x0Var;
        this.f48214c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48212a) {
            case 0:
                List list = (List) obj;
                x0 x0Var = this.f48213b;
                ArrayList arrayList = x0Var.f48224g0;
                if (this.f48214c) {
                    x0Var.f48225h0.addAll(list);
                }
                if (x0Var.f48234r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    x0Var.b0(true, true);
                    x0Var.X(true);
                    return;
                }
                return;
            default:
                x0.P(this.f48213b, this.f48214c, (Pair) obj);
                return;
        }
    }
}
