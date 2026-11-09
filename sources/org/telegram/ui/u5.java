package org.telegram.ui;
public final class u5 implements d60 {
    public final int f50289a;
    public final x5 f50290b;
    public final org.telegram.messenger.s2 f50291c;

    public u5(x5 x5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f50289a = i7;
        this.f50290b = x5Var;
        this.f50291c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f50289a) {
            case 0:
                x5 x5Var = this.f50290b;
                org.telegram.messenger.s2 s2Var = this.f50291c;
                if (i7 == 4) {
                    x5Var.d.remove(s2Var);
                    x5Var.Z();
                } else {
                    s2Var.f25408b = i7;
                    org.telegram.messenger.g0.b4(x5Var.f51548b);
                }
                x5Var.getMessagesController().f24887r7.h(x5Var.f51550e, x5Var.d);
                return;
            default:
                this.f50291c.f25408b = i7;
                x5 x5Var2 = this.f50290b;
                x5Var2.getMessagesController().f24887r7.h(x5Var2.f51550e, x5Var2.d);
                org.telegram.messenger.g0.b4(x5Var2.f51548b);
                return;
        }
    }
}
