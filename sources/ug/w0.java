package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f47769a;
    public final y0 f47770b;
    public final boolean f47771c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f47769a = i10;
        this.f47770b = y0Var;
        this.f47771c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47769a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f47770b;
                ArrayList arrayList = y0Var.f47781g0;
                if (this.f47771c) {
                    y0Var.f47782h0.addAll(list);
                }
                if (y0Var.f47791r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f47770b, this.f47771c, (Pair) obj);
                return;
        }
    }
}
