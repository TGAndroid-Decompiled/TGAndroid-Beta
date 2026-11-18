package org.telegram.ui;
public final class u5 implements c60 {
    public final int f52426a;
    public final x5 f52427b;
    public final org.telegram.messenger.t2 f52428c;

    public u5(x5 x5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.f52426a = i7;
        this.f52427b = x5Var;
        this.f52428c = t2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52426a) {
            case 0:
                x5 x5Var = this.f52427b;
                org.telegram.messenger.t2 t2Var = this.f52428c;
                if (i7 == 4) {
                    x5Var.d.remove(t2Var);
                    x5Var.Z();
                } else {
                    t2Var.f26933b = i7;
                    org.telegram.messenger.g0.Z3(x5Var.f53588b);
                }
                x5Var.getMessagesController().f25778u7.h(x5Var.f53590e, x5Var.d);
                return;
            default:
                this.f52428c.f26933b = i7;
                x5 x5Var2 = this.f52427b;
                x5Var2.getMessagesController().f25778u7.h(x5Var2.f53590e, x5Var2.d);
                org.telegram.messenger.g0.Z3(x5Var2.f53588b);
                return;
        }
    }
}
