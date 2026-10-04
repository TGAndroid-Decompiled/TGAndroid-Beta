package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f47121a;
    public final z0 f47122b;
    public final boolean f47123c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f47121a = i10;
        this.f47122b = z0Var;
        this.f47123c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47121a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f47122b;
                ArrayList arrayList = z0Var.f47134g0;
                if (this.f47123c) {
                    z0Var.f47135h0.addAll(list);
                }
                if (z0Var.f47144r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.W(true);
                    return;
                }
                return;
            default:
                z0.N(this.f47122b, this.f47123c, (Pair) obj);
                return;
        }
    }
}
