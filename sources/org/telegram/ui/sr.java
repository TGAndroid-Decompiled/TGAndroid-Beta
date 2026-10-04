package org.telegram.ui;
public final class sr implements Runnable {
    public final int f40605a;
    public final tr f40606b;

    public sr(tr trVar, int i10) {
        this.f40605a = i10;
        this.f40606b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f40605a) {
            case 0:
                org.telegram.ui.Components.w61 w61Var = this.f40606b.f32724a;
                if (w61Var != null) {
                    w61Var.f25244f3.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.w61 w61Var2 = this.f40606b.f32724a;
                if (w61Var2 != null) {
                    w61Var2.f25244f3.N(true);
                    return;
                }
                return;
        }
    }
}
