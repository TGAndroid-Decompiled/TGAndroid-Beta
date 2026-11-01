package org.telegram.ui;
public final class rm0 implements org.telegram.messenger.r20 {
    public final int f41107a;
    public final rn0 f41108b;

    public rm0(rn0 rn0Var, int i10) {
        this.f41107a = i10;
        this.f41108b = rn0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f41107a) {
            case 0:
                Integer num = (Integer) obj;
                hk hkVar = this.f41108b.I;
                if (hkVar != null) {
                    hkVar.E(num.intValue());
                    return;
                }
                return;
            default:
                rn0 rn0Var = this.f41108b;
                rn0Var.f41119r = false;
                rn0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    rn0Var.C0();
                    rn0Var.finishFragment();
                    rn0Var.I0();
                    return;
                }
                return;
        }
    }
}
