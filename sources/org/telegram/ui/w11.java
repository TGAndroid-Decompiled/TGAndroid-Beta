package org.telegram.ui;
public final class w11 implements Runnable {
    public final int f43070a;
    public final a21 f43071b;
    public final int f43072c;

    public w11(a21 a21Var, int i10, int i11) {
        this.f43070a = i11;
        this.f43071b = a21Var;
        this.f43072c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43070a) {
            case 0:
                a21 a21Var = this.f43071b;
                org.telegram.ui.Components.n91 n91Var = a21Var.f35811n;
                z11 z11Var = a21Var.f35813s;
                int i10 = this.f43072c;
                n91Var.d(i10, z11Var.i(i10));
                return;
            default:
                a21 a21Var2 = this.f43071b;
                org.telegram.ui.Components.n91 n91Var2 = a21Var2.f35811n;
                z11 z11Var2 = a21Var2.f35813s;
                int i11 = this.f43072c;
                n91Var2.d(i11, z11Var2.i(i11));
                return;
        }
    }
}
