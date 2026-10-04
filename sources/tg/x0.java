package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f47113a;
    public final z0 f47114b;
    public final boolean f47115c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f47113a = i10;
        this.f47114b = z0Var;
        this.f47115c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47113a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f47114b;
                ArrayList arrayList = z0Var.f47126g0;
                if (this.f47115c) {
                    z0Var.f47127h0.addAll(list);
                }
                if (z0Var.f47136r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.W(true);
                    return;
                }
                return;
            default:
                z0.N(this.f47114b, this.f47115c, (Pair) obj);
                return;
        }
    }
}
