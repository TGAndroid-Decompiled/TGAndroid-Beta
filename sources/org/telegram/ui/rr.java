package org.telegram.ui;
public final class rr implements Runnable {
    public final int f37222a;
    public final sr f37223b;

    public rr(sr srVar, int i10) {
        this.f37222a = i10;
        this.f37223b = srVar;
    }

    @Override
    public final void run() {
        switch (this.f37222a) {
            case 0:
                org.telegram.ui.Components.n61 n61Var = this.f37223b.f27008a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.n61 n61Var2 = this.f37223b.f27008a;
                if (n61Var2 != null) {
                    n61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
