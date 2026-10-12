package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f48632a;
    public final y0 f48633b;
    public final boolean f48634c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f48632a = i10;
        this.f48633b = y0Var;
        this.f48634c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48632a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f48633b;
                ArrayList arrayList = y0Var.f48645g0;
                if (this.f48634c) {
                    y0Var.f48646h0.addAll(list);
                }
                if (y0Var.f48655r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f48633b, this.f48634c, (Pair) obj);
                return;
        }
    }
}
