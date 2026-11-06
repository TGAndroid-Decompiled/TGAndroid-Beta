package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
public final class u0 implements c20 {
    public final int f57721a;
    public final w0 f57722b;
    public final boolean f57723c;

    public u0(w0 w0Var, boolean z9, int i7) {
        this.f57721a = i7;
        this.f57722b = w0Var;
        this.f57723c = z9;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f57721a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f57722b;
                ArrayList arrayList = w0Var.Y1;
                if (this.f57723c) {
                    w0Var.Z1.addAll(list);
                }
                if (w0Var.f57736j2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.n1(true, true);
                    w0Var.j1(true);
                    return;
                }
                return;
            default:
                w0.d1(this.f57722b, this.f57723c, (Pair) obj);
                return;
        }
    }
}
