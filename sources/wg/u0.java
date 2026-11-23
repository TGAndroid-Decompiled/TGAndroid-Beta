package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.y10;
public final class u0 implements y10 {
    public final int f59837a;
    public final w0 f59838b;
    public final boolean f59839c;

    public u0(w0 w0Var, boolean z10, int i7) {
        this.f59837a = i7;
        this.f59838b = w0Var;
        this.f59839c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59837a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f59838b;
                ArrayList arrayList = w0Var.f59846c2;
                if (this.f59839c) {
                    w0Var.d2.addAll(list);
                }
                if (w0Var.f59856n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.o1(true, true);
                    w0Var.k1(true);
                    return;
                }
                return;
            default:
                w0.e1(this.f59838b, this.f59839c, (Pair) obj);
                return;
        }
    }
}
