package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f47257a;
    public final a1 f47258b;
    public final boolean f47259c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f47257a = i10;
        this.f47258b = a1Var;
        this.f47259c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47257a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f47258b;
                ArrayList arrayList = a1Var.f47077g0;
                if (this.f47259c) {
                    a1Var.f47078h0.addAll(list);
                }
                if (a1Var.f47087r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f47258b, this.f47259c, (Pair) obj);
                return;
        }
    }
}
