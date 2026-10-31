package org.telegram.ui;
public final class sg0 implements Runnable {
    public final int f41508a;
    public final kh0 f41509b;

    public sg0(kh0 kh0Var, int i10) {
        this.f41508a = i10;
        this.f41509b = kh0Var;
    }

    @Override
    public final void run() {
        switch (this.f41508a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                kh0 kh0Var = this.f41509b;
                kh0Var.getClass();
                nh.h.f(false);
                nh.h hVar = kh0Var.f38839h0;
                if (hVar != null) {
                    hVar.b(kh0Var.E);
                }
                org.telegram.messenger.i0.g3(new sg0(kh0Var, 0));
                return;
            case 2:
                nh.h.f(false);
                kh0 kh0Var2 = this.f41509b;
                nh.h hVar2 = kh0Var2.f38839h0;
                if (hVar2 != null) {
                    hVar2.b(kh0Var2.E);
                }
                org.telegram.messenger.i0.g3(new sg0(kh0Var2, 3));
                return;
            default:
                super/*android.app.Dialog*/.dismiss();
                return;
        }
    }
}
