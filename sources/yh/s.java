package yh;

import android.os.Bundle;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.h10;
public final class s implements Runnable {
    public final int f54530a;
    public final z f54531b;

    public s(z zVar, int i10) {
        this.f54530a = i10;
        this.f54531b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f54530a) {
            case 0:
                z zVar = this.f54531b;
                zVar.f54551r1.d.f31182e3.h1(1, zVar.L1.f7767b);
                zVar.f54543i1.a(false, true);
                zVar.f21611q0 = true;
                h10 h10Var = zVar.f54554u1;
                i0.v1(h10Var.f26635r);
                h10Var.f26635r.clearFocus();
                return;
            case 1:
                z zVar2 = this.f54531b;
                zVar2.f54553t1.d.f31182e3.h1(1, zVar2.L1.f7767b);
                zVar2.f54544j1.a(false, true);
                zVar2.f21611q0 = true;
                h10 h10Var2 = zVar2.f54555v1;
                i0.v1(h10Var2.f26635r);
                h10Var2.f26635r.clearFocus();
                return;
            default:
                z zVar3 = this.f54531b;
                zVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", zVar3.l1);
                zVar3.f54550q1.presentFragment(new l(bundle));
                zVar3.dismiss();
                return;
        }
    }
}
