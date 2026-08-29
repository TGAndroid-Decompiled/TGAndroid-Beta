package org.telegram.ui;
public final class u01 implements Runnable {
    public final int f43122a;
    public final y01 f43123b;
    public final int f43124c;

    public u01(y01 y01Var, int i10, int i11) {
        this.f43122a = i11;
        this.f43123b = y01Var;
        this.f43124c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43122a) {
            case 0:
                y01 y01Var = this.f43123b;
                org.telegram.ui.Components.y71 y71Var = y01Var.f44686n;
                x01 x01Var = y01Var.f44688s;
                int i10 = this.f43124c;
                y71Var.d(i10, x01Var.i(i10));
                return;
            default:
                y01 y01Var2 = this.f43123b;
                org.telegram.ui.Components.y71 y71Var2 = y01Var2.f44686n;
                x01 x01Var2 = y01Var2.f44688s;
                int i11 = this.f43124c;
                y71Var2.d(i11, x01Var2.i(i11));
                return;
        }
    }
}
