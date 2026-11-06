package org.telegram.ui;
public final class u5 implements b60 {
    public final int f50203a;
    public final x5 f50204b;
    public final org.telegram.messenger.s2 f50205c;

    public u5(x5 x5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f50203a = i7;
        this.f50204b = x5Var;
        this.f50205c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f50203a) {
            case 0:
                x5 x5Var = this.f50204b;
                org.telegram.messenger.s2 s2Var = this.f50205c;
                if (i7 == 4) {
                    x5Var.d.remove(s2Var);
                    x5Var.Z();
                } else {
                    s2Var.f25404b = i7;
                    org.telegram.messenger.g0.b4(x5Var.f51749b);
                }
                x5Var.getMessagesController().f24872r7.h(x5Var.f51751e, x5Var.d);
                return;
            default:
                this.f50205c.f25404b = i7;
                x5 x5Var2 = this.f50204b;
                x5Var2.getMessagesController().f24872r7.h(x5Var2.f51751e, x5Var2.d);
                org.telegram.messenger.g0.b4(x5Var2.f51749b);
                return;
        }
    }
}
