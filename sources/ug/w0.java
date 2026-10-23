package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class w0 implements Utilities.Callback {
    public final int f47780a;
    public final y0 f47781b;
    public final boolean f47782c;

    public w0(y0 y0Var, boolean z10, int i10) {
        this.f47780a = i10;
        this.f47781b = y0Var;
        this.f47782c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47780a) {
            case 0:
                List list = (List) obj;
                y0 y0Var = this.f47781b;
                ArrayList arrayList = y0Var.f47792g0;
                if (this.f47782c) {
                    y0Var.f47793h0.addAll(list);
                }
                if (y0Var.f47802r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    y0Var.c0(true, true);
                    y0Var.Y(true);
                    return;
                }
                return;
            default:
                y0.Q(this.f47781b, this.f47782c, (Pair) obj);
                return;
        }
    }
}
