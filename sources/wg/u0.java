package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
public final class u0 implements c20 {
    public final int f57722a;
    public final w0 f57723b;
    public final boolean f57724c;

    public u0(w0 w0Var, boolean z9, int i7) {
        this.f57722a = i7;
        this.f57723b = w0Var;
        this.f57724c = z9;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f57722a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f57723b;
                ArrayList arrayList = w0Var.Y1;
                if (this.f57724c) {
                    w0Var.Z1.addAll(list);
                }
                if (w0Var.f57737j2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.n1(true, true);
                    w0Var.j1(true);
                    return;
                }
                return;
            default:
                w0.d1(this.f57723b, this.f57724c, (Pair) obj);
                return;
        }
    }
}
