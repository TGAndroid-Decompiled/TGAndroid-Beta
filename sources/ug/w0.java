package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f47779a;
    public final y0 f47780b;
    public final boolean f47781c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f47779a = i10;
        this.f47780b = y0Var;
        this.f47781c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47779a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f47780b;
                ArrayList arrayList = y0Var.f47791g0;
                if (this.f47781c) {
                    y0Var.f47792h0.addAll(list);
                }
                if (y0Var.f47801r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f47780b, this.f47781c, (Pair) obj);
                return;
        }
    }
}
