package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class y0 implements Utilities.Callback {
    public final int f43238a;
    public final a1 f43239b;
    public final boolean f43240c;

    public y0(a1 a1Var, boolean z10, int i10) {
        this.f43238a = i10;
        this.f43239b = a1Var;
        this.f43240c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43238a) {
            case 0:
                List list = (List) obj;
                a1 a1Var = this.f43239b;
                ArrayList arrayList = a1Var.f43066g0;
                if (this.f43240c) {
                    a1Var.f43067h0.addAll(list);
                }
                if (a1Var.f43076r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    a1Var.b0(true, true);
                    a1Var.X(true);
                    return;
                }
                return;
            default:
                a1.P(this.f43239b, this.f43240c, (Pair) obj);
                return;
        }
    }
}
