package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f43193a;
    public final a1 f43194b;
    public final boolean f43195c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f43193a = i10;
        this.f43194b = a1Var;
        this.f43195c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43193a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f43194b;
                ArrayList arrayList = a1Var.f43021g0;
                if (this.f43195c) {
                    a1Var.f43022h0.addAll(list);
                }
                if (a1Var.f43031r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f43194b, this.f43195c, (Pair) obj);
                return;
        }
    }
}
