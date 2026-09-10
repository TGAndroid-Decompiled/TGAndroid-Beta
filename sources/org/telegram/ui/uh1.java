package org.telegram.ui;
public final class uh1 implements Runnable {
    public final int f37278a;
    public final vh1 f37279b;

    public uh1(vh1 vh1Var, int i10) {
        this.f37278a = i10;
        this.f37279b = vh1Var;
    }

    @Override
    public final void run() {
        switch (this.f37278a) {
            case 0:
                org.telegram.ui.Components.l61 l61Var = this.f37279b.f25171a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.l61 l61Var2 = this.f37279b.f25171a;
                if (l61Var2 != null) {
                    l61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
