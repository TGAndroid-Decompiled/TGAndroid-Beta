package org.telegram.ui;
public final class wi0 implements Runnable {
    public final int f42864a;
    public final cj0 f42865b;

    public wi0(cj0 cj0Var, int i10) {
        this.f42864a = i10;
        this.f42865b = cj0Var;
    }

    @Override
    public final void run() {
        switch (this.f42864a) {
            case 0:
                this.f42865b.dismiss();
                return;
            case 1:
                this.f42865b.V(true, false);
                return;
            default:
                this.f42865b.V(true, false);
                return;
        }
    }
}
