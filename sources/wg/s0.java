package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
public final class s0 implements z10 {
    public final int f59236a;
    public final u0 f59237b;
    public final boolean f59238c;

    public s0(u0 u0Var, boolean z10, int i7) {
        this.f59236a = i7;
        this.f59237b = u0Var;
        this.f59238c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59236a) {
            case 0:
                List list = (List) obj;
                u0 u0Var = this.f59237b;
                ArrayList arrayList = u0Var.f59245c2;
                if (this.f59238c) {
                    u0Var.d2.addAll(list);
                }
                if (u0Var.f59255n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    u0Var.n1(true, true);
                    u0Var.j1(true);
                    return;
                }
                return;
            default:
                u0.d1(this.f59237b, this.f59238c, (Pair) obj);
                return;
        }
    }
}
