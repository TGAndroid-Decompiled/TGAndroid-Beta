package org.telegram.ui;
public final class w11 implements Runnable {
    public final int f43114a;
    public final a21 f43115b;
    public final int f43116c;

    public w11(a21 a21Var, int i10, int i11) {
        this.f43114a = i11;
        this.f43115b = a21Var;
        this.f43116c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43114a) {
            case 0:
                a21 a21Var = this.f43115b;
                org.telegram.ui.Components.o91 o91Var = a21Var.f35855n;
                z11 z11Var = a21Var.f35857s;
                int i10 = this.f43116c;
                o91Var.d(i10, z11Var.i(i10));
                return;
            default:
                a21 a21Var2 = this.f43115b;
                org.telegram.ui.Components.o91 o91Var2 = a21Var2.f35855n;
                z11 z11Var2 = a21Var2.f35857s;
                int i11 = this.f43116c;
                o91Var2.d(i11, z11Var2.i(i11));
                return;
        }
    }
}
