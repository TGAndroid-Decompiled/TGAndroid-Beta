package org.telegram.ui;
public final class u5 implements b60 {
    public final int f50216a;
    public final x5 f50217b;
    public final org.telegram.messenger.s2 f50218c;

    public u5(x5 x5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f50216a = i7;
        this.f50217b = x5Var;
        this.f50218c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f50216a) {
            case 0:
                x5 x5Var = this.f50217b;
                org.telegram.messenger.s2 s2Var = this.f50218c;
                if (i7 == 4) {
                    x5Var.d.remove(s2Var);
                    x5Var.Z();
                } else {
                    s2Var.f25408b = i7;
                    org.telegram.messenger.g0.b4(x5Var.f51771b);
                }
                x5Var.getMessagesController().f24887r7.h(x5Var.f51773e, x5Var.d);
                return;
            default:
                this.f50218c.f25408b = i7;
                x5 x5Var2 = this.f50217b;
                x5Var2.getMessagesController().f24887r7.h(x5Var2.f51773e, x5Var2.d);
                org.telegram.messenger.g0.b4(x5Var2.f51771b);
                return;
        }
    }
}
