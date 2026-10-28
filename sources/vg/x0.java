package vg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f50310a;
    public final z0 f50311b;
    public final boolean f50312c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f50310a = i10;
        this.f50311b = z0Var;
        this.f50312c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f50310a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f50311b;
                ArrayList arrayList = z0Var.f50322g0;
                if (this.f50312c) {
                    z0Var.f50323h0.addAll(list);
                }
                if (z0Var.f50332r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f50311b, this.f50312c, (Pair) obj);
                return;
        }
    }
}
