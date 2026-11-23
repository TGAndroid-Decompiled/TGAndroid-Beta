package org.telegram.ui;
public final class v5 implements c60 {
    public final int f52807a;
    public final y5 f52808b;
    public final org.telegram.messenger.t2 f52809c;

    public v5(y5 y5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.f52807a = i7;
        this.f52808b = y5Var;
        this.f52809c = t2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52807a) {
            case 0:
                y5 y5Var = this.f52808b;
                org.telegram.messenger.t2 t2Var = this.f52809c;
                if (i7 == 4) {
                    y5Var.d.remove(t2Var);
                    y5Var.Z();
                } else {
                    t2Var.f27032b = i7;
                    org.telegram.messenger.g0.Z3(y5Var.f54225b);
                }
                y5Var.getMessagesController().f25873u7.h(y5Var.f54227e, y5Var.d);
                return;
            default:
                this.f52809c.f27032b = i7;
                y5 y5Var2 = this.f52808b;
                y5Var2.getMessagesController().f25873u7.h(y5Var2.f54227e, y5Var2.d);
                org.telegram.messenger.g0.Z3(y5Var2.f54225b);
                return;
        }
    }
}
