package rh;

import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.un;
public final class v1 implements Runnable {
    public final int f47566a;
    public final e4 f47567b;
    public final un f47568c;
    public final long d;

    public v1(e4 e4Var, un unVar, long j10, int i10) {
        this.f47566a = i10;
        this.f47567b = e4Var;
        this.f47568c = unVar;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f47566a;
        long j10 = this.d;
        un unVar = this.f47568c;
        e4 e4Var = this.f47567b;
        switch (i10) {
            case 0:
                wb I = cc.a0(unVar).I(2131624027, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j10))));
                I.f32145t = true;
                I.j();
                return;
            default:
                wb I2 = cc.a0(unVar).I(2131624027, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j10))));
                I2.f32145t = true;
                I2.j();
                return;
        }
    }
}
