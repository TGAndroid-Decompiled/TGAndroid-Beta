package xg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;
public final class u0 implements u10 {
    public final int f58764a;
    public final w0 f58765b;
    public final boolean f58766c;

    public u0(w0 w0Var, boolean z10, int i3) {
        this.f58764a = i3;
        this.f58765b = w0Var;
        this.f58766c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f58764a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f58765b;
                ArrayList arrayList = w0Var.Z1;
                if (this.f58766c) {
                    w0Var.f58771a2.addAll(list);
                }
                if (w0Var.f58780k2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.n1(true, true);
                    w0Var.j1(true);
                    return;
                }
                return;
            default:
                w0.d1(this.f58765b, this.f58766c, (Pair) obj);
                return;
        }
    }
}
