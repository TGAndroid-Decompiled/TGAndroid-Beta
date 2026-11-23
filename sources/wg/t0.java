package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.w10;
public final class t0 implements w10 {
    public final int f59932a;
    public final v0 f59933b;
    public final boolean f59934c;

    public t0(v0 v0Var, boolean z10, int i7) {
        this.f59932a = i7;
        this.f59933b = v0Var;
        this.f59934c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59932a) {
            case 0:
                List list = (List) obj;
                v0 v0Var = this.f59933b;
                ArrayList arrayList = v0Var.f59941c2;
                if (this.f59934c) {
                    v0Var.d2.addAll(list);
                }
                if (v0Var.f59951n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    v0Var.o1(true, true);
                    v0Var.k1(true);
                    return;
                }
                return;
            default:
                v0.e1(this.f59933b, this.f59934c, (Pair) obj);
                return;
        }
    }
}
