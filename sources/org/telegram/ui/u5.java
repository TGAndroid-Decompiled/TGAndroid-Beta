package org.telegram.ui;
public final class u5 implements c60 {
    public final int f52431a;
    public final x5 f52432b;
    public final org.telegram.messenger.t2 f52433c;

    public u5(x5 x5Var, org.telegram.messenger.t2 t2Var, int i7) {
        this.f52431a = i7;
        this.f52432b = x5Var;
        this.f52433c = t2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52431a) {
            case 0:
                x5 x5Var = this.f52432b;
                org.telegram.messenger.t2 t2Var = this.f52433c;
                if (i7 == 4) {
                    x5Var.d.remove(t2Var);
                    x5Var.Z();
                } else {
                    t2Var.f26935b = i7;
                    org.telegram.messenger.g0.Z3(x5Var.f53637b);
                }
                x5Var.getMessagesController().f25780u7.h(x5Var.f53639e, x5Var.d);
                return;
            default:
                this.f52433c.f26935b = i7;
                x5 x5Var2 = this.f52432b;
                x5Var2.getMessagesController().f25780u7.h(x5Var2.f53639e, x5Var2.d);
                org.telegram.messenger.g0.Z3(x5Var2.f53637b);
                return;
        }
    }
}
