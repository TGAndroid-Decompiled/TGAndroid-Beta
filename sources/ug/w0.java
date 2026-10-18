package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f47816a;
    public final y0 f47817b;
    public final boolean f47818c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f47816a = i10;
        this.f47817b = y0Var;
        this.f47818c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47816a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f47817b;
                ArrayList arrayList = y0Var.f47828g0;
                if (this.f47818c) {
                    y0Var.f47829h0.addAll(list);
                }
                if (y0Var.f47838r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f47817b, this.f47818c, (Pair) obj);
                return;
        }
    }
}
