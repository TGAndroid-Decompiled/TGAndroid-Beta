package org.telegram.ui;
public final class w5 implements v50 {
    public final int f50708a;
    public final z5 f50709b;
    public final org.telegram.messenger.s2 f50710c;

    public w5(z5 z5Var, org.telegram.messenger.s2 s2Var, int i3) {
        this.f50708a = i3;
        this.f50709b = z5Var;
        this.f50710c = s2Var;
    }

    @Override
    public final void a(int i3) {
        switch (this.f50708a) {
            case 0:
                z5 z5Var = this.f50709b;
                org.telegram.messenger.s2 s2Var = this.f50710c;
                if (i3 == 4) {
                    z5Var.d.remove(s2Var);
                    z5Var.Z();
                } else {
                    s2Var.f25269b = i3;
                    org.telegram.messenger.g0.b4(z5Var.f52534b);
                }
                z5Var.getMessagesController().f23111r7.h(z5Var.f52536e, z5Var.d);
                return;
            default:
                this.f50710c.f25269b = i3;
                z5 z5Var2 = this.f50709b;
                z5Var2.getMessagesController().f23111r7.h(z5Var2.f52536e, z5Var2.d);
                org.telegram.messenger.g0.b4(z5Var2.f52534b);
                return;
        }
    }
}
