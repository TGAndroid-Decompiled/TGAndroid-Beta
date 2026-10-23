package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class v0 implements Utilities.Callback {
    public final int f48213a;
    public final x0 f48214b;
    public final boolean f48215c;

    public v0(x0 x0Var, boolean z10, int i10) {
        this.f48213a = i10;
        this.f48214b = x0Var;
        this.f48215c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48213a) {
            case 0:
                List list = (List) obj;
                x0 x0Var = this.f48214b;
                ArrayList arrayList = x0Var.f48225g0;
                if (this.f48215c) {
                    x0Var.f48226h0.addAll(list);
                }
                if (x0Var.f48235r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    x0Var.b0(true, true);
                    x0Var.X(true);
                    return;
                }
                return;
            default:
                x0.P(this.f48214b, this.f48215c, (Pair) obj);
                return;
        }
    }
}
