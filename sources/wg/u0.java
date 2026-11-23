package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.y10;
public final class u0 implements y10 {
    public final int f59872a;
    public final w0 f59873b;
    public final boolean f59874c;

    public u0(w0 w0Var, boolean z10, int i7) {
        this.f59872a = i7;
        this.f59873b = w0Var;
        this.f59874c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59872a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f59873b;
                ArrayList arrayList = w0Var.f59881c2;
                if (this.f59874c) {
                    w0Var.d2.addAll(list);
                }
                if (w0Var.f59891n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.o1(true, true);
                    w0Var.k1(true);
                    return;
                }
                return;
            default:
                w0.e1(this.f59873b, this.f59874c, (Pair) obj);
                return;
        }
    }
}
