package org.telegram.ui;
public final class r41 implements Runnable {
    public final int f41132a;
    public final e51 f41133b;

    public r41(e51 e51Var, int i10) {
        this.f41132a = i10;
        this.f41133b = e51Var;
    }

    @Override
    public final void run() {
        int i10 = this.f41132a;
        e51 e51Var = this.f41133b;
        switch (i10) {
            case 0:
                org.telegram.messenger.vp.r1(e51Var.currentAccount).l0(null);
                return;
            case 1:
                gf.f.r(e51Var.getParentActivity(), org.telegram.messenger.cd.L0(2131752154, null));
                return;
            default:
                e51Var.f36935c.f30819f3.O(true);
                return;
        }
    }
}
