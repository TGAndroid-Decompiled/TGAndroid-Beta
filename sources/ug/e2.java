package ug;

import ai.v2;
public final class e2 implements Runnable {
    public final int f55960a;
    public final j2 f55961b;

    public e2(j2 j2Var, int i3) {
        this.f55960a = i3;
        this.f55961b = j2Var;
    }

    @Override
    public final void run() {
        switch (this.f55960a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.h3(new e2(this.f55961b, 0));
                return;
            case 2:
                this.f55961b.dismiss();
                return;
            default:
                j2 j2Var = this.f55961b;
                v2 v2Var = j2Var.I;
                if (v2Var != null) {
                    v2Var.a(null);
                    j2Var.I = null;
                }
                j2Var.dismiss();
                return;
        }
    }
}
