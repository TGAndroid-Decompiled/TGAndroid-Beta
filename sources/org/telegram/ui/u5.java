package org.telegram.ui;
public final class u5 implements e60 {
    public final int f50405a;
    public final x5 f50406b;
    public final org.telegram.messenger.s2 f50407c;

    public u5(x5 x5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f50405a = i7;
        this.f50406b = x5Var;
        this.f50407c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f50405a) {
            case 0:
                x5 x5Var = this.f50406b;
                org.telegram.messenger.s2 s2Var = this.f50407c;
                if (i7 == 4) {
                    x5Var.d.remove(s2Var);
                    x5Var.Z();
                } else {
                    s2Var.f25412b = i7;
                    org.telegram.messenger.g0.b4(x5Var.f51523b);
                }
                x5Var.getMessagesController().f24891r7.h(x5Var.f51525e, x5Var.d);
                return;
            default:
                this.f50407c.f25412b = i7;
                x5 x5Var2 = this.f50406b;
                x5Var2.getMessagesController().f24891r7.h(x5Var2.f51525e, x5Var2.d);
                org.telegram.messenger.g0.b4(x5Var2.f51523b);
                return;
        }
    }
}
