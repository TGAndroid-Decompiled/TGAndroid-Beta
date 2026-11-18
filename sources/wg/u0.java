package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
public final class u0 implements x10 {
    public final int f59827a;
    public final w0 f59828b;
    public final boolean f59829c;

    public u0(w0 w0Var, boolean z10, int i7) {
        this.f59827a = i7;
        this.f59828b = w0Var;
        this.f59829c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59827a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f59828b;
                ArrayList arrayList = w0Var.f59836c2;
                if (this.f59829c) {
                    w0Var.d2.addAll(list);
                }
                if (w0Var.f59846n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.o1(true, true);
                    w0Var.k1(true);
                    return;
                }
                return;
            default:
                w0.e1(this.f59828b, this.f59829c, (Pair) obj);
                return;
        }
    }
}
