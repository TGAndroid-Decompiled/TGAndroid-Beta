package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f47771a;
    public final y0 f47772b;
    public final boolean f47773c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f47771a = i10;
        this.f47772b = y0Var;
        this.f47773c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47771a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f47772b;
                ArrayList arrayList = y0Var.f47783g0;
                if (this.f47773c) {
                    y0Var.f47784h0.addAll(list);
                }
                if (y0Var.f47793r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f47772b, this.f47773c, (Pair) obj);
                return;
        }
    }
}
