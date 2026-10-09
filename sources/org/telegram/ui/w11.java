package org.telegram.ui;
public final class w11 implements Runnable {
    public final int f43068a;
    public final a21 f43069b;
    public final int f43070c;

    public w11(a21 a21Var, int i10, int i11) {
        this.f43068a = i11;
        this.f43069b = a21Var;
        this.f43070c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43068a) {
            case 0:
                a21 a21Var = this.f43069b;
                org.telegram.ui.Components.n91 n91Var = a21Var.f35809n;
                z11 z11Var = a21Var.f35811s;
                int i10 = this.f43070c;
                n91Var.d(i10, z11Var.i(i10));
                return;
            default:
                a21 a21Var2 = this.f43069b;
                org.telegram.ui.Components.n91 n91Var2 = a21Var2.f35809n;
                z11 z11Var2 = a21Var2.f35811s;
                int i11 = this.f43070c;
                n91Var2.d(i11, z11Var2.i(i11));
                return;
        }
    }
}
