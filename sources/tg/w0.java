package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f48525a;
    public final y0 f48526b;
    public final boolean f48527c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f48525a = i10;
        this.f48526b = y0Var;
        this.f48527c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48525a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f48526b;
                ArrayList arrayList = y0Var.f48538g0;
                if (this.f48527c) {
                    y0Var.f48539h0.addAll(list);
                }
                if (y0Var.f48548r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f48526b, this.f48527c, (Pair) obj);
                return;
        }
    }
}
