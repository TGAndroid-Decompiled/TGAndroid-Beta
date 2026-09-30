package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43507a;
    public final z0 f43508b;
    public final boolean f43509c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43507a = i10;
        this.f43508b = z0Var;
        this.f43509c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43507a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43508b;
                ArrayList arrayList = z0Var.f43519g0;
                if (this.f43509c) {
                    z0Var.f43520h0.addAll(list);
                }
                if (z0Var.f43529r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43508b, this.f43509c, (Pair) obj);
                return;
        }
    }
}
