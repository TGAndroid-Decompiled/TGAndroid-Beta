package org.telegram.ui;
public final class tr implements Runnable {
    public final int f37794a;
    public final ur f37795b;

    public tr(ur urVar, int i10) {
        this.f37794a = i10;
        this.f37795b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f37794a) {
            case 0:
                org.telegram.ui.Components.n61 n61Var = this.f37795b.f26891a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.n61 n61Var2 = this.f37795b.f26891a;
                if (n61Var2 != null) {
                    n61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
