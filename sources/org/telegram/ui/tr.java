package org.telegram.ui;
public final class tr implements Runnable {
    public final int f37869a;
    public final ur f37870b;

    public tr(ur urVar, int i10) {
        this.f37869a = i10;
        this.f37870b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f37869a) {
            case 0:
                org.telegram.ui.Components.o61 o61Var = this.f37870b.f27268a;
                if (o61Var != null) {
                    o61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.o61 o61Var2 = this.f37870b.f27268a;
                if (o61Var2 != null) {
                    o61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
