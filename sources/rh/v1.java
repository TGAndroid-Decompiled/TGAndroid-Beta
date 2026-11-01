package rh;

import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.un;
public final class v1 implements Runnable {
    public final int f47573a;
    public final e4 f47574b;
    public final un f47575c;
    public final long d;

    public v1(e4 e4Var, un unVar, long j10, int i10) {
        this.f47573a = i10;
        this.f47574b = e4Var;
        this.f47575c = unVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f47573a;
        long j10 = this.d;
        un unVar = this.f47575c;
        e4 e4Var = this.f47574b;
        switch (i10) {
            case 0:
                wb I = cc.a0(unVar).I(2131624027, dd.L0(2131749906, null), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j10))));
                I.f32211t = true;
                I.j();
                return;
            default:
                wb I2 = cc.a0(unVar).I(2131624027, dd.L0(2131749906, null), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j10))));
                I2.f32211t = true;
                I2.j();
                return;
        }
    }
}
