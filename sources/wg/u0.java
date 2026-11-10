package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
public final class u0 implements c20 {
    public final int f57810a;
    public final w0 f57811b;
    public final boolean f57812c;

    public u0(w0 w0Var, boolean z9, int i7) {
        this.f57810a = i7;
        this.f57811b = w0Var;
        this.f57812c = z9;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f57810a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f57811b;
                ArrayList arrayList = w0Var.f57818b2;
                if (this.f57812c) {
                    w0Var.f57819c2.addAll(list);
                }
                if (w0Var.f57828m2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.n1(true, true);
                    w0Var.j1(true);
                    return;
                }
                return;
            default:
                w0.d1(this.f57811b, this.f57812c, (Pair) obj);
                return;
        }
    }
}
