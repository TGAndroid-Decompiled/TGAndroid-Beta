package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f48491a;
    public final y0 f48492b;
    public final boolean f48493c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f48491a = i10;
        this.f48492b = y0Var;
        this.f48493c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48491a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f48492b;
                ArrayList arrayList = y0Var.f48504g0;
                if (this.f48493c) {
                    y0Var.f48505h0.addAll(list);
                }
                if (y0Var.f48514r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f48492b, this.f48493c, (Pair) obj);
                return;
        }
    }
}
