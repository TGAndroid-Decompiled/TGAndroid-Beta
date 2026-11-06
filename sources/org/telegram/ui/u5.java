package org.telegram.ui;
public final class u5 implements b60 {
    public final int f50224a;
    public final x5 f50225b;
    public final org.telegram.messenger.s2 f50226c;

    public u5(x5 x5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f50224a = i7;
        this.f50225b = x5Var;
        this.f50226c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f50224a) {
            case 0:
                x5 x5Var = this.f50225b;
                org.telegram.messenger.s2 s2Var = this.f50226c;
                if (i7 == 4) {
                    x5Var.d.remove(s2Var);
                    x5Var.Z();
                } else {
                    s2Var.f25412b = i7;
                    org.telegram.messenger.g0.b4(x5Var.f51764b);
                }
                x5Var.getMessagesController().f24880r7.h(x5Var.f51766e, x5Var.d);
                return;
            default:
                this.f50226c.f25412b = i7;
                x5 x5Var2 = this.f50225b;
                x5Var2.getMessagesController().f24880r7.h(x5Var2.f51766e, x5Var2.d);
                org.telegram.messenger.g0.b4(x5Var2.f51764b);
                return;
        }
    }
}
