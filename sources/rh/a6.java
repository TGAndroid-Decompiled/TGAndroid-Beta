package rh;

import org.telegram.messenger.at;
import org.telegram.messenger.kj;
import org.telegram.ui.Components.wb;
public final class a6 implements Runnable {
    public final int f46631a;
    public final c6 f46632b;

    public a6(c6 c6Var, int i10) {
        this.f46631a = i10;
        this.f46632b = c6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f46631a;
        c6 c6Var = this.f46632b;
        switch (i10) {
            case 0:
                c6Var.b();
                return;
            case 1:
                c6Var.a();
                return;
            default:
                wb wbVar = c6Var.d;
                e6 e6Var = c6Var.f46743q;
                a6 a6Var = c6Var.f46742p;
                kj kjVar = c6Var.f46731b;
                if (!c6Var.f46738l) {
                    c6Var.f46738l = true;
                    kjVar.f((int) c6Var.f46737k, c6Var.c(), true);
                    long j10 = e6Var.f46867g;
                    int i11 = e6Var.f46863a;
                    e6Var.f46867g = j10 + c6Var.f46737k;
                    at.f(i11).k(221, new Object[0]);
                    c6Var.f46737k = 0L;
                    at.f(i11).k(103, Long.valueOf(kj.B0(kjVar.f16690k)), Integer.valueOf(kjVar.f1()), kjVar.f16690k.reactions);
                }
                if (!c6Var.f46739m) {
                    c6Var.f46739m = true;
                    c6Var.f46733f.f29396b = 5000L;
                    org.telegram.messenger.i0.r(a6Var);
                    org.telegram.messenger.i0.h3(a6Var, 5000L);
                    wbVar.k(true);
                    wbVar.v = a6Var;
                }
                c6Var.e.f29704b.setText(c6Var.d());
                return;
        }
    }
}
