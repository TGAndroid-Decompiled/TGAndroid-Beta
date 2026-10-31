package org.telegram.ui;
public final class yz0 implements Runnable {
    public final int f43923a;
    public final b01 f43924b;

    public yz0(b01 b01Var, int i10) {
        this.f43923a = i10;
        this.f43924b = b01Var;
    }

    @Override
    public final void run() {
        switch (this.f43923a) {
            case 0:
                b01 b01Var = this.f43924b;
                c01 c01Var = b01Var.f35926w;
                if (b01Var.f35919a == 0) {
                    c01Var.dismiss();
                    return;
                } else {
                    c01Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.i0.J3(this.f43924b.f35923n.d);
                return;
        }
    }
}
