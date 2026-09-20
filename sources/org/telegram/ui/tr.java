package org.telegram.ui;
public final class tr implements Runnable {
    public final int f37868a;
    public final ur f37869b;

    public tr(ur urVar, int i10) {
        this.f37868a = i10;
        this.f37869b = urVar;
    }

    @Override
    public final void run() {
        switch (this.f37868a) {
            case 0:
                org.telegram.ui.Components.m61 m61Var = this.f37869b.f26598a;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.m61 m61Var2 = this.f37869b.f26598a;
                if (m61Var2 != null) {
                    m61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
