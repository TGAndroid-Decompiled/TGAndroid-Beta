package org.telegram.ui;
public final class u5 implements b60 {
    public final int f50225a;
    public final x5 f50226b;
    public final org.telegram.messenger.s2 f50227c;

    public u5(x5 x5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f50225a = i7;
        this.f50226b = x5Var;
        this.f50227c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f50225a) {
            case 0:
                x5 x5Var = this.f50226b;
                org.telegram.messenger.s2 s2Var = this.f50227c;
                if (i7 == 4) {
                    x5Var.d.remove(s2Var);
                    x5Var.Z();
                } else {
                    s2Var.f25404b = i7;
                    org.telegram.messenger.g0.b4(x5Var.f51766b);
                }
                x5Var.getMessagesController().f24872r7.h(x5Var.f51768e, x5Var.d);
                return;
            default:
                this.f50227c.f25404b = i7;
                x5 x5Var2 = this.f50226b;
                x5Var2.getMessagesController().f24872r7.h(x5Var2.f51768e, x5Var2.d);
                org.telegram.messenger.g0.b4(x5Var2.f51766b);
                return;
        }
    }
}
