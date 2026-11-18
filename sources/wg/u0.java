package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.x10;
public final class u0 implements x10 {
    public final int f59826a;
    public final w0 f59827b;
    public final boolean f59828c;

    public u0(w0 w0Var, boolean z10, int i7) {
        this.f59826a = i7;
        this.f59827b = w0Var;
        this.f59828c = z10;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59826a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f59827b;
                ArrayList arrayList = w0Var.f59835c2;
                if (this.f59828c) {
                    w0Var.d2.addAll(list);
                }
                if (w0Var.f59845n2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.o1(true, true);
                    w0Var.k1(true);
                    return;
                }
                return;
            default:
                w0.e1(this.f59827b, this.f59828c, (Pair) obj);
                return;
        }
    }
}
