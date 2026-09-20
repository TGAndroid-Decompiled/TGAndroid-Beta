package tg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
public final class x0 implements Utilities.Callback {
    public final int f43520a;
    public final z0 f43521b;
    public final boolean f43522c;

    public x0(z0 z0Var, boolean z10, int i10) {
        this.f43520a = i10;
        this.f43521b = z0Var;
        this.f43522c = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43520a) {
            case 0:
                List list = (List) obj;
                z0 z0Var = this.f43521b;
                ArrayList arrayList = z0Var.f43532g0;
                if (this.f43522c) {
                    z0Var.f43533h0.addAll(list);
                }
                if (z0Var.f43542r0 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    z0Var.b0(true, true);
                    z0Var.X(true);
                    return;
                }
                return;
            default:
                z0.P(this.f43521b, this.f43522c, (Pair) obj);
                return;
        }
    }
}
