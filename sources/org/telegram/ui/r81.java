package org.telegram.ui;
public final class r81 implements Runnable {
    public final int f49316a;
    public final x81 f49317b;

    public r81(x81 x81Var, int i7) {
        this.f49316a = i7;
        this.f49317b = x81Var;
    }

    @Override
    public final void run() {
        switch (this.f49316a) {
            case 0:
                x81 x81Var = this.f49317b;
                x81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) x81Var, 11, false).show();
                return;
            default:
                x81 x81Var2 = this.f49317b;
                x81Var2.f51635e.requestFocus();
                org.telegram.messenger.g0.K3(x81Var2.f51635e);
                return;
        }
    }
}
