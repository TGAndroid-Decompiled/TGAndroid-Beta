package org.telegram.ui;
public final class tm0 implements org.telegram.messenger.q20 {
    public final int f41866a;
    public final tn0 f41867b;

    public tm0(tn0 tn0Var, int i10) {
        this.f41866a = i10;
        this.f41867b = tn0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f41866a) {
            case 0:
                Integer num = (Integer) obj;
                hk hkVar = this.f41867b.I;
                if (hkVar != null) {
                    hkVar.E(num.intValue());
                    return;
                }
                return;
            default:
                tn0 tn0Var = this.f41867b;
                tn0Var.f41877r = false;
                tn0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    tn0Var.B0();
                    tn0Var.finishFragment();
                    tn0Var.H0();
                    return;
                }
                return;
        }
    }
}
