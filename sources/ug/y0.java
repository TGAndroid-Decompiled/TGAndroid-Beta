package ug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f47230a;
    public final a1 f47231b;
    public final boolean f47232c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f47230a = i10;
        this.f47231b = a1Var;
        this.f47232c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47230a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f47231b;
                ArrayList arrayList = a1Var.f47050g0;
                if (this.f47232c) {
                    a1Var.f47051h0.addAll(list);
                }
                if (a1Var.f47060r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f47231b, this.f47232c, (Pair) obj);
                return;
        }
    }
}
