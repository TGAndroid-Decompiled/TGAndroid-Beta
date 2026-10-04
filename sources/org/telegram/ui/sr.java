package org.telegram.ui;
public final class sr implements Runnable {
    public final int f40606a;
    public final tr f40607b;

    public sr(tr trVar, int i10) {
        this.f40606a = i10;
        this.f40607b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f40606a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.f40607b.f32725a;
                if (w61Var != null) {
                    w61Var.f25245f3.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.f40607b.f32725a;
                if (w61Var2 != null) {
                    w61Var2.f25245f3.N(true);
                    return;
                }
                return;
        }
    }
}
