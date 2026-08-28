package org.telegram.ui;
public final class t01 implements Runnable {
    public final int f42799a;
    public final x01 f42800b;
    public final int f42801c;

    public t01(x01 x01Var, int i9, int i10) {
        this.f42799a = i10;
        this.f42800b = x01Var;
        this.f42801c = i9;
    }

    @Override
    public final void run() {
        switch (this.f42799a) {
            case 0:
                x01 x01Var = this.f42800b;
                org.telegram.ui.Components.m71 m71Var = x01Var.f44301n;
                w01 w01Var = x01Var.f44303s;
                int i9 = this.f42801c;
                m71Var.d(i9, w01Var.i(i9));
                return;
            default:
                x01 x01Var2 = this.f42800b;
                org.telegram.ui.Components.m71 m71Var2 = x01Var2.f44301n;
                w01 w01Var2 = x01Var2.f44303s;
                int i10 = this.f42801c;
                m71Var2.d(i10, w01Var2.i(i10));
                return;
        }
    }
}
