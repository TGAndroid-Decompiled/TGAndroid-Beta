package org.telegram.ui;
public final class vr implements Runnable {
    public final int f38492a;
    public final wr f38493b;

    public vr(wr wrVar, int i10) {
        this.f38492a = i10;
        this.f38493b = wrVar;
    }

    @Override
    public final void run() {
        switch (this.f38492a) {
            case 0:
                org.telegram.ui.Components.z51 z51Var = this.f38493b.f22333a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.z51 z51Var2 = this.f38493b.f22333a;
                if (z51Var2 != null) {
                    z51Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
