package yh;

import android.os.Bundle;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.h10;
public final class t implements Runnable {
    public final int f54529a;
    public final a0 f54530b;

    public t(a0 a0Var, int i10) {
        this.f54529a = i10;
        this.f54530b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f54529a) {
            case 0:
                a0 a0Var = this.f54530b;
                a0Var.f54449r1.d.f30818e3.h1(1, a0Var.L1.f7766b);
                a0Var.f54441i1.a(false, true);
                a0Var.f21610q0 = true;
                h10 h10Var = a0Var.f54452u1;
                i0.v1(h10Var.f26588r);
                h10Var.f26588r.clearFocus();
                return;
            case 1:
                a0 a0Var2 = this.f54530b;
                a0Var2.f54451t1.d.f30818e3.h1(1, a0Var2.L1.f7766b);
                a0Var2.f54442j1.a(false, true);
                a0Var2.f21610q0 = true;
                h10 h10Var2 = a0Var2.f54453v1;
                i0.v1(h10Var2.f26588r);
                h10Var2.f26588r.clearFocus();
                return;
            default:
                a0 a0Var3 = this.f54530b;
                a0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", a0Var3.l1);
                a0Var3.f54448q1.presentFragment(new l(bundle));
                a0Var3.dismiss();
                return;
        }
    }
}
