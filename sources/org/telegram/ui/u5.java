package org.telegram.ui;
public final class u5 implements c60 {
    public final int f52432a;
    public final x5 f52433b;
    public final org.telegram.messenger.t2 f52434c;

    public u5(x5 x5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.f52432a = i7;
        this.f52433b = x5Var;
        this.f52434c = t2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52432a) {
            case 0:
                x5 x5Var = this.f52433b;
                org.telegram.messenger.t2 t2Var = this.f52434c;
                if (i7 == 4) {
                    x5Var.d.remove(t2Var);
                    x5Var.Z();
                } else {
                    t2Var.f26912b = i7;
                    org.telegram.messenger.g0.Z3(x5Var.f53555b);
                }
                x5Var.getMessagesController().f25941u7.h(x5Var.f53557e, x5Var.d);
                return;
            default:
                this.f52434c.f26912b = i7;
                x5 x5Var2 = this.f52433b;
                x5Var2.getMessagesController().f25941u7.h(x5Var2.f53557e, x5Var2.d);
                org.telegram.messenger.g0.Z3(x5Var2.f53555b);
                return;
        }
    }
}
