package org.telegram.ui;
public final class v5 implements a60 {
    public final int f52128a;
    public final y5 f52129b;
    public final org.telegram.messenger.s2 f52130c;

    public v5(y5 y5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f52128a = i7;
        this.f52129b = y5Var;
        this.f52130c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52128a) {
            case 0:
                y5 y5Var = this.f52129b;
                org.telegram.messenger.s2 s2Var = this.f52130c;
                if (i7 == 4) {
                    y5Var.d.remove(s2Var);
                    y5Var.Z();
                } else {
                    s2Var.f26402b = i7;
                    org.telegram.messenger.g0.a4(y5Var.f53418b);
                }
                y5Var.getMessagesController().f25395s7.h(y5Var.f53420e, y5Var.d);
                return;
            default:
                this.f52130c.f26402b = i7;
                y5 y5Var2 = this.f52129b;
                y5Var2.getMessagesController().f25395s7.h(y5Var2.f53420e, y5Var2.d);
                org.telegram.messenger.g0.a4(y5Var2.f53418b);
                return;
        }
    }
}
