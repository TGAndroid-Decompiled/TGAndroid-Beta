package org.telegram.ui;
public final class y11 implements Runnable {
    public final int f44269a;
    public final c21 f44270b;
    public final int f44271c;

    public y11(c21 c21Var, int i10, int i11) {
        this.f44269a = i11;
        this.f44270b = c21Var;
        this.f44271c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44269a) {
            case 0:
                c21 c21Var = this.f44270b;
                org.telegram.ui.Components.t91 t91Var = c21Var.f36306n;
                b21 b21Var = c21Var.f36308s;
                int i10 = this.f44271c;
                t91Var.d(i10, b21Var.i(i10));
                return;
            default:
                c21 c21Var2 = this.f44270b;
                org.telegram.ui.Components.t91 t91Var2 = c21Var2.f36306n;
                b21 b21Var2 = c21Var2.f36308s;
                int i11 = this.f44271c;
                t91Var2.d(i11, b21Var2.i(i11));
                return;
        }
    }
}
