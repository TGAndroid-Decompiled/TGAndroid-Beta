package org.telegram.ui;
public final class rl0 implements Runnable {
    public final int f41243a;
    public final sm0 f41244b;

    public rl0(sm0 sm0Var, int i10) {
        this.f41243a = i10;
        this.f41244b = sm0Var;
    }

    @Override
    public final void run() {
        switch (this.f41243a) {
            case 0:
                this.f41244b.y0();
                return;
            case 1:
                sm0 sm0Var = this.f41244b;
                sm0Var.getMessagesController().f18846m7 = null;
                if (sm0Var.f41561f1 == 3 && !sm0Var.isFinishing()) {
                    sm0Var.f41561f1 = 4;
                    rm0 rm0Var = sm0Var.Z0;
                    if (rm0Var != null) {
                        rm0Var.e(4);
                    }
                    sm0Var.finishFragment();
                    return;
                } else if (sm0Var.f41561f1 == 1 && !sm0Var.isFinishing()) {
                    sm0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                sm0 sm0Var2 = this.f41244b;
                if (sm0Var2.f41555d0 != null) {
                    sm0Var2.B0();
                    sm0Var2.f41555d0 = null;
                    return;
                }
                return;
            default:
                sm0 sm0Var3 = this.f41244b;
                sm0Var3.f41559f[0].requestFocus();
                org.telegram.messenger.i0.J3(sm0Var3.f41559f[0]);
                return;
        }
    }
}
