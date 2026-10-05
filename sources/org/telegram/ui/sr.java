package org.telegram.ui;
public final class sr implements Runnable {
    public final int f40624a;
    public final tr f40625b;

    public sr(tr trVar, int i10) {
        this.f40624a = i10;
        this.f40625b = trVar;
    }

    @Override
    public final void run() {
        switch (this.f40624a) {
            case 0:
                org.telegram.ui.Components.y61 y61Var = this.f40625b.f33438a;
                if (y61Var != null) {
                    y61Var.f26034f3.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.y61 y61Var2 = this.f40625b.f33438a;
                if (y61Var2 != null) {
                    y61Var2.f26034f3.N(true);
                    return;
                }
                return;
        }
    }
}
