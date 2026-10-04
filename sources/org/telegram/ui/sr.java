package org.telegram.ui;
public final class sr implements Runnable {
    public final int f40612a;
    public final tr f40613b;

    public sr(tr trVar, int i10) {
        this.f40612a = i10;
        this.f40613b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f40612a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.f40613b.f32731a;
                if (w61Var != null) {
                    w61Var.f25250f3.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.f40613b.f32731a;
                if (w61Var2 != null) {
                    w61Var2.f25250f3.N(true);
                    return;
                }
                return;
        }
    }
}
