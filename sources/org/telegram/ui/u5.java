package org.telegram.ui;
public final class u5 implements c60 {
    public final int f52438a;
    public final x5 f52439b;
    public final org.telegram.messenger.t2 f52440c;

    public u5(x5 x5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.f52438a = i7;
        this.f52439b = x5Var;
        this.f52440c = t2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52438a) {
            case 0:
                x5 x5Var = this.f52439b;
                org.telegram.messenger.t2 t2Var = this.f52440c;
                if (i7 == 4) {
                    x5Var.d.remove(t2Var);
                    x5Var.Z();
                } else {
                    t2Var.f26961b = i7;
                    org.telegram.messenger.g0.Z3(x5Var.f53629b);
                }
                x5Var.getMessagesController().f25806u7.h(x5Var.f53631e, x5Var.d);
                return;
            default:
                this.f52440c.f26961b = i7;
                x5 x5Var2 = this.f52439b;
                x5Var2.getMessagesController().f25806u7.h(x5Var2.f53631e, x5Var2.d);
                org.telegram.messenger.g0.Z3(x5Var2.f53629b);
                return;
        }
    }
}
