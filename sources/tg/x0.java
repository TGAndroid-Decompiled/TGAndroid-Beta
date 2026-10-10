package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f48471a;
    public final z0 f48472b;
    public final boolean f48473c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f48471a = i10;
        this.f48472b = z0Var;
        this.f48473c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48471a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f48472b;
                ArrayList arrayList = z0Var.f48484g0;
                if (this.f48473c) {
                    z0Var.f48485h0.addAll(list);
                }
                if (z0Var.f48494r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.c0(true, true);
                    z0Var.Y(true);
                    return;
                }
                return;
            default:
                z0.Q(this.f48472b, this.f48473c, (Pair) obj);
                return;
        }
    }
}
