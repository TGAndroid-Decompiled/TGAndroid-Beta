package org.telegram.ui;
public final class xz0 implements Runnable {
    public final int f43489a;
    public final a01 f43490b;

    public xz0(a01 a01Var, int i10) {
        this.f43489a = i10;
        this.f43490b = a01Var;
    }

    @Override
    public final void run() {
        switch (this.f43489a) {
            case 0:
                a01 a01Var = this.f43490b;
                b01 b01Var = a01Var.f35511w;
                if (a01Var.f35504a == 0) {
                    b01Var.dismiss();
                    return;
                } else {
                    b01Var.onBackPressed();
                    return;
                }
            default:
                org.telegram.messenger.i0.J3(this.f43490b.f35508n.d);
                return;
        }
    }
}
