package org.telegram.ui;
public final class u5 implements a70 {
    public final int f42009a;
    public final x5 f42010b;
    public final org.telegram.messenger.w2 f42011c;

    public u5(x5 x5Var, org.telegram.messenger.w2 w2Var, int i10) {
        this.f42009a = i10;
        this.f42010b = x5Var;
        this.f42011c = w2Var;
    }

    @Override
    public final void a(int i10) {
        switch (this.f42009a) {
            case 0:
                x5 x5Var = this.f42010b;
                org.telegram.messenger.w2 w2Var = this.f42011c;
                if (i10 == 4) {
                    x5Var.d.remove(w2Var);
                    x5Var.Y();
                } else {
                    w2Var.f19044b = i10;
                    org.telegram.messenger.i0.a4(x5Var.f43443b);
                }
                x5Var.getMessagesController().f18901s7.h(x5Var.e, x5Var.d);
                return;
            default:
                this.f42011c.f19044b = i10;
                x5 x5Var2 = this.f42010b;
                x5Var2.getMessagesController().f18901s7.h(x5Var2.e, x5Var2.d);
                org.telegram.messenger.i0.a4(x5Var2.f43443b);
                return;
        }
    }
}
