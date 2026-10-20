package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f47776a;
    public final y0 f47777b;
    public final boolean f47778c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f47776a = i10;
        this.f47777b = y0Var;
        this.f47778c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47776a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f47777b;
                ArrayList arrayList = y0Var.f47788g0;
                if (this.f47778c) {
                    y0Var.f47789h0.addAll(list);
                }
                if (y0Var.f47798r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f47777b, this.f47778c, (Pair) obj);
                return;
        }
    }
}
