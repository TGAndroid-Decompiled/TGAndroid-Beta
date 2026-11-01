package org.telegram.ui;
public final class u5 implements a70 {
    public final int f41797a;
    public final x5 f41798b;
    public final org.telegram.messenger.w2 f41799c;

    public u5(x5 x5Var, org.telegram.messenger.w2 w2Var, int i10) {
        this.f41797a = i10;
        this.f41798b = x5Var;
        this.f41799c = w2Var;
    }

    @Override
    public final void a(int i10) {
        switch (this.f41797a) {
            case 0:
                x5 x5Var = this.f41798b;
                org.telegram.messenger.w2 w2Var = this.f41799c;
                if (i10 == 4) {
                    x5Var.d.remove(w2Var);
                    x5Var.Z();
                } else {
                    w2Var.f18969b = i10;
                    org.telegram.messenger.i0.a4(x5Var.f43244b);
                }
                x5Var.getMessagesController().f19244s7.h(x5Var.e, x5Var.d);
                return;
            default:
                this.f41799c.f18969b = i10;
                x5 x5Var2 = this.f41798b;
                x5Var2.getMessagesController().f19244s7.h(x5Var2.e, x5Var2.d);
                org.telegram.messenger.i0.a4(x5Var2.f43244b);
                return;
        }
    }
}
