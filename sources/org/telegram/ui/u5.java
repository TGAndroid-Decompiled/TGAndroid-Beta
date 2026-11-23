package org.telegram.ui;
public final class u5 implements c60 {
    public final int f52442a;
    public final x5 f52443b;
    public final org.telegram.messenger.t2 f52444c;

    public u5(x5 x5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.f52442a = i7;
        this.f52443b = x5Var;
        this.f52444c = t2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52442a) {
            case 0:
                x5 x5Var = this.f52443b;
                org.telegram.messenger.t2 t2Var = this.f52444c;
                if (i7 == 4) {
                    x5Var.d.remove(t2Var);
                    x5Var.Z();
                } else {
                    t2Var.f26948b = i7;
                    org.telegram.messenger.g0.Z3(x5Var.f53633b);
                }
                x5Var.getMessagesController().f25977u7.h(x5Var.f53635e, x5Var.d);
                return;
            default:
                this.f52444c.f26948b = i7;
                x5 x5Var2 = this.f52443b;
                x5Var2.getMessagesController().f25977u7.h(x5Var2.f53635e, x5Var2.d);
                org.telegram.messenger.g0.Z3(x5Var2.f53633b);
                return;
        }
    }
}
