package wg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.c20;
public final class u0 implements c20 {
    public final int f57814a;
    public final w0 f57815b;
    public final boolean f57816c;

    public u0(w0 w0Var, boolean z9, int i7) {
        this.f57814a = i7;
        this.f57815b = w0Var;
        this.f57816c = z9;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f57814a) {
            case 0:
                List list = (List) obj;
                w0 w0Var = this.f57815b;
                ArrayList arrayList = w0Var.Y1;
                if (this.f57816c) {
                    w0Var.Z1.addAll(list);
                }
                if (w0Var.f57829j2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    w0Var.n1(true, true);
                    w0Var.j1(true);
                    return;
                }
                return;
            default:
                w0.d1(this.f57815b, this.f57816c, (Pair) obj);
                return;
        }
    }
}
