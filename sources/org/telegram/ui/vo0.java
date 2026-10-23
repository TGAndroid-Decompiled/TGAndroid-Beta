package org.telegram.ui;
public final class vo0 implements Runnable {
    public final int f42800a;
    public final fp0 f42801b;

    public vo0(fp0 fp0Var, int i10) {
        this.f42800a = i10;
        this.f42801b = fp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f42800a;
        fp0 fp0Var = this.f42801b;
        switch (i10) {
            case 0:
                if (fp0Var.G) {
                    fp0Var.f37385b.invalidate();
                    return;
                }
                return;
            case 1:
                fp0Var.h();
                return;
            case 2:
                int i11 = fp0.f37382q0;
                fp0Var.h();
                return;
            default:
                int i12 = fp0.f37382q0;
                fp0Var.h();
                return;
        }
    }
}
