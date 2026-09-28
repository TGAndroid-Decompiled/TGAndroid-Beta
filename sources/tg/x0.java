package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43505a;
    public final z0 f43506b;
    public final boolean f43507c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43505a = i10;
        this.f43506b = z0Var;
        this.f43507c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43505a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43506b;
                ArrayList arrayList = z0Var.f43517g0;
                if (this.f43507c) {
                    z0Var.f43518h0.addAll(list);
                }
                if (z0Var.f43527r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43506b, this.f43507c, (Pair) obj);
                return;
        }
    }
}
