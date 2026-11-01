package org.telegram.ui;
public final class vy0 implements Runnable {
    public final int f42635a;
    public final yy0 f42636b;
    public final int f42637c;

    public vy0(yy0 yy0Var, int i10, int i11) {
        this.f42635a = i11;
        this.f42636b = yy0Var;
        this.f42637c = i10;
    }

    @Override
    public final void run() {
        switch (this.f42635a) {
            case 0:
                yy0 yy0Var = this.f42636b;
                org.telegram.ui.Components.w71 w71Var = yy0Var.f43748b;
                xy0 xy0Var = yy0Var.d;
                int i10 = this.f42637c;
                w71Var.d(i10, xy0Var.i(i10));
                return;
            default:
                yy0 yy0Var2 = this.f42636b;
                org.telegram.ui.Components.w71 w71Var2 = yy0Var2.f43748b;
                xy0 xy0Var2 = yy0Var2.d;
                int i11 = this.f42637c;
                w71Var2.d(i11, xy0Var2.i(i11));
                return;
        }
    }
}
