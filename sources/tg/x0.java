package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43541a;
    public final z0 f43542b;
    public final boolean f43543c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43541a = i10;
        this.f43542b = z0Var;
        this.f43543c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43541a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43542b;
                ArrayList arrayList = z0Var.f43553g0;
                if (this.f43543c) {
                    z0Var.f43554h0.addAll(list);
                }
                if (z0Var.f43563r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43542b, this.f43543c, (Pair) obj);
                return;
        }
    }
}
