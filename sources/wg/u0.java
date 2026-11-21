package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
public final class u0 implements x10 {
    public final int f59868a;
    public final w0 f59869b;
    public final boolean f59870c;

    public u0(w0 w0Var, boolean z10, int i7) {
        this.f59868a = i7;
        this.f59869b = w0Var;
        this.f59870c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59868a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f59869b;
                ArrayList arrayList = w0Var.f59877c2;
                if (this.f59870c) {
                    w0Var.d2.addAll(list);
                }
                if (w0Var.f59887n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.o1(true, true);
                    w0Var.k1(true);
                    return;
                }
                return;
            default:
                w0.e1(this.f59869b, this.f59870c, (Pair) obj);
                return;
        }
    }
}
