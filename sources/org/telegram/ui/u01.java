package org.telegram.ui;

public final class u01 implements Runnable {

    public final int f43059a;

    public final y01 f43060b;

    public final int f43061c;

    public u01(y01 y01Var, int i10, int i11) {
        this.f43059a = i11;
        this.f43060b = y01Var;
        this.f43061c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43059a) {
            case 0:
                y01 y01Var = this.f43060b;
                org.telegram.ui.Components.o71 o71Var = y01Var.f44655n;
                x01 x01Var = y01Var.f44657s;
                int i10 = this.f43061c;
                o71Var.d(i10, x01Var.i(i10));
                break;
            default:
                y01 y01Var2 = this.f43060b;
                org.telegram.ui.Components.o71 o71Var2 = y01Var2.f44655n;
                x01 x01Var2 = y01Var2.f44657s;
                int i11 = this.f43061c;
                o71Var2.d(i11, x01Var2.i(i11));
                break;
        }
    }
}
